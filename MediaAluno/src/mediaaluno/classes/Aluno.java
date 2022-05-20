package mediaaluno.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	private String serieMatriculado;
	private String dataMatricula;
	private String nomeEscola;
	
	List<Diciplina>disciplinas = new ArrayList<Diciplina>();
	
	
	public List<Diciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Diciplina> disciplinas) {
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
		for (Diciplina diciplina : disciplinas) {
			somaNotas += diciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media <=50) {
			if(media >=70) {
				return "Aluno Aprovado";
			}else {
				return "Aluno em Recuperação";
			}
			
		}else {
			return "Aluno Reprovado";
		}
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
	

}
