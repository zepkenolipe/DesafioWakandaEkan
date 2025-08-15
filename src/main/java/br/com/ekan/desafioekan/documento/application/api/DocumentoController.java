package br.com.ekan.desafioekan.documento.application.api;

import br.com.ekan.desafioekan.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiarioComId(UUID idBeneficiario) {
        log.info("[inicia] DocumentoController - getDocumentosDoBeneficiarioComId");
        List<DocumentoBeneficiarioListResponse> documentosDoCliente = documentoService.buscaDocumentosDoBeneficiarioComID(idBeneficiario);
        log.info("[finaliza] DocumentoController - getDocumentosDoBeneficiarioComId");
        return documentosDoCliente;
    }
}

