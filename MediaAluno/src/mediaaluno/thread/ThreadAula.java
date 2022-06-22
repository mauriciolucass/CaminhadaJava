package mediaaluno.thread;

import javax.swing.JOptionPane;

public class ThreadAula {
	public static void main(String[] args) throws InterruptedException {

	Thread  threadEmail = new Thread(thread1);
	threadEmail.start();
	Thread threadNfce = new Thread(thread2);
	threadNfce.start();
	

		/* o codigo do usuario continua o fluxo de trabalho */
		// fluxo do sistema
		JOptionPane.showMessageDialog(null, "O progama continua executando para o usuario");

	}
	
         private  static Runnable thread1 = new Runnable() {
			
			@Override
			public void run() {
				
				
				for (int pos = 0; pos <= 10; pos++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("envio de Email para clientes !!");

				} // fim do codigo

				
			}
		};
		
		private static Runnable thread2 = new Runnable() {
			
			@Override
			public void run() {
			
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
			}
		};

}
