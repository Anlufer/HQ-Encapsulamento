public class ItemCatalogo {
	
	public String nome;
	public String preco;
	public String roteirista;
	public String artista;
	public String ISBN;
	
	public ItemCatalogo(String nome, String preco, String roteirista, String artista, String iSBN) {
		this.nome = nome;
		this.preco = preco;
		this.roteirista = roteirista;
		this.artista = artista;
		this.ISBN = iSBN;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
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
}