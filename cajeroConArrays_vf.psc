Algoritmo cajeroConArrays
	definir cantidad, nCajas, cambioFinal, cambio, denominacion como entero;
	dimension cantidad[6];
	Dimension cambioFinal[6];
	dimension denominacion[6];
	dimension indice[6];
	dimension cambio[6];
	definir  m, i, totalDinero, cantBilletes Como Entero;
	definir resto como entero;
	definir resp, saldo,monto como logico;
	definir salida,opera como texto;
	salida<-'no';
	
	Repetir
		nCajas<-6;
		inicializaDenominacion(denominacion, nCajas);
		cargarCantidad(cantidad, nCajas);
		ordenaCajas(cantidad, denominacion, nCajas);
		cantBilletes<-cuentaBilletes(cantidad, denominacion, nCajas);
		inicializaCambio(cambio, nCajas);
		inicializaCambio(cambioFinal, nCajas);
		totalDinero<-sum(cantidad, denominacion, nCajas);
		opera<-'no';	
			
		
		Mientras totalDinero>0 hacer
			Mientras opera!='si' hacer
				Escribir " Bienvenido al Cajero del Oeste";
				Escribir "Desea realizar una operación si/no: ";
				leer opera;
			FinMientras
			escribir "Ingrese el monto que desea retirar: ";
			Leer m;
			monto<-montoOk(m);
			si m > 0 entonces
				mientras monto=falso hacer
					escribir "El monto a retirar tiene que ser múltiplo de 10: ";
					escribir "Ingrese el monto que desea retirar: ";
					Leer m;
					monto<-montoOk(m);
				FinMientras
				saldo<-haySaldo(m, totalDinero);
				mientras saldo=falso  hacer
					escribir "El monto ingresado supera el cambio disponible";
					escribir "Ingrese un monto menor: ";
					Leer m;	
					saldo<-haySaldo(m, totalDinero);
				FinMientras
				i<-0;
				
				buscarCambio(m, denominacion, cantidad, nCajas, cambio);  
				descuentaCambio(cantidad, denominacion, nCajas, cambio);
				cFinal(cambioFinal, cambio, nCajas, denominacion);
				i<-0;
				mientras i<nCajas hacer
					si cambioFinal[i]>0 Entonces
						ESCRIBIR "entrega: ", cambioFinal[i] , "  billete/s de:  ", denominacion[i];
					FinSi
					i<-i+1;	
				Finmientras	
				
				i<-0;
				totalDinero<-sum(cantidad, denominacion, nCajas);
				inicializaCambio(cambio, nCajas);
				inicializaCambio(cambioFinal, nCajas);
				opera<-'no';
			finsi	
		finmientras
Hasta Que salida='si'
FinAlgoritmo





Funcion inicializaDenominacion(denominacion, nCajas)
	denominacion[0]<-10;
	denominacion[1]<-20;
	denominacion[2]<-500;
	denominacion[3]<-100;
	denominacion[4]<-500;
	denominacion[5]<-100;
FinFuncion
Funcion cargarCantidad(cantidad, nCajas)
	cantidad[0]<-10;
	cantidad[1]<-10;
	cantidad[2]<-10;
	cantidad[3]<-10;
	cantidad[4]<-10;
	cantidad[5]<-10;
FinFuncion

funcion inicializaCambio(cambio, nCajas)
	definir i como entero;
	i<-0;
	mientras i<nCajas hacer
		cambio[i]<-0;
		i<-i+1;
	FinMientras
FinFuncion

funcion mon<-montoOk(m)
	definir mon como logico;
	
	si m%10=0 entonces
		mon<-verdadero;
	sino mon<-falso;finsi
FinFuncion

funcion saldo<-haySaldo(m, totalDinero)
	definir saldo como logico;
	si totalDinero-m>=0 Entonces
		saldo<-verdadero;
	sino saldo<-falso; finsi
FinFuncion

funcion buscarCambio(m, denominacion, cantidad, nCajas, cambio)
	definir i, saldo, resto como entero;
	definir finaliza como logico;
	finaliza<-falso;
	i<-0;
	Repetir
		
		resto<-m%denominacion[i];
		saldo<-trunc(m/denominacion[i]);
		
		si 	resto=0 & cantidad[i]-saldo>=0 entonces
			cambio[i]<-saldo;
			finaliza<-verdadero;
		sino si resto=0 & cantidad[i]-saldo<0 entonces
				cambio[i]<-cantidad[i];
				m<-m-(cambio[i]*denominacion[i]);	
			sino si resto>0 & cantidad[i]-saldo>=0 entonces
				cambio[i]<-trunc(m/denominacion[i]);
				m<-m%denominacion[i];
				finsi
			FinSi
		FinSi
		
		i<-i+1;	
	hasta que finaliza=verdadero | i=nCajas
FinFuncion

funcion descuentaCambio(cantidad, denominacion, nCajas, cambio)
	definir i como entero;
	i<-0;
	mientras i<nCajas Hacer
		cantidad[i]<-cantidad[i]-cambio[i];
		i<-i+1;
	FinMientras
FinFuncion

Funcion t<-sum(cantidad, denominacion, nCajas)
	Definir t,i como entero;
	t<-0;
	i<-0;
	mientras i<nCajas hacer
		t<-t+(cantidad[i]*denominacion[i]);
		i<-i+1;
	FinMientras
		
FinFuncion
funcion ordenaCajas(cantidad, denominacion, nCajas)
	definir i,j,auxD,auxC como entero;
	auxD<-0;
	auxC<-0;
	i<-0;
	mientras i<nCajas-1 hacer
		j<-i+1;
		mientras j<nCajas hacer	
			si denominacion[i]<denominacion[j] entonces
				auxD<-denominacion[i];
				auxC<-cantidad[i];
				denominacion[i]<-denominacion[j];
				cantidad[i]<-cantidad[j];
				denominacion[j]<-auxD;
				cantidad[j]<-auxC;
			FinSi
			j<-j+1;
		FinMientras
		i<-i+1;
			
	FinMientras
FinFuncion

funcion n<-cuentaBilletes(cantidad, denominacion, nCajas)
	definir n,i,j como entero;
	n<-0;
	i<-0;
	mientras i<nCajas-1 hacer
		j<-i+1;
		
		si denominacion[i]!=denominacion[j] entonces
			n<-n+1;
		FinSi
		i<-i+1;
		
	FinMientras
FinFuncion
funcion cFinal(cambioFinal, cambio, nCajas, denominacion)
	definir i,j como enteros;
		i<-0;
		j<-1;
		
		mientras j < nCajas Hacer
			si denominacion[i]=denominacion[j] & cambio[j]>0 entonces 
 				cambioFinal[i]<-cambio[i]+cambio[j];
				cambioFinal[j]<-0;
				cambio[j]<-0;
			sino si cambio[i]>0 | cambio[j]>0 entonces 
					cambioFinal[i]<-cambio[i];
					cambioFinal[j]<-cambio[j]; 
				FinSi
				
			FinSi
			i<-i+1;
			j<-i+1;
		FinMientras
		
	
FinFuncion


	