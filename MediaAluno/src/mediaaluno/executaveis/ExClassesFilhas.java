package mediaaluno.executaveis;

import javax.swing.JOptionPane;

import mediaaluno.classes.Aluno;
import mediaaluno.classes.Diretor;
import mediaaluno.classes.Secretario;

public class ExClassesFilhas {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("nome do Aluno ");
		String cpf = JOptionPane.showInputDialog("cpf ");
		String idade = JOptionPane.showInputDialog("idade ");
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setNumeroCpf(cpf);
		aluno.setIdade(Integer.valueOf(idade));

		String nomeDiretor = JOptionPane.showInputDialog("nome do Diretor");
		String cpfDiretor = JOptionPane.showInputDialog("cpf ");
		String cargo = JOptionPane.showInputDialog("cargo");
		String registroEducacional = JOptionPane.showInputDialog("registro educacional ");
		String idadeDiretor = JOptionPane.showInputDialog("idade ");
		Diretor diretor = new Diretor();
		diretor.setNome(nomeDiretor);
		diretor.setNumeroCpf(cpfDiretor);
		diretor.setCargo(cargo);
		diretor.setIdade(Integer.valueOf(idadeDiretor));
		diretor.setRegistroEducacional(registroEducacional);
		
		String nomeSecretario = JOptionPane.showInputDialog("nome do Secretario ");
		String cpfSecretario = JOptionPane.showInputDialog("cpf ");
		String cargoSecretario = JOptionPane.showInputDialog("cargo");
		String idadeSecretario = JOptionPane.showInputDialog("idade ");
		Secretario secretario = new Secretario();
		secretario.setNome(nomeSecretario);
		secretario.setNumeroCpf(cpfSecretario);
		secretario.setCargo(cargoSecretario);
		secretario.setIdade(Integer.valueOf(idadeSecretario));
		
		
		
		
		
		System.out.println(aluno.toString());
		System.out.println(aluno.pessoaMaiorIdade()+ " "+ aluno.mensagemMaiorIdade());
		aluno.pessoaMaiorIdade();
		System.out.println("--------------------------------------------------------");
		System.out.println(diretor.toString());
		System.out.println(diretor.pessoaMaiorIdade()+ " "+ diretor.mensagemMaiorIdade());
		System.out.println("--------------------------------------------------------");
		diretor.pessoaMaiorIdade();
		System.out.println(secretario.toString());
		System.out.println(secretario.pessoaMaiorIdade()+ " "+ secretario.mensagemMaiorIdade());
		secretario.pessoaMaiorIdade();
		
		
		
		
		
		
		
		
		

	}

}
