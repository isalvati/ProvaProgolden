package progolden.agenda.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import progolden.agenda.entidades.Endereco;
import progolden.agenda.entidades.Pessoa;

public class EnderecoRepositorio {
	private Session session;

	public void addEndereco(String rua, String bairro, String telefone, int id_pessoa) {
		abrirConexao();
		this.session.save(new Endereco(rua, bairro, telefone, id_pessoa));
		fecharConexao();
	}
	
	public void addEndereco(Endereco e) {
		abrirConexao();
		this.session.save(e);
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
	
	public List<Endereco> listEndereco(){
		abrirConexao();
		Query query = session.createQuery("FROM " + Endereco.class.getName());
		List results = query.list();
		fecharConexao();
		return results;
	}
	
	public void updateEndereco(Endereco e){
		abrirConexao();
		this.session.update(e);
		fecharConexao();
	}
}
