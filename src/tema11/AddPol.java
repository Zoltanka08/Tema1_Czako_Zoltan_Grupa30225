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

public class AddPol extends Polinom{

	
	public AddPol(int[] a, int[]  b)
	{
		this.a = a.clone();
		this.b = b.clone();
	}
	
	@Override
	public int[] Op() {
		
		int l,m;
		int[] rez;
		
		if (a.length<b.length)
			{
			l = b.length;
			rez = new int[l];
			m = a.length;
			rez = b.clone();
			for (int i=0;i<m;i++)
				rez[i] += a[i];
				}
			else
				{
					l = a.length;
					rez = new int[l];
					m = b.length;
					rez = a.clone();
					for (int i=0;i<m;i++)
						rez[i] += b[i];
				}
		
		return rez;
	} 

}

