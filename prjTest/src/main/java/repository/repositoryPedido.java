package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entities.Pedido;

public interface repositoryPedido extends JpaRepository<Pedido, Long> {

}
