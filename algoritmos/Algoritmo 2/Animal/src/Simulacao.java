import java.util.ArrayList;
import java.util.List;
public class Simulacao {
    public static void main(String[] args) {
    	List<Animal> lstAnimal = new ArrayList<Animal>();
    	Animal a = new Cao(6,4);
    	Animal b = new Gato(2,4);
    	Animal c = new Elefante(200,4);
    	Animal d = new Cavalo(100,4);
		Animal e = new Andorinha(0.4,4);
		Animal ff = new Pato(1,4);
		Animal g = new Galinha(1,4);

    	lstAnimal.add(a);
    	lstAnimal.add(b);
    	lstAnimal.add(c);
    	lstAnimal.add(d);
    	lstAnimal.add(e);
    	lstAnimal.add(ff);
		lstAnimal.add(g);

    	for (Animal f : lstAnimal) {
            System.out.println("Sou um(a) "+f.nome()+" e estou "+f.comer());
            System.out.println("Sou um(a) "+f.nome()+" e estou "+f.andar());
            if(f.nome()=="cão"){
    			System.out.println("Sou um(a) "+f.nome()+" e estou "+f.atacar());
    		}else if(f.nome()=="andorinha" || f.nome()=="pato"){
    			System.out.println("Sou um(a) "+f.nome()+" e estou "+f.voar());
    		}

        }
    }
}
