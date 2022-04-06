/*
// Ex #8: (Compute area and a perimeter of a circle);
class Main{
  public static void main(String[] args){
    double r = 5.5;
    double pi = Math.PI;
    double P = 2 * r * pi;
    double A = r * r * pi;
    System.out.println("Perimeter of a circle is " + P);
    System.out.println("Area of a circle is " + A);
  }
}
*/

/*
// Ex #9: (Display area and a perimeter of a rectangle);

class Main{
  public static void main(String[] args){
    double width = 4.5;
    double height = 7.9;
    double A = width * height;
    double P = 2 * (width + height);

    // here is %.2f\n rounding the number after floating point until 2 digits;
    System.out.printf("Area of rectangle is %.2f\n", A);
    System.out.println("Perimeter of rectangle is " + P);
  }
}
*/
/*
// Ex10: (Find average speed in mi/hr);
class Main{
  public static void main(String[] args){

    double mi = 1.6; // 1mi = 1.6km;
    int hr = 60; // 1hr = 60 min;
    int S = 14; // Distance;
    double t = 45.5; // Time;
    double V = ((S/mi)/(t/hr)); // V = S/t;

    System.out.printf("The average speed in MPH is %.2f\n", V);
    //double V = ((14/1.6)/(45.5/60)); // Simple way;
  }
  */

  /*
  // According to the soln in internet;
  double numMiles = 14 / 1.6;            //Convert kilometers into MPH
        double speed = numMiles / (45.5 / 60);            //Average speed in miles per hour

        System.out.printf("%.3f", speed);
  */

/*
//Ex #11: (Population projection);
class Main{
  public static void main(String[] args){
    // 24hrs * 3600s = 86400s;
    // 86400/7.0 = 12342.857 b/y
    // 86400/13.0 = 6646.154 d/y
    // 86400/45.0 = 1920 i/y

    // 86400*365 = 31536000s/year;
    // 31536000/7.0 = 4505142.857 born/year;
    // 31536000/13.0 = 2425846.154 d/year;
    // 31536000/45.0 = 700800 mig/year;

    //4505142.857-2425846.154+700800 = 2780096.703 p/add/yr;

    // 312,032,486 + 2780096.703 = 314812582.703 1st yr total;
    // 314812582.703 + 2780096.703 = 317592679.406 2nd yr total;
    // 317592679.406 + 2780096.703 = 320372776.109 3rd yr total;
    // 320372776.109 + 2780096.703 = 323152872.812 4th yr total;
    // 323152872.812 + 2780096.703 = 325932969.515 5th yr total;

    int days = 365;
    int sec_per_day = 86400; 
    int cur_popul = 312032486;
    double b = 7.0; // One birth every 7s;
    double d = 13.0;  // One death every 13s; 
    double im = 45.0; // One new imgrant 45s;

    double sec_per_year = days * sec_per_day;
    double born = sec_per_year / b;
    double d2 = sec_per_year / d;
    double imigrated = sec_per_year / im;

    double total_added = born - d2 + imigrated;
    double fifth_y_pop = (total_added * 5) + cur_popul;

    while(cur_popul <= fifth_y_pop){
      cur_popul += total_added;
      //System.out.println(cur_popul*0.01);
      //System.out.printf(" The population in one year is %1.0f\n",cur_popul);
      System.out.println(" The population in one year is "+cur_popul);
      cur_popul++;
    } 
  }
} */

/*
// Ex #11: (Github soln_ver)
public class Main {
    public static void main(String[] args) {


        double birthInseconds = 7.0;
        double deathInseconds = 13.0;
        double immigrationInseconds = 45.0;

        double birthsPeryear = changeToyears(birthInseconds);
        double deathsPeryear = changeToyears(deathInseconds);
        double immigratePeryear = changeToyears(immigrationInseconds);

        double currentPopulation = 312_032_486;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += birthsPeryear - deathsPeryear + immigratePeryear;

            System.out.print("The population in year " + i + " will be ");
            System.out.printf("%1.0f", currentPopulation);   //To prevent displaying in scientific notation
            System.out.println();
        }

    }

    public static double changeToyears(double valueInseconds) {

        double secondsInyear = 60 * 60 * 24 * 365;

        double amountPeryear = secondsInyear / valueInseconds;

        return amountPeryear;
    }

}*/

/*
// Ex #12: (Average speed in km);
class Main{
  public static void main(String[] args){
    // S = 24mi;
    // t = 1hr 40min 35s;
    // V = ?; KPH;
    // 1 mi = 1.6km;
    // 1hr40min35s = 1.6767hr;
    double V = ((24*1.6)/(1.6767));
    System.out.printf("The average speed in KPH is %.2f\n", V);

  }
}
*/

/*
// Ex #12 (GitHub v.soln):

public class Exercise01_12 {
    public static void main(String[] args) {
        double hrs = 1;
        double mins = 40;
        double secs = 35;
        double totaldist = 24;
        double kilodist = totaldist * 1.6;
        double converttomin = hrs * 60 + mins + secs / 60;
        double KPH = 60 * kilodist / converttomin;

        System.out.println(KPH);

    }

} 
*/

/*
// Ex #13: (Solve linear eq 2x2 using Cramer's rule)
// Note: GitHub version soln the same;
class Main{
  public static void main(String[] args){
    double a = 3.4;
    double b = 50.2;
    double c = 2.1;
    double d = 0.55;
    double e = 44.5;
    double f = 5.9;

    double x = ((e * d) - (b * f))/((a * d) - (b * c));
    double y = ((a * f) - (e * c))/((a * d) - (b * c));

    System.out.printf("x is equal to %.3f\n", x);
    System.out.printf("y is equal to %.3f\n", y);
  }
}

*/
