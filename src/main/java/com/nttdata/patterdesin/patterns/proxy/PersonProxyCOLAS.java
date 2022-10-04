package com.nttdata.patterdesin.patterns.proxy;

public class PersonProxyCOLAS extends AbstractPersonProxy {
	
	public PersonProxyCOLAS(PersonaProxyInterface person) {
		super(person);
	}

	public  void before() {
		System.out.println("Abrir conexion con COLAS...");
	}

	public  void after() {
		System.out.println("Cerrar conexion con COLAS...");
	}

}
