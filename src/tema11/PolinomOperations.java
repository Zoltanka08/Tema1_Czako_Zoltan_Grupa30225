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

public class PolinomOperations {
	
	public static int[] parseString(String s,int grad) throws NumberFormatException
	{
		String conv = new String();
		char[] c,aux = new char[s.length()];
		int[] send = new int[grad+1];
		int len=0, val, ind, put;
		
		c = s.toCharArray();
		
		int i = 0, j;
		boolean first = true; 
		
		while (i!=s.length())
		{
			if (c[i] == 'x')
			{
				///////////////  coef
				if (first == true)
				{
					if (i!=0)
					{
						conv = String.copyValueOf(c, 0, i);
						val = Integer.parseInt(conv);
						first = false;
					}
					else 
						{
						val = 1;
						first = false;
						}
				}
				else 
				{
					j = i;
					while (j!=0 && c[j]!='+' && c[j]!='-')
					{
						j--;
					}
					conv = String.copyValueOf(c, j+1, i-j-1);
					if (i-j!=1){
						val = Integer.parseInt(conv);
					}
					else 
					{
						val = 1;
					}
					if (c[j] == '-')
					{
						val = -val;
					}
					
				}
				///////////////////////// end coef
				
				////// putere
				if  (i!=(s.length()-1))
				{
				i++;
				if (c[i] == '^')
				{
					j = i+1;
					while (j!=s.length() && c[j]!='+' && c[j]!='-')
					{
						j++;
					}
					
					conv = String.copyValueOf(c, i+1, j-i-1);
					put = Integer.parseInt(conv);
				}
				else
				{
					put = 1;
				}
				}
				else
				{
					put = 1;
				}
				// //////////////   end putere
				
				send[put] = val;
				
			}
			
			i++;
		}
		
		return send;
	}
	
	public static double findValue(int[] a, double x)
	{
		double rez = 0;
		
		for (int i = 0;i<a.length;i++)
		{
			rez += Math.pow(x, i) * a[i];
		}
		
		return rez;
	}
	
	public static double findRoots(Func func, double startValue){
		double precision = 1e-6;
		double x = startValue;
		double x1;
                int[] a;
                
                a = func.getA();
                
                if (a.length==2)
                {
                    return -a[0];
                }
                else if(a.length==3)
                {
                    if (a[0]==0) return 0;
                    else
                    {
                        if (a[1]==0)
                        {
                            if (a[0]<0) 
                            {
                                return Math.sqrt((-a[0]));
                            }
                            else 
                            {
                                throw new RuntimeException("Nu pot gasi radacinile.");
                            }
                        }
                        else
                        {
                            int delta;
                            delta = a[1]*a[1] - 4*a[2]*a[0];
                            if (delta>=0) 
                            {
                                return ((-a[1] + Math.sqrt(delta))/(2*a[2]));
                            }
                            else
                            {
                                throw new RuntimeException("Nu pot gasi radacinile.");
                            }
                        }
                    }
                }
                else{
		//Do maximum 500 iterations
		for (int i=0;i<500;i++){
			try {
				x1 = x - func.getFuncValue(x) / func.getDerivValue(x);
				if (Math.abs(x1-x) < precision){
					break;
				}
				x = x1;
			} catch (Exception e) {
				break;
			}
		}
		if (Math.abs(func.getFuncValue(x)) > precision){
			throw new RuntimeException("Nu pot gasi radacinile.");
		}
		return x;
                }
	}
	

}
