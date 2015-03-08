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

public abstract class Polinom {
	
	protected int[] a,b;
	
	public Polinom()
	{
		
	}
	
	public Polinom(int[] a, int[] b)
	{
		this.a = a.clone();
		this.b = b.clone();
	}
	
	public String toString(int[] v) 
	{
		    String s = new String();
		    s = "";
                    if (v[0]!=0)
                    {
                        s += v[0];
                    }
 
		   // s += " + ";
		    for (int i=1;i<v.length;i++)
		    {
		    	if (v[i]!=0)
		    	{
		    		if (i<v.length-1)
		    		{
		    			if (v[i]!=1)
		    			{
		    				if(i!=1)
		    				{
		    					if(v[i]>0)
		    					{
		    						s +="+" + v[i] + "x" + "^" + i;
		    					}
		    					else
		    					{
                                                            if (v[i]!=-1)
                                                            {
                                                                s +=v[i] + "x" + "^" + i;
                                                            }
                                                            else
                                                            {
                                                                s +="-x" + "^" + i;
                                                            }
		    					}
		    				}
		    				else
		    				{
                                                    if(v[i]>0)
                                                    {
		    					s +="+" + v[i] + "x";
                                                    }
                                                    else
                                                    {
                                                    	if (v[i]!=-1)
                                                            {
                                                                s +=v[i] + "x";
                                                            }
                                                            else
                                                            {
                                                                s +="-x";
                                                            }
                                                    }
		    				}
		    			}
		    			else
		    			{
		    				if(i!=1)
		    				{
		    					s += "+" + "x" + "^" + i ;
		    				}
		    				else
		    				{
		    					s += "+" + "x";
		    				}
		    			}
		    		}
		    		else
		    		{
		    			if (v[i]!=1)
		    			{
		    				if(i!=1)
		    				{
		    					if(v[i]>0)
		    					{
		    						s +="+" + v[i] + "x" + "^" + i;
		    					}
		    					else
		    					{
                                                            if (v[i]!=-1)
                                                            {
                                                                s +=v[i] + "x" + "^" + i;
                                                            }
                                                            else
                                                            {
                                                                s +="-x" + "^" + i;
                                                            }
		    					}
		    				}
		    				else
		    				{
		    					if(v[i]>0)
		    					{
		    						s +="+" + v[i] + "x" ;
		    					}
		    					else
		    					{
                                                            if (v[i]!=-1)
                                                            {
                                                                s +=v[i] + "x";
                                                            }
                                                            else
                                                            {
                                                                s +="-x";
                                                            }
		    					}
		    				}
		    			}
		    			else
		    			{
		    				if(i!=1)
		    				{
		    					s +="+" + "x" + "^" + i;
		    				}
		    				else
		    				{
		    					s +="+" + "x";
		    				}
		    			}
		    		}	
		    	}
		    }
		    
                    if (v[0] == 0) 
                    {
                        s = s.substring(1, s.length());
                    }
		    return s;
	}
	
	public abstract int[] Op();

}
