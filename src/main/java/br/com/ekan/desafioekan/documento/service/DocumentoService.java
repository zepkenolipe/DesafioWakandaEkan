package br.com.ekan.desafioekan.documento.service;

import br.com.ekan.desafioekan.documento.api.DocumentoRequest;
import br.com.ekan.desafioekan.documento.api.DocumentoResponse;
import jakarta.validation.Valid;

import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest);
}
