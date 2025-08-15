package br.com.ekan.desafioekan.beneficiario.application.service;

import br.com.ekan.desafioekan.beneficiario.application.api.*;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscaTodosBeneficiarios();

    void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);

    void deletaBeneficiarioAtravesId(UUID idBeneficiario);

    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);
}
