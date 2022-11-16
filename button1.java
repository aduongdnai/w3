import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class button1{
    public static void addComponentstoPane(Container pane){
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        Container top=new Container();
        top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
        addALabel("Your district:  ",top);
//        addAButton("butom",top);
        String district[]={"District 1","District Aus","District U.S.A","District England","District Newzealand"};
        JComboBox cb=new JComboBox(district);
//        cb.setBounds(100, 1000,90,20);
        cb.setMaximumSize(new DimensionUIResource(200,30));
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("District 1");
        l1.addElement("District Aus");
        l1.addElement("District U.S.A");
        l1.addElement("District England");
        l1.addElement("District Newzealand");
        JList<String> list = new JList<>(l1);
        list.setSize(1000,1000);
        Container bottom=new Container();
        bottom.setLayout(new BoxLayout(bottom,BoxLayout.X_AXIS));
        addAButton("OK",bottom);
        addAButton("Cancel",bottom);
        top.add(cb);
        pane.add(top);
        pane.add(list);
        pane.add(bottom);
        pane.setSize(1000,1000 );

    }
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    private static void addALabel(String text, Container container) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(label);
    }
    private static void createAndShowGUI(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame=new JFrame("District");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentstoPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String agrs[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}