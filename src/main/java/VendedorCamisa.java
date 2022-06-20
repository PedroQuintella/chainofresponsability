public class VendedorCamisa extends Vendedor {

    public VendedorCamisa(Vendedor vendedor){
        listaProdutos.add(ProdutoCamisa.getProdutoCamisa());
        setSuperiorVendedor(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor camisa.";
    }
}
