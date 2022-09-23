package br.com.Atividade;

public class CondicionalComposta{

	public static void main(String[] args) {

	double saldo = 85.0;
	double valorSolicitado = 25.0;
	
	// Condicional composta
	if( valorSolicitado < saldo) {
	System.out.println("Compra realizada!");
		
	}
	
	else if (valorSolicitado > saldo) {
	System.out.println("Compra não realizada!");
}
	saldo -= valorSolicitado;
	System.out.println("Saldo final:" +  " " + "R$" + saldo);
}

}
	


