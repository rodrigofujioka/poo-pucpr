package br.pucpr.registrovenda;

public class RegistroVendaPrincipal {

    public static void main(String[] args) {

        Produto xbox = new Produto(1, "Xbox Series S", 2000.0f, 1500.0f, false);
        Vendedor vendedor = new Vendedor("Fujioka", 1, "Rua Jabam");
        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setProduto(xbox);
        venda.setQuantidadeItens(2);
        venda.calcularValor();
        System.out.println("Comissão: " + venda.calcularComissao());
        venda.imprimir();

        System.out.println(" ========================================= ");
        Produto ps4 = new Produto(2, "PS4", 100.0f, 80.0f, true);
        vendedor = new Vendedor("Fujioka", 1, "Rua Jabam");
        venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setProduto(ps4);
        venda.setQuantidadeItens(3);
        venda.efetuarDesconto(10);
        venda.calcularValor();
        System.out.println("Comissão: " + venda.calcularComissao());
        venda.imprimir();

    }
}
