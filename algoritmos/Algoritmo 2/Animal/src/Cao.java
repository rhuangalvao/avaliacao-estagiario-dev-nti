/**
 * @(#)Cao.java
 *
 *
 * @author
 * @version 1.00 2019/10/5
 */


public class Cao extends Mamifero {

    public Cao(double pes,int pat) {
    	super(pes,pat);
    }
    public String nome(){
   		String aux = "cão";
   		return aux;
   	}
    public String atacar(){
    	String aux;
    	aux="atacando";
    	return aux;
    }

}