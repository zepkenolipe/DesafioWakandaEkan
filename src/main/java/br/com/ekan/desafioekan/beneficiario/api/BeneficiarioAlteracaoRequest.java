package br.com.ekan.desafioekan.beneficiario.api;

import lombok.Value;

import java.time.LocalDate;

@Value
public class BeneficiarioAlteracaoRequest {
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
}
