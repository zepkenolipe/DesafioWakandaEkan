package br.com.ekan.desafioekan.beneficiario.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class BeneficiarioRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
}
