package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		
		String [] candidatos = {"Marcos", "Thais", "Luana", "Sabrina", "William", "Larissa", "Isabela", "Levy", "Cesár", "Aida"};
		
		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas ++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO!");
			
		} while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTIVA.");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE LIGAÇÕES " + tentativasRealizadas);
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {	
		String [] candidatos = {"Marcos", "Thais", "Luana", "Aida", "César"};
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O(A) candidato(a) de número " + (indice + 1) + " é " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação");
		for(String candidato : candidatos) {
			System.out.println("O(A) candidato(a) selecionado(a) foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Marcos", "Thais", "Luana", "Sabrina", "William", "Larissa", "Isabela", "Levy", "Cesár", "Aida"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O(A) candidato(a) " + candidato + " solicitou este valor de salário: R$ " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O(A) candidato(a) " + candidato + " foi selecionado(a) para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
