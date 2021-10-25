package br.pucpr.semana08.interfaces;
public interface ServicoPagamento {
	public abstract void cobrar(Lojista lojista,Consumidor consumidor,
            double valor);
	public abstract void estornar(Lojista lojista,Consumidor consumidor,
            double valor);
}
