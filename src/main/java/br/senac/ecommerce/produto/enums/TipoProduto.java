package br.senac.ecommerce.produto.enums;

import lombok.Getter;

@Getter
public enum TipoProduto {

    EBOOK("E", "Ebook"),
    LIVRO("L", "Livro Físico");

    private String cod;

    private String description;

    TipoProduto(String cod, String description){
        this.cod= cod;
        this.description = description;
    }
}
