
public class Venda {
	//criando galpão
	Item itensdeVenda[] = new Item[10];
	
	int controledeEstoque = 0;
	
	//private float total;

	//adicionando itens
	public void registrarItem(Item item){
		for (int i = 0; i < itensdeVenda.length; i++) {
			itensdeVenda[i] = item;
			controledeEstoque++;		
		}
	}
	
	//removendo itens
	public  boolean removerItem(String nome){
		for (int i=0; i< itensdeVenda.length; i++){
			if(itensdeVenda[i].getNome() == nome){
				itensdeVenda[i] = null;
				controledeEstoque--;
				System.out.println("produto removido");
				return true;				
			}
		}
		System.out.println("produto removido");
		return false;		
	}
	
	
}
