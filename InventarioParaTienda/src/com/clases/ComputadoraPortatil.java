package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	
	String marca;
	String ram;
	int serie;
	
	public ComputadoraPortatil(String nombre, double precio, int cantidad, String marca, String ram, int serie ) {
		super(nombre,precio,cantidad);
		this.marca = marca;
		this.ram = ram;
		this.serie = serie;
	}
	@Override
	public void mostrarInformacion() {
		System.out.print("Nombre: "+this.nombre+ " ");
		System.out.print("Precio: "+this.precio+ " ");
		System.out.print("Cantidad disponible: "+this.cantidadDisponible+ " ");
		System.out.print("Marca: "+this.marca+ " ");
		System.out.print("Cantidad: "+this.ram+ " ");
		System.out.println("Serie: "+this.serie+ " ");
		System.out.println("----------------------------------------------------");
	}
}
