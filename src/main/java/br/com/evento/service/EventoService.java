package br.com.evento.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evento.dto.EmailRequisicaoDTO;
import br.com.evento.dto.EventoDTO;
import br.com.evento.exception.EventoLotadoException;
import br.com.evento.exception.EventoNaoEncontradoException;
import br.com.evento.model.Evento;
import br.com.evento.model.Inscricao;
import br.com.evento.repository.EventoRepository;
import br.com.evento.repository.InscricaoRepository;

@Service
public class EventoService {
	
	private static final int QUANTIDADE_MAX_PARTICIPANTES = 20;
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Autowired
	private EmailServiceClient emailService;
	
	
	public List<Evento> listaTodosOsEventos(){
		return eventoRepository.findAll();
	}
	
	public List<Evento> listaTodosOsEventosPorVir(){
		return eventoRepository.consultaTodosOsEventosPorData(LocalDateTime.now());
	}
	
	public Evento cadastra(EventoDTO eventoDTO) {
		Evento evento = new Evento(eventoDTO);
		return eventoRepository.save(evento);
	}
	
	private boolean isEventoLotado() {
		return eventoRepository.count() > QUANTIDADE_MAX_PARTICIPANTES;
	}

	
	public void registraNovaInscricaoDeParticipante(Long eventoId, String emailParticipante) {
		Evento evento = eventoRepository
				.findById(eventoId)
				.orElseThrow(() -> new EventoNaoEncontradoException("Evento não encontrado!"));
		
		if(isEventoLotado()) {
			throw new EventoLotadoException("Evento atingiu o numero máximo de participantes!");
		}
		
		Inscricao inscricao = new Inscricao(evento, emailParticipante);
		inscricaoRepository.save(inscricao);
		
		EmailRequisicaoDTO emailRequisicao = new EmailRequisicaoDTO(emailParticipante, "Confirmação de Inscrição", "Olá, você foi inscrito no evento com sucesso!");
		emailService.enviaEmail(emailRequisicao);
	}

}
