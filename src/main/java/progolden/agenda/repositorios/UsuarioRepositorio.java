package progolden.agenda.repositorios;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import progolden.agenda.entidades.Endereco;
import progolden.agenda.entidades.Pessoa;
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
	
	public List<Usuario> listUsuario(){
		abrirConexao();
		Query query = session.createQuery("FROM " + Usuario.class.getName());
		List results = query.list();
		fecharConexao();
		return results;
	}
	
	public void updateUsuario(Usuario u){
		abrirConexao();
		this.session.update(u);
		fecharConexao();
	}
}
