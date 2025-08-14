package br.com.ekan.desafioekan.beneficiario.repository;

import br.com.ekan.desafioekan.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTodosBeneficiarios();

    Beneficiario buscaBeneficiarioPorId(UUID idBeneficiario);

    void deletaBeneficiario(Beneficiario beneficiario);
}
