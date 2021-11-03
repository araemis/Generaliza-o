package Simples;

public class ContaMain {
	public static void main(String[] args) {
		var cs = new ContaSimples("Caixa", 1, 2, 3);
		System.out.println(cs);
		cs.depositoPoupanca(100);
		System.out.println(cs);
		cs.depositoPoupanca(100);
		System.out.println(cs);
		cs.depositoPoupanca(-10);
		System.out.println(cs);
		cs.saquePoupanca(100);
		System.out.println(cs);
		cs.saquePoupanca(-1);
		System.out.println(cs);
	}

}