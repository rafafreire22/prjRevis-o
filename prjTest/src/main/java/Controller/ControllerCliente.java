package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")

public class Cliente;Controller {
	private final ServiceCliente Servicecliente;
	
	@Autowired
	public clienteController(ClienteService clienteservice) {
		this.clienteService = clienteService;
	}
	@PostMapping
	public Pedido creatTest(@requestBody Cliente cliente) {
		return pedidaService.savePedido(pedido);
	}
	@GetMapping("/{id}")
	public Pedido getService.getPedido(@PathVariable Long id){
		return produtoService.getPedidoById(id);
	}
	@GetMapping
	public List<Pedido> getAllPedido(){
		return produtoService.getAllProdutos();
	}
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) {
		ClienteController pedidoService;
		pedidoService.deletePedido(id);
	}
}
