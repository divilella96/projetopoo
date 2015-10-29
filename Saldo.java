/**
 * @(#)Saldo.java
 *
 *
 * @author Diego Vilella Rodrigues
 * @version 1.00 2015/10/29
 */

import java.util.Calendar;

public class Saldo {
	private float valor;
	private Calendar vencimento = Calendar.getInstance();
	
    public Saldo() {
    }
    public float getValor() {
    	return this.valor;
    }
    public Calendar getVencimento() {
    	return this.vencimento;
    }
    public void setValor(float valor) {
    	this.valor = valor;
    }
     public void setVencimento(Calendar vencimento) {
    	this.vencimento = vencimento;
    }
}