package com;

import com.clases.TiendaElectronica;

public class Aplicacion {
	public static void main(String args[]) {
		TiendaElectronica tienda = new TiendaElectronica();
		
		tienda.agregarProducto("Nuevo Producto 1", 1200, 10);
		tienda.agregarProducto("Nuevo Producto 2", 1200, 2, 22.5, 1080);
		tienda.agregarProducto("Nuevo Producto 3", 1200, 2, "HYPER XXX","16GB", 111);
		tienda.listarProductos();
		tienda.buscarPorNombre("Nuevo Producto 1");
		tienda.buscarPorNombre("Nuevo Producto 2");
		//Venta donde se ingresa nombre (String) y cantidad de la venta (int)
		tienda.ventaProducto("Nuevo Producto 1", 3);
		tienda.ventaProducto("Nuevo Producto 3", 2);
	}
}
