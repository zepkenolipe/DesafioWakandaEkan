package br.com.ekan.desafioekan.documento.application.service;

import br.com.ekan.desafioekan.documento.application.api.DocumentoRequest;
import br.com.ekan.desafioekan.documento.application.api.DocumentoResponse;
import jakarta.validation.Valid;

import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest);
}
