package program;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Answers {
	JFrame f;
	JLabel l1,l,l2,l3;
	JRadioButton r1,r2,r3,r4;
	ButtonGroup bg;
	JButton b1,b3,b;
	String check[][] =new String[20][2];
	int marks=0;
	String ans="",crct="";
	
			
	
	
	public Answers() throws Exception{
		try {
			f=new JFrame("Question page");
			 b1 = new JButton("");
			 b3=new JButton("SUBMIT");
		    b=new JButton("NEXT");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
		Statement st=con.createStatement();
		
		String qid="Q"+1;
		String Query="SELECT *from adminque where qid='"+qid+"'";
		final ResultSet rs=st.executeQuery(Query);
		if(rs.next()) {
			
			l1=new JLabel("Q");
			l=new JLabel(")");
			l2=new JLabel("Question view");
			l3=new JLabel();
			r1=new JRadioButton("option 1");
			r2=new JRadioButton("option 2");  
			r3=new JRadioButton("option 3");  
			r4=new JRadioButton("option 4");  
			bg=new ButtonGroup(); 
			bg.add(r1);
			bg.add(r2);
			bg.add(r3);
			bg.add(r4);
		
			
		}
		else{
			JOptionPane.showInternalMessageDialog(null,"NO QUIZ CREATED :(", "message", JOptionPane.ERROR_MESSAGE);
		    Homepage1 h=new Homepage1();
		    h.Homepage1();
		}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		
		
		
		
		
		 
	
		 
			
			
		b.addActionListener(new ActionListener() {
			
			int i=0;
			public void actionPerformed(ActionEvent e) {
				try {
					
						
					
						i++;
						l1.setText("Q"+i);
						String q="Q"+i;
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 	
				    Statement st=con.createStatement();
				 
					String Query="SELECT *from adminque where qid='"+q+"'";
					
					final ResultSet rs=st.executeQuery(Query);
					if(rs.next()) {
						l1.setText(rs.getString(1));
						l2.setText(rs.getString(2));
						r1.setText(rs.getString(3));
						r2.setText(rs.getString(4));
						r3.setText(rs.getString(5));
						r4.setText(rs.getString(6));
						check[i-1][0]=rs.getString(7);
						System.out.println(crct);
						
						r1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
									
									ans=r1.getText();
									check[i-1][1]=ans;
														
							}
						});
						r2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
										ans=r2.getText();
										check[i-1][1]=ans;
								
										
									
							}
						});
						r3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								
									ans=r3.getText();
									
									check[i-1][1]=ans;
																		
								
							}
						});
						
					
						r4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
									ans=r4.getText();
									
									check[i-1][1]=ans;
									
								
							}
						});
						
						
							

						bg.clearSelection();
						
					}
					else{
						JOptionPane.showInternalMessageDialog(null," SUBMIT YOUR QUIZ ", "message", JOptionPane.INFORMATION_MESSAGE);
						}
					
					
					
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
						
					}
				

			}
			
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null,"Submitted successful", "message", JOptionPane.INFORMATION_MESSAGE);
				try {
					String c = null;
	            	int b;
					Connection con;
					con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
					Statement st=con.createStatement();
					PreparedStatement ps1 = con.prepareStatement("select count(qid) from adminque");
	                 ResultSet r2=ps1.executeQuery();
	                 if(r2.next()) {
	                	 c=r2.getString(1);
	                 }
	                 b= Integer.parseInt(c);
					String Query="SELECT *from reg";
				for(int j=0;j<b;j++) {
					System.out.println("answers");
					System.out.println("crct ans:    "+check[j][0]);
					System.out.println("selected ans:    "+check[j][1]);
					
					if(check[j][0].equals(check[j][1])) {
						
						marks=marks+1;
						
					}
					System.out.println(marks);
					
				
					
					
						
						final ResultSet rs=st.executeQuery(Query);
						if (rs.next()){
							String a=rs.getString(1);
							String s1="UPDATE Register SET MARKS ='"+marks+"' WHERE USERID = '"+a+"'";
							st.executeUpdate(s1);
							
							
							
							
							
							
						}
						
						
					}
				}catch (SQLException e1) {} 
				Score s=new Score();
				s.score();
					
					
					
				}
				
				
			}
			
		);
	     

		l1.setBounds(30,77,50,50);
		l.setBounds(70,77,50,50);
		l2.setBounds(100,70,1300,60);
		l3.setBounds(50, 50, 100, 100);
		r1.setBounds(70,211,500,30);
		r2.setBounds(70,311,500,30);
		r3.setBounds(70,411,500,30);
		r4.setBounds(70,511,500,30);
		b3.setBounds(660,650,100,50);
		b.setBounds(900,650,100,50);
		
		l1.setForeground(new Color(255,255,255));
		l.setForeground(new Color(255,255,255));
		l2.setForeground(new Color(255, 255,255));
		l3.setForeground(new Color(255, 255,255));
		r1.setForeground(new Color(255,255,255));
		r2.setForeground(new Color(255,255,255));
		r3.setForeground(new Color(255, 255,255));
		r4.setForeground(new Color(255, 255,255));
		r1.setBackground(new Color(255,0,127));
		r2.setBackground(new Color(255,0,127));
		r3.setBackground(new Color(255,0,127));
		r4.setBackground(new Color(255,0,127));
		r1.setForeground(new Color(255,255,255));
		
		l1.setFont(new Font("Courier New", Font.BOLD,25));
		l.setFont(new Font("Courier New", Font.BOLD,25));
		l2.setFont(new Font("Courier New", Font.BOLD,25));
		l2.setFont(new Font("Courier New", Font.BOLD,25));
		r1.setFont(new Font("Courier New", Font.BOLD,25));
		r2.setFont(new Font("Courier New", Font.BOLD,22));
		r3.setFont(new Font("Courier New", Font.BOLD,22));
		r4.setFont(new Font("Courier New", Font.BOLD,22));

		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		
		
		b1.setIcon(new ImageIcon("B:\\New Folder\\home.png"));
		b1.setBounds(1460, 30, 29, 29);
		f.add(b1);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Subjects s=new Subjects();
				s.Subjects();
			}
			
		});
		
		
		b6.setIcon(new ImageIcon("B:\\New Folder\\back.png"));
		b6.setBounds(10, 10, 29, 29);
		
		
		
		
		
		f.add(b6);
		f.add(b3);
		f.add(b);
		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(r4);
		f.add(l1);
		f.add(l);
		f.add(l2);
		f.add(l3);
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		f.setSize(1600,1600);
		f.setLayout(null);
		f.add(l7);
		f.setDefaultCloseOperation(3);	
	
	}
	protected String String(int marks2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void Answers() {
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Answers s = new Answers();
					s.f.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
}
