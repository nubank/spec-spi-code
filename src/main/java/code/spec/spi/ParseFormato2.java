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

public class ParseFormato2 {
	
	public static void main(String[] args) {
		String uri = "spi://pagar/+5511928341823/brl/10.00";

		String strippedUri = uri.replace("spi://pagar/", "");

		String[] paramametros = strippedUri.split("/");

		System.out.println("chave de enderecamento: " + paramametros[0]);
		System.out.println("moeda: " + paramametros[1]);
		System.out.println("valor: " + paramametros[2]);

	}
}