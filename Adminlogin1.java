package program;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.sql.*;
public class Adminlogin1 extends JFrame{
	
	private JPanel c;
	private JTextField tf;
	private JPasswordField pf;
		public static void main(String[] args) throws Exception{
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Adminlogin1 frame = new Adminlogin1();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		public Adminlogin1() throws Exception{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
			Statement st=con.createStatement();
		    final  ResultSet rs = st.executeQuery("Select * from admin_login");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 1920, 1080);
			
			c = new JPanel();
			c.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(c);
			c.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(255,182,193));//major
			panel.setBounds(460, 125, 235, 515);
			c.add(panel);
			panel.setLayout(null);
			
			JLabel l1 = new JLabel("");
			l1.setIcon(new ImageIcon("B:\\New Folder\\admin.png"));
			l1.setBounds(71, 191, 109, 100);
			panel.add(l1);
			
			JPanel p1 = new JPanel();
			p1.setBounds(695, 125, 261, 505);
			c.add(p1);
			p1.setLayout(null);
			
			JLabel ln = new JLabel("LOGIN");
			ln.setForeground(new Color(0, 0, 0));
			ln.setFont(new Font("New Peninim MT", Font.BOLD, 20));
			ln.setBounds(54, 136, 96, 26);
			p1.add(ln);
			
			JLabel la = new JLabel("ADMIN ID");
			la.setForeground(new Color(0,0,0));
			la.setFont(new Font("American Typewriter", Font.PLAIN, 15));
			la.setBounds(54, 199, 96, 16);
			p1.add(la);
			
			JLabel lp = new JLabel("PASSWORD");
			lp.setForeground(new Color(0,0,0));
			lp.setFont(new Font("American Typewriter", Font.PLAIN, 15));
			lp.setBounds(54, 264, 96, 16);
			p1.add(lp);
			
			JButton b = new JButton("");
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Homepage1 hp=new Homepage1();
					hp.Homepage1();
				}
				
			});
			
			
			b.setIcon(new ImageIcon("B:\\New Folder\\home.png"));
			b.setBounds(205, 125, 29, 29);
			p1.add(b);
			
			
			JButton b6 = new JButton("");
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Homepage1 h=new Homepage1();
					h.Homepage1();
					
				}
				
			});
			
			
			b6.setIcon(new ImageIcon("B:\\New Folder\\back.png"));
			b6.setBounds(20,20, 24, 24);
			p1.add(b6);
			
			
			
			JButton b1 = new JButton("LOGIN");
			b1.setFont(new Font("American Typewriter", Font.BOLD, 15));
			b1.setForeground(new Color(0,0,0));
			b1.setBounds(54, 328, 152, 29);
			b1.addActionListener((ActionListener) new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					try {
						int res=0;
						while(rs.next()) {
							if(rs.getString(1).equals(tf.getText())&& rs.getString(3).equals(pf.getText()))
							{ 
								res=1;
								Subjects s=new Subjects();
								s.Subjects();
								
								
								break;
							}
							else
								continue;
						}
						if (res!=1) {
							JOptionPane.showInternalMessageDialog(null,"Authentication unsuccessful:(", "message", JOptionPane.ERROR_MESSAGE);
						}
					}
						catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
					
		    	
		    });
			p1.add(b1);
			
			tf = new JTextField();
			tf.setForeground(new Color(255,0,127));
			tf.setBackground(new Color(240, 255, 240));
			tf.setBounds(54, 216, 152, 26);
			p1.add(tf);
			tf.setColumns(10);
			
			pf = new JPasswordField();
			pf.setBackground(new Color(240, 255, 240));
			pf.setForeground(new Color(255,0,127));
			pf.setBounds(54, 280, 152, 26);
			p1.add(pf);
			
			JPanel p2 = new JPanel();
			p2.setBackground(new Color(255,182,193));
			p2.setBounds(460, 115, 496, 10);
			c.add(p2);
			
			JPanel p3 = new JPanel();
			p3.setBackground(new Color(255,182,193));
			p3.setBounds(460, 630, 496, 10);
			c.add(p3);
			
			JPanel p4 = new JPanel();
			p4.setBackground(new Color(255,182,193));
			p4.setBounds(956, 115, 10, 525);
			c.add(p4);
			
			
			ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
			JLabel l7 = new JLabel();
			l7.setIcon(i);
			l7.setBounds(0,0,1920,1080);
			add(l7);
			
		}
		public void Adminlogin1() {
			
			setVisible(true);
		}
}

		


