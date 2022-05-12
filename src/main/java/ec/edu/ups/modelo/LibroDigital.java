package ec.edu.ups.modelo;

public class LibroDigital extends Libro {

	private double costoFijoComision;

	public LibroDigital(String titulo, String autor, int edicion, double precio, double costoFijoComision) {
		super(titulo, autor, edicion, precio);
		this.costoFijoComision = costoFijoComision;
	}

	@Override
	public double calcularPrecioComision() {
		return costoFijoComision;
	}

	@Override
	public double calcularGastosEnvio() {
		return 0;
	}

}
