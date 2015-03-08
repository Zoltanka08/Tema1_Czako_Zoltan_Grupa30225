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

public class MultPol extends Polinom{

	
	public MultPol(int[] a, int[]  b)
	{
		this.a = a.clone();
		this.b = b.clone();
	}
	
	
	@Override
	public int[] Op() {
		
		int[] aux = new int[a.length+b.length+1];
		
		for (int i=0;i<a.length;i++)
			for (int j=0;j<b.length;j++)
				aux[i+j] += a[i] * b[j];
		
		return aux;
	}
	

}
