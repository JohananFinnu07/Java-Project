package program;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Questions{
	private int i =1;
	JButton b;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t5,t6,t4,t;
	public Questions() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
		String query="INSERT INTO adminque values (?,?,?,?,?,?,?)";
		final PreparedStatement ps=con.prepareStatement(query);
		JFrame f=new JFrame("Question page");
		f.setSize(1600,1600);
		
		f.setLayout(null);
		JButton b3=new JButton("SUBMIT");
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInternalMessageDialog(null,"Submitted successfull", "message", JOptionPane.INFORMATION_MESSAGE);
				Homepage1 h=new Homepage1();
				h.Homepage1();
			}
			
		});
		int count1=1;
		final JButton b=new JButton("+QUES");
		// int k=2;
		String q="Q";
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					try {
						ps.setString(1,t.getText());
						ps.setString(2,t1.getText());
						ps.setString(3,t2.getText());
						ps.setString(4,t3.getText());
						ps.setString(5,t4.getText());
						ps.setString(6,t5.getText());
						ps.setString(7,t6.getText());
						/*ps.setString(8,null);
						ps.setString(9,null);*/
						
						ps.executeUpdate();
							JOptionPane.showInternalMessageDialog(null,"question added", "message", JOptionPane.INFORMATION_MESSAGE);
							t1.setText("");
							t2.setText("");
							t3.setText("");
							t4.setText("");
							t5.setText("");
							t6.setText("");
				}
			 catch (SQLException e1) {

				e1.printStackTrace();
			}
					if(e.getSource()==b) {
						i++;
						t.setText("Q"+i);
					}
			}	
			}
			
);
		
		JButton b2=new JButton("clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}	
			}
			
		});
		f.add(b2);
		
	
		l2=new JLabel("1");  
		l3= new JLabel("2");
		l4=new JLabel("3");
		l5=new JLabel("4");
		l6=new JLabel("ANS");
		String p="Q"+1;
		t=new JTextField(p);
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		
		
		l2.setBounds(70,315,20,20);
		l3.setBounds(630,315,20,20);
		l4.setBounds(70,515,20,20);
		l5.setBounds(630,515,20,20);
		l6.setBounds(338,700,50,50);
		t.setBounds(30,80,50,50);
		t1.setBounds(100,70,1300,60);
		t2.setBounds(100,300,300,50);
		t3.setBounds(660,300,300,50);
		t4.setBounds(100,500,300,50);
		t5.setBounds(660,500,300,50);
		t6.setBounds(380,700,300,50);
		b3.setBounds(1062,700,100,50);
		b.setBounds(862,700,100,50);
		b2.setBounds(100,700,100,50);
	
		l2.setFont(new Font("Courier New", Font.BOLD,20));
		l3.setFont(new Font("Courier New", Font.BOLD,20));
		l4.setFont(new Font("Courier New", Font.BOLD,20));
		l5.setFont(new Font("Courier New", Font.BOLD,20));
		l6.setFont(new Font("Courier New", Font.BOLD,20));
		
		
		
		t.setForeground(new Color(255,0,127));
		t.setBackground(new Color(240, 255, 240));
		t.setFont(new Font("Courier New", Font.BOLD,27));
		t1.setForeground(new Color(255,0,127));
		t1.setBackground(new Color(240, 255, 240));
		t1.setFont(new Font("Courier New", Font.BOLD,20));
		t2.setForeground(new Color(255,0,127));
		t2.setBackground(new Color(240, 255, 240));
		t2.setFont(new Font("Courier New", Font.BOLD,20));
		t3.setForeground(new Color(255,0,127));
		t3.setBackground(new Color(240, 255, 240));
		t3.setFont(new Font("Courier New", Font.BOLD,20));
		t4.setForeground(new Color(255,0,127));
		t4.setBackground(new Color(240, 255, 240));
		t4.setFont(new Font("Courier New", Font.BOLD,20));
		t5.setForeground(new Color(255,0,127));
		t5.setBackground(new Color(240, 255, 240));
		t5.setFont(new Font("Courier New", Font.BOLD,20));
		t6.setForeground(new Color(255,0,127));
		t6.setBackground(new Color(240, 255, 240));
		t6.setFont(new Font("Courier New", Font.BOLD,20));
	
		l2.setForeground(new Color(255, 255,255));
		l3.setForeground(new Color(255, 255,255));
		l4.setForeground(new Color(255, 255,255));
		l5.setForeground(new Color(255, 255,255));
		l6.setForeground(new Color(255, 255,255));
		
	
		
		
		JButton b1 = new JButton("");
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
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(t);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		
		
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		f.add(l7);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(3);	
	}
	public static void main(String[] args) {
	try {
		Questions p=new Questions();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
	public void Questions() {
		
		
	}
	public int getCount() {
		
		return 0;
	}
	
}
