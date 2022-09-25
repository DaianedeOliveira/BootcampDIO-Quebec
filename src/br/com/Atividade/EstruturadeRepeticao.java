package br.com.Atividade;

public class EstruturadeRepeticao {

	public static void main(String[] args) {

		//for
		for(int gatos = 15; gatos <= 20; gatos++) {
			System.out.println("\n" + "Contando gatos" + " " + gatos);
		}
		
		System.out.println("-------------");

		
		//for em array
		String alunos [] = {"Ana", "Gabriel", "Maria", "Poliana" };
		for (int x = 0; x < alunos.length; x++) {
			System.out.println("\n" + "O aluno no índice x=" + x + " " + "é" + " " + alunos[x] );
		}
		
		
		System.out.println("-------------");
		
		
		//forEach
		String pessoas [] = {"Ana", "Gabriel", "Maria", "Poliana" };

		for(String aluno : pessoas) {
			System.out.println("\n" + "O nome do aluno é:"+ " " + aluno);
		}
		
		
	}

}
