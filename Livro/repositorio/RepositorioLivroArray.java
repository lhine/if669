package repositorio;
import livro.Livro;

public class RepositorioLivroArray implements RepositorioLivro {
	private Livro[] livro;

		public RepositorioLivroArray() {
			livro = new Livro [3];
		}
		
		public void inserir (Livro livro) {
			for (int i = 0; i < this.livro.length; i++) {
				if (this.livro[i] == null) {
					this.livro[i] = livro;
					i = this.livro.length;
				}
			}
			Livro[] livroII = new Livro [this.livro.length * 2];
			
			for (int i = 0; i < this.livro.length; i++) {
				livroII[i] = this.livro[i];
			}
			this.livro = livroII;
		}
		
		public boolean procurar (String titulo) {
		boolean achou = false;
			for (int i = 0; i < this.livro.length && !achou; i++) {
				if (this.livro[i].getTitulo().equals(titulo)) {
					achou = true;
				}
			}
			return achou;
		}
		
		public void remover (String titulo) {
		for (int i = 0; i < this.livro.length; i++) {
			if (this.livro[i].getTitulo().equals(titulo)) {
				this.livro[i] = null;	
			}
		}	
	}
}