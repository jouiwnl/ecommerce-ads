package br.senac.ecommerce.produto;
import
import br.senac.ecommerce.cliente.Cliente;
import br.senac.ecommerce.cliente.ClienteRepresentation;
import br.senac.ecommerce.cliente.enums.TipoCliente;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

public interface ProdutoRepresentation {

    @Getter
    @Setter
    @Builder
    class ListaProduto {
        private Long id;
        private String nome;
        private TipoCliente tipo;

        private static ProdutoRepresentation.ListaProduto from(Cliente cliente) {
            return ProdutoRepresentation.ListaProduto.builder()
                    .id(cliente.getId())
                    .nome(cliente.getNome())
                    .tipo(cliente.getTipo())
                    .build();
        }

        public static List<ProdutoRepresentation.ListaProduto> from(List<Produto> produtoList) {
            return produtoList.stream().map(ProdutoRepresentation.ListaProduto::from).collect(Collectors.toList());
        }
    }
}
