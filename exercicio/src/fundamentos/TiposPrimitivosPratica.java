package fundamentos;

public class TiposPrimitivosPratica {
	public static void main (String [] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 123411;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano;
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'a';
		
		// Dias de empresa
		System.out.println("dias de empresa: " + anosDeEmpresa * 365);
		System.out.println("numeros de voos: " + numeroDeVoos / 2);
		System.out.println("Pontos por real: " + pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Está de férias: " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
