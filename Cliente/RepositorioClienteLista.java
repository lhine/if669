package Cliente;
 
public class RepositorioClienteLista implements RepositorioCliente {
    private Cliente cliente;
    private RepositorioClienteLista prox;
    public RepositorioClienteLista () {
        this.cliente = null;
        this.prox = null;
    }
    public void inserir (Cliente cliente) {
       if (this.cliente != null) {
    	   this.cliente = cliente;
    	   this.prox = new RepositorioClienteLista();
       } else prox.inserir(cliente);
    }
    public void remover (Cliente cliente) throws ClienteNaoExisteException {
    	if (this.cliente != null) {
    		if (this.cliente.getCPF().equals(cliente.getCPF())) {
        		this.cliente = this.prox.cliente;
        		this.prox = this.prox.prox;
        	} 
    		if (this.prox.cliente != null) {
        		this.prox.remover(cliente);
        	}
    	} 
    	throw new ClienteNaoExisteException(cliente.getCPF());
    }
    public Cliente procurar (String cpf) throws ClienteNaoExisteException {
    	if (this.cliente != null) {
    		if (this.cliente.getCPF().equals(cpf)) {
    			return this.cliente;
    		}
    		if (this.prox.cliente != null) {
    			this.prox.procurar(cpf);
    		}
    	} 
    	throw new ClienteNaoExisteException(cpf);
    }
    public void atualizar (Cliente cliente) throws ClienteNaoExisteException {
    	if (this.cliente != null) {
    		if (this.cliente.getCPF().equals(cliente.getCPF())) {
    			this.cliente = cliente;
    		}
    		if (this.prox.cliente != null) {
    			this.prox.atualizar(cliente);
    		}
    	}
    	throw new ClienteNaoExisteException(cliente.getCPF());
    }
    public boolean existe (String cpf) {
    	if (this.cliente != null) {
    		if (this.cliente.getCPF().equals(cpf)) {
    			return true;
    		}
    		if (this.prox.cliente.getCPF().equals(cpf)) {
    			this.prox.existe(cpf);
    		}
    	}
    	return false;
    }
}