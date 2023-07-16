import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class gui3
{
    /**
     * @param args
     */
    public static void main(String[] args)
     {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run()
            {
               JFrame abhi = new JFrame("Helllo world");
               
                //set the size of frame
                abhi.setSize(500, 600);
                abhi.setVisible(true);
                abhi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        
     }
}