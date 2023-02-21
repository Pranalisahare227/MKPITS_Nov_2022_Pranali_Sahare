//QUE 9- WRITE a Program to calculate the distance between the two points

public class distn_two_pts{

  public static void main(String[] args){



  int x1 = 2;
  int y1 = 4;
  int x2 = 7;
  int y2 = 9;
  int  x;
  int  y;
  double distance;


  //distance btn 2 pts

  x = x2-x1;

  y = y2-y1;

  distance = Math.sqrt(x*x + y*y);

  System.out.println("Distance between the two points is "+distance);



  }


}