package Arraycodes;

public class ArrayDatatypesCodes {
	public static void main(String[]args)
	{
		   //Integer 
	
		    int n[]={2,3,5,6,7,7,8};
		    for(int k=0;k<n.length;k++)
		    {
		    	System.out.print(n[k]+", ");
		    }
		    System.out.println();
	         //Double	
			double d[]={2.3,5.3,6.2,1.3,1.3};
			
			//Character
			
			char ch[]={'a','e','i','o','u'};
			
			//String
			
			String str[]={"one","two","three","four","Five"};
			for(int i=0;i<d.length;i++)
			{
				System.out.print(d[i]+", ");
				
			}
			System.out.println();
			for(int j=0;j<ch.length;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		   for(String k :str)
		   {
			   System.out.print(k+", ");
		   }
}

}
