package ec.edu.ups.modelo;

public class Compra {
	private Libro libro;
	private Cliente cliente;
	
	public Compra(Libro libro, Cliente cliente) {
		super();
		this.libro = libro;
		this.cliente = cliente;
	}

        public Libro getLibro() {
            return libro;
        }

        public void setLibro(Libro libro) {
            this.libro = libro;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
        
}
