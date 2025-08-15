package br.com.ekan.desafioekan.documento.service;

import br.com.ekan.desafioekan.beneficiario.service.BeneficiarioService;
import br.com.ekan.desafioekan.documento.api.DocumentoRequest;
import br.com.ekan.desafioekan.documento.api.DocumentoResponse;
import br.com.ekan.desafioekan.documento.domain.Documento;
import br.com.ekan.desafioekan.documento.repository.DocumentoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    private final BeneficiarioService beneficiarioService;
    private final DocumentoRepository documentoRepository;

    @Override
    public DocumentoResponse criaDocumento(UUID idBeneficiario, @Valid DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoApplicationService - criaDocumento");
        beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        Documento documento = documentoRepository.salvaDocumento(new Documento(idBeneficiario, documentoRequest));
        log.info("[finaliza] DocumentoApplicationService - criaDocumento");
        return new DocumentoResponse(documento.getIdDocumento());
    }
}
