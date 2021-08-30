package br.senac.ecommerce.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long clienteId){
        return clienteRepository.findById(clienteId).get();
    }

    public Cliente insert(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente cliente, Long clienteId) {
        Cliente newCliente = this.findById(clienteId);
        newCliente.setNome(cliente.getNome());
        newCliente.setCpfCnpj(cliente.getCpfCnpj());
        newCliente.setEmail(cliente.getEmail());
        newCliente.setEndereco(cliente.getEndereco());
        newCliente.setTipo(cliente.getTipo());

        return newCliente;
    }

    public void delete(Long clienteId) {

    }

}
