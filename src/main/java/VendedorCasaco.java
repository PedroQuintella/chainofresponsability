public class VendedorCasaco extends Vendedor {

    public VendedorCasaco(Vendedor vendedor){
        listaProdutos.add(ProdutoCasaco.getProdutoCasaco());
        setSuperiorVendedor(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor casaco.";
    }
}
