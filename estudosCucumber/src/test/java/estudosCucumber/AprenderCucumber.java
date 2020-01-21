package estudosCucumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class AprenderCucumber {

//	@Given("^que criei o arquivo corretamente$")
//	public void que_criei_o_arquivo_corretamente() throws Exception {
//		System.out.println("Teste CUCUMBER");
//	}
//
//	@When("^executa-lo$")
//	public void executalos() throws Exception {
//		System.out.println("Teste When");
//	}
//
//	@Then("^a especificação deve finalizar com sucesso$")
//	public void deve_finalizar_com_sucesso() throws Exception {
//		System.out.println("Teste Then");
//	}

//	private int cont = 0;
//
//	@Dado("^que o valor do contador é (\\d+)$")
//	public void valorDoContador(int arg1) throws Exception {
//		cont = arg1;
//	}
//
//	@Quando("^eu incrementar em (\\d+)$")
//	public void incrementar(int arg1) throws Exception {
//		cont += arg1;
//	}
//
//	@Então("^o valor do contador será (\\d+)$")
//	public void calculaContador(int arg1) throws Exception {
//		Assert.assertEquals(arg1, cont);
//	}

	Date entrega = new Date();

	@Dado("que a entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void que_a_entrega_é_dia(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes -1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("a entrega atrasar em (\\d+) dias$")
	public void a_entrega_atrasar_em_dias(Integer arg1) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, arg1);
		entrega = cal.getTime();
	
	}

	@Então("entrega será efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void entrega_será_efetuada_em(String data) {
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}

}
