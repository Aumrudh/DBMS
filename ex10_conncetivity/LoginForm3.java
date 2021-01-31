import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public  class LoginForm3 extends JFrame implements ActionListener
{
	    JFrame f=new JFrame();//Setting frame
		JTextField t1,t2,t3,t4,t5,t6;
		JLabel l1,l2,l3,l4,l5,l6;
		JButton b1,b2,b3,b4,b5;
	LoginForm3()
	{		
		l1= new JLabel("SSN ");
		l2= new JLabel("pname ");
		l3= new JLabel("age ");
		l4= new JLabel("bill");
		l5= new JLabel("disease");
		l6= new JLabel("dname");		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();      // Creating text fields
		t6=new JTextField();		
		b1=new JButton("Insert");
		b2=new JButton("Delete");
		b3=new JButton("Update");
		b4=new JButton("Print");
		b5=new JButton("Search");
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,150,100,20);
		l3.setBounds(50,200,100,20);
		l4.setBounds(50,250,100,20);
		l5.setBounds(50,300,100,20);
		l6.setBounds(50,350,100,20);
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,150,100,20);
		t3.setBounds(200,200,100,20);
		t4.setBounds(200,250,100,20);
		t5.setBounds(200,300,100,20);
		t6.setBounds(200,350,100,20);
		b1.setBounds(300,400,100,20);
		b2.setBounds(300,450,100,20);
		b3.setBounds(300,500,100,20);
		b4.setBounds(300,550,100,20);
		b5.setBounds(300,600,100,20);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == b1)
			{
				int x=0;
				int s1=Integer.parseInt(t1.getText());
				String s2=t2.getText();
				int x3=Integer.parseInt(t3.getText());
				int x4=Integer.parseInt(t4.getText());
				String s5=t5.getText();
				String s6=t6.getText();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root","sanjai");
				Statement stmt=conn.createStatement();
				System.out.println(s1+""+s2+""+x3+""+x4+""+s5+""+s6);
				stmt.executeUpdate("Insert into Hospital values("+s1+",'"+s2+"',"+x3+","+x4+",'"+s5+"',+'"+s6+"');"); 
                x=x+1;				
                    if (x > 0)   
                    {  
                       // JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");  
                    } 
			}
			catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }
			}
		}
	public static void main(String args[])  
    {  
        new LoginForm3();  
    }
}