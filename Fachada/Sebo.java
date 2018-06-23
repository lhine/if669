package Fachada;

import Cliente.*;
import Livro*;
// import

public class Sebo {
	private CadastroClientes clientes;
	private Cadastrolivro livro;
	//private CadastroVendas
	public Sebo(CadastroClientes clientes, Cadastrolivro livro, //CadastroVendas vendas) {
		this.clientes = clientes;
		this.livro = livro;
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
	public void inserirLivro (Livro livro) throws AnoInvalidoException {
		this.livro.inserir(livro);
	}
	public boolean procurar (String titulo) throws LivroNaoEncontradoException {
		return this.repositorioLivro.procurar(titulo);
	} 

	// Outros metodos de outras classes
	// Fazer as relações entre as classes, como verificações pra realizar uma venda, etc.

}
