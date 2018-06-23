package livro;

public class LivroLiterario extends Livro {

	public double precoModificado() {
		double preco = getPreco() + (getAno() * 0.001);
		return preco;
	}
}
