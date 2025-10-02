public class StringFormat {
    public static void main(String[] args) {
      int y=10;
      int x=25;
      int z=x+y;
      double a = 7.2;
      double b = 10.88;
      String c= "Tischina";
      String d = String.format("%.6f",b);

      System.out.printf("Sum of %d + %d = %d\n",x,y,z); //d is decimal integer
      System.out.printf("%2.0f and %2.2f are doubles because they have decimals",b,a); //f is for floating point number
      System.out.printf("\n%s likes to program.",c);//s is string  -- must put in "\n"
      System.out.println(d); // notice is on previous line output!
    }
}
