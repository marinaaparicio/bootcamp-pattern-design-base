package com.nttdata.patterdesin.facade;

import java.util.List;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonaFacade {
	
	List<Person> personaLista;
	
	Person person = new Person();
	
	
	private static int MIN_AGE = 20;
	private static int MAX_AGE = 30;


	public void startEngine() {

	    person.setAge(MIN_AGE);
	    personaLista.add(person);
	}

	public void stopEngine() {

	    person.setAge(MAX_AGE);
	    personaLista.add(person);

	}

}

