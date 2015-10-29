/**
 * @(#)Pre.java
 *
 *
 * @author Diego Vilela Rodrigues
 * @version 1.00 2015/10/29
 */

import java.util.*;
public class Pre {
	private Saldo saldo;
    public Pre() {
    }
    public boolean recarregar(float valor) {
    	Date dataAtual = new java.util.date();
    	 saldo = new Saldo(valor,dataAtual);
    	
    	return true;
    }
    
}