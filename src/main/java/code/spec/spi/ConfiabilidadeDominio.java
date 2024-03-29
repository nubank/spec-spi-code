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