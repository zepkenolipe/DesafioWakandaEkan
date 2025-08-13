package br.com.ekan.desafioekan.beneficiario.infra;

import br.com.ekan.desafioekan.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {
}
