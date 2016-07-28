package progolden.agenda.entidades;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;
	private long nascimento;
	
	public Pessoa(String nome, String cpf, long nascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}
	
	

	public Pessoa(int id, String nome, String cpf, long nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}



	public Pessoa() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public long getNascimento() {
		return nascimento;
	}

	public void setNascimento(long nascimento) {
		this.nascimento = nascimento;
	}



	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", nascimento=" + nascimento + "]";
	}
	
	
	
	
	
}