package program;
import java.awt.GridLayout;

import javax.swing.*;
public class Calci {
	JFrame j;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	JTextField t;
	JPanel p1,p2;
	public static void main(String[] args) {
		Calci c=new Calci();
		c.Calci();
	}

	public void Calci() {
	j =new JFrame();
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("+");
	JButton b5=new JButton("4");
	JButton b6=new JButton("5");
	JButton b7=new JButton("6");
	JButton b8=new JButton("-");
	JButton b9=new JButton("7");
	JButton b10=new JButton("8");
	JButton b11=new JButton("9");
	JButton b12=new JButton("*");
	JButton b13=new JButton("0");
	JButton b14=new JButton(".");
	JButton b15=new JButton("del");
	JButton b16=new JButton("/");
	t=new JTextField();
	p1=new JPanel();
	p1.setBounds(0,0,500,100);
	p2=new JPanel();
	p2.setSize(350,500);
	p2.add(t);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	p1.add(b4);
	p1.add(b5);
	p1.add(b6);
	p1.add(b7); 
	p1.add(b8);
	p1.add(b9);
	p1.add(b10);
	p1.add(b11);
	p1.add(b12);
	p1.add(b13);
	p1.add(b14);
	p1.add(b15);
	p1.add(b16);
	j.add(p1);
	j.add(p2);
	p2.setLayout(new GridLayout(1,2));
	p1.setLayout(new GridLayout(4,4));
	j.setLayout(new GridLayout(2,1));
	
	j.setSize(350,500);
	j.setVisible(true);
	}

}
