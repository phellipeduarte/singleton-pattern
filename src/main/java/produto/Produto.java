package produto;

public class Produto {
    private Produto() {};
    private static Produto instance = new Produto();
    public static Produto getInstance(){return instance;}

    private String nome;
    private Integer quantidadeEmEstoque;
    private Float preco;

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public Float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}
