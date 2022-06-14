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
		
		
	/*	System.out.println("nome do aluno  : " + aluno.getNome() + " escrito no curso " + aluno.getNomeEscola());
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("========= disciplinas do aluno=================");
			System.out.println("disciplina : " + d.getDisciplina());
			System.out.println("notas do Aluno ");
			double maxNota = 0;
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota" + pos + " sao :" + d.getNota()[pos]);
				if(pos == 0) {
					maxNota = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] < maxNota) {
						maxNota = d.getNota()[pos];
					}
				}
				
			}
			System.out.println("A menor nota da disciplina " + d.getDisciplina() + " e :"+ maxNota);
		}
		
		*/
		
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("lucas");
		aluno2.setNomeEscola("sousa java");
		
		
		double[] notasLogica = {10,5.5,8.75,9.5};
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("logica");
		disciplina3.setNota(notasLogica);
		aluno2.getDisciplinas().add(disciplina3);
		
		
		double[] notasHtml = {5.7,7.8,9.0,2.8};
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("html");
		disciplina4.setNota(notasCss);
		aluno2.getDisciplinas().add(disciplina4);
		
		Aluno[] arrayAluno = new Aluno[2];
		arrayAluno[0] = aluno;
		arrayAluno[1] = aluno2;
		for(int pos = 0; pos < arrayAluno.length; pos++) {
			System.out.println("o nome do aluno : " + arrayAluno[pos].getNome());
			for(Disciplina d : arrayAluno[pos].getDisciplinas()) {
				System.out.println("nome da disciplina : " + d.getDisciplina());
				double maxN = 0;
				for(int posn = 0; posn < d.getNota().length; posn++) {
					System.out.println("A nota numero " + posn + "  e = "+ d.getNota()[posn]);
					if(posn == 0) {
						maxN = d.getNota()[pos];
					}else {
						if(d.getNota()[pos] > maxN) {
							maxN = d.getNota()[pos];
							
						}
						
					}
				}
				System.out.println("A maior nota da "+ d.getDisciplina() + " e = " + maxN);
			}
			
		}
			
		
		
	}
	

}
