package br.com.cotiinformatica.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Tarefa {

	private Integer id;
	private String nome;
	private Date data;
	private String descricao;
	private Categoria categoria;

}
