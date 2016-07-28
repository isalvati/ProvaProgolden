package progolden.agenda.repositorios;

import org.hibernate.Session;

import progolden.agenda.entidades.Endereco;

public class EnderecoRepositorio {
	private Session session;

	public void addEndereco(String rua, String bairro, String telefone, int id_pessoa) {
		abrirConexao();
		this.session.save(new Endereco(rua, bairro, telefone, id_pessoa));
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
