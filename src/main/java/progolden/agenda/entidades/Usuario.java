package progolden.agenda.entidades;


public class Usuario {
	
	private int id;
	private String login;
	private int status_2;
	private int id_pessoa;
	
	public Usuario(String login, int status_2, int id_pessoa) {
		this.login = login;
		this.status_2 = status_2;
		this.id_pessoa = id_pessoa;
	}
	
	

	public Usuario() {
		super();
	}



	public Usuario(int id, String login, int status_2, int id_pessoa) {
		super();
		this.id = id;
		this.login = login;
		this.status_2 = status_2;
		this.id_pessoa = id_pessoa;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getStatus_2() {
		return status_2;
	}

	public void setStatus_2(int status_2) {
		this.status_2 = status_2;
	}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}



	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", status_2=" + status_2 + ", id_pessoa=" + id_pessoa + "]";
	}
	
	
	
	
	
	
}
