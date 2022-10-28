package Arraycodes;

public class StringArray {
	public static void main(String[]args)
	{
		String str1="how there this is mahaprabu here";
		System.out.println(str1);
		String sarray[]=str1.split("");
		for(int i=sarray.length-1;i>=0;i--)
		{
			System.out.println(sarray[i]+" ");
		}
		
		
	}

}
