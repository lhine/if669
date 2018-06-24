package negocios;
import excecoes.AnoInvalidoException;
import excecoes.LivroNaoEncontradoException;
import livro.Livro;
import repositorio.RepositorioLivro;

public class CadastroLivro {
	private RepositorioLivro repositorioLivro;
	public CadastroLivro (RepositorioLivro repositorio) {
		this.repositorioLivro = repositorio;
	}
	public void remover (String titulo) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(titulo)) {
			this.repositorioLivro.remover(titulo);
		} else throw new LivroNaoEncontradoException();
	}
	public void atualizar (Livro livro) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(livro.getTitulo())) {
			this.repositorioLivro.atualizar(livro);
		} else throw new LivroNaoEncontradoException();
	}
	public Livro procurar (String titulo) throws LivroNaoEncontradoException {
		if (this.repositorioLivro.existe(titulo)) {
			return this.procurar(titulo);
		} else throw new LivroNaoEncontradoException();
	}
}