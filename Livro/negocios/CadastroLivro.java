package negocios;
import excecoes.AnoInvalidoException;
import excecoes.LivroNaoEncontradoException;
import livro.Livro;
import repositorio.RepositorioLivro;

public class CadastroLivro {
	private RepositorioLivro repositorioLivro;

	public void CadastroLivro (RepositorioLivro repositorio) {
		this.repositorioLivro = repositorio;
	}
	public boolean procurar (String titulo) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.procurar(titulo)) {
			return this.repositorioLivro.procurar(titulo);
		} 
		else {
			throw new LivroNaoEncontradoException();
		}
	}
	public void inserirLivro (Livro livro) throws AnoInvalidoException {
		if (livro.getAno() >= 1900 && livro.getAno() <= 2018) {
			this.repositorioLivro.inserir(livro);
		}
		else {
			throw new AnoInvalidoException();
		}
	}
}