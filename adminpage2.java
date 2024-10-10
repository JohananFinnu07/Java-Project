package program;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class adminpage2 extends JFrame {
	private JFrame j;
		
	public adminpage2(){
		j=new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(1600,1600);
		j.getContentPane().setBackground(new Color(0, 128, 128));
		j.getContentPane().setLayout(null);
		
		
		JLabel l = new JLabel("WELCOME ADMIN!!");
		l.setFont(new Font("Courier New", Font.PLAIN, 50));
		l.setForeground(new Color(255, 248, 255));
		l.setBounds(495, 50, 658, 114);
		j.getContentPane().add(l);
		
		
		
		JButton b2 = new JButton("CREATE QUIZ");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from adminque");
					if(rs.next()) {
					JOptionPane.showInternalMessageDialog(null,"Quiz already created ", "message", JOptionPane.ERROR_MESSAGE);	
					
					}
					else 
					{
					JOptionPane.showMessageDialog(null,"ready to create quiz");	
					Questions q=new Questions();
					q.Questions();
					
					}
					     
					}

					catch(Exception e1) {
						System.out.println(e1);
					}
			}
			
		});
		b2.setForeground(new Color(0, 0, 128));
		b2.setFont(new Font("Courier New", Font.PLAIN, 25));
		b2.setBounds(575, 250, 300,100);
		j.getContentPane().add(b2);
		
	
		JButton b3 = new JButton("VIEW SCORE");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Viewscore v=new Viewscore();
				v.Viewscore();
				
			}
			
		});
		b3.setForeground(new Color(0, 0, 128));
		b3.setFont(new Font("Courier New", Font.PLAIN, 25));
		b3.setBounds(575, 650, 300,100);
		j.getContentPane().add(b3);
		
		JButton b4 = new JButton("DELETE QUIZ");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
					String query="TRUNCATE TABLE adminque";
					String q2="TRUNCATE TABLE register";
					PreparedStatement ps=con.prepareStatement(query);
					PreparedStatement p2=con.prepareStatement(query);
					Statement st=con.createStatement();
					Statement s2=con.createStatement();
					ResultSet rs=st.executeQuery("select *from adminque");
					ResultSet r2=st.executeQuery("select *from register");
					
					if(rs.next()) {
					ps.executeQuery();
					
					JOptionPane.showMessageDialog(null,"Quiz Deleted Successful");
					if(r2.next()) {
					p2.executeQuery();	
					}
					
					}
					else 
					{
						JOptionPane.showInternalMessageDialog(null,"There is no quiz created to delete :(", "message", JOptionPane.ERROR_MESSAGE);	
					     
					}
				}
					catch(Exception e1) {
						System.out.println(e1);
					}
			}
			
		});
		
		b4.setForeground(new Color(0, 0, 128));
		b4.setFont(new Font("Courier New", Font.PLAIN, 25));
		b4.setBounds(575, 460, 300,100);
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
		

		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("B:\\New Folder\\admin.png"));
		l1.setBounds(945, 50, 109, 100);
		j.add(l1);
		
		
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		j.add(l7);
		
		
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminpage2 s = new adminpage2();
					s.j.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
public void adminpage2() {
	j.setVisible(true);
}

}
