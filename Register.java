package program;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Register extends JFrame{

	private JTextField txt,t1,t2,t3;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
	}
				}
			});
	}
	public Register() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
		 String query="INSERT INTO register values (?,?,?,?,?)";
		 String q="INSERT INTO REG VALUES(?)";
		final PreparedStatement ps=con.prepareStatement(query);
		final PreparedStatement ps1=con.prepareStatement(q);
		setBounds(0, 0, 1920, 1080);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,182,193));
		panel.setBounds(741, 123, 235, 497);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l5 = new JLabel("\n");
		l5.setIcon(new ImageIcon("B:\\New Folder\\student.png"));
		l5.setBounds(85, 180, 105, 102);
		panel.add(l5);
		
		JPanel p1 = new JPanel();
		p1.setBounds(491, 133, 250, 477);
		getContentPane().add(p1);
		p1.setLayout(null);
		
		JLabel l = new JLabel("REGISTER!");
		l.setFont(new Font("New Peninim MT", Font.BOLD,16 ));
		l.setForeground(new Color(0, 0, 0));
		l.setBounds(46, 65, 89, 20);
		p1.add(l);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
		});
		button.setIcon(new ImageIcon("B:\\New Folder\\home.png"));
		button.setBounds(198, 56,33, 29);
		p1.add(button);
		
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		
		
		b6.setIcon(new ImageIcon("B:\\New Folder\\back.png"));
		b6.setBounds(10, 10, 24, 24);
		p1.add(b6);
		
		JLabel l1 = new JLabel("USER_NAME");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		l1.setBounds(47, 124, 130, 16);
		p1.add(l1);
		
		JLabel l2 = new JLabel("USER_ID");
		l2.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		l2.setForeground(new Color(0, 0, 0));
		l2.setBounds(47, 180, 130, 16);
		p1.add(l2);
		
		JLabel l3 = new JLabel("DEPARTMENT");
		l3.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		l3.setForeground(new Color(0, 0, 0));
		l3.setBounds(47,228, 130, 26);
		p1.add(l3);
		
		JLabel l4 = new JLabel("GMAIL");
		l4.setForeground(new Color(0, 0, 0));
		l4.setFont(new Font("American Typewriter", Font.PLAIN, 15));
		l4.setBounds(47, 289, 130, 16);
		p1.add(l4);
		
	    JButton b1 = new JButton("REGISTER");
		b1.setForeground(new Color(0, 0, 0));
		b1.setFont(new Font("American Typewriter", Font.BOLD, 15));
		b1.setBounds(47, 351, 165, 29);
		b1.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					/*String USER_NAME=txt.getText();
					String USER_ID=t1.getText();
					String DEPARTMENT =t2.getText();
					String GMAIL =t3.getText();*/
					
					ps.setString(1,txt.getText());
					ps1.setString(1,t1.getText());
					ps.setString(2,t1.getText());
					ps.setString(3,t2.getText());
					ps.setString(4,t3.getText());
					ps.setString(5,null);
					
				
					ps.executeUpdate();
					ps1.executeUpdate();
					
					/*while(rs.next()) {
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
					}*/
				//	if(txt.getText()
						
					JOptionPane.showInternalMessageDialog(null,"registration successfull", "message", JOptionPane.INFORMATION_MESSAGE);
					Instructions i=new Instructions();
					i.Instructions();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
				
	    	
	    });
		p1.add(b1);
		
		txt = new JTextField();
		txt.setBackground(new Color(240, 255, 240));
		txt.setForeground(new Color(255,0,127));
		txt.setBounds(47, 147, 165, 26);
		p1.add(txt);
		txt.setColumns(10);
		
		t1 = new JTextField();
		t1.setBackground(new Color(240, 255, 240));
		t1.setForeground(new Color(255,0,127));
		t1.setBounds(47, 196, 165, 26);
		p1.add(t1);
		t1.setColumns(10);
		t2 = new JTextField();
		t2.setBackground(new Color(240, 255, 240));
		t2.setForeground(new Color(255,0,127));
		t2.setBounds(47, 251, 165, 26);
		p1.add(t2);
		t2.setColumns(10);
		t3 = new JTextField();
		t3.setBackground(new Color(240, 255, 240));
		t3.setForeground(new Color(255,0,127));
		t3.setBounds(47,303, 165, 26);
		p1.add(t3);
		t3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255,182,193));
		panel_1.setBounds(487, 123, 254, 10);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255,182,193));
		panel_2.setBounds(481, 123, 10, 497);
		getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255,182,193));
		panel_3.setBounds(487, 610, 254, 10);
		getContentPane().add(panel_3);
		
		
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		add(l7);
		
		
	}
	public void Register() {
		setVisible(true);
	}
}

