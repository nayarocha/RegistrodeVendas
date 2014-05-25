
public class Venda {
	//criando galpão
	Item[] itensdeVenda = new Item[5];	
	int controledeVendas = 0;
	
	
	private float total = 0;

	
	//adicionando itens
	public void registrarItem(Item item){
		//aumentando tamanho do array itensdevenda
		if(controledeVendas == itensdeVenda.length){
			Item[] item_aux =  new Item[controledeVendas*2];
			for (int i = 0; i < item_aux.length; i++) {
				item_aux[i] = itensdeVenda[i];
			}
			itensdeVenda = item_aux;		
		}
		
		//inserindo os itens no array
		for (int i = 0; i < itensdeVenda.length; i++) {
			if(itensdeVenda[i] == null){
				itensdeVenda[i] = item;
				controledeVendas++;
				break;
			}
		}
		System.out.println("item adicionado");
	}
	
	//removendo itens
	public  boolean removerItem(String nome){
		for (int i=0; i< itensdeVenda.length; i++){
			if(itensdeVenda[i] != null && nome.equals(itensdeVenda[i].getNome())){
				itensdeVenda[i] = null;
				controledeVendas--;
				System.out.println("produto removido");
				return true;				
			}
		}
		System.out.println("produto n removido");
		return false;		
	}
	
	
	//listando itens registrados
	public Item[] verItensRegistrados(){	
		return this.itensdeVenda;			
	}
	
	public float calcularTotal(){
		
		
		for (int i = 0; i < itensdeVenda.length; i++) {
			if(itensdeVenda[i] != null){
				total += itensdeVenda[i].getValor();
			}
			
		}
		return total;
		
	}
	
	public int controledeVendas(){
		return controledeVendas;
	}
}
