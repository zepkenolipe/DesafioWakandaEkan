package br.com.ekan.desafioekan.beneficiario.service;

import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioRequest;
import br.com.ekan.desafioekan.beneficiario.api.BeneficiarioResponse;

public interface BeneficiarioService {

    BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}
