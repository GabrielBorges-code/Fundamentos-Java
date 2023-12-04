package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
				
		String s = "Bom dia X";
		
		s = s.replace("X", "Gabriel");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);	
		System.out.println("dragon age".toUpperCase());
		
		String y = "Boa noite X"
				.replace("X", "banana!");
		
		System.out.println(y);
		
		// tipos primitivos não tem notação de ponto.
		int a = 13;
		
	}
}
