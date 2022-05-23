package mediaaluno.executaveis;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Disciplina;
import mediaaluno.constantes.StatusAluno;

public class Executavel {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 5; qtd++) {
			String nome = JOptionPane.showInputDialog("nome do Aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("idade ?"); String dataNascimento
			 * = JOptionPane.showInputDialog(" data de nascimento"); String cpf =
			 * JOptionPane.showInputDialog(" informe o cpf "); String rg =
			 * JOptionPane.showInputDialog("informe o RG "); String mae =
			 * JOptionPane.showInputDialog("nome da Mae ?"); String pai =
			 * JOptionPane.showInputDialog("nome do pai ?"); String serie =
			 * JOptionPane.showInputDialog("serie matriculado"); String dataMatricula =
			 * JOptionPane.showInputDialog("data da matricula"); String escola =
			 * JOptionPane.showInputDialog("nome da escola ?");
			 */
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setNumeroCpf(cpf);
			 * aluno1.setRegistroGeral(rg); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setSerieMatriculado(serie); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("nome da disciplina " + pos + "?");
				String nomeNota = JOptionPane.showInputDialog("nota " + pos + "?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(nomeNota));
				aluno1.getDisciplinas().add(disciplina);
			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 0;
				while (continuarRemover == 0) {
					String discplinaRemover = JOptionPane
							.showInputDialog("qual disciplia deseja remover 1, 2, 3, ou 4");
					aluno1.getDisciplinas().remove(Integer.valueOf(discplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "continuar a remover ?");

				}

			}

			alunos.add(aluno1);
		}
		for (Aluno aluno : alunos) {
			if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
				
			}else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
				
			}else {
				alunosReprovados.add(aluno);
				
			}
		
			
		}
		System.out.println("------------lista dos aprovados -------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado :" + aluno.getAlunoAprovado());
			System.out.println("media : "+ aluno.getMediaNota());
			
			
			
		}
		System.out.println("------------lista de recuperação-------------------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado :" + aluno.getAlunoAprovado());
			System.out.println("media : "+ aluno.getMediaNota());
			
			
		}
		System.out.println("-----------lista de Reprovados --------------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado :" + aluno.getAlunoAprovado());
			System.out.println("media : "+ aluno.getMediaNota());
			
		}
		
		
	}

}
