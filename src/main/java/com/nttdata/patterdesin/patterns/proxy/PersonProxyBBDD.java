package com.nttdata.patterdesin.patterns.proxy;

public class PersonProxyBBDD extends AbstractPersonProxy {
	
	public PersonProxyBBDD(PersonaProxyInterface person) {
		super(person);
	}

	public  void before() {
		System.out.println("Abrir conexion con BBDD...");
	}

	public  void after() {
		System.out.println("Cerrar conexion BBDD...");
	}

}
