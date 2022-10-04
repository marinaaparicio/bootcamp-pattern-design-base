package com.nttdata.patterdesin.patterns.decorator;

public class PersonDecorador implements PersonInterface{
	
	private PersonInterface personInterface;
	
	public PersonDecorador(PersonInterface personInterface) {
		this.personInterface = personInterface;
	}

	@Override
	public String getName() {

		return personInterface.getName();
	}

	@Override
	public void setName(String name) {
		this.personInterface.setName(name);
		
	}

	@Override
	public int getAge() {

		return personInterface.getAge() * 365;
	}

	@Override
	public void setAge(int age) {
		this.personInterface.setAge(age);
		
	}

}
