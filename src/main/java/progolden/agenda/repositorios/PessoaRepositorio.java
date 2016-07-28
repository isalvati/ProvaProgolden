package progolden.agenda.repositorios;

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
}
