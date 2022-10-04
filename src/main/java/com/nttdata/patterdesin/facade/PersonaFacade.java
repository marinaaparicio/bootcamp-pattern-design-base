package com.nttdata.patterdesin.facade;

import java.util.List;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonaFacade {
	
	List<Person> personaLista;
	
	Person person = new Person();


	
	
	public List<Person> getListPersons(){
		
	    if(person.getAge() >= 20 && person.getAge() <= 30) {
	    	
	    	personaLista.add(person);
	    	
	    }
	       
		return personaLista;
		
	}
}

