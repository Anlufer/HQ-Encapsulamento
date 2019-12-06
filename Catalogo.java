import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	
	private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();
	
	public List<ItemCatalogo> listarCatalogo() {
		ItemCatalogo itemCatalogo1 = new ItemCatalogo("O Rei da Cozinha do Inferno", "50.00", "Brian Michael Bendis", "Alex Maleev", "O_REI_DA_COZINHA_DO_INFERNO_ISBN");
		ItemCatalogo itemCatalogo2 = new ItemCatalogo("Batman: Ano Zero", "70.00", "Scott Snyder", "Greg Capullo", "BATMAN_ANO_ZERO");
		
		adicionarLista(itemCatalogo1);
		adicionarLista(itemCatalogo2);
		
		return itens;
	}	
	
	public List<ItemCatalogo> adicionarLista(ItemCatalogo itemCatalogo){
		this.itens.add(itemCatalogo);
		return this.itens;
	}
}