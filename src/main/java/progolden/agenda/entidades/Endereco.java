package progolden.agenda.entidades;

public class Endereco {
	private int id;
	private String rua;
	private String bairro;
	private String telefone;
	private int id_pessoa;
	
	public Endereco(String rua, String bairro, String telefone, int id_pessoa) {
		this.rua = rua;
		this.bairro = bairro;
		this.telefone = telefone;
		this.id_pessoa = id_pessoa;
	}
	
	
	public Endereco() {
		super();
	}

	public Endereco(int id, String rua, String bairro, String telefone, int id_pessoa) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.telefone = telefone;
		this.id_pessoa = id_pessoa;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", telefone=" + telefone + ", id_pessoa="
				+ id_pessoa + "]";
	}
	
	
	
	
	
	
}
