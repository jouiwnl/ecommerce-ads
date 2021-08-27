package br.senac.ecommerce.cliente.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public enum TipoCliente {

    FISICA("F", "Pessoa física"),
    JURIDICA("J", "Pessoa jurídica");

    private String cod;

    private String description;

    TipoCliente(String cod, String description) {
        this.cod = cod;
        this.description = description;
    }

}
