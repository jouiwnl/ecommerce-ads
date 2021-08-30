package br.senac.ecommerce.cliente;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
@NoArgsConstructor
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteRepresentation.ListaCliente>> findAll() {
        List<ClienteRepresentation.ListaCliente> list = ClienteRepresentation.ListaCliente.from(clienteService.findAll());

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{clienteId}")
    public ClienteRepresentation.ClienteDetalhes find(@PathVariable(name = "clienteId") Long clienteId) {
        ClienteRepresentation.ClienteDetalhes cliente = ClienteRepresentation.ClienteDetalhes.from(clienteService.findById(clienteId));

        return cliente;
    }

    @PostMapping
    public ResponseEntity<Cliente> insert(@RequestBody Cliente cliente) {
        Cliente obj = clienteService.insert(cliente);

        return ResponseEntity.ok(obj);
    }

    @PutMapping("{clienteId}")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente, @PathVariable("clienteId") Long clienteId){
        Cliente newCliente = clienteService.update(cliente, clienteId);

        return ResponseEntity.ok(newCliente);
    }

}
