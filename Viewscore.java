package program;
import java.sql.*;
import javax.swing.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
public class Viewscore {
	JFrame j;
    static JTable table;
    String[] columnNames = {"Username", "userid", "marks"};
	public Viewscore() {
		j=new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        	 String username = "";
             String userid = "";
             String marks = "";
            
             try {
            	 Class.forName("oracle.jdbc.driver.OracleDriver");
         		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
            	String a = null;
            	int b;
         		PreparedStatement pst = con.prepareStatement("select * from register");
                 ResultSet rs = pst.executeQuery();
                 PreparedStatement ps1 = con.prepareStatement("select count(username) from register");
                 ResultSet r2=ps1.executeQuery();
                 if(r2.next()) {
                	 a=r2.getString(1);
                 }
                 b= Integer.parseInt(a);
                 System.out.println(b);
                 for(int i=0;i<b;i++) {
                 if (rs.next()) {
                     username = rs.getString(1);
                     userid = rs.getString(2);
                     marks = rs.getString(5);
                    
                     model.addRow(new Object[]{username,userid,marks});
                     
                 }
                 
             } 
             }catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
             }
        
		JButton b1 = new JButton("ok");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		b1.setForeground(new Color(0, 0, 128));
		b1.setFont(new Font("Courier New", Font.PLAIN, 25));
		b1.setBounds(620,700, 300,70);
		j.add(b1);
		
		JButton b = new JButton("");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		
		
		
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage1 hp=new Homepage1();
				hp.Homepage1();
			}
			
		});
		scroll.setOpaque(true);
		j.add(scroll);
	
		j.setSize(1600,1600);
		j.setBackground(new Color(255,182,193));
		}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Viewscore v = new Viewscore();
					v.j.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}

	public void Viewscore() {
		j.setVisible(true);
	}

}
