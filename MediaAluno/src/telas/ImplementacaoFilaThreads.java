package telas;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThreads extends Thread {
	private static ConcurrentLinkedQueue<ListaThreads> pilha_filha = new ConcurrentLinkedQueue<>();

	public static void add(ListaThreads fListaThreads) {
		pilha_filha.add(fListaThreads);
	}

	@Override
	public void run() {
		System.out.println("fila rodando!");
		

		while (true) {
			

			synchronized (pilha_filha) {// bloquear a esta lista por outro processo
				Iterator iteracao = pilha_filha.iterator();
				while (iteracao.hasNext()) {/* enquanto tiver dados sera processado */
					ListaThreads processar = (ListaThreads) iteracao.next();
					
					
					/* aqui dentro escrevemos a rotina */

					// gera envio de notas fiscais
					// gera envio em massa de email
					// gera envio de PDF
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					iteracao.remove();

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) { /* da um tempo para descarga de memoria */
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

			super.run();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
