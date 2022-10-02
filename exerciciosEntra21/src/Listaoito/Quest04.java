package Listaoito;

import java.util.Scanner;

public class Quest04 {
	public static void main(String[] args) {
		String[][] agenda = new String[31][24];
		Scanner read = new Scanner(System.in);
		String resAdd = "s", res = "";
		String com = "";
		boolean loop = true;

		System.out.println("Agenda de compromissos:\n" +
		"###################################\n");
		do {
			System.out.println("\n**************************************\n"
					+ "O que deseja fazer?\n" +
			"Adicionar compromisso [a], Consultar Compromissos [c] ou Encerrar [e]");
			res = read.next();
			if(res.equalsIgnoreCase("a") ^ res.equalsIgnoreCase("c") ^ res.equalsIgnoreCase("e") ) {
				
				if (res.equalsIgnoreCase("a")) {
					do {
						int dia = 0, hora = 0;
						System.out.print("Qual ้ o dia? ");
						dia = read.nextInt();
						System.out.print("Qual ้ a hora? ");
						hora = read.nextInt();
						com = read.nextLine();
						System.out.print("Qual ้ o compromisso? ");
						com = read.nextLine();
						
						agenda[--dia][--hora] = com;
						System.out.print("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n"
								+ "Agendar Novo compromisso? Sim[s] Nใo[n]");
						
						resAdd = read.next();
					} while (resAdd.equalsIgnoreCase("s"));
				} else if(res.equalsIgnoreCase("c")){
					
					do {
					System.out.println("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n"
							+ "Compromissos agendados para os dias:");
					for (int i = 0; i < agenda.length; i++) {
						for (int j = 0; j < agenda[i].length; j++) {
							if (agenda[i][j] == null) {
								continue;
							} else {
								int dia = i, hora = j;
								System.out.printf("\nDia: %d. Hora: %d.",++dia,++hora);
							}
						}
					}
					System.out.print("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n"
							+ "Para consultar o seu compromisso, siga as instru็๕es:\n"
							+ "Digite o dia: ");
					int dia = read.nextInt();
					System.out.print("Digite a hora: ");
					int hora = read.nextInt();
					if(agenda[--dia][--hora] != null) {
						System.out.println("\nSeu compromisso ้:\n"+agenda[dia][hora]);
					}else {
						System.out.println("\nSEM COMPROMISSO AGENDADO...");
					}
					System.out.print("\nจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ\n"
							+ "Consultar novo compromisso? Sim[s] Nใo[n]");
					resAdd = read.next();
				} while (resAdd.equalsIgnoreCase("s"));
					
				}else if(res.equalsIgnoreCase("e")) {
					break;
				}
			}else {
				System.out.println("\n**********************************\n"
						+ "Comando errado...\nAceitos somente [a], [c] ou [e]:\n"
						+ "**************************************\n");
				continue;
			}

		} while (loop == true);

		read.close();
	}

}
