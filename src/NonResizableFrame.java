import javax.swing.*;


public class NonResizableFrame extends JFrame {
	
  public static void main(String[] args){
    JFrame frame = new JFrame();
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}