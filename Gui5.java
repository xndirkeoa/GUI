import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


class Gui5 extends JFrame 
{
    private TextPanel textPanel;
    private JButton btn;

    public Gui5(){
      super("hi");

    setLayout( new BorderLayout());

    btn = new JButton("click me");
    textPanel = new TextPanel();
    
    btn.addActionListener(new ActionListener()
    {

        public void actionPerformed(ActionEvent argo)
        {
            textPanel.appendText("Hello\n");
        }
    });
     add(textPanel,BorderLayout.CENTER);

    add(btn,BorderLayout.SOUTH); 

    setSize(500, 600);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setVisible(true);
    
    
    setSize(500, 600);

    setVisible(true);
    }
    public static void main(String[]args){
        new Gui5();
    }
}


