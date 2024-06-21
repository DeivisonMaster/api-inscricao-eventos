package br.com.evento.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.evento.dto.EmailRequisicaoDTO;

@FeignClient(name = "email-service-client", url="http://localhost:8090/api/emails")
public interface EmailServiceClient {
	
	@PostMapping
	void enviaEmail(@RequestBody EmailRequisicaoDTO email);
	
}
