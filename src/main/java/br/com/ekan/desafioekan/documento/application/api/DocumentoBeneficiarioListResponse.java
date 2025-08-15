package br.com.ekan.desafioekan.documento.application.api;

import br.com.ekan.desafioekan.documento.domain.Documento;
import br.com.ekan.desafioekan.documento.domain.TipoDocumento;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class DocumentoBeneficiarioListResponse {

    private UUID idDocumento;
    private UUID idBeneficiarioDocumento;
    private TipoDocumento tipoDocumento;
    private String descricao;
    private LocalDateTime dataInclusao;

    public static List<DocumentoBeneficiarioListResponse> converte(List<Documento> documentosDoBeneficiario) {
        return documentosDoBeneficiario.stream()
                .map(DocumentoBeneficiarioListResponse::new)
                .collect(Collectors.toList());
    }

    public DocumentoBeneficiarioListResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
        this.idBeneficiarioDocumento = documento.getIdBeneficiarioDocumento();
        this.tipoDocumento = documento.getTipoDocumento();
        this.descricao = documento.getDescricao();
        this.dataInclusao = documento.getDataInclusao();
    }
}
