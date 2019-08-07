package code.spec.spi;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class RequisicaoAInstituicaoRecebedor {
	
	public static void main(String[] args) throws IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("https://spi.nubank.com.br/dinamico/57ca2178-b8d0-4cdf-81e5-fbe4fc326f3b");
		HttpResponse response = client.execute(request);
		
		int statusCode = response.getStatusLine().getStatusCode();
		
		String body = EntityUtils.toString(response.getEntity(), "UTF-8");

		System.out.println("Status:" + statusCode + "\npayload: " + body);
	}
}
