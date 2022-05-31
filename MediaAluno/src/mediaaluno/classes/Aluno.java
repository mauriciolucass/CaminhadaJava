package mediaaluno.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import mediaaluno.constantes.StatusAluno;

public class Aluno extends Pessoa {
	private String serieMatriculado;
	private String dataMatricula;
	private String nomeEscola;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina diciplina : disciplinas) {
			somaNotas += diciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}

	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
				
			}

		} else {
			return StatusAluno.REPROVADO;
		}
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
		return Objects.hash(dataMatricula, nomeEscola, serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

	@Override
	public String toString() {
		return "Aluno [serieMatriculado=" + serieMatriculado + ", dataMatricula=" + dataMatricula + ", nomeEscola="
				+ nomeEscola + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
