package principal;
import entidade.Gato;
import entidade.Vaca;
import entidade.Cachorro;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Gato gato = new Gato();
    System.out.println(gato.EmitirSom());
    Vaca vaca = new Vaca();
    System.out.println(vaca.EmitirSom());
    Cachorro cachorro = new Cachorro();
    System.out.println(cachorro.EmitirSom());
    
    
	}

}
