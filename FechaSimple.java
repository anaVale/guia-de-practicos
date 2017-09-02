
public class FechaSimple implements Fecha {

	final int aaaammdd;
	
	public FechaSimple(int dia, int mes, int año) {
			aaaammdd = año * 10000 
					 + mes *   100
					 + dia *     1
			;
	}

	@Override
	public int getdia() {
		
		return (aaaammdd - getaño()*10000-  getmes()*100);
	}

	@Override
	public int getmes() {
		return (aaaammdd - (getaño() * 10000))/100;
	}

	@Override
	public int getaño() {
		return aaaammdd / 10000;
	}

}
