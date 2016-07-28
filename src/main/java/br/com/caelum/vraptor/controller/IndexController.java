package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import progolden.agenda.entidades.Usuario;
import progolden.agenda.repositorios.EnderecoRepositorio;
import progolden.agenda.repositorios.PessoaRepositorio;
import progolden.agenda.repositorios.UsuarioRepositorio;

@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	@Path("/")
	public void index() {		
		//UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
		//usuarioRepositorio.addUsuario("teste", 1, 2);
		
		//PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
		//pessoaRepositorio.addPessoa("Igor", "08903775619", 728524800);
		
		EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
		enderecoRepositorio.addEndereco("Rua Dr. Knight 415 A", "Nova Lavras", "3226-1200", 1);
		
		result.include("variable", "VRaptor!");
	}
}