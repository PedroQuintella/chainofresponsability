public class ProdutoCasaco implements TipoProduto {

    private  static ProdutoCasaco produtoCasaco = new ProdutoCasaco();

    private ProdutoCasaco(){};

    public static ProdutoCasaco getProdutoCasaco(){
        return produtoCasaco;
    }
}
