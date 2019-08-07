package code.spec.spi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ConfiabilidadeDominio {

	public static void main(String[] args) throws MalformedURLException {
		String[] dominiosConfiaveis = new String[] { "spi.nubank.com.br", "spi.bancodobrasil.com.br" };

		URL url = new URL("https://spi.nubank.com.br/dinamico/57ca2178-b8d0-4cdf-81e5-fbe4fc326f3b");

		boolean dominiosValidos = Arrays.asList(dominiosConfiaveis).contains(url.getHost());

		if (dominiosValidos) {
			System.out.println("Dominio confiavel");
		}
	}
}