package br.com.ekan.desafioekan.documento.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario/{idBeneficiario}/documento")
public interface DocumentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@PathVariable UUID idBeneficiario,
                        @Valid @RequestBody DocumentoRequest DocumentoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<DocumentoBeneficiarioListResponse> getDocumentosDoBeneficiarioComId(@PathVariable UUID idBeneficiario);
}
