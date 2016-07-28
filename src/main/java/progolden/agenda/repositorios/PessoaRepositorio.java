package progolden.agenda.repositorios;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import progolden.agenda.entidades.Pessoa;

public class PessoaRepositorio {
private Session session;
	
	public void addPessoa(String nome, String cpf, long nascimento) {
		abrirConexao();
		this.session.save(new Pessoa(nome, cpf, nascimento));	
		fecharConexao();
	}
	
	private void abrirConexao() {
		this.session = SessionSingleton.getFactory().openSession();
		session.beginTransaction();
	}
	
	private void fecharConexao() {
		this.session.getTransaction().commit();
		this.session.close();
	}
	
	public List<Pessoa> listPessoa(){
		abrirConexao();
		Query query = session.createQuery("FROM " + Pessoa.class.getName());
		List results = query.list();
		fecharConexao();
		return results;
	}
}
