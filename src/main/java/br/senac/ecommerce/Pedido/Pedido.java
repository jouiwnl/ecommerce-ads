package br.senac.ecommerce.Pedido;

import br.senac.ecommerce.cliente.Cliente;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @Column
    private Cliente id_cliente;

    //@Id
    //@Column
    //private Produto id_produto;

    @Column
    private double qtde_produto;

    @Column
    private String obs;

    @Column
    private String forma_pagamento;

    public Pedido() {}

    public Pedido(Long Id, Cliente cliente, double qtde_produto, String obs, String forma_pagamento) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.qtde_produto = qtde_produto;
        this.obs = obs;
        this.forma_pagamento = forma_pagamento;
    }





}
