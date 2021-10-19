package br.pucpr.registrovenda;

public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeItens;
    private float valor;

    public void calcularValor(){
        valor = quantidadeItens * (getProduto().getValorVenda()-desconto);
    }

    public float calcularComissao(){
        float valorComissao = this.valor * (Vendedor.COMISSAO/100);
        if(produto.isPromocao()){
                valorComissao = valorComissao/2;
        }
        return valorComissao;
    }

    public void efetuarDesconto(float percentualDesconto){
        float descontoProvisorio = this.produto.getValorVenda() * (percentualDesconto/100);
        float valorProdutoComDesconto = produto.getValorVenda() - descontoProvisorio;

        if(valorProdutoComDesconto < produto.getValorCusto()){
            System.out.println("O desconto não foi possível");
            this.desconto = 0;
        }else{
            this.desconto = descontoProvisorio;
        }

    }

    public void imprimir(){
        float valorComissao = calcularComissao();
        System.out.println("Código: " + this.vendedor.getCodigo());
        System.out.println("Vendedor: " + this.vendedor.getNome());
        System.out.println("Comissão: R$ " + valorComissao);
        System.out.println("Quantidade: " + this.quantidadeItens);
        System.out.println("Código do Produto: " + this.produto.getCodigo());
        System.out.println("Descrição : " + this.produto.getDescricao());
        System.out.println("Valor Produto R$: " + getProduto().getValorVenda());
        System.out.println("Em promoção : " + getProduto().isPromocao());
        System.out.println("Valor do desconto R$ : " + this.desconto * quantidadeItens);
        System.out.println("Valor total R$ :"  + valor );
    }



    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}
