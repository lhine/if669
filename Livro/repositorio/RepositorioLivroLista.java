package repositorio;
import livro.Livro;

public class RepositorioLivroLista implements RepositorioLivro {
	private Livro livro;
	private RepositorioLivroLista prox;
	
	public RepositorioLivroLista () {
		this.livro = null;
		this.prox = null;
	}
	public void inserir(Livro livro) {
		if (this.livro == null) {
			this.livro = livro;
			this.prox = new RepositorioLivroLista();
		} 
		else {
			prox.inserir(livro);
		}
	}
	public void remover(String titulo) {
		if (this.livro != null && this.livro.getTitulo().equals(titulo)) {
			this.livro = this.prox.livro;
			this.prox = this.prox.prox;
		} 
		else {
			this.prox.remover(titulo);
		}
	}
	public boolean procurar(String titulo) {
		if (this.livro != null && this.livro.getTitulo().equals(titulo)) {
			return true;
		} 
		else if (this.prox.livro != null) {
			return this.prox.procurar(titulo);
		} 
		else {
			return false;
		}
	}
}