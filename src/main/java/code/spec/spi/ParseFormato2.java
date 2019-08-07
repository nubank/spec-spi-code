package code.spec.spi;
public class ParseFormato2 {
	
	public static void main(String[] args) {
		String uri = "spi://pagar/+5511928341823/brl/10.00";

		String strippedUri = uri.replace("spi://pagar/", "");

		String[] params = strippedUri.split("/");

		System.out.println("chave de enderecamento: " + params[0]);
		System.out.println("moeda: " + params[1]);
		System.out.println("valor: " + params[2]);

	}
}