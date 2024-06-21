package br.com.evento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.evento.dto.EventoDTO;
import br.com.evento.dto.InscricaoDTO;
import br.com.evento.model.Evento;
import br.com.evento.service.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {
	
	@Autowired
	private EventoService eventoService;
	
	@GetMapping
	public ResponseEntity<List<Evento>> listarTodosEventos(){
		return ResponseEntity.ok(eventoService.listaTodosOsEventos());
	}
	
	@GetMapping("/porData")
	public ResponseEntity<List<Evento>> listaTodosOsEventosPorVir(){
		return ResponseEntity.ok(eventoService.listaTodosOsEventosPorVir());
	}
	
	@PostMapping
	public ResponseEntity<Evento> cadastrar(@RequestBody EventoDTO evento){
		return new ResponseEntity<>(eventoService.cadastra(evento), HttpStatus.CREATED);
	}
	
	@PostMapping("/{eventoId}/registrar")
	public ResponseEntity<Void> registraParticipante(@PathVariable("eventoId") Long eventoId, @RequestBody InscricaoDTO inscricao){
		eventoService.registraNovaInscricaoDeParticipante(eventoId, inscricao.emailParticipante());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
