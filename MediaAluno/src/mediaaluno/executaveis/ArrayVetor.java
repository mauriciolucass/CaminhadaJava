package mediaaluno.executaveis;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("mauricio");
		aluno.setNomeEscola("sousa java");
		
		
		double[] notas = {10,5.5,8.75,9.5};
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);
		
		
		double[] notasCss = {5.7,7.8,9.0,2.8};
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("css");
		disciplina2.setNota(notasCss);
		aluno.getDisciplinas().add(disciplina2);
		
		
		System.out.println("nome do aluno  : " + aluno.getNome() + " escrito no curso " + aluno.getNomeEscola());
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("========= disciplinas do aluno=================");
			System.out.println("disciplina : " + d.getDisciplina());
			System.out.println("notas do Aluno ");
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota" + pos + " sao :" + d.getNota()[pos]);
			}
		}
		
		
		
	}

}
