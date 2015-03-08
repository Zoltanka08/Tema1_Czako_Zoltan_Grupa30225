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

public class DerivPol extends Polinom{

	public DerivPol()
	{
	}
	
	public DerivPol(int[] a, int[] b)
	{
		this.a = a.clone();
		this.b = b.clone();
	}
	
	@Override
	public int[] Op() {
		
		return null;
	}
	
	public int[] deriv(int[] d)
	{
		
		for (int i=1;i<d.length;i++)
		{
			d[i] = d[i]  * i;
		}
		
		for (int i=0;i<(d.length-1);i++)
		{
			d[i] = d[i+1];
		}
		
		d[d.length-1] = 0;
		
		return d;
	}

}


