package mediaaluno.thread;

import javax.swing.JOptionPane;

public class ThreadAula {
	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {// executa o que nos queremos
				/* codigo da rotina */
				/* codigo da rotina que eu quero executar em paralelo */
				for (int pos = 0; pos <= 10; pos++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("envio de Email para clientes !!");

				} // fim do codigo

			};

		}.start();// Start liga a thread que fica processando paralelamente
		
		//=====================DIVISAO==============================
		
		new Thread() {
			public void run() {// executa o que nos queremos
				/* codigo da rotina */
				/* codigo da rotina que eu quero executar em paralelo */
				for (int pos = 0; pos <= 10; pos++) {
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("envio de notas ficais de clientes");

				} // fim do codigo

			};

		}.start();// Start liga a thread que fica processando paralelamente

		/* o codigo do usuario continua o fluxo de trabalho */
		// fluxo do sistema
		JOptionPane.showMessageDialog(null, "O progama continua executando para o usuario");

	}

}
