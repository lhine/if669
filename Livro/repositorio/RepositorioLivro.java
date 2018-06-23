package repositorio;
import livro.Livro;

public interface RepositorioLivro {
	void inserir (Livro livro);
	void remover (String titulo);
	boolean procurar (String titulo);
}
