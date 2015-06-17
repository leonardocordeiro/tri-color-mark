package tricolormark;

public class Objeto {
	private Cor cor;
	private Objeto objeto;
	private Object value;

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return cor.toString();
	}
}
