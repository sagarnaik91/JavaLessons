package interview;

public class SubString {
	//Print these combinations se,el,le,en,sel,ele,len,sele,elen from string selen
	public static void main(String[] args) {
		String s="Selen";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+2;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}

	}

}
