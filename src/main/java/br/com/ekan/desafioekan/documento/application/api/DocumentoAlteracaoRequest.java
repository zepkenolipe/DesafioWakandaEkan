package br.com.ekan.desafioekan.documento.application.api;

import br.com.ekan.desafioekan.documento.domain.TipoDocumento;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class DocumentoAlteracaoRequest {
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @NotBlank
    private String descricao;
}
