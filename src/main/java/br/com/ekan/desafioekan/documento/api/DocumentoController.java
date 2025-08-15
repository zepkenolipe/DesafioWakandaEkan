package br.com.ekan.desafioekan.documento.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    @Override
    public DocumentoResponse postDocumento(UUID idBeneficiario, DocumentoRequest DocumentoRequest) {

        return null;
    }
}

