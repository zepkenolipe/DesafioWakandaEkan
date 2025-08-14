package br.com.ekan.desafioekan.documento.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {
}
