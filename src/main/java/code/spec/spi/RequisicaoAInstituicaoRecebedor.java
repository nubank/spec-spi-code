package code.spec.spi;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class RequisicaoAInstituicaoRecebedor {
	
	public static void main(String[] args) throws IOException {
		HttpClient cliente = HttpClientBuilder.create().build();
		HttpGet requisicao = new HttpGet("https://spi.nubank.com.br/dinamico/57ca2178-b8d0-4cdf-81e5-fbe4fc326f3b");
		HttpResponse resposta = cliente.execute(requisicao);
		
		int statusCode = resposta.getStatusLine().getStatusCode();
		
		String corpo = EntityUtils.toString(resposta.getEntity(), "UTF-8");

		System.out.println("Status:" + statusCode + "\ncorpo: " + corpo);
	}
}
