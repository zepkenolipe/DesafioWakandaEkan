package br.com.ekan.desafioekan.beneficiario.service;

import br.com.ekan.desafioekan.beneficiario.api.*;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscaTodosBeneficiarios();

    void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);

    void deletaBeneficiarioAtravesId(UUID idBeneficiario);

    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);
}
