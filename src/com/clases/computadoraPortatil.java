package com.clases;

public class computadoraPortatil  extends ProductoElectrodomestico{
	private String marca;
	private int memoriaRAM;
	private String numeroSerie;
	public computadoraPortatil(String nombre, Double precio, int cantidadDisponible, String marca, int memoriaRAM,
			String numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Marca: " + marca);
		System.out.println("Memoria RAM: " + memoriaRAM);
		System.out.println("Numero Serie: " + numeroSerie);
	}
	
}
