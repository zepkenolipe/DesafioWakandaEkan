package br.com.ekan.desafioekan.documento.api;

import br.com.ekan.desafioekan.documento.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {
    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest DocumentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        DocumentoResponse documento = documentoService.criaDocumento(idBeneficiario, DocumentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }
}

