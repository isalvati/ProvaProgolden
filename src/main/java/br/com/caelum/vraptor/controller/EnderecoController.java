package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import progolden.agenda.entidades.Endereco;
import progolden.agenda.repositorios.EnderecoRepositorio;

@Controller
public class EnderecoController {
	EnderecoRepositorio enderecoDao = new EnderecoRepositorio();
	
	@Post
	@Path("/endereco/adcionaEndereco")
	public void adcionaEndereco(Endereco endereco){
		enderecoDao.addEndereco(endereco);
	}
}
