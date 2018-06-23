package Fachada;

import Cliente.*;
// import
// import

public class Sebo {
	private CadastroClientes clientes;
	// private CadastroLivros
	//private CadastroVendas
	public Sebo(CadastroClientes clientes, //Cadastrolivros livros, CadastroVendas vendas) {
		this.clientes = clientes;
		// Livros
		// Vendas
	}
	public void cadastrarCliente (Cliente cliente) throws ClienteJaCadastradoException {
		this.clientes.cadastrar(cliente);
	}
	public void removerCliente (String cpf) throws ClienteNaoExisteException {
		this.clientes.remover(cpf);
	}
	public void atualizarCliente (Cliente cliente) throws ClienteNaoExisteException {
		this.clientes.atualizar(cliente);
	}
	public Cliente procurarCliente (String cpf) throws ClienteNaoExisteException {
		return this.clientes.procurar(cpf);
	}
	public void mudarPlano (String cpf, Integer plano) throws PlanoInvalidoException, ClienteNaoExisteException {
		this.clientes.mudarPlano(cpf, plano);
	}
	
	
	// Outros metodos de outras classes
	// Fazer as relações entre as classes, como verificações pra realizar uma venda, etc.
	
	
}
