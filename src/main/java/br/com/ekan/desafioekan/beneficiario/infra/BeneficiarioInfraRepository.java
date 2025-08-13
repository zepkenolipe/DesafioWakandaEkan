package br.com.ekan.desafioekan.beneficiario.infra;

import br.com.ekan.desafioekan.beneficiario.domain.Beneficiario;
import br.com.ekan.desafioekan.beneficiario.repository.BeneficiarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
    private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }
}