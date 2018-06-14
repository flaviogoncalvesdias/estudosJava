
public class TesteTributavel {

	public static void main(String[] args) {
		Tributavel ab = new AcaoBolsa();
		Tributavel cc = new ContaCorrente(1259, 43245);
		Tributavel sv = new SeguroDeVida();
		
		CalculadorImposto calculador = new CalculadorImposto();
		
		System.out.println("Percentual de imposto "+calculador.calculadorImposto(ab));
		
		System.out.println("Percentual de imposto  "+calculador.calculadorImposto(cc));
		
		System.out.println("Percentual de imposto  "+calculador.calculadorImposto(sv));

	}

}
