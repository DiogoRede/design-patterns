package behavioral.decorator;

import behavioral.decorator.src.Acucar;
import behavioral.decorator.src.Cafe;
import behavioral.decorator.src.Leite;

public class Main {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		System.out.println(cafe.getDescricao() + ": " + cafe.custo());

		Leite addLeite = new Leite(cafe);
		System.out.println(addLeite.getDescricao() + ": " + addLeite.custo());

		Acucar addAcucar = new Acucar(addLeite);
		System.out.println(addAcucar.getDescricao() + ": " + addAcucar.custo());

	}

}