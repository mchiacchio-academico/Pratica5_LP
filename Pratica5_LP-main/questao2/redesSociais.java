package questao2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class redesSociais {

	public static void main(String[] args) {

		ArrayList<String> cadastroRS = new ArrayList();
		int menu;
		do {
			menu=Integer.parseInt(JOptionPane.showInputDialog("MENU\n1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair"));
		switch(menu) {
			case 1: 
				String nome = JOptionPane.showInputDialog("Digite o nome: ");
				String telefone = JOptionPane.showInputDialog("Digite o telefone: ");
				String usuarioIG = JOptionPane.showInputDialog("Digite o usuario do Instagram: ");
				String email = JOptionPane.showInputDialog("Digite o email: ");
				cadastroRS.add(nome+";"+telefone+";"+usuarioIG+";"+email);
				JOptionPane.showMessageDialog(null, "Cadastro concluido com sucesso!");
				break;
			case 2:
				String consulta = JOptionPane.showInputDialog("Digite alguma informacao do cadastro que deseja excluir: ");
				for(int i=0; i<cadastroRS.size(); i++) {
					if(cadastroRS.get(i).contains(consulta)) {
						cadastroRS.remove(i);
						JOptionPane.showMessageDialog(null, "Cadastro removido com sucesso");
					}
				}
				break;
			case 3:
				consulta = JOptionPane.showInputDialog("Digite alguma informacao do cadastro: ");
				if(cadastroRS.size()==0) {
					JOptionPane.showMessageDialog(null, consulta);
				}
				for(int i=0; i<cadastroRS.size(); i++) {
					if(cadastroRS.get(i).contains(consulta)) {
						JOptionPane.showMessageDialog(null, cadastroRS.get(i));
					}
					else {
						JOptionPane.showMessageDialog(null, "Registro não encontrado!");
					}
				}
					break;
			case 4:
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente!");
		}	
		}while(menu!=4);
			
		}
		}

		
		

	
