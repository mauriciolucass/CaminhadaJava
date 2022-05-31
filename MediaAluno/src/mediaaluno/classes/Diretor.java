package mediaaluno.classes;

import java.util.Objects;

public class Diretor extends Pessoa{
	private String cargo;
	private String titulacao;
	private String registroEducacional;
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getRegistroEducacional() {
		return registroEducacional;
	}

	public void setRegistroEducacional(String registroEducacional) {
		this.registroEducacional = registroEducacional;
	}
	@Override
	public boolean pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	@Override
	public String mensagemMaiorIdade() {
		// TODO Auto-generated method stub
		return super.mensagemMaiorIdade();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cargo, registroEducacional, titulacao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(registroEducacional, other.registroEducacional)
				&& Objects.equals(titulacao, other.titulacao);
	}

	@Override
	public String toString() {
		return "Diretor [cargo=" + cargo + ", titulacao=" + titulacao + ", registroEducacional=" + registroEducacional
				+ "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 5000.00;
	}
	

}
