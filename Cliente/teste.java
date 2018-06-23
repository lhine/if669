package Cliente;

public class teste {

	public static void main(String[] args) {
		System.out.println("asdasd");
		RepositorioClienteArray Y = new RepositorioClienteArray(15);
		CadastroClientes X = new CadastroClientes(Y);
		try {
			X.cadastrar(new Cliente ("12341678911"));
			X.cadastrar(new Cliente ("12345678911"));
			X.cadastrar(new Cliente ("12355578911"));
			X.cadastrar(new Cliente ("12366678911"));
			X.cadastrar(new Cliente ("11115678911"));
			X.cadastrar(new Cliente ("12342278911"));
			X.remover("12345678911");
			X.remover("11115678911");
			X.cadastrar(new Cliente("11111111111"));
		} catch (ClienteInvalidoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteJaCadastradoException a) {
			System.out.println(a.getMessage());
		} catch (ClienteNaoExisteException a) {
			System.out.println(a.getMessage());
		}
	}
}
