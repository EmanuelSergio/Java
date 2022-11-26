package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador Monstro = new Monstro();
		Jogador Heroi = new Heroi();
		
		
		
		Monstro.x=10;
		Monstro.y=10;
		
		Heroi.x=10;
		Heroi.y=11;
		
		System.out.println(Monstro.vida);
		System.out.println(Heroi.vida);

		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		Monstro.andar(Direcao.NORTE);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		
		System.out.println("vida do Monstro: "+Monstro.vida);
		System.out.println("vida do Heroi: "+Heroi.vida);
		
		
		
		
	}
	
}
