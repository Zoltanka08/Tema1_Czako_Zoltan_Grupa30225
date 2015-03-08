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

public class DivPol extends Polinom{

	public DivPol(int[] a, int[]  b)
	{
		this.a = a.clone();
		this.b = b.clone();
	}
	
	
	public static int degree(int[] a)
	{
		int i=a.length-1;
		while (i>=0 && a[i]==0)
		{
			i--;
		}
		
		return i;
	}
	
	@Override
	public int[] Op() {
		
		int i,j;
		int[] aux = new int[a.length + 2];
		int[] q = new int[a.length+2];
		int[] d = new int[a.length+2];
		
		for (i=0;i<b.length;i++)
			aux[i] = b[i];
		
		if (degree(aux)<0) return null;
		
		if (degree(a) > degree(aux))
		{
			for (i=0;i<q.length;i++) q[i] = 0;
			
			while (degree(a) >= degree(aux))
			{
				for (i=0;i<(degree(a) - degree(b));i++)
					{
						int deg = degree(aux);
						for (j=deg;j>=0;j--)
							aux[j+1] = aux[j];
						aux[i] = 0;
					}
					//aux[i] = 0;
				
					d = aux.clone();
				q[degree(a)-degree(b)] = a[degree(a)] / d[degree(d)];
				
				for (i=0;i<d.length;i++)
					d[i] = d[i] * q[degree(a)-degree(b)];
				
				for (i=0;i<=degree(d);i++)
					a[i] -= d[i];
				
				for (i=0;i<aux.length;i++)
					if(i<b.length) 
						{
							aux[i] = b[i];
						}
					else
					{
						aux[i] = 0;
					}
				
			}
		}
		else
		{
			for (i=0;i<q.length;i++) q[i] = 0;
		}
		
		return q;
	}

}

