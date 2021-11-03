package Simples;

public class ContaSimples extends Conta {
	private double saldoPoupanca;

	ContaSimples(String banco, int agencia, int numeroConta, double saldo) {
		super(banco, agencia, numeroConta, saldo);
	}

	ContaSimples() {

	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca() + valor);
			return true;
		} else
			return false;
	}

	public boolean saquePoupanca(double valor) {
		if (valor <= getSaldoPoupanca() && valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca() - valor);
			return true;
		} else
			return false;
	}
	public double total() {
		return getSaldo()+ getSaldoPoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", total=");
		builder.append(total());
		builder.append(", toString =");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}