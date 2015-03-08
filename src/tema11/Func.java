/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11;

/**
 *
 * @author Zoli
 */
import java.util.Arrays;

public class Func implements Function{
	
private int[] a = new int[100];
	
	// Constructor
	
	public Func(int[] a)
	{
		if (a.length<2)
		{
			a = new int[] {1,0};
		}
		this.a = Arrays.copyOf(a, a.length);
	}
	
	/////////////////// 
	
	// get method
	
	public int[] getA()
	{
		return this.a;
	}
	
	///////////////////
	
	// valoarea functiei
	
	/* (non-Javadoc)
	 * @see ro.utcluj.poo.lab04.Function#getFuncValue(double)
	 */
	@Override
	public double getFuncValue(double x){
		
		double f=0;
		
		if (a.length < 2) return x;
		else
		{
			int i;
			for (i=0;i<a.length;i++)
				f = f + Math.pow(x,a.length-1-i) * a[i]; // f = a[0]*x^n + a[1]*x^(n-1) + ... + a[n]*x^0
		}
		
		return f;
	}
	
	///////////////////
	
	// derivata functiei
	
	/* (non-Javadoc)
	 * @see ro.utcluj.poo.lab04.Function#getDerivValue(double)
	 */
	@Override
	public double getDerivValue(double x){
		
		double f=0;
	
		if (a.length < 2) return a[1];
		else
		{
			int i;
			for (i=1;i<a.length;i++)
				f = f + (a.length-i) * Math.pow(x,a.length-1-i) * a[i-1]; // f = 1*a[1] + 2*a[2]*x + ... + n*a[n]*x^n-1
		}
		
		return f;
	}
	
	/////////////////////////
	
	//  sirul de caractere pt afisarea frumoasa a functiei
	
	

}

