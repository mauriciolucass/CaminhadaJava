package data.clesses;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class DatasEmJava2 {
		
		public static void main(String[] args) throws ParseException {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			
			Date dataVencimentoBoleto = simpleDateFormat.parse("15/09/2022");
			
			Date dataAtualHoje = simpleDateFormat.parse("15/08/2022");
			
			
			// Aftaer : se data 1 é maior que data 2
			// Before : se data 1 é menor qye d=
			
			if (dataVencimentoBoleto.before(dataAtualHoje)) {/*Se a data 1 é menor que a data 2*/
				System.out.println("Boleto vencido - URGENTE");
			}else {
				System.out.println("Boleto não vencido");
			}
			
			
		}

	}


