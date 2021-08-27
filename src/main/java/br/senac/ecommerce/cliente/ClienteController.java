package br.senac.ecommerce.cliente;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
@NoArgsConstructor
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ResponseEntity<List<Cliente>> findAll() {
        List<Cliente> cliente = clienteService.findAll();

        return ResponseEntity.ok().body(cliente);
    }

}
