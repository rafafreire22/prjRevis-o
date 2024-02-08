package Controller;

private final pedidoService pedidoService;

@Autowired
public PedidoControler(PedidoService pedidoService) {
	this.pedidoService = pedidoService;
}

@GetMapping("/{id}")
public ResponseEntity<Pedido> findPedidobyId(@PathVariable Long id) {
	Pedido pedido = funcionarioService.getPedidoById(id);
	if (pedido != null) {
		return ResponseEntity.ok(pedido);
	} else {
		return ResponseEntity.notFound().build();
	}
}
@GetMapping("/nome/{funnome}")
public ResponseEntity<List<Pedido>> findPedidoByNomeAproximado(@PathVariable String funnome) {
    List<Pedido> pedido = funcionarioService.getPedidoByFunnomeAproximado(funnome);
    if (!pedido.isEmpty()) {
        return ResponseEntity.ok(pedido);
    } else {
        return ResponseEntity.notFound().build();
    }
}


@GetMapping("/")
public ResponseEntity<List<Pedido>> findAllUsuarioscontrol() {
	List<Pedido> pedido = pedidoService.getAllPedido();
	return ResponseEntity.ok(pedido);
}

@PostMapping("/")
public ResponseEntity<Pedido> insertUsuariosControl(@RequestBody Pedido pedido) {
	Pedido novopedido = pedidoService.savePedido(pedido);
	return ResponseEntity.status(HttpStatus.CREATED).body(novopedido);
}

@PutMapping("/{id}")
public ResponseEntity<Pedido> updatePedido2(@PathVariable Long funcodigo, @RequestBody Funcionario funcionario) {
    Funcionario funcionarioAtualizado = funcionarioService.updateFuncionario(funcodigo, funcionario);
    if (funcionarioAtualizado != null) {
        return ResponseEntity.ok(funcionarioAtualizado);
    } else {
        return ResponseEntity.notFound().build();
    }
}

@DeleteMapping("/id")
public ResponseEntity<String> deleteUsuarioControl(@PathVariable Long funcodigo) {
	boolean remover = funcionarioService.deleteFuncionario(funcodigo);
	if (remover) {
		return ResponseEntity.ok().body("usuario Excluido com sucesso");
	} else {
		return ResponseEntity.notFound().build();
}
}
}