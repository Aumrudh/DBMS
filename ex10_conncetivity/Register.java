import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.sql.*;
  
public class Register extends JFrame implements ActionListener { 

    private Container c; 
    private JLabel title,id,name,mno,gender,dob,add,res; 
    private JTextField tid,tname,tmno,tadd; 
    private JRadioButton male,female; 
    private ButtonGroup gengp;
    private JComboBox date,month,year;
    private JTextArea tout; 
    private JButton ins,del,upd,pri;  
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 

    private String months[] 
        = {  "01", "02", "03", "04", "05", 
            "06", "07", "08", "09", "10", 
            "11", "12"}; 

    private String years[] 
        = { "1991","1992","1993","1994",
            "1995","1996", "1997", "1998",
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016" }; 
  
    public Register(){ 
        setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Employee Registration"); 
        title.setFont(new Font("Arial", Font.PLAIN, 25)); 
        title.setSize(300, 30); 
        title.setLocation(150, 10); 
        c.add(title); 
         

        id = new JLabel("ID"); 
        id.setFont(new Font("Arial", Font.PLAIN, 20)); 
        id.setSize(100, 20); 
        id.setLocation(100, 50); 
        c.add(id); 
  
        tid = new JTextField(); 
        tid.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tid.setSize(190, 20); 
        tid.setLocation(200,50); 
        c.add(tid);

        name = new JLabel("Name"); 
        name.setFont(new Font("Arial", Font.PLAIN, 20)); 
        name.setSize(100, 20); 
        name.setLocation(100, 100); 
        c.add(name); 
  
        tname = new JTextField(); 
        tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tname.setSize(190, 20); 
        tname.setLocation(200, 100); 
        c.add(tname); 
  
        mno = new JLabel("Mobile No."); 
        mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
        mno.setSize(100, 20); 
        mno.setLocation(100, 150); 
        c.add(mno); 
  
        tmno = new JTextField(); 
        tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tmno.setSize(150, 20); 
        tmno.setLocation(200, 150); 
        c.add(tmno); 
  
        gender = new JLabel("Gender"); 
        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        gender.setSize(100, 20); 
        gender.setLocation(100, 200); 
        c.add(gender); 
  
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(200, 200); 
        c.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(275, 200); 
        c.add(female); 
  
        gengp = new ButtonGroup(); 
        gengp.add(male); 
        gengp.add(female); 
  
        dob = new JLabel("DOB"); 
        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
        dob.setSize(100, 20); 
        dob.setLocation(100, 250); 
        c.add(dob); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(200, 250); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 250); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 250); 
        c.add(year); 
  
        add = new JLabel("City"); 
        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
        add.setSize(100, 20); 
        add.setLocation(100, 300); 
        c.add(add); 
  
        tadd = new JTextField(); 
        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tadd.setSize(150, 20);
        tadd.setLocation(200, 300);  
        c.add(tadd);
  
        ins = new JButton("Insert"); 
        ins.setFont(new Font("Arial", Font.PLAIN, 15)); 
        ins.setSize(100, 20); 
        ins.setLocation(150, 350); 
        ins.addActionListener(this); 
        c.add(ins);

        del = new JButton("Delete"); 
        del.setFont(new Font("Arial", Font.PLAIN, 15)); 
        del.setSize(100, 20); 
        del.setLocation(250, 350); 
        del.addActionListener(this); 
        c.add(del);  
  
        upd = new JButton("Update"); 
        upd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        upd.setSize(100, 20); 
        upd.setLocation(150, 400); 
        upd.addActionListener(this); 
        c.add(upd);

        pri = new JButton("Print"); 
        pri.setFont(new Font("Arial", Font.PLAIN, 15)); 
        pri.setSize(100, 20); 
        pri.setLocation(250, 400); 
        pri.addActionListener(this); 
        c.add(pri);    
        setVisible(true);  

        tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 600); 
        tout.setLocation(500, 0); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout);        
    } 
   
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == ins) { 
            if(e.getSource() == ins)
            {
                int s1=Integer.parseInt(tid.getText());
                String s2=tname.getText();
                long  s3=Long.parseLong(tmno.getText());
                String s4;
                if (male.isSelected()) 
                    s4 = "MALE"; 
                else
                    s4 = "FEMALE"; 
                 String s5=(String)year.getSelectedItem() 
                      + "-" + (String)month.getSelectedItem() 
                      + "-" + (String)date.getSelectedItem();
                String s6=tadd.getText();
                try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jeyakumar28");
                Statement stmt=conn.createStatement();
                //System.out.println(s1+""+s2+""+x3+""+x4+""+s5+""+s6);
                stmt.executeUpdate("Insert into Employee values("+s1+",'"+s2+"','"+s4+"','"+s5+"',"+s3+",'"+s6+"');");
                JOptionPane.showMessageDialog(null, "Inserted Succefully");
                String def = ""; 
                tname.setText(def); 
                tid.setText(def); 
                tadd.setText(def);
                tmno.setText(def);
                date.setSelectedIndex(0); 
                month.setSelectedIndex(0); 
                year.setSelectedIndex(0);
                }
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }        
            }        
             
        } 
  
        else if (e.getSource() == del) { 
            int ss1=Integer.parseInt(tid.getText());
            String ss2=tname.getText();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jeyakumar28");
                Statement stmt=conn.createStatement();
                //System.out.println(s1+""+s2+""+x3+""+x4+""+s5+""+s6);
                stmt.executeUpdate("DELETE FROM Employee WHERE EID="+ss1+" and name='"+ss2+"'");
                JOptionPane.showMessageDialog(null, "Deleted Succefully");
                String def = ""; 
                tname.setText(def); 
                tid.setText(def); 
                tadd.setText(def);
                tmno.setText(def);
                date.setSelectedIndex(0); 
                month.setSelectedIndex(0); 
                year.setSelectedIndex(0);
                }
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }          
        }
        else if (e.getSource() == upd) { 
            int ss1=Integer.parseInt(tid.getText());
            String ss2=tname.getText();
            long  s3=Long.parseLong(tmno.getText());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jeyakumar28");
                Statement stmt=conn.createStatement();
                //System.out.println(s1+""+s2+""+x3+""+x4+""+s5+""+s6);
                stmt.executeUpdate("UPDATE Employee SET PHO="+s3+" WHERE EID="+ss1+" and name='"+ss2+"'");
                JOptionPane.showMessageDialog(null, "Updated Succefully");
                String def = ""; 
                tname.setText(def); 
                tid.setText(def); 
                tadd.setText(def);
                tmno.setText(def);
                date.setSelectedIndex(0); 
                month.setSelectedIndex(0); 
                year.setSelectedIndex(0);                       
                }
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }          
        }
        else if (e.getSource() == pri) { 
            try{
                String def = ""; 
                tname.setText(def); 
                tid.setText(def); 
                tadd.setText(def);
                tmno.setText(def);
                date.setSelectedIndex(0); 
                month.setSelectedIndex(0); 
                year.setSelectedIndex(0);
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","Jeyakumar28");
                Statement stmt=conn.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT * FROM Employee");
                while(rs.next()){
                int i1=rs.getInt("EID");
                String i2=rs.getString("NAME");
                String i3=rs.getString("GEN");
                String i4=rs.getString("DOB");
                long i5=rs.getLong("PHO");
                String i6=rs.getString("CITY");
                tout.setText("Eid : "+i1 +"\n"+ "Name : "+i2 +"\n"+"Gender : "+ i3+"\n" +"DOB : "+ i4+"\n"+
                    "Number : "+i5+"\n"+"City : "+i6+"\n"); 
                tout.setEditable(false); 
                }
                }
                catch (Exception ex)   
                {  
                    System.out.println(ex);  
                }          
        }   
    } 
    public static void main(String[] args) throws Exception{ 
        Register f = new Register(); 
    } 
} 