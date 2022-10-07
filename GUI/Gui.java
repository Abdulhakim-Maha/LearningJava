import javax.swing.JFrame;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Gui{
    
    public Gui(){
        
        //Frame
        JFrame window = new JFrame("Welcome!");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 400);
        window.setLocationRelativeTo(null);

        //Panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        

        //Lable
        JLabel user = new JLabel();
        user.setBounds(20, 10, 85, 25 );
        user.setText("user");
        

        //Button
        JButton login = new JButton();
        login.setBounds(20, 50, 85, 25);
        login.setText("Login");
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"login Succesful!" ,"Announcment",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(login);
        panel.add(user);

        

        

        
        
        
        window.add(panel);
        window.setVisible(true);
        

    }
    
    
    
    
    
    public static void main(String[] args) {
        Gui run = new Gui();
        
    }


    
    
}
