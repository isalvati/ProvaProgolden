package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class Listar {
	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected Listar() {
		this(null);
	}
	
	@Inject
	public Listar(Result result) {
		this.result = result;
	}

	public void listaEnderecos() {		
		System.out.println("Lista Enderecos");
	}
}
