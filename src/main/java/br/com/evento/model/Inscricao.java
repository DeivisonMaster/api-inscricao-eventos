package br.com.evento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inscricao")
@EqualsAndHashCode(of = "id")
public class Inscricao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_evento")
	private Evento evento;
	
	@Column(name = "email_participante")
	private String emailParticipante;
	
	public Inscricao(Evento evento, String emailParticipante) {
		this.evento = evento;
		this.emailParticipante = emailParticipante;
	}

}
