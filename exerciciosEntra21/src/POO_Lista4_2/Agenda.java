package POO_Lista4_2;

public class Agenda {

	private Contato contatos[];
	private String nomeAgenda;
	
	

	public Agenda() {
		 contatos = new Contato[3];
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public String menuver() {
	
	String res = "";
	for (int i = 0; i < contatos.length; i++) {
		res +=  "CONTATO : "+contatos[i].menu()+"\n";
	}
	return "Nome da Agenda: "+this.getNomeAgenda()+"\n_____________________________________\n"+res;
}
	
		
		
		
		
	
	
}
