import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Driver extends JFrame implements ActionListener{

   Context c;
   JButton start;
   JButton pickFile;
   JFileChooser chooser;
   JTextArea area;
   JPanel buttons;

   public Driver(){
      super("Character Counter");
      //c = new Context();
      pickFile = new JButton("Choose File");
      pickFile.addActionListener(this);
      start = new JButton("Count");
      start.addActionListener(this);
      area = new JTextArea();
      chooser = new JFileChooser();
      buttons = new JPanel();
      buttons.setLayout(new GridLayout(2,1));
      buttons.add(start);
      buttons.add(pickFile);
      getContentPane().setLayout(new BorderLayout());
      getContentPane().add(buttons, BorderLayout.EAST);
      getContentPane().add(area);
      area.setEditable(false);

   }

   public void actionPerformed(ActionEvent e){
      if(e.getSource() == pickFile){
         chooser.showOpenDialog(null);
         File file = chooser.getSelectedFile();
         c = new Context(file);
      }
      if(e.getSource() == start){
         c.pressCount();
         area.append("Code: " +c.getCode() + "\n");
         area.append("Comment: " + c.getComment() + "\n");
         area.append("Javadoc: " + c.getJavadoc() + "\n");
      }

   }

   public static void main(String args[]){
      Driver d = new Driver();

      d.setSize(300, 175);
      d.setLocation(100,300);
      d.setVisible(true);
      d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }


}
