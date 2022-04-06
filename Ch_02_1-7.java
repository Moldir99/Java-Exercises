/*// Ex #1 (convert C to F):
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    // fahrenheit = (9 / 5) * celsius + 32
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0 / 5) * celsius + 32;
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit" );
    input.close();
  }
}
*/

/*
// Ex #2: (Compute the volume of a cylinder)

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    //area = radius * radius * p 
    //volume = area * length
    System.out.print("Enter here radius and length of a cylinder: ");
    Scanner input = new Scanner(System.in);
    double rad = input.nextDouble();
    double length_ = input.nextDouble();
    final double PI = 3.14159; // Or just use Math.PI func.
    double area = rad * rad * PI;
    double volume = area * length_;

    System.out.printf("The area is %.3f\n", area);
    System.out.printf("The volume is %.3f\n", volume);
    input.close();
    
  }
}
*/

/*
// Ex #3: (Convert feet into meters);

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // One foot is 0.305 meter.
    System.out.print("Enter here a value for a fit: ");
    Scanner input = new Scanner(System.in);
    double feet = input.nextDouble();
    double foot = 0.305;
    double meter = feet * foot;
    System.out.println(feet + " feet is " + meter + " meters");
    input.close();
  }
}
*/

/*
// Ex #4: (Convert pounds into kilograms):

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    //One pound is 0.454 kilograms.
    System.out.print("Enter here a number in pounds: ");
    Scanner input = new Scanner(System.in);
    double pound = input.nextDouble();
    double one_pound_kg = 0.454;
    double kg = pound * one_pound_kg;
    System.out.println(pound + " pound is " + kg + " kg");
    input.close();
  }
}
*/

/*
// Ex #5:(Financial application: calculate tips)

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter here subtotal and gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuity_rate = input.nextDouble();
    double gratuity = subtotal * (gratuity_rate / 100);
    double total = gratuity + subtotal;

    System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    input.close();
  }
}
*/

/*
// Ex #6: (Sum the digits in an integer)

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter here a number between 0 and 1000: ");
    int num = input.nextInt();

    // Modified version of soln from Git;
    int sum = 0;
    while(num > 0){
      sum += (num % 10);
      num /= 10;
    }
    System.out.println("The sum is: " + sum);

    
    // Own initial soln; 
    // int rem = num % 10; 
    // int num2 = num / 10;
    // int rem2 = num2 % 10;
    // int num3 = num2 / 10;
    // int rem3 = num3 % 10;
    // int num4 = num3 /10;
    // int sum = rem + rem2 + rem3 + num4; 

    input.close();
  }
}*/

/*
// Ex #7 (Find the number of years):
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // 1 day = 24hrs; 24*60 = 1440 min/day;
    // 1 hr = 60min; 1min = 60s;
    // 1 yr = 365 days => 365 * 1440 = 525600 min/yr
    // 1 yr = 525600min -> min / 525600 = year;
    // 1 day = 1440min -> min / 1440 = day;

    System.out.print("Enter here the number of minutes: ");
    int userInput = input.nextInt();
    int min_p_year = 525600;
    int min_p_day = 1440;
    int years = userInput / min_p_year;
    int days = (userInput % min_p_year) / min_p_day;
    System.out.println(userInput + " minutes is approximately " + years + " years and " + days + " days");

    input.close();
  }
}
*/

/*
// Ex #7 Git version soln:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final int minInhour = 60;
        final int hoursInday = 24;
        final int daysInyear = 365;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes: ");

        int numberOfmin = input.nextInt();

        int numberOfyears = numberOfmin / minInhour / hoursInday / daysInyear;

        int numberOfdays = numberOfmin / minInhour / hoursInday % daysInyear;

        System.out.println(numberOfmin + " minutes is approximately " + numberOfyears + " years and " + numberOfdays + " days");
    }
}
*/