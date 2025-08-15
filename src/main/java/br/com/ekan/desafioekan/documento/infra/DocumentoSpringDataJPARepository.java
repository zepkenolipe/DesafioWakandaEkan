package br.com.ekan.desafioekan.documento.infra;

import br.com.ekan.desafioekan.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento, UUID> {
    List<Documento> findByidBeneficiarioDocumento(UUID idBeneficiario);
}
