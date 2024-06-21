package br.com.evento.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.evento.model.Evento;
import jakarta.annotation.Nonnull;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long>{

	@Query(value = "SELECT * FROM Evento e WHERE parsedatetime(e.data, 'dd/MM/yyyy') > :dataAtual", nativeQuery = true)
	List<Evento> consultaTodosOsEventosPorData(@Param("dataAtual") LocalDateTime dataAtual);
	
	@Nonnull
	Optional<Evento> findById(@Nonnull Long id);
}
