package progolden.agenda.repositorios;

import org.hibernate.Session;

import progolden.agenda.entidades.Usuario;

public class UsuarioRepositorio {
	
	private Session session;
	
	public void addUsuario(String login, int status_2, int id_pessoa) {
		abrirConexao();
		this.session.save(new Usuario(login, status_2, id_pessoa));	
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
