package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String cedula;
	private String nombre;
	private double credito;
	private List<Compra> compras;
	
	public Cliente(String cedula, String nombre, double credito) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.credito = credito;
		this.compras = new ArrayList<Compra>();
	}

	public void recargarCredito(double cantidadRecarga) {
		this.credito += cantidadRecarga;
	}
	
	public void debitarCredito(double cantidadDebito) {
		this.credito -= cantidadDebito;
	}
	
	public void comprarLibro(Libro libro) {
		Compra compra = new Compra(libro, this);
		this.compras.add(compra);
		double precioLibro = libro.calcularPrecioFinal();
		this.debitarCredito(precioLibro);
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getCredito() {
		return credito;
	}


	public void setCredito(double credito) {
		this.credito = credito;
	}
}
