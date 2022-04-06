/*
// Ex #8: (Current time);
import java.util.Scanner;

class Main{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the time zone offset to GMT: ");
    int time_zone_offset = input.nextInt();

    long totalMilliseconds = System.currentTimeMillis();
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentlMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24;

    long current_time = currentHour + time_zone_offset;
    // currentHour += time_zone_offset; (Git version);
    System.out.println("Current time is " + current_time + ":" + currentlMinute + ":" + currentSecond + " GMT");
    input.close();
  }
}
*/

/*
// Ex #9: (Physics: acceleration)

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    System.out.print("Enter starting velocity, ending velocity and the time: ");
    Scanner input = new Scanner(System.in);
    
    double v0, v1, t, a ;
    v0 = input.nextDouble();
    v1 = input.nextDouble();
    t = input.nextDouble();

    a = (v1 - v0) / t;
    System.out.printf("The average acceleration is %.4f\n", a);
    // "Area of rectangle is %.2f\n", A
    input.close();
  }
}
*/

/*
// #Ex 10: (Science: calculating energy);

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Q = M * (finalTemperature – initialTemperature) * 4184

    Scanner input = new Scanner(System.in);
    double M, finalTemp, initTemp, Q;

    System.out.print("Enter the amount of water in kilograms: ");
    M = input.nextDouble();

    System.out.print("Enter the initial temperature: ");
    initTemp = input.nextDouble();

    System.out.print("Enter the the final temperature: ");
    finalTemp = input.nextDouble();

    Q = M * (finalTemp - initTemp) * 4184;
    System.out.print("The energy needed is " + Q + " Joules");
    input.close();
  }
}
*/