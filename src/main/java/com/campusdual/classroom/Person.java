package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	// Constructor
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	// Método que muestra información básica de la persona
	public void getDetails() {
		System.out.println("Nombre: " + name);
		System.out.println("Apellido: " + surname);
	}
}

