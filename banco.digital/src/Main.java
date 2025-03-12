public class Main {

	public static void main(String[] args) {
		Cliente yasmin = new Cliente();
		yasmin.setNome("Yasmin");
		
		Conta cc = new ContaCorrente(yasmin);
		Conta poupanca = new ContaPoupanca(yasmin);

		cc.depositar(100.0);
		cc.transferir(100.0, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}