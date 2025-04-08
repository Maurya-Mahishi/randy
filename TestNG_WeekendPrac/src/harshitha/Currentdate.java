package harshitha;

import java.time.LocalDate;
import java.util.Date;

public class Currentdate {
	public static void main(String[] args) {
		//LocalDate current = LocalDate.now();
		Date d =new Date();
		System.out.println(d);
		String d2 = d.toString();
		String d1 = d2.replaceAll(":", "-");
		System.out.println(d1);
		//System.out.println(current);
	}

}
