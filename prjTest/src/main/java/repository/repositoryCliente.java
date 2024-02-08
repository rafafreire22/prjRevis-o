package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entities.Cliente;

public interface repositoryCliente extends JpaRepository<Cliente, Long> {
	

}
