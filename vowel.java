import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a alphabet");

char c=scob.next().charAt(0);
if((c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'))System.out.println("VOWEL");
else System.out.println("CONSONANT");
}
}
