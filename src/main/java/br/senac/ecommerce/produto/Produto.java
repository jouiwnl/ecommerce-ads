package br.senac.ecommerce.produto;

import br.senac.ecommerce.cliente.Cliente;
import br.senac.ecommerce.produto.enums.TipoProduto;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.io.Serializable;

public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeProduto;

    @Column
    private Double pesoUnitario;

    @Column
    private Double valorUnitario;

    @Column
    private Boolean desconto;

    @Enumerated(value = EnumType.STRING)
    private TipoProduto tipoProduto;

    public Produto(){
    }

    public Produto(Long id, String nomeProduto, Double pesoUnitario, Double valorUnitario, Boolean desconto, TipoProduto tipoProduto){
        this.id=id;
        this.nomeProduto= nomeProduto;
        this.pesoUnitario= pesoUnitario;
        this.valorUnitario= valorUnitario;
        this.desconto= desconto;
        this.tipoProduto= tipoProduto;
    }
}
