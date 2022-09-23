package br.com.Atividade;

    public class CondicionalEncadeada {
	public static void main(String[] args) {
	//Condicional encadeada, ou seja, não se limita ao if e else

	int nota = 6;
		
		
	if (nota > 6) {
		System.out.println("Aprovado");
	}
	
	// Se a nota ficar entre 6 e 7, o aluno ficará de recuperação
	
	else if (nota >= 6 && nota < 8) {
	 System.out.println("Recuperação");
	}
	
	//
	else {
		System.out.println("Reprovado");
	}

}
}
