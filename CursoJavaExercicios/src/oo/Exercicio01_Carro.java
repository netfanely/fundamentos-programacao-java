package oo;

public class Exercicio01_Carro extends Exercicio01_Veiculo {

	void Mover() {
		System.out.println("Sua distancia era: " + this.distancia);
		this.distancia += 2;
		System.out.println("Sua distancia é: " + this.distancia);
	}

	void Ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println(this.nomeDoVeiculo + " est� ligado!");
		} else {
			System.out.println("O veiculo já está ligado!");
		}
	}
}
