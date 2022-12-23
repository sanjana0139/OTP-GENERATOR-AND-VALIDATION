# OTP-GENERATOR-AND-VALIDATION
import javax.swing.*;  
import java.awt.event.*;
//import java.util.*;
class otp {  
    
public static void main(String args[])  
    {  
        int rdn;String otpno;
        String check1;
        
    JFrame f= new JFrame("OTP Generator and Validation");  
    JLabel l1,l2;
    JButton b1,b2;
    JTextField t1,t2;  
    l1=new JLabel("click on the button to generate OTP");
    l1.setBounds(200,20,250,200);
    f.add(l1);   
    t1=new JTextField();
    t1.setBounds(200,300,250,40);
    f.add(t1);
    t2=new JTextField();
    t2.setBounds(200,300,250,40);
    f.add(t2);
    b1=new JButton("Generate OTP"); 
    b1.setBounds(200,200,250,40);
    
    b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            
            int rdn=(int)(Math.random()*100001);
            String otpno=Integer.toString(rdn);
            l1.setText(otpno);
        }  
        });   
    
        f.add(b1);
    l2=new JLabel("Enter otp:");
    l2.setBounds(300,50,80,25);
    f.add(l2);
    t2=new JTextField();
    f.add(t2);
    b2=new JButton("User check");
    b2.setBounds(200,500,250,40);
    f.add(b2); 
    b2.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
           String str= l1.getText();
           if(str.equals(t1.getText()))
           {
            l1.setText("OTP verified");
           }
           else
           l1.setText("OTP is wrong");
           
            
           
        }  
        });
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);
}
}
