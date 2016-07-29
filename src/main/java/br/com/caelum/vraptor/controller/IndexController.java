package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import progolden.agenda.entidades.Endereco;
import progolden.agenda.entidades.Pessoa;
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
		/*UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
		Usuario u = new Usuario(3,"igor_salvati", 1, 1);
		usuarioRepositorio.updateUsuario(u);
		String listaUsuarios = usuarioRepositorio.listUsuario().toString();
		*/
		PessoaRepositorio pessoaRepositorio = new PessoaRepositorio();
		//Pessoa p = new Pessoa(1, "Igor Salvati", "08903775619", 728524800);
		//pessoaRepositorio.updatePessoa(p);
		List<Pessoa> listaPessoas = pessoaRepositorio.listPessoa();
		
		/*EnderecoRepositorio enderecoRepositorio = new EnderecoRepositorio();
		Endereco e = new Endereco(1,"Av. Silvio Menicucci 415 A", "Nova Lavras", "3826-9999", 1);
		enderecoRepositorio.updateEndereco(e);
		String listaEnderecos = enderecoRepositorio.listEndereco().toString();
		
		result.include("variable", "VRaptor!");
		result.include("listaEnderecos", listaEnderecos);*/
		result.include("listPessoas", listaPessoas);
		//result.include("listaUsuarios", listaUsuarios);
	}
}