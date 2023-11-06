/**
 * 
 */
package com.uap.it1311l.passowrdencryptorapi.webclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.HttpExchange;

import com.uap.it1311l.passowrdencryptorapi.models.EncryptionResponse;

/**
 * @author Gabby
 *
 */
@HttpExchange
public interface EncryptionApiClient {

	@GetMapping("/encryptstring?secretKey={secretKey}&plainText={plainText}&cryptAlgorithm={cryptAlgorithm}")
    EncryptionResponse encrypt(
        @RequestParam("secretKey") String secretKey,
        @RequestParam("plainText") String plainText,
        @RequestParam("cryptAlgorithm") String cryptAlgorithm);
	
}
