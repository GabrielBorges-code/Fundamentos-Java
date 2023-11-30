package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		final double Pi = 3.14149;
		double raio = 3.4;
		
		double area = Pi * raio * raio;
		
		System.out.println("resultado = " + area);
		
		raio = 5;
		
		area = Pi * raio * raio;
		
		System.out.println("resultado = " + area);
	}

}
