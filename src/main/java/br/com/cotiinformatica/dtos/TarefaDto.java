package br.com.cotiinformatica.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TarefaDto {

	@Size(min = 6, max = 100, message = "O nome da tarefa deve ter de 6 a 100 caracteres.")
	@NotEmpty(message = "O nome da tarefa é obrigatório.")
	private String nome;

	@NotNull(message = "A data da tarefa é obrigatória.")
	private Date data;

	@Size(min = 6, max = 250, message = "A descrição da tarefa deve ter de 6 a 250 caracteres.")
	@NotEmpty(message = "A descrição da tarefa é obrigatório.")
	private String descricao;

	@NotNull(message = "O id da categoria é obrigatória.")
	private Integer categoriaId;

}
