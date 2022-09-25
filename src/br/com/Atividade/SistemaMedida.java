package br.com.Atividade;

public class SistemaMedida {

	public static void main(String[] args) {
		
	// Switch Case compara  cada valor com a variável

    String sigla = "M";
    
    switch(sigla) {
    case "P": {
    	System.out.println("PEQUENO");
    break;
    }
    
    case "M": {
    	System.out.println("MÉDIO");
    break;
    }
    
    case "G": {
    	System.out.println("GRANDE");
    break;
    }
    
    default: {
    	System.out.println("INDEFINIDO");

	}
	}
	}
}
