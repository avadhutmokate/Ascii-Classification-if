import  java.util.Scanner;
class AsciiClassifiaction1
{
    public static void main (String [] args)
{    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character : ");
    char ch = sc.next().charAt(0);

    if (ch >= 65 && ch<=90)
    {
        // condition
        System.out.println(ch+ " is a Uppercase Character");

    }
    if (ch >=97 && ch<=122)
    {
        System.out.println(ch+ " is a Lowercase Character");

    }
    if (ch >=48 && ch<=57)
    {
        System.out.println(ch+ "is a Number");

    }
    if (!((ch >=97 && ch<=122) || (ch >=48 && ch<=57) || (ch >= 65 && ch<=90))) {
        System.out.println(ch + " is a Special Character");

    }
}
}