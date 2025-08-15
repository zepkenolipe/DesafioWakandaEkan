package br.com.ekan.desafioekan.documento.application.repository;

import br.com.ekan.desafioekan.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
}
