import java.awt.Rectangle;

public class Rectangledos
{
   public static void main(String[] args)
   {
       Rectangle red =new Rectangle(0,0,100,100);
       Rectangle blue = new Rectangle(100,10,100,100);
       System.out.println(red);
       red.translate(15,25);
       System.out.println(red);
   }
}
       