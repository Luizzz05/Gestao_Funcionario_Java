package model;

public class Funcionario {
    private String nome;
    private String cargo;
    private String habilidades;
    private int idade;
    private String sexo;
    private String endereco;
    private String cidade;
    private String estado;
    
    
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String cargo, String habilidades, int idade, String sexo, String endereco,
			String cidade, String estado) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.habilidades = habilidades;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
