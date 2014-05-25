import java.util.Scanner;

public class CaixaInterfacePrincipal {
	public static void main(String[] args) {
		
		Venda novaVenda = new Venda();
		menu();
		Scanner ler = new Scanner(System.in);
		int opcao =1;
		opcao = ler.nextInt();
		
			
			switch(opcao){
			case 1:
				menu();
				break;			
			case 2:
				
				String nome, descricao;
				float valor;
				
				Item novoItem = new Item();
				Scanner lerNome = new Scanner(System.in);
				System.out.println("Insira o nome do produto:");
				nome = lerNome.nextLine();
				
				Scanner lerValor = new Scanner(System.in);
				System.out.println("Insira o valor:");
				valor = lerValor.nextFloat();
				
				Scanner lerDescricao = new Scanner(System.in);
				System.out.println("Insira uma descrição:");
				descricao = lerDescricao.nextLine();
				
				novoItem.setNome(nome);
				novoItem.setValor(valor);
				novoItem.setDescricao(descricao);
			
				novaVenda.registrarItem(novoItem);
				System.out.println("item adicionado");
				
				menu();
				
				break;
			case 3:
			//remomover item
				Scanner lerNomeItem = new Scanner(System.in);
				String nomeItem;
				nomeItem = lerNomeItem.nextLine();
				novaVenda.removerItem(nomeItem);
			
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				break;					
			default:
				System.out.println("NÃO É UMA OPÇÃO VÁLIDA");
		}
	  }
				
	public static void menu(){
		
		System.out.println("1 - INICIAR VENDA");
		System.out.println("2 - REGISTRAR ITEM");
		System.out.println("3 - REMOVER ITEM");
		System.out.println("4 - VER ITENS REGISTRADOS");
		System.out.println("5 - FINALIZAR VENDA (INCLUIR VER O TOTAL)");
		System.out.println("0 - SAIR");
		System.out.println("-------------------------------------------------------------------------");

	}

}
