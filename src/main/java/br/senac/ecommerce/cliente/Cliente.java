package br.senac.ecommerce.cliente;

import br.senac.ecommerce.cliente.enums.TipoCliente;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cpfCnpj;

    @Column
    private String endereco;

    @Column
    private String email;

    @Column(name = "tipoCliente")
    @Enumerated(value = EnumType.STRING)
    private TipoCliente tipo;

    public Cliente() {}

    public Cliente(Long id, String nome, String cpfCnpj, String endereco, String email, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.email = email;
        this.tipo = tipo;
    }


}
