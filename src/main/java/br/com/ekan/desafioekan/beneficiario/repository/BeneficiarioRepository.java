package br.com.ekan.desafioekan.beneficiario.repository;

import br.com.ekan.desafioekan.beneficiario.domain.Beneficiario;

import java.util.List;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTodosBeneficiarios();
}
