package code.spec.spi;
public class ParseFormato1 {
	
	public static void main(String[] args) {
		String uri = "spi://spi#+5511928341823/brl/10.00";
		
		String strippedUri = uri.replace("spi://spi#", "");

		String[] paramametros = strippedUri.split("/");

		System.out.println("chave de enderecamento: " + paramametros[0]);
		System.out.println("moeda: " + paramametros[1]);
		System.out.println("valor: " + paramametros[2]);
	}
}