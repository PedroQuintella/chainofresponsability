import java.util.ArrayList;

public abstract class Vendedor {

    protected ArrayList listaProdutos = new ArrayList();
    private Vendedor superiorVendedor;

    public Vendedor getSuperiorVendedor(){
        return superiorVendedor;
    }

    public void setSuperiorVendedor(Vendedor superiorVendedor){
        this.superiorVendedor = superiorVendedor;
    }

    public abstract String getDescricaoCargo();

    public String venderProduto(Produto produto){
        if(listaProdutos.contains(produto.getTipoProduto())){
            return "Venda realizada - Por " + getDescricaoCargo();
        }
        else {
            if(superiorVendedor != null){
                return superiorVendedor.venderProduto(produto);
            }
            else
            {
                return "Venda não autorizada.";
            }
        }
    }
}
