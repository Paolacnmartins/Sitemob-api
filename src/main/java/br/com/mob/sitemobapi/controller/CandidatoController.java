package br.com.mob.sitemobapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.mob.sitemobapi.entity.Candidato;
import br.com.mob.sitemobapi.repository.CandidatoRepository;

@CrossOrigin
@RestController
@RequestMapping("candidato")
public class CandidatoController {

	@Autowired
	CandidatoRepository candidatoRepository;
	
	@GetMapping
	public List<Candidato> listarCandidato() {
		List<Candidato> listadecandidatos = candidatoRepository.findAll();

		return listadecandidatos;
	}
	
	@DeleteMapping("{id}")
	public void deletarCandidato(@PathVariable UUID id) {
		candidatoRepository.deleteById(id);

	}
	
	@PostMapping
	public Candidato inserirCandidato(@RequestBody Candidato novoCandidato) {
		var candidato = candidatoRepository.save(novoCandidato);

		return candidato;

	}
	
}
