package br.com.ekan.desafioekan.beneficiario.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListResponse> getTodosBeneficiarios();

    @PatchMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraBeneficiario(@PathVariable UUID idBeneficiario, @Valid @RequestBody BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);

    @DeleteMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);
}
