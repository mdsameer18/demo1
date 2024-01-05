import java.util.Scanner;
class Consonant
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a alphabet");

char c=scob.next().charAt(0);
if((c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'))
System.out.println("YES");

else
System.out.println("NO");


}
}

