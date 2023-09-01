package br.com.mob.sitemobapi.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_candidato")
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	UUID id;
	
	String nome; 
	String RG;
	String CPF;
	String telefone;
	String email;
	String periodo;
	Boolean programacao;
	
	
	public UUID getId() {
		return id;
		
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Boolean getProgramacao() {
		return programacao;
	}
	public void setProgramacao(Boolean programacao) {
		this.programacao = programacao;
	}
	
	
	
	
}
