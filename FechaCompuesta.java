public class FechaCompuesta implements Fecha {
	
	final int año;
	final int mes;
	final int dia;
	
	public FechaCompuesta(int dia, int mes, int año) {
		this.año=año;
		this.mes=mes;
		this.dia=dia;
	}

	@Override
	public int getdia() {
		// TODO Auto-generated method stub

		return dia;
	}

	@Override
	public int getmes() {
		// TODO Auto-generated method stub
		return mes;
	}

	@Override
	public int getaño() {
		// TODO Auto-generated method stub
		return año;
	}

}
