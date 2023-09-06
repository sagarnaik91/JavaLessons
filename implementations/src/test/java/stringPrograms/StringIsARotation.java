package stringPrograms;

public class StringIsARotation {

	public static void main(String[] args) {
		String s1="abcde";
		String s2="deabc";
		
		if(s1.length()!=s2.length())
		{
			System.out.println(s2+" is not a rotation of "+s1);
		}
		else
		{
			s1=s1.concat(s1);
			if(s1.indexOf(s2)!=-1)
			{
				System.out.println(s1+" is a rotation of "+s2);
			}
			else
			{
				System.out.println(s1+" is not a rotation of "+s2);
			}
		}

	}

}
