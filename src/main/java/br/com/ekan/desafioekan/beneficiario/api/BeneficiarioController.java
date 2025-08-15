package br.com.ekan.desafioekan.beneficiario.api;

import br.com.ekan.desafioekan.beneficiario.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
        log.info("[inicia] BeneficiarioController - postBeneficiario");
        BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
        log.info("[finaliza] BeneficiarioController - postBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public List<BeneficiarioListResponse> getTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioController - getTodosBeneficiarios");
        List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioController - getTodosBeneficiarios");
        return beneficiarios;
    }

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiariosAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioController - getBeneficiariosAtravesId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - getBeneficiariosAtravesId");
        return beneficiarioDetalhado;
    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioController - patchAlteraBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.patchAlteraBeneficiario(idBeneficiario, beneficiarioAlteracaoRequest);
        log.info("[finaliza] BeneficiarioController - patchAlteraBeneficiario");

    }

    @Override
    public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioController - deletaBeneficiarioAtravesId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        beneficiarioService.deletaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - deletaBeneficiarioAtravesId");
    }
}
