package progolden.agenda.entidades;

public class EnderecoPessoa {
	private String nome;
	private String rua;
	private String bairro;
	private String telefone;
	
	public EnderecoPessoa(String nome, String rua, String bairro, String telefone) {
		super();
		this.nome = nome;
		this.rua = rua;
		this.bairro = bairro;
		this.telefone = telefone;
	}

	public EnderecoPessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	
	
}
