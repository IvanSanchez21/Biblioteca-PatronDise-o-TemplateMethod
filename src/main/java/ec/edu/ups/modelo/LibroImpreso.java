package ec.edu.ups.modelo;

public class LibroImpreso extends Libro {
	public LibroImpreso(String titulo, String autor, int edicion, double precio) {
		super(titulo, autor, edicion, precio);
	}

	@Override
	public double calcularPrecioComision() {
		return this.getPrecio() * 0.02;
	}

	@Override
	public double calcularGastosEnvio() {
		return 20;
	}

}
