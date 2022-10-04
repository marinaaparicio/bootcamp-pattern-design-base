package com.nttdata.patterdesin.patterns.proxy;

public abstract class AbstractPersonProxy implements PersonaProxyInterface {
	private PersonaProxyInterface persona;

	public AbstractPersonProxy(PersonaProxyInterface persona) {
		this.persona = persona;
	}

	@Override
	public void operacion() {
		before();
		persona.operacion();
		after();
	}

	public abstract void before();

	public abstract void after();

}
