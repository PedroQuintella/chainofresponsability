public class Produto {

    private TipoProduto tipoProduto;

    public Produto(TipoProduto tipoProduto){
        this.tipoProduto = tipoProduto;
    }

    public TipoProduto getTipoProduto(){
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto){
        this.tipoProduto = tipoProduto;
    }
}
