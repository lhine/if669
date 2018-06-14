package Cliente;
 
public interface RepositorioCliente {
    void inserir (Cliente cliente);
    void remover (Cliente cliente) throws ClienteNaoExisteException;
    Cliente procurar (String cpf) throws ClienteNaoExisteException;
    void atualizar (Cliente cliente) throws ClienteNaoExisteException;
    boolean existe (String cpf);
}