/**
 * @(#)Andorinha.java
 *
 *
 * @author
 * @version 1.00 2019/10/5
 */


public class Andorinha extends Ave implements Voo {

    public Andorinha(double pes,int pat) {
    	super(pes,pat);

    }
    public String voar(){
    	String aux;
    	aux = "voando";
    	return aux;
    }
    public String nome(){
   		String aux = "andorinha";
   		return aux;
   	}

}