import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = new Rectangle(100,100,200,100);
      r2 = r1;
      System.out.println(r1);
      System.out.println(r2);
   }
}