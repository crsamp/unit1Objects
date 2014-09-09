
import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random dice = new Random();
        int number = dice.nextInt(6)+1;
        System.out.println(number);
    }
}