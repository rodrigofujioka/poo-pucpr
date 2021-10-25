package br.pucpr.semana08.interfaces;

public abstract class AgenteFinanceiro implements ServicoPagamento {

	public void estornar(Lojista lojista,Consumidor consumidor, double valor) {
		lojista.debitar(valor);
		consumidor.depositar(valor);
		}
}
