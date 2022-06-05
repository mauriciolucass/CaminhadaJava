package mediaaluno.executaveis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Diretor;
import mediaaluno.classes.Disciplina;
import mediaaluno.constantes.StatusAluno;
import mediaaluno.funcoesauxiliares.FuncaoAutenticar;

public class Executavel {
	public static void main(String[] args) {

		try {
				

			String login = JOptionPane.showInputDialog("iforme o usuario ");
			String senha = JOptionPane.showInputDialog("iforme a senha  ");

			if (new FuncaoAutenticar(new Diretor(login, senha)).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 5; qtd++) {
					String nome = JOptionPane.showInputDialog("nome do Aluno " + qtd + "?");
					String idade = JOptionPane.showInputDialog("idade  do Aluno ");

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));

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
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);

					} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);

					} else {
						maps.get(StatusAluno.REPROVADO).add(aluno);

					}

				}
				System.out.println("------------lista dos aprovados -------------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println("Resultado :" + aluno.getAlunoAprovado());
					System.out.println("media : " + aluno.getMediaNota());

				}
				System.out.println("------------lista de recuperação-------------------------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Resultado :" + aluno.getAlunoAprovado());
					System.out.println("media : " + aluno.getMediaNota());

				}
				System.out.println("-----------lista de Reprovados --------------------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println("Resultado :" + aluno.getAlunoAprovado());
					System.out.println("media : " + aluno.getMediaNota());

				}
				
				

			} else {
				JOptionPane.showMessageDialog(null, "Acesso negado ");
			}

		} catch (NumberFormatException e) {
			e.printStackTrace(); // imprime erro no condole

			StringBuilder saida = new StringBuilder();

			System.out.println("mensagem de erro : " + e.getMessage());

			for (int i = 0; i <= e.getStackTrace().length; i++) {
				saida.append(" \n mensagem de erro : " + e.getStackTrace()[i].getClassName());
				saida.append("\n metodo de erro : " + e.getStackTrace()[i].getMethodName());
				saida.append("\n linha de erro : " + e.getStackTrace()[i].getLineNumber());
			}

			JOptionPane.showMessageDialog(null, "Erro ao Processar Notas !" + saida.toString());

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "erro null poiter exception !" + e.getClass());

		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "erro inesperado" + e.getClass().getName());
		}
		finally {
			JOptionPane.showMessageDialog(null, "Praticando java !");
		}

	}

}
