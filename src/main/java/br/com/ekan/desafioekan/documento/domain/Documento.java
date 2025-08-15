package br.com.ekan.desafioekan.documento.domain;

import br.com.ekan.desafioekan.documento.api.DocumentoAlteracaoRequest;
import br.com.ekan.desafioekan.documento.api.DocumentoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
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

    public Documento(UUID idDocumento, @Valid DocumentoRequest documentoRequest ){
        this.idDocumento = idDocumento;
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();
        this.dataAtualizacao = LocalDateTime.now();
    }

    public void altera(DocumentoAlteracaoRequest documentoRequest) {
        this.tipoDocumento = documentoRequest.getTipoDocumento();
        this.descricao = documentoRequest.getDescricao();
        this.dataAtualizacao = LocalDateTime.now();
    }
}
