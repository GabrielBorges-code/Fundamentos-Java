package fundamentos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Importe {

	public static void main(String[] args) {
		String s = "Bom dia, chefe!";
		System.out.println(s);
		
		Date d = new Date();
		LocalDateTime data = LocalDateTime.now();
		// System.out.println(d.getHours() + ":" + d.getMinutes()); // forma obsoleta
		System.out.println(d);
		System.out.println(data.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		// JButton botao = new JButton();
		
	}
}
