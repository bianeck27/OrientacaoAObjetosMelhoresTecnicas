
public class Cnpj {

	private String valor;

//	public Cnpj(String valor) {
//		this.valor = valor;
//	}

	public String getValor() {
		return valor;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}

	public boolean cnpjValido() {
		return primeiroDigitoVerificador() == primeiroDigitoCorreto()
				&& segundoDigitoVerificador() == segundoDigitoCorreto();
	}

	private int primeiroDigitoCorreto() {
		// Calcula o primeiro d�gito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int primeiroDigitoVerificador() {
		// Extrai o primeiro d�gito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	private int segundoDigitoCorreto() {
		// Calcula o segundo d�gito verificador correto para
		// o CNPJ armazenado no atributo valor
		return 0;
	}

	private int segundoDigitoVerificador() {
		// Extrai o segundo d�gito verificador do CNPJ armazenado
		// no atributo valor
		return 0;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Cnpj)) {
			return false;
		}
		Cnpj outro = (Cnpj) o;
		return this.valor.equals(outro.valor);
		// delegamos a compara��o de dois Cnpj para seus atributos valor
	}

	@Override
	public int hashCode() {
		return this.valor.hashCode();
	}
	
	@Override
	public String toString() {
		return this.valor;
	}

}
