package mediaaluno.executaveis;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		
		
		String txt = "mauricio , curso java , 90 ,76 , 12 , 34";
		
		String[] valorArray = txt.split(",");
		System.out.println("nome   : " +valorArray[0]);
		System.out.println("curso  :" + valorArray[1]);
		System.out.println("nota 1 : " + valorArray[2]);
		System.out.println("nota 2 : " + valorArray[3]);
		System.out.println("nota 3 : " + valorArray[4]);
		System.out.println("nota 4 :" + valorArray[5]);
		
		
		//convertendo um array para lista 
		
		List<String> list = Arrays.asList(valorArray);
		
		for (String valorstring : list) {
			System.out.println(valorstring);
			
		}
		// convertendo uma lista para array
		
		String[] coversaoArray = list.toArray(new String[6]);
		System.out.println(coversaoArray);
		
		for(int pos = 0; pos < coversaoArray.length; pos++) {
			System.out.println(coversaoArray[pos]);
			
		}
		
	}

}
