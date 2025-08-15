package br.com.ekan.desafioekan.beneficiario.infra;

import br.com.ekan.desafioekan.beneficiario.domain.Beneficiario;
import br.com.ekan.desafioekan.beneficiario.application.repository.BeneficiarioRepository;
import br.com.ekan.desafioekan.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<Beneficiario> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        return todosBeneficiarios;
    }

    @Override
    public Beneficiario buscaBeneficiarioPorId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioPorId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findByIdBeneficiario(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiário não encontrado com o ID:" + idBeneficiario));
        log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioPorId");
        return beneficiario;
    }

    @Override
    public void deletaBeneficiario(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - deletaBeneficiario");
        beneficiarioSpringDataJPARepository.delete(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - deletaBeneficiario");
    }
}