import javax.swing.*;
public class gui2
{
    static JFrame abhi;
    gui2(){
        //creating a jframe
        abhi = new JFrame("abhishek");
        JButton button = new JButton("ABHISHEK");
        button.setBounds(600, 350, 100, 300);
        abhi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abhi.add(button);
        abhi.setSize(100,100);
        abhi.setVisible(true);
        abhi.setLayout(null);
        abhi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main ( String []args){
        new gui2();   
    }
}

// import javax.swing.*;
// public class gui2
// {
// 	private static JFrame frame;

// 	gui2()
// 	{
// 		// creating instance of JFrame with name "first way"
// 		frame=new JFrame("first way");
		
// 		// creates instance of JButton
// 		JButton button = new JButton("let's see");

// 		button.setBounds(200, 150, 90, 50);
		
// 		// setting close operation
// 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// 		// adds button in JFrame
// 		frame.add(button);

// 		// sets 500 width and 600 height
// 		frame.setSize(500, 600);
		
// 		// uses no layout managers
// 		frame.setLayout(null);
		
// 		// makes the frame visible
// 		  frame.setVisible(true);
// 	}
	
// 	public static void main(String[] args)
// 	{
// 		new gui2();
      
// 	}
// }
