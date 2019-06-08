package br.com.etechoracio.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cadastro_cur")
public class Curso {
	
	@Id
	@GeneratedValue
	@Column(name="ID_CUR")
	private Long id;
	
	
	@Column(name="NOME_CUR")
	private String nome;
	
	
	@Column(name="IDADE_MIN")
	private String idade;
	
	
	@Column(name="PERIODO_CUR")
	private String período;
	
	@Column(name="MENSALID_CUR")
	private String mensalidade;
	

}
