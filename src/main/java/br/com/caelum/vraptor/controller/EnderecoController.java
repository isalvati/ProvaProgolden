package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import progolden.agenda.entidades.Endereco;
import progolden.agenda.repositorios.EnderecoRepositorio;

@Controller
public class EnderecoController {
	EnderecoRepositorio enderecoDao = new EnderecoRepositorio();
	@Inject
    private Result result;
	@Post
	public void adcionaEndereco(Endereco endereco){
		enderecoDao.addEndereco(endereco);
		result.use(Results.logic()).redirectTo(IndexController.class).index();
	}
}
