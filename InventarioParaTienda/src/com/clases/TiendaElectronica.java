package com.clases;

import java.util.ArrayList;


public class TiendaElectronica {
	ArrayList<ProductoElectrodomestico> listaProductos = new ArrayList<ProductoElectrodomestico>();
	
	public void agregarProducto(String nombre, double precio, int cantidad) {
		listaProductos.add(new ProductoElectrodomestico(nombre, precio, cantidad));
	}
	
	public void agregarProducto(String nombre, double precio, int cantidad,double tamañoPantalla, int resolucion) {
		listaProductos.add(new Televisor(nombre ,precio ,cantidad , tamañoPantalla, resolucion));
	}
	
	public void agregarProducto(String nombre, double precio, int cantidad,String marca, String ram, int serie ) {
		listaProductos.add(new ComputadoraPortatil(nombre, precio, cantidad, marca, ram, serie));
	}
	
	public void listarProductos() {
		for (int i = 0; i < listaProductos.size(); i++) {
			listaProductos.get(i).mostrarInformacion();
		}
		System.out.println();
	}
	
	
	public void buscarPorNombre(String nombre) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equals(nombre)) {
				System.out.println("Nombre buscado: '"+ nombre+ "' Coincidencia: ");
				listaProductos.get(i).mostrarInformacion();
			}
		}
	}
	
	public void ventaProducto(String nombre, int cantida){
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i).getNombre().equals(nombre)) {
				int cantidad = listaProductos.get(i).getCantidadDisponible();
				if(cantidad-cantida >=0) {
					
				System.out.println("Venta-Producto: '"+ nombre+ "' Stock actual: "+ cantidad);
				
				listaProductos.get(i).setCantidadDisponible(cantidad-cantida);
				System.out.println("Nuevo Stock: "+ listaProductos.get(i).getCantidadDisponible());
				}else {
					System.out.println("Stock no se puede reducir debajo de 0");
				}
			}
		}
	}
	
}