package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class ExplorandoDatas {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		
		
		Date date = new Date();
		
		System.out.println("mili segundos :"+ date.getTime());
		System.out.println("Calendar milisegunndos:"+ calendar.getTimeInMillis());
		System.out.println("dia do nmes :"+ date.getDate());
		System.out.println("calendar dia do mes :"+ calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("dia da semana :"+date.getDay());
		System.out.println("calendar dia semana :"+(calendar.get(calendar.DAY_OF_WEEK )-1));
		System.out.println("hora do dia : "+date.getHours());
		System.out.println("calendar hara do dia :"+calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("minutos da hora : "+date.getMinutes());
		System.out.println("calendar minutos da hora :"+calendar.get(calendar.MINUTE));
		System.out.println("segundos :"+date.getSeconds());
		System.out.println("calendar segundos :"+ calendar.get(calendar.MILLISECOND));
		System.out.println("ano :"+(date.getYear()+ 1900));
		System.out.println("calendar ano :"+ calendar.get(calendar.YEAR));
		
		
		
		/*----------------simple date format--------------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("formato padrao de data :"+simpleDateFormat.format(date));
		System.out.println("calendar formato data padrao :"+ simpleDateFormat.format(calendar.getInstance().getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("formato de data para banco de dados :"+simpleDateFormat.format(date));
		System.out.println("calendar formato de data para banco de dados :"+simpleDateFormat.format(calendar.getTime()));
		
		System.out.println("objeto date :"+ simpleDateFormat.parse("2022-09-08 17:33.15"));
		
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
		System.out.println("objeto date :"+ simpleDateFormat.parse("2022-09-08 "));
	
		

		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy ");
		System.out.println("objeto date :"+ simpleDateFormat.parse("09/08/2022 "));
		
		
	}

}
