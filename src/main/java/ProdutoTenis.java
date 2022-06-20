public class ProdutoTenis implements TipoProduto {

    private  static ProdutoTenis produtoTenis = new ProdutoTenis();

    private ProdutoTenis(){};

    public static ProdutoTenis getProdutoTenis(){
        return produtoTenis;
    }
}
