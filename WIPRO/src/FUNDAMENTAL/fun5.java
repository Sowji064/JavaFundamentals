package FUNDAMENTAL;

public class fun5 {
	public static void main(String args[]) {
	char a=args[0].charAt(0);
	if(a>=48 && a<=57)
	{
		System.out.print("Digital");
		
	}
	else if((a>='a' && a<='z')||(a>='A' && a<='Z'))
	{
		System.out.print("Alphabet");
	}
	else
	{
		System.out.print("Special character");
	}
		

}
}
