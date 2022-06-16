package mediaaluno.executaveis;

public class Matrizes {
	public static void main(String[] args) {

	/*	int[][] notas = new int[2][3];

		notas[0][0] = 90;
		notas[0][1] = 50;
		notas[0][2] = 87;

		notas[1][0] = 7;
		notas[1][1] = 8;
		notas[1][2] = 4;

		

		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			
			System.out.println("----------------------------------------------------");

			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {

				System.out.println("o valor da matriz : " + notas[poslinha][poscoluna]);

			}

		}*/
		
		// criando uma matrix teste
		
		String[][] nomes = new String[2][4];
		
		nomes[0][0] = "socorro";
		nomes[0][1] = "jorge";
		nomes[0][2] = "mauricio";
		nomes[0][3] = "jorge filho";
		
		nomes[1][0] = "joselha";
		nomes[1][1] = "isis";
		nomes[1][2] = "vitoria";
		nomes[1][3] = "lucas";
		
		for(int poslinhas = 0; poslinhas < nomes.length; poslinhas++ ) {
			System.out.println("---------------------------------");
			for(int poscolunas = 0;poscolunas < nomes[poslinhas].length; poscolunas++) {
				System.out.println("nome dos menbro da familia : "+ nomes[poslinhas][poscolunas] );
				
				
			}
		}
		

	}

}
