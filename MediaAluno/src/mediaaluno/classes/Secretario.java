package mediaaluno.classes;

import java.util.Objects;

import mediaalun.interfaces.PermitirAcesso;

public class Secretario extends Pessoa  implements PermitirAcesso {
	private String cargo;
	private String titulacao;
	private String registroEducacional;
	
	private String login;
	private String senha;
	
	

	
	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Secretario() {
		
	}



	public Secretario(String login , String senha) {
		this.login = login;
		this.senha = senha;		
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
		Secretario other = (Secretario) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(registroEducacional, other.registroEducacional)
				&& Objects.equals(titulacao, other.titulacao);
	}

	@Override
	public String toString() {
		return "Secretario [cargo=" + cargo + ", titulacao=" + titulacao + ", registroEducacional="
				+ registroEducacional + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3000.00 * 0.9;
	}



	@Override
	public boolean autenticar(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		return autenticar();
	}



	@Override
	public boolean autenticar() {
		return login.equals("escola") && senha.equals("123");		
	}



	

	

}
