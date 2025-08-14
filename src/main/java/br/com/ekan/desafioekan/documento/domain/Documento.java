package br.com.ekan.desafioekan.documento.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idDocumento", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;

    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @NotBlank
    private String descricao;

    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
}
