package code.spec.spi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class ConfiabilidadeDominio {

	public static void main(String[] args) throws MalformedURLException {
		String[] trustedDomains = new String[] { "spi.nubank.com.br", "spi.bancodobrasil.com.br" };

		URL url = new URL("https://spi.nubank.com.br/dinamico/57ca2178-b8d0-4cdf-81e5-fbe4fc326f3b");

		boolean isDomainValid = Arrays.asList(trustedDomains).contains(url.getHost());

		if (isDomainValid) {
			System.out.println("Dominio confiavel");
		}
	}
}