/**
 * 
 */
package com.uap.it1311l.passowrdencryptorapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.uap.it1311l.passowrdencryptorapi.webclient.EncryptionApiClient;

/**
 * @author Gabby
 *
 */
@Configuration
public class EncryptionApiConfig {

	@Bean
		EncryptionApiClient encryptionApi() {
		WebClient webClient = WebClient.builder()
				.baseUrl("https://encryption-apil.p.rapidapi.com/apiCryptor")
				.defaultHeader("X-RapidAPI-Key", "f369b503a3msh3cadf0e9d1c4511p15e3ebjsnd88d3b27a770")
				.defaultHeader("X-RapidAPI-Host", "encryption-apil.p.rapidapi.com")
				.build();
		
		HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build();
		return httpServiceProxyFactory.createClient(EncryptionApiClient.class);
	}
	
	
	
	
	
}
