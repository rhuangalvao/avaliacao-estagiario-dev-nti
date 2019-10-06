/**
 * @(#)Pato.java
 *
 *
 * @author
 * @version 1.00 2019/10/5
 */


public class Pato extends Ave implements Voo {

   	public Pato( double pes,int pat) {
    	super(pes,pat);

    }
    public String voar(){
    	String aux;
    	aux = "voando";
    	return aux;
    }
    public String nome(){
   		String aux = "pato";
   		return aux;
   	}

}