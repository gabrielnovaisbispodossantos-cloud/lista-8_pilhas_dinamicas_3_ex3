package view;
import javax.swing.JOptionPane;
import controller.PalindromoController;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {

	            PalindromoController c = new PalindromoController();

	            // pede palavra
	            String palavra = JOptionPane.showInputDialog("Digite uma palavra:");

	            String invertida = c.invertePalavra(palavra); // inverte

	            boolean resultado = c.comparaPalavras(palavra, invertida); // compara

	            if (resultado) {
	                System.out.println("É palíndromo!");
	            } else {
	                System.out.println("Não é palíndromo!");
	            }

	        } catch (Exception e) {
	            System.out.println("Erro: " + e.getMessage());
	    }
	}
}
