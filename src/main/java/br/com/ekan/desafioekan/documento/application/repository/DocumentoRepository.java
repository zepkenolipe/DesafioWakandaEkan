package br.com.ekan.desafioekan.documento.application.repository;

import br.com.ekan.desafioekan.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);

    List<Documento> buscaDocumentosDoBeneficiarioComID(UUID idBeneficiario);
}
