import java.math.BigDecimal;

public class HQ {

	private String nome;
	private BigDecimal preco;
	private String roteirista;
	private String artista;
	private String ISBN;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getRoteirista() {
		return roteirista;
	}

	public void setRoteirista(String roteirista) {
		this.roteirista = roteirista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	@Override
	public String toString() {
		return "HQ: \nnome=" + nome + "\npreco=" + preco + "\nroteirista=" + roteirista + "\nartista=" + artista
				+ "\nISBN=" + ISBN + "";
	}
	
}
