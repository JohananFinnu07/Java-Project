package program;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.sql.*;
public class Authentication {
    public static void main(String[] args) throws Exception{
    	new Authentication();
	}
  public Authentication() throws Exception{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
		Statement st=con.createStatement();
	    final  ResultSet rs = st.executeQuery("Select * from admin_login");
	    JFrame  f=new JFrame();
	    JLabel l = new JLabel("ADMIN_ID");
		l.setBounds(54, 136, 96, 26);
		final JTextField tf=new JTextField();
		tf.setBounds(200, 136, 152, 26);
		
		
		JLabel l1 = new JLabel("PASSWORD");
		l1.setBounds(54, 196, 96, 26);
		final JPasswordField pf=new JPasswordField();
		pf.setBounds(200,196, 152, 26);
		
		
		
		
		JButton b=new JButton("login");
		b.setBounds(150, 328, 100, 26);
		b.addActionListener((ActionListener) new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				try {
					int res=0;
					while(rs.next()) {
						if(rs.getString(1).equals(tf.getText())&& rs.getString(3).equals(pf.getText()))
						{ 
							res=1;
                           
							JOptionPane.showInternalMessageDialog(null,"welcome !! your login successful:)", "message", JOptionPane.INFORMATION_MESSAGE);
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
		f.setLayout(null);
		f.getContentPane().setBackground(Color.red);
		f.add(l);
		f.add(tf);
		f.add(l1);
		f.add(pf);
		f.add(b);
		f.setTitle("Authentication");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(0,0,1920,1080);
  }
}
