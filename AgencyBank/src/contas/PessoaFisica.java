package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Roberto Carlos");
		cc1.setSaldo(12000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1200);
		cc1.exibirSaldo();
		
		System.out.println("*********************");
		
		Conta cc2 = new Conta();
		cc2.setCliente("Maria Carmo");
		cc2.setSaldo(18000);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(1200);
		cc2.exibirSaldo();
		
		System.out.println("******************");
		
		System.out.println("Trenferência");
		System.out.println("Cliente " + cc1.getCliente());
		System.out.println("Favorecido " + cc2.getCliente());
		cc1.trasferir(cc2, 1600);
		System.out.println("");
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		System.out.println("*****************");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getSaldo(), cc2.getSaldo());
		System.out.println("Saldo total nas contas: " + relatorio);
	}

}
