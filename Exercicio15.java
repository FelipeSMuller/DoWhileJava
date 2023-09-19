package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * Escreva um programa que peça ao usuário para adivinhar um número entre 1 e
		 * 100. O programa deve gerar um número aleatório e continuar pedindo ao usuário
		 * para adivinhar até que ele acerte.
		 */

		int escolhaUsuario = 0;
		int numeroAleatorio = (int) (Math.random() * 100);

		System.out.println(numeroAleatorio);

		do {

			try {
				escolhaUsuario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));

				if (escolhaUsuario < 0) {
					JOptionPane.showMessageDialog(null, " Você selecionou um número negativo, inválido!!");
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,
						" Você digitou um número decimal ou algo diferente de um número, ERRO!!");
			}

			if (escolhaUsuario == numeroAleatorio) {
				JOptionPane.showMessageDialog(null, " Parabéns, você acertou");
				break;

			} else {
				JOptionPane.showMessageDialog(null, "Você errou, tente novamente");

			}
		}

		while (escolhaUsuario != numeroAleatorio);

	}
}
