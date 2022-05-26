package mediaaluno.executaveis;

import javax.swing.JOptionPane;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Diretor;
import mediaaluno.classes.Secretario;

public class ExClassesFilhas {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("nome do Aluno ");
		String cpf = JOptionPane.showInputDialog("cpf ");
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNumeroCpf(cpf);

		String nomeDiretor = JOptionPane.showInputDialog("nome do Aluno ");
		String cpfDiretor = JOptionPane.showInputDialog("cpf ");
		String cargo = JOptionPane.showInputDialog("cargo");
		String registroEducacional = JOptionPane.showInputDialog("registro educacional ");
		Diretor diretor = new Diretor();
		diretor.setNome(nomeDiretor);
		diretor.setNumeroCpf(cpfDiretor);
		diretor.setCargo(cargo);
		diretor.setRegistroEducacional(registroEducacional);
		
		String nomeSecretario = JOptionPane.showInputDialog("nome do Aluno ");
		String cpfSecretario = JOptionPane.showInputDialog("cpf ");
		String cargoSecretario = JOptionPane.showInputDialog("cargo");
		Secretario secretario = new Secretario();
		secretario.setNome(nomeSecretario);
		secretario.setNumeroCpf(cpfSecretario);
		secretario.setCargo(cargoSecretario);
		
		
		
		

	}

}
