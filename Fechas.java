public class Fechas {

	public static void main(String[] args) {
		Fecha navidad= crear();
		System.out.println(navidad.getdia());
		System.out.println(navidad.getmes());
		System.out.println(navidad.getaño());
	}

	private static Fecha crear() {
		Fecha fecha;
		if (true || Math.random() < 0.5) { 
			fecha = new FechaSimple(25,12,2017);
		} else {
			fecha = new FechaCompuesta(25,12,2017);
		}
		return fecha ;
	}

}
