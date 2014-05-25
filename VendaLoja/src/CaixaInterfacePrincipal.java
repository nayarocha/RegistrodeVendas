import java.util.Scanner;

public class CaixaInterfacePrincipal {
		
	private static Scanner ler;

	public static void main(String[] args) {			
		int num = -1;
		Venda novaVenda = null;
		do{
		System.out.println("1 - INICIAR VENDA");
		System.out.println("2 - REGISTRAR ITEM");
		System.out.println("3 - REMOVER ITEM");
		System.out.println("4 - VER ITENS REGISTRADOS");
		System.out.println("5 - FINALIZAR VENDA (INCLUIR VER O TOTAL)");
		System.out.println("0 - SAIR");
		System.out.println("-------------------------------------------------------------------------");
		ler = new Scanner(System.in);
		int opcao = ler.nextInt();
		
		
			
				switch(opcao){
					case 1:
						novaVenda = new Venda();
						System.out.println("Iniciando Venda...");
						System.out.println("********************************");
						
						break;			
					case 2:
					
						//registrar item
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
											
						break;
					case 3:
					//remomover item
						System.out.println("Digite o Item para Remover : \n");
						System.out.println("********************************");
						Scanner lerNomeItem = new Scanner(System.in);
						String nomeItem;
						nomeItem = lerNomeItem.nextLine();
						novaVenda.removerItem(nomeItem);
					
						break;
					case 4:
					//ver itens registrados 
						Item[] listar = novaVenda.verItensRegistrados();
						System.out.println("Total de itens Registrados:" +novaVenda.controledeVendas());
						System.out.println("----------------------------------------------------------");
						for (int i = 0; i < listar.length; i++) {
							if(listar[i] != null){
								System.out.println(listar[i].getNome());
							}
						}
						break;
					case 5:
						System.out.println("Total:" +novaVenda.calcularTotal() +" reais");
						novaVenda = null;
						System.out.println("********************************");
						System.out.println("Venda Finalizada!");
						System.out.println("********************************");
						break;
					case 0:
						System.out.println("Saindo do programa");
						num = 0;
						break;					
					default:
						System.out.println("opção invalida");
				}
			} while(num != 0 );
	}
}
