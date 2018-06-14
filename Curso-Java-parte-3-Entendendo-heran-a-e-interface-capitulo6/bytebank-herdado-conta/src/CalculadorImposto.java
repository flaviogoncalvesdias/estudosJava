
public class CalculadorImposto {
	
	public double calculadorImposto(Tributavel tributavel) {
		return tributavel.getValorImposto()*100;
	}

}
