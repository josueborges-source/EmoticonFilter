package br.com.emoticon.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int valorEmocional = 0;

		String caracteresFelicidade = ":-)";
		String caracteresTristeza = ":-(";

		String mensagem;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira a mensagem: ");
		mensagem = scanner.nextLine();

		int pos = -1;
		while (true) {
			pos = mensagem.indexOf(caracteresFelicidade, pos + 1);
			if (pos < 0)
				break;
			valorEmocional++;
		}

		pos = -1;
		while (true) {
			pos = mensagem.indexOf(caracteresTristeza, pos + 1);
			if (pos < 0)
				break;
			valorEmocional--;
		}

		if (valorEmocional == 0) {
			System.out.print("Neutro");
		} else if (valorEmocional > 0) {
			System.out.print("Divertido");
		} else if (valorEmocional < 0) {
			System.out.print("Chateado");
		}

		scanner.close();

	}

}
