package com.clases;

public class Televisor extends ProductoElectrodomestico {
	
	double tamañoPantalla;
	int resolucion;
	
	public Televisor(String nombre, double precio, int cantidad, double tamañoPantalla, int resolucion) {
		super(nombre, precio, cantidad);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}

	@Override
	public void mostrarInformacion() {
		System.out.print("Nombre: "+this.nombre+ " ");
		System.out.print("Precio: "+this.precio+ " ");
		System.out.print("Cantidad disponible: "+this.cantidadDisponible+ " ");
		System.out.print("Tamaño de Pantalla: "+this.tamañoPantalla+ " ");
		System.out.println("Resolución: "+this.resolucion+ " ");
		System.out.println("----------------------------------------------------");
	}
}
