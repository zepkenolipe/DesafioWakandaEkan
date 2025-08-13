package br.com.ekan.desafioekan.beneficiario.domain;

import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
    @Column(unique = true)
    private String telefone;
    @NotNull
    private LocalDate dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDate dataAtualizacao;

    public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
        this.nome = beneficiarioRequest.getNome();
        this.telefone = beneficiarioRequest.getTelefone();
        this.dataNascimento = beneficiarioRequest.getDataNascimento();
        this.dataInclusao = LocalDateTime.now();
    }
}
