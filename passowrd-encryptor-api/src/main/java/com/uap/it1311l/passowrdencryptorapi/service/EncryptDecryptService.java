/**
 * 
 */
package com.uap.it1311l.passowrdencryptorapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uap.it1311l.passowrdencryptorapi.models.EncryptionResponse;
//import com.uap.it1311l.passowrdencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passowrdencryptorapi.webclient.EncryptionApiClient;

/**
 * @author Gabby
 *
 */
@Service
public class EncryptDecryptService {
	
	@Autowired
	EncryptionApiClient apiClient;
	
	 public EncryptionResponse encrypt(String password) {
	        // You can replace "whateverkeyyouwant" and "AES" with actual values
	        return apiClient.encrypt("whateverkeyyouwant", password, "AES");
	    }

	
	
}
