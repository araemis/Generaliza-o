package Simples;

public class ContaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;

	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, double limite) {
		super(banco, agencia, numeroConta, saldo);
		setLimite(limite);
	}

	public ContaEspecial() {

	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if (limite > 0)
			this.limite = limite;
	}

	public boolean depositoEspecial(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			return true;
		} else
			return false;
	}

	public boolean saqueEspecial(double valor) {
		if (valor < getLimite() + getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		} else
			return false;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
