import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n =scan.nextInt(); 
    int first_digit = n/100;
    int second_digit = ((n/10)%10);
    int last_digit = n%10;
  int reverse = (last_digit*100+second_digit*10 +first_digit);
    System.out.println(reverse);
  }
}