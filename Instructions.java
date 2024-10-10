package program;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Instructions extends JFrame{
	JFrame j;
	JButton b;
	

	public  Instructions() {
		j=new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l = new JLabel("INSTRUCTIONS:");
		l.setFont(new Font("Courier New", Font.BOLD, 50));
		l.setForeground(new Color(248, 248, 255));
		l.setBounds(150, 50, 658, 114);
		j.getContentPane().add(l);	
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("B:\\New Folder\\books.png"));
		l1.setBounds(50,30, 114, 114);
		j.getContentPane().add(l1);

		JTextArea a=new JTextArea("Hello Students!! You have to attempt \n all the questions without skipping \n any questions. You have 4 options \nfor each each question .you need to\n select only one option among them.\n Once you go for  next question\n you can't modify the previous- \nquestion.Carefully select your \noptions and attend the quiz\n                     \n     	GOOD LUCK:)\n Are you ready to attempt the quiz!!!");
		a.setFont(new Font("Courier New", Font.PLAIN,22));
		a.setForeground(new Color(248,248,255));
		a.setBackground(new Color(255,182,193));
		a.setBounds(50,150,500,500);
		j.getContentPane().add(a);
		
		JButton b = new JButton("START");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			Answers a = null;
			try {
				a = new Answers();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			a.Answers();
			}
			
		});
		b.setForeground(new Color(0, 0, 128));
		b.setFont(new Font("Courier New", Font.BOLD, 22));
		b.setBounds(650,700, 200, 40);
		
		
		
		
		
		ImageIcon i=new ImageIcon("B:\\New Folder\\home.jpg");
		JLabel l7 = new JLabel();
		l7.setIcon(i);
		l7.setBounds(0,0,1920,1080);
		j.add(b);
		j.add(l7);
		j.setSize(1600,1600);
		j.getContentPane().setBackground(new Color(0, 128, 128));
		j.getContentPane().setLayout(null);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions i = new Instructions();
					i.j.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
}
public void Instructions() {
	j.setVisible(true);
}

}
