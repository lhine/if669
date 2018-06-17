package Cliente;

public class teste {

	public static void main(String[] args) {
		System.out.println("asdasd");
		RepositorioClienteLista Y = new RepositorioClienteLista();
		CadastroClientes X = new CadastroClientes(Y);
		try {
			X.cadastrar(new Cliente ("22222222222"));
			X.cadastrar(new Cliente ("222222222"));
			X.remover(new Cliente ("222222"));
		} catch (ClienteJaCadastradoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteNaoExisteException a) {
			System.out.println(a.getMessage());
		}
	}
}
