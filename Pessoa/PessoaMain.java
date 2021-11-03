package Pessoa;

public class PessoaMain {
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("", "");
		System.out.println(pf);
		pf.setCpf("");
		pf.setEstadoCivil("");
		System.out.println(pf);

		PessoaJuridica pj = new PessoaJuridica("", "");
		System.out.println(pj);
		pj.setCnpj("");
		pj.setTipoEmpresa("");
		System.out.println(pj);

	}
}