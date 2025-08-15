package br.com.ekan.desafioekan.documento.application.api;

import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoResponse {
    private UUID idDocumento;
}
