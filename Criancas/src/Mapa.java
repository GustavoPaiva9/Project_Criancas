import java.util.ArrayList;
/**
 * @author Gustavo Paiva
 */
public class Mapa {

	public static void main(String[] args) {
     //Cria um Array List
		ArrayList <Crianca> Criancas = new ArrayList<Crianca>(); 
		Criancas.add(new Pedro());
		Criancas.add(new Ana());
		Criancas.add(new Marcelo());
		Criancas.add(new Livia());
		Criancas.add(new Vanessa());
		
		for (Crianca C : Criancas) {
		  C.agir();
		}
	}
}