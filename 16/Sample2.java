import java.awt.*;
import java.awt.event.*;

public class Sample2 extends Frame
{
  private Label lb;

  public static void main(String[] args)
  {
    Sample2 sm = new Sample2();
  }
  public Sample2()
  {
    super("����");

    lb = new Label("ȯ���մϴ�.");

    add(lb);
    lb.setForeground(Color.blue);
    lb.setFont(new Font("Serif", Font.BOLD, 24));

    addWindowListener(new SampleWindowListener());

    setSize(250, 200);
    setVisible(true);
  }

  class SampleWindowListener extends WindowAdapter
  {
    public void windowClosing(WindowEvent e)
    {
      System.exit(0);
    }
  }
}