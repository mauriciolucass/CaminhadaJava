package telas;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) {

		Thread email = new Thread(thread1);
		email.start();

		Thread nfce = new Thread(thread2);
		nfce.start();

		JOptionPane.showMessageDialog(null, "progama rodando normal para o usuario");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("envio de email!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("envio de nota fiscal !");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

}
