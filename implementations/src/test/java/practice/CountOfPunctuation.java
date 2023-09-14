package practice;

public class CountOfPunctuation {

	public static void main(String[] args) {
		String s = "s.s,a:e;";
		char[] ch=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='.'||ch[i]==','||ch[i]==':'||ch[i]==';')
			{
				count++;
			}
		}
		System.out.println("Total number of punctuations are: "+count);

	}

}
