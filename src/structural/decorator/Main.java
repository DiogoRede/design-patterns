package structural.decorator;

import structural.decorator.src.Acucar;
import structural.decorator.src.Cafe;
import structural.decorator.src.Leite;

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