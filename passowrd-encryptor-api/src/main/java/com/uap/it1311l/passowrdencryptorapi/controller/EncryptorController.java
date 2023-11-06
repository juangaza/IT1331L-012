package com.uap.it1311l.passowrdencryptorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311l.passowrdencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passowrdencryptorapi.models.UapEncryptionRequest;
import com.uap.it1311l.passowrdencryptorapi.service.EncryptDecryptService;

@RestController
@RequestMapping("/api/encryption")
public class EncryptorController {

	
	   @Autowired
	    private EncryptDecryptService encryptDecryptService;

	    @GetMapping("/encryptString")
	    public EncryptionResponse encryptString(@RequestBody UapEncryptionRequest request) {
	        // Assuming you have an encryptDecryptService to perform encryption
	        EncryptionResponse response = encryptDecryptService.encrypt(request.getPassword());
	        return response;
	    }
	
	
}
