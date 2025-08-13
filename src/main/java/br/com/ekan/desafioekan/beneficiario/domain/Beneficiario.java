package br.com.ekan.desafioekan.beneficiario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idBeneficiario", updatable = false, unique = true, nullable = false)
    private UUID idBeneficiario;
    @NotBlank
    private String nome;
    @NotBlank
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private LocalDate dataInclusao;
    @NotNull
    private LocalDate dataAtualizacao;
}
