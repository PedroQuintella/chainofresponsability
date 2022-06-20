public class ProdutoCamisa implements TipoProduto {

    private  static ProdutoCamisa produtoCamisa = new ProdutoCamisa();

    private ProdutoCamisa(){};

    public static ProdutoCamisa getProdutoCamisa(){
        return produtoCamisa;
    }
}
