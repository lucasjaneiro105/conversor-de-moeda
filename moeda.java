package projetos_java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class moeda {

	public static void main(String[] args) {
		// variaveis 
		double valorMoeda, valorReal, cotacaoMoeda;
		
		// objetos 
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		// entrada 
		System.out.println("Conversor de Moedas");
		System.out.print("Digite o valor da moeda de interesse: (exemplo: euro, dolar)");
		valorMoeda = teclado.nextDouble();
		System.out.print("Digite a cotação dessa moeda:");
		cotacaoMoeda = teclado.nextDouble();
		
		// processamento 
		valorReal = valorMoeda * cotacaoMoeda;
		
		// saida 
		System.out.println("Valor em Real: R$ " + formatador.format(valorReal));
		
		teclado.close(); 
	}
}
