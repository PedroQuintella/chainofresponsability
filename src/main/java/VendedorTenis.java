public class VendedorTenis extends Vendedor {

    public VendedorTenis(Vendedor vendedor){
        listaProdutos.add(ProdutoTenis.getProdutoTenis());
        setSuperiorVendedor(vendedor);
    }

    public String getDescricaoCargo(){
        return "Vendedor tênis.";
    }
}
