package com;

import com.clases.*;
public class Aplicacion {

	public static void main(String[] args) {
TiendaElectronica tienda = new TiendaElectronica();
Televisor tv = new Televisor("LG", 69.990, 7, 40, "1080p");
computadoraPortatil laptop = new computadoraPortatil("Mac", 59.990, 12, "Apple", 8, "L2m45x");
tienda.agregar(tv);
tienda.agregar(laptop);
tienda.venta("LG", 7);
tienda.venta("Mac", 12);
tienda.mostrar();
	}
}
