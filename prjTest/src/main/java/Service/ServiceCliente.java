package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.example.Entities.Cliente;

@Service
public class ServiceCliente {
	private final Repositories repositoryCliente;
	 
	@Autowired
	public ServiceService(RepositoriesCliente repositoryCliente) {
		this.ServiceRepository = serviceRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return repositoryCliente.save(cliente);
	}
	
	public Cliente getClienteById(Long id) {
		return RepositoryCliente.findById(id).orElse(null));
	}
	public List<Cliente> getAllCliente(){
		return RepositoryCliente.findAll();
	}
	public void deleteCliente(Long id) {
		repositoryClieinte.deleteById(id);
	}
}