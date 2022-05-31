package mediaaluno.classes;

import java.util.Objects;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String numeroCpf;
	protected String registroGeral;
	protected String nomeMae;
	protected String nomePai;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	public String mensagemMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Maior de Idade!" : " Menor de Idade";
	}
	
	public abstract double salario();

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, idade, nome, nomeMae, nomePai, numeroCpf, registroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(registroGeral, other.registroGeral);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroCpf="
				+ numeroCpf + ", registroGeral=" + registroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ "]";
	}
	

}
