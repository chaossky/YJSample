import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample999 extends Applet implements ActionListener
{
    Button bt;
    public void init()
    {
        bt = new Button("��ư");
        add(bt);
        bt.addActionListener(this);

        add(new Checkbox());

        Choice choice = new Choice();
        choice.add("���̽�");
        add(choice);

        Label label = new Label("��");
        add(label);
        List list = new List();
        list.add("����Ʈ 1");
        list.add("����Ʈ 2");
        list.add("����Ʈ 3");
        add(list);

        add(new TextField("�ؽ�Ʈ �ʵ�",30));

        add(new TextArea("�ؽ�Ʈ ���̸���"));

        add(new Scrollbar());
    }
    public void actionPerformed(ActionEvent ae)
    {
        bt.setLabel("�ߴ�");
    }
}