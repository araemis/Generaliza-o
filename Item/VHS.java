package Item;

public class VHS extends Midia {
	private String titulo;
	public VHS(int codigo, String descricao,String gravadora, float duracao, String titulo) {
		super(codigo, descricao, gravadora, duracao);
		settitulo(titulo);		
	}
	public VHS() {
		
	}
	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
