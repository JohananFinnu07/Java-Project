package program;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Homepage1  {
	private JFrame f;
	public static void main(String []args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage1 h = new Homepage1();
					h.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Homepage1() {
		initialize();
	}
	public void initialize() {
		f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.getContentPane().setLayout(null);
		Image i=Toolkit.getDefaultToolkit().getImage("C:\\Users\\CH.BHAVANA\\Downloads\\student-card.png");
		f.setIconImage(i);
		
		JLabel l = new JLabel("ONLINE QUIZ");
		l.setFont(new Font("Courier New", Font.BOLD, 99));
		l.setForeground(new Color(248, 248, 255));
		l.setBounds(350, 168, 658, 114);
		f.getContentPane().add(l);
		
		JButton b = new JButton("HOME");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Let's start this is HOME PAGE:)");	
			}
		});
		b.setFont(new Font("Courier New", Font.BOLD, 16));
		b.setForeground(new Color(0, 0, 128));
		b.setBounds(912,359, 104, 29);
		f.getContentPane().add(b);
		
		JButton b2 = new JButton("ADMIN");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Adminlogin1 a=new Adminlogin1();
				a.Adminlogin1();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			
			}
		});
		b2.setForeground(new Color(0, 0, 128));
		b2.setFont(new Font("Courier New", Font.BOLD, 16));
		b2.setBounds(400, 318, 117, 29);
		f.getContentPane().add(b2);
		
		
		JButton b1 = new JButton("USER");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register us = null;
				try {
					us = new Register(); 
											
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				us.Register();
				
			}
		});
		b1.setForeground(new Color(0, 0, 128));
		b1.setFont(new Font("Courier New", Font.BOLD, 16));
		b1.setBounds(655, 318, 117, 29);
		f.getContentPane().add(b1);
		

		JButton b3 = new JButton("ABOUT");
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Hello Users !! This  application is a best platform for creation and attemption of Quiz :)");	
			}
		});
		
		b3.setForeground(new Color(0, 0, 128));
		b3.setFont(new Font("Courier New", Font.BOLD, 16));
		b3.setBounds(912, 318, 104, 29);
		f.getContentPane().add(b3);
		
		
		JLabel l2 = new JLabel("");
		l2.setIcon(new ImageIcon("B:\\New Folder\\books.png"));
		l2.setBounds(1030, 176, 92, 82);
		f.getContentPane().add(l2);
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("B:\\New Folder\\admin.png"));
		l1.setBounds(420, 349, 95, 107);
		f.getContentPane().add(l1);
		
		JLabel l3 = new JLabel("");
		l3.setIcon(new ImageIcon("B:\\New Folder\\student.png"));
		l3.setBounds(700, 349, 107, 100);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("\n");
		l4.setIcon(new ImageIcon("B:\\New Folder\\info.png"));
		l4.setBounds(1030, 313, 32, 36);
		f.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("\n");
		l5.setIcon(new ImageIcon("B:\\New Folder\\home1.png"));
		l5.setBounds(1030, 360, 32, 24);
		f.getContentPane().add(l5);
		
		
		
		JLabel l6 = new JLabel("");
		l6.setBounds(2560, 1600, 61, 16);
		f.getContentPane().add(l6);
		f.setTitle("ONLINE QUIZ");
		f.setForeground(SystemColor.textHighlight);
		f.setBounds(0, 0, 2560, 1600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon i1=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i1);
		l7.setBounds(0,0,1920,1080);
		f.add(l7);
	}
	private void setIcon(ImageIcon i) {
		// TODO Auto-generated method stub
		
	}
	public void Homepage1() {
		f.setVisible(true);
	}	
}
