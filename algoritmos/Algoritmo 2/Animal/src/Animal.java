/**
 * @(#)Animal.java
 *
 *
 * @author
 * @version 1.00 2019/10/5
 */
public abstract class Animal {

	double peso;
	int patas;
    public Animal(double pes,int pat) {
    	peso=pes;
    	patas=pat;
    }
    public String andar(){
    	String aux;
    	aux= "andando";
    	return aux;
    }
    public String comer(){
    	String aux;
    	aux= "comendo";
    	return aux;
    }
    public abstract String nome();
    public abstract String atacar();
   	public abstract String voar();

}