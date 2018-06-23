package livro;

public abstract class Livro {
	private String titulo;
	private int ano;
	private double preco;
	
	Livro() {
		this.titulo = null;
		this.ano = 0;
		this.preco = 0.0;
	}
	
	public void inserirLivro (String titulo, int ano) {
			this.titulo = titulo;
			this.ano = ano;
			this.preco = 30.0; 
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public abstract double precoModificado();
}