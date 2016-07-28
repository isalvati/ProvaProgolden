package progolden.agenda.repositorios;

import org.hibernate.Session;

import progolden.agenda.entidades.Usuario;

public class UsuarioRepositorio {
	
	private Session session;
	
	public void addUsuario(String nome, String telefone) {
		abrirConexao();
		this.session.save(new Usuario(nome, telefone));	
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
