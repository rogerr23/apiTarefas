package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoriaDto {

	@NotEmpty(message = "O nome da categoria é obrigatório.")
	@Size(min = 6, max = 50, message = "O nome da categoria deve ter de 6 a 50 caracteres.")
	private String nome;

}
