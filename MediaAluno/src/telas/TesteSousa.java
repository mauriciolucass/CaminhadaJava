package telas;

import javax.swing.JOptionPane;

public class TesteSousa {
	public static void main(String[] args) {
		Thread certificadoEcpf = new Thread(ecpf);
		certificadoEcpf.start();
		Thread certificadoCnpj = new Thread(cnpj);
		certificadoCnpj.start();
		
		JOptionPane.showMessageDialog(null, "vou me torna um progamador java !");
		
		
	}
	
	private static Runnable  ecpf = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				System.out.println("envio de certificado pessoa fisica ");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
private static Runnable  cnpj = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				System.out.println("envio de certificado pessoa juridica ");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	

}
