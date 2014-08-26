
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://blogs.adobe.com/digitalpublishing/files/2011/02/android_logo.gif");
        JOptionPane.showMessageDialog(null, "BYE", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}