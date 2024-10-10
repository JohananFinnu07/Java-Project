package program;
import javax.swing.*;
import java.awt.event.*;
public class pro {
	pro(){
		JFrame f=new JFrame("sample pro");
		JPanel p=new JPanel();
		JTabbedPane tb=new JTabbedPane();
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		tb.add("HOME",p1);
		tb.add("LOGIN",p2);
		tb.add("SIGNUP",p3);
		f.add(tb);
		f.setSize(500,500);
		f.setVisible(true);
		tb.setBounds(0,0,400,30);
	}
public static void main(String args[]) {
	new pro();

}
}
