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
		UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
		String listaUsuarios = usuarioRepositorio.listUsuario().toString();
		
		PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
		String listaPessoas = pessoaRepositorio.listPessoa().toString();
		
		EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
		//enderecoRepositorio.addEndereco("Rua Dr. Knight 415 A", "Nova Lavras", "3226-1200", 1);
		String listaEnderecos = enderecoRepositorio.listEndereco().toString();
		
		result.include("variable", "VRaptor!");
		result.include("listaEnderecos", listaEnderecos);
		result.include("listaPessoas", listaPessoas);
		result.include("listaUsuarios", listaUsuarios);
	}
}