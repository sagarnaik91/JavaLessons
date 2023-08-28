package stringPrograms;

public class ReverseWordReverseCharacter {

	public static void main(String[] args) {
		String rev="";
		String s1 = "Arise Awake stop not till goal is reached";
		String[] s2 = s1.split("\\W+");
		System.out.println(s2.length);
		for(String s:s2)
		{
			System.out.println("s is "+s.toString());
		}
		for(int i=s2.length-1;i>=0;i--)
		{
			rev=rev+reverse(s2[i]);
		}
		System.out.println(rev);

	}
	
	public static String reverse(String n)
	{
		String revv="";
		for(int i=n.length()-1;i>=0;i--)
		{
			revv=revv+n.charAt(i);
		}
		return revv;
		
	}

}
