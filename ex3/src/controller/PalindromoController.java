package controller;
import model.*;
public class PalindromoController {

	public PalindromoController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public String invertePalavra(String palavra) throws Exception {

	        PilhaString pilha = new PilhaString(); // cria pilha
	        String invertida = ""; // string resultado

	        // percorre a palavra
	        for (int i = 0; i < palavra.length(); i++) {

	            // pega letra por letra e empilha
	            pilha.push(palavra.substring(i, i + 1));
	        }
	        

	        // desempilha tudo (inverte)
	        while (!pilha.isEmpty()) {

	            invertida = invertida + pilha.pop(); // concatena invertido
	        }

	        return invertida;
	    }

	   
	    // comparar palavras
	 
	   	    public boolean comparaPalavras(String original, String invertida) {

	        if (original.equalsIgnoreCase(invertida)) {
	            return true; // é palíndromo
	        } else {
	            return false; // não é
	        }
	    }	

}
