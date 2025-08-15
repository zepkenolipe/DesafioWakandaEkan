package br.com.ekan.desafioekan.documento.infra;

import br.com.ekan.desafioekan.documento.application.repository.DocumentoRepository;
import br.com.ekan.desafioekan.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDocumento");
        documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }

    @Override
    public List<Documento> buscaDocumentosDoBeneficiarioComID(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentosDoBeneficiarioComID");
        var documentos = documentoSpringDataJPARepository.findByidBeneficiarioDocumento(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentosDoBeneficiarioComID");
        return documentos;
    }
}
