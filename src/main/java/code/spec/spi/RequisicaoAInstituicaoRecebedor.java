/*
 * Copyright 2019 Nubank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
