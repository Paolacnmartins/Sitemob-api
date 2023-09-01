package br.com.mob.sitemobapi.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mob.sitemobapi.entity.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, UUID>  {

}
