package produto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTest {
    @Test
    public void deveRetornarNomeProduto(){
        Produto.getInstance().setNome("Chocolate");
        assertEquals("Chocolate", Produto.getInstance().getNome());

    }

    @Test
    public void deveRetornarQuantidadeEmEstoque(){
        Produto.getInstance().setQuantidadeEmEstoque(3);
        assertEquals(3, Produto.getInstance().getQuantidadeEmEstoque());

    }

    @Test
    public void deveRetornarPreco(){
        Produto.getInstance().setPreco(9.5F);
        assertEquals(9.5F, Produto.getInstance().getPreco());

    }
}
