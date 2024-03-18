package creational.builder;

import creational.builder.src.Produto;

public class Main{

    public static void main(String[] args){
        Produto produto = new Produto.ProdutoBuilder()
                                        .nome("Builder Pattern")
                                        .descricao("Padrão de criacao")
                                        .preco(0)
                                        .build();
        System.out.println(produto.toString());
    }

}