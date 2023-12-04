package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		String s = "Boa noite";
		System.out.println(s.concat("!!!"));
		System.out.println(s.endsWith("!!!"));
		
		s = "Bom dia";
		System.out.println(s);
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.length());
		
		System.out.println(s.equals("Bom dia"));
		System.out.println(s.equalsIgnoreCase("BOM DIA"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.98;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d de idade e recebe R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d de idade e recebe R$%.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		System.out.println(frase.contains("cebe"));
		System.out.println(frase.indexOf("senhor"));
		System.out.println(frase.substring(6, 17));
		
	}

}
