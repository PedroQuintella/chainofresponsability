import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    VendedorTenis vendedorTenis;
    VendedorCamisa vendedorCamisa;
    VendedorCasaco vendedorCasaco;

    @BeforeEach
    void setUp(){
        vendedorTenis = new VendedorTenis(vendedorTenis);
        vendedorCamisa = new VendedorCamisa(vendedorCamisa);
        vendedorCasaco = new VendedorCasaco(vendedorCasaco);
    }

    @Test
    public void deveRetornarVendaPorVendedorTenis(){
        assertEquals("Venda realizada - Por Vendedor tênis.", vendedorTenis.venderProduto(new Produto(ProdutoTenis.getProdutoTenis())));
    }

    @Test
    public void deveRetornarVendaPorVendedorCamisa(){
        assertEquals("Venda realizada - Por Vendedor camisa.", vendedorCamisa.venderProduto((new Produto(ProdutoCamisa.getProdutoCamisa()))));
    }

    @Test
    public void deveRetornarVendaPorVendedorCasaco(){
        assertEquals("Venda realizada - Por Vendedor casaco.", vendedorCasaco.venderProduto(new Produto(ProdutoCasaco.getProdutoCasaco())));
    }

    @Test
    public void deveRetornarVendaNaoAutorizada(){
        assertEquals("Venda não autorizada.", vendedorCamisa.venderProduto(new Produto(ProdutoCasaco.getProdutoCasaco())));
    }
}