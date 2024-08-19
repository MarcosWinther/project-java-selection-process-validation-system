package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		
		//analisarCandidato(1900.0);
		//analisarCandidato(2500.0);
		//analisarCandidato(2000.0);
		
		selecaoCandidatos();
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
