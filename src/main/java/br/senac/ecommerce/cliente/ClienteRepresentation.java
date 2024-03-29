package br.senac.ecommerce.cliente;

import br.senac.ecommerce.cliente.enums.TipoCliente;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

public interface ClienteRepresentation {

    @Getter
    @Setter
    @Builder
    class ListaCliente {
        private Long id;
        private String nome;
        private TipoCliente tipo;

        private static ListaCliente from(Cliente cliente) {
            return ListaCliente.builder()
                    .id(cliente.getId())
                    .nome(cliente.getNome())
                    .tipo(cliente.getTipo())
                    .build();
        }

        public static List<ListaCliente> from(List<Cliente> clienteList) {
            return clienteList.stream().map(ListaCliente::from).collect(Collectors.toList());
        }
    }

    @Getter
    @Setter
    @Builder
    class ClienteDetalhes {
        private Long id;
        private String nome;
        private String cpfCnpj;
        private String endereco;
        private String email;
        private TipoCliente tipo;

        public static ClienteDetalhes from(Cliente cliente){
            return ClienteDetalhes.builder()
                    .id(cliente.getId())
                    .nome(cliente.getNome())
                    .cpfCnpj(cliente.getCpfCnpj())
                    .endereco(cliente.getEndereco())
                    .email(cliente.getEmail())
                    .tipo(cliente.getTipo()).build();
        }
    }

}
