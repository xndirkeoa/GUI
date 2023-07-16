import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Gui4 extends JFrame 
{
    private JTextArea textArea;
    private JButton btn;

    public Gui4(){
      super("world");

    setLayout( new BorderLayout());

    btn = new JButton("click me");
    textArea = new JTextArea();
    
    btn.addActionListener( new ActionListener(){

        public void actionPerformed(ActionEvent argo){


            textArea.append("Hello\n");
        }
    });
     add(textArea,BorderLayout.CENTER);

    add(btn,BorderLayout.SOUTH); 

    setSize(500, 600);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setVisible(true);
    
    
    setSize(500, 600);

    setVisible(true);


    
    }
    public static void main(String[]args){
        new Gui4();
    }
}


