package br.pucpr.semana08.interfaces;

public class Operacao {

	public static void main(String[] args) {
		Banco itau = new Banco("Itau", 0.02);
		Visa visa  = new Visa();
		
		System.out.println("Saldos iniciais -----------");
		Lojista americanas = new Lojista(10000, 'C');
		Lojista amazon     = new Lojista(20000, 'A');
		
		System.out.println("\nAmericanas - " + americanas.printDados());
		System.out.println("\nAmazon     - " + amazon.printDados());

		Consumidor carmem = new Consumidor( 500.00 );
		Consumidor beatriz = new Consumidor( 800.00 );
		System.out.println("\nCarmem     - " + carmem.printDados());
		System.out.println("\nBeatriz    - " + beatriz.printDados());

		ServicoPagamento servico;

		servico = itau;
		servico.cobrar  (americanas, carmem, 200.00);
		servico.estornar(americanas, carmem, 100.00);
		servico = visa;
		servico.cobrar  (amazon, beatriz, 100.00);
		servico.estornar(amazon, beatriz, 50.00);
		
		System.out.println("\n\nSaldos Finais -------------");
		System.out.println("\nAmericanas - " + americanas.printDados());
		System.out.println("\nAmazon     - " + amazon.printDados());
		System.out.println("\nCarmem     - " + carmem.printDados());
		System.out.println("\nBeatriz    - " + beatriz.printDados());

	}

}
