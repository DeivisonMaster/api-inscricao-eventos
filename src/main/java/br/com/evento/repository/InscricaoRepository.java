package br.com.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.evento.model.Inscricao;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long>{
	
}
