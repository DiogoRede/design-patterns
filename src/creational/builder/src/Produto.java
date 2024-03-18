package creational.builder.src;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;

    private Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public static class ProdutoBuilder{
        private String nome;
        private String descricao;
        private double preco;

        public ProdutoBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public ProdutoBuilder descricao(String descricao){
            this.descricao = descricao;
            return this;
        }

        public ProdutoBuilder preco(double preco){
            this.preco = preco;
            return this;
        }

        public Produto build(){
            return new Produto(nome, descricao, preco);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}