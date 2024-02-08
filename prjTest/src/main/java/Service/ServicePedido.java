package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePedido {
	private final pedidoRepository serviceRepository;
	
	@Autowired
	public ServicePedido(pedidoRepository  serviceRepository) {
		this.pedidoRepository  = pedidoRepository ;
	}
	public Pedido savePedido(Pedido pedido) {
		return PedidoRepository.save(pedido);
	}
	public Pedido getPedidoById
}
