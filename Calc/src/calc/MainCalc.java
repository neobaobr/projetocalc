package calc;

import java.util.Scanner;

public class MainCalc {

	public static void main(String[] args) {
		int opcao;
		double a, b, resultado = 0,memoria =0 ;
		Scanner ler = new Scanner(System.in);

		System.out.println("Bem vindo a calculador , escolha uma opcao para realizar uma operacao: \n");
		System.out.println("1- Somar dois numeros \n");
		System.out.println("2- subtrair dois numeros \n");
		System.out.println("3-multiplicar dois numero  \n");
		System.out.println("4-dividir dois numero \n");
		System.out.println("5- potencia de dois numero \n");
		System.out.println("6- raiz enesima \n"); // raiz quadrada ou enesima
		System.out.println("7- % de dois numeros \n");
		System.out.println("8- inversao de sinal \n");
		System.out.println("-99 -> para sair \n");
		opcao = ler.nextInt();
		switch (opcao) {
		// soma 1 .. subtrai 2 .. mult 3 .. divide 4 .. potencia 5 .. sqrt 6 .. 7
		// porcentagem 8 - inverter sinal do ultimo resultado 
		case 1: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			// resultado = a+b;
			System.out.println(a + " + " + b + " = " + (a + b));
			memoria=a+b;

			break;
		}

		case 2: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			System.out.println(a + " - " + b + " = " + (a - b));
			memoria=a-b;
			break;
		}

		case 3: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			System.out.println(a + " * " + b + " = " + (a * b));
			memoria=a*b;
			break;
		}

		case 4: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			System.out.println(a + " / " + b + " = " + (a / b));
			memoria=a/b;
			break;
		}

		case 5: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			System.out.println(a + " ^ " + b + " = " + Math.pow(a, b));
			memoria=Math.pow(a, b);
			break;
		}

		case 6: {
			System.out.println("digite o primeiro numero A dentro da raiz \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B (raiz enesima) \n");
			b = ler.nextDouble();
			Math.pow(a, 1.0 / b);
			System.out.println(a + " raiz " + b + " = " + (Math.pow(a, 1.0 / b)));
			memoria = Math.pow(a, 1.0 / b);
			break;
		}

		case 7: {
			System.out.println("digite o primeiro numero A \n");
			a = ler.nextDouble();
			System.out.println("digite o segundo numero B \n");
			b = ler.nextDouble();
			System.out.println(a + " % " + b + " = " + ((a / 100) * b));
			memoria=(a / 100) * b;
			break;
		}
		case 8: {
			memoria=memoria*(-1);
			System.out.println(memoria);
			break;
		}
		default:
			System.out.println("opcao invalida \n");

		}
		while (opcao != -99)
			;

	}

}
