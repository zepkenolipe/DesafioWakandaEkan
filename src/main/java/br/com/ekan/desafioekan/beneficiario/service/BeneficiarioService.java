package br.com.ekan.desafioekan.beneficiario.service;

import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioListResponse;
import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioRequest;
import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioResponse;

import java.util.List;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);

    List<BeneficiarioListResponse> buscaTodosBeneficiarios();
}
