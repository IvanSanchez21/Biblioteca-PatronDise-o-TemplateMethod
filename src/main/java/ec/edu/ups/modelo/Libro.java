package ec.edu.ups.modelo;

public abstract class Libro {
	private String titulo;
	private String autor;
	private int edicion;
	private double precio;
	
	public Libro(String titulo, String autor, int edicion, double precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.edicion = edicion;
		this.precio = precio;
	}

	public double calcularPrecioFinal() {
		return this.precio + this.calcularPrecioComision() + this.calcularGastosEnvio();
	}
	
	public abstract double calcularPrecioComision();
	
	public abstract double calcularGastosEnvio();
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
