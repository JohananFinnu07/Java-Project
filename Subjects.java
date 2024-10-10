package program;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Subjects extends JFrame {
	private JFrame j;
		
	public Subjects(){
		j=new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JLabel l = new JLabel("SELECT A SUBJECT");
		l.setFont(new Font("Courier New", Font.PLAIN, 50));
		l.setForeground(new Color(248, 248, 255));
		l.setBounds(495, 50, 658, 114);
		j.getContentPane().add(l);
		
		JButton b1 = new JButton("DC");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage2 a=new adminpage2();
				a.adminpage2();
			}
			
		});
		b1.setForeground(new Color(0, 0, 128));
		b1.setFont(new Font("Courier New", Font.PLAIN, 25));
		b1.setBounds(550, 360, 400,70);
		j.getContentPane().add(b1);
		
		
		JButton b2 = new JButton("DBMS");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage2 a=new adminpage2();
				a.adminpage2();
			}
			
		});
		b2.setForeground(new Color(0, 0, 128));
		b2.setFont(new Font("Courier New", Font.PLAIN, 25));
		b2.setBounds(550, 210, 400, 70);
		j.getContentPane().add(b2);
		
	
		JButton b3 = new JButton("OS");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage2 a=new adminpage2();
				a.adminpage2();
			}
			
		});
		b3.setForeground(new Color(0, 0, 128));
		b3.setFont(new Font("Courier New", Font.PLAIN, 25));
		b3.setBounds(550, 660, 400, 70);
		j.getContentPane().add(b3);
		
		JButton b4 = new JButton("JAVA");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminpage2 a=new adminpage2();
				a.adminpage2();
			}
			
		});
		
		b4.setForeground(new Color(0, 0, 128));
		b4.setFont(new Font("Courier New", Font.PLAIN, 25));
		b4.setBounds(550, 510, 400, 70);
		j.getContentPane().add(b4);
		
		JButton b = new JButton("");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		
		
		b.setIcon(new ImageIcon("B:\\New Folder\\home.png"));
		b.setBounds(1450, 50, 29, 29);
		j.add(b);
		
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		
		
		b6.setIcon(new ImageIcon("B:\\New Folder\\back.png"));
		b6.setBounds(100, 50, 29, 29);
		j.add(b6);
		
			
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		j.add(l7);
		
		
		j.setSize(1600,1600);
		j.getContentPane().setBackground(new Color(0, 128, 128));
		j.getContentPane().setLayout(null);
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subjects s = new Subjects();
					s.j.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
public void Subjects() {
	j.setVisible(true);
}
}
