package mediaaluno.executaveis;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Disciplina;

public class Executavel {
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		for (int qtd = 1; qtd <= 2; qtd++) {
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

			for (int pos = 1; pos <= 4; pos++) {
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
			if (aluno.getNome().equalsIgnoreCase("mauricio")) {
				alunos.remove(alunos);
				break;
			} else {

				System.out.println(aluno.toString());
				System.out.println("Nome do Aluno : " + aluno.getNome());
				System.out.println("A media do Aluno e : " + aluno.getMediaNota());
				System.out.println("Rewsultado e : " + aluno.getAlunoAprovado());
				
			}

		}

	}

}
