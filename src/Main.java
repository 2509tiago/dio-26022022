
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.depositar(130);
		
		Conta poupanca = new ContaPoupanca();
		poupanca.depositar(390);
		
		cc.imprimirExtrto();
		poupanca.imprimirExtrto();

	}

}
