package br.com.evento.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.evento.dto.EmailRequisicaoDTO;

@FeignClient(name = "email-service-client", url="ec2-54-90-168-119.compute-1.amazonaws.com:8080/api/email")
public interface EmailServiceClient {
	
	@PostMapping
	void enviaEmail(@RequestBody EmailRequisicaoDTO email);
	
}
