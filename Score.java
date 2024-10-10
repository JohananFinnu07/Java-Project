package program;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score  {
	
	
	JFrame f;
	JLabel l,l1;
	
	
	public  Score() {
		
	    f=new JFrame();

		l = new JLabel("score:");
		l.setFont(new Font("Courier New", Font.BOLD, 99));
		l.setForeground(new Color(248, 248, 255));
		l.setBounds(450,450,500,80);
		f.add(l);
		l1 = new JLabel();
		l1.setFont(new Font("Courier New", Font.BOLD, 102));
		l1.setForeground(new Color(248, 248, 255));
		l1.setBounds(850,450,500,80);
		
		JLabel l3 = new JLabel("");
		l3.setIcon(new ImageIcon("B:\\New Folder\\stu.png"));
		l3.setBounds(550,-150, 900,900);
		f.add(l3);
		try {
			String a="";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
			Statement st=con.createStatement();
			String q1="SELECT *from reg";
			
			
			
			
			Statement st1=con.createStatement();
			
			
			
			ResultSet r1=st.executeQuery(q1);
			
			if(r1.next()) {
				a=r1.getString(1);
				String q2="SELECT * from register where USERID='"+a+"'";
				ResultSet r2=st.executeQuery(q2);
				if(r2.next()) {
					String s=String.valueOf(r2.getString(5));
					l1.setText(s);
				}
			}
			
			
			
		
			
			
		}
			catch(Exception e1) {
				
			}
		
		JButton b = new JButton("ok");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
					String query="TRUNCATE TABLE REG";
					PreparedStatement ps=con.prepareStatement(query);
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from REG");
					if(rs.next()) {
					ps.executeQuery();
					JOptionPane.showMessageDialog(null,"YOU COMPLETED A QUIZ");	
					Homepage1 hp=new Homepage1();
					hp.Homepage1();
					}
					
				}
					catch(Exception e1) {}
			}
			
		});
		b.setFont(new Font("American Typewriter", Font.BOLD, 15));
		b.setForeground(new Color(0,0,0));
		
		b.setBounds(700,650,100,50);
		f.add(b);

		
		ImageIcon i1=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i1);
		l7.setBounds(0,0,1920,1080);
		f.add(l);
		f.add(l1);
		f.add(b);
		f.add(l7);
		f.setSize(1600,1600);
		f.setLayout(null);
		
		f.setDefaultCloseOperation(3);
	}
	
	protected void Homepage1() {
		// TODO Auto-generated method stub
		
	}

	public void score() {
		f.setVisible(true);
	}
	public static void main(String[] args) {

		Score s = new Score();
		s.score();
}

	public void Score() {
	 new Score();	
	}
}
