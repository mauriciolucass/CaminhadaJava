package mediaaluno.thread;

import javax.swing.JOptionPane;

public class TestAula {
	public static void main(String[] args) {
		
		new Thread() {
			public void run() {
				for(int pos = 0; pos < 10; pos++) {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("so queria vc aqui mae !");
				}
			};
		}.start();
		
		JOptionPane.showMessageDialog(null, " esta tudo normal para o usuario");
	}

}
