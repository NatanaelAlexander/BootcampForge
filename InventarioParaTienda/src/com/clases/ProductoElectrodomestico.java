package com.clases;

public class ProductoElectrodomestico {
	
	String nombre;
	double precio;
	int cantidadDisponible;
	
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidad;
	}
	
	public ProductoElectrodomestico(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	public void mostrarInformacion() {
		System.out.print("Nombre: "+this.nombre+ " ");
		System.out.print("Precio: "+this.precio+ " ");
		System.out.println("Cantidad disponible: "+this.cantidadDisponible+ " ");
		System.out.println("----------------------------------------------------");
	}
}
