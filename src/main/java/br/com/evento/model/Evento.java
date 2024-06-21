package br.com.evento.model;

import br.com.evento.dto.EventoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "evento")
@EqualsAndHashCode(of = "id")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "quantidade_max_participantes")
	private int quantidadeMaximaParticipantes;
	private String data;
	private String titulo;
	private String descricao;
	
	public Evento(EventoDTO evento) {
		this.data = evento.data();
		this.quantidadeMaximaParticipantes = evento.quantidadeMaximaParticipantes();
		this.titulo = evento.titulo();
		this.descricao = evento.descricao();
	}
}
