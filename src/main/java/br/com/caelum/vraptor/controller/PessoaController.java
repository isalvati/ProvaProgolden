package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import progolden.agenda.entidades.Endereco;
import progolden.agenda.entidades.Pessoa;
import progolden.agenda.repositorios.PessoaRepositorio;


@Controller
public class PessoaController {
	PessoaRepositorio pessoaDao = new PessoaRepositorio();
	Result result;
	@Post
	@Path("/pessoa/listaPessoas")
	public List<Pessoa> listaPessoas (){
		//result.include("listPessoas", pessoaDao.listPessoa());
		return pessoaDao.listPessoa();
	}
	
	@Post
	@Path("/pessoa/adcionaPessoa")
	public void adcionaPessoa(Pessoa pessoa){
		pessoaDao.addPessoa(pessoa);
	}
	
}
