package es_primo;

public class Primo {
private int numero;

public boolean esPrimo(int n){
	numero=n;
	boolean re=true;
	int i=2;
	if (numero<4){
}
	
	while ((i<numero)&&(numero>3)&&(re==true)){
		if ((numero%i)==0){
			return (false);
		}
		else {
			re=true;	
		}
				
		i+=1;
	}
	return (re);
	}

}



