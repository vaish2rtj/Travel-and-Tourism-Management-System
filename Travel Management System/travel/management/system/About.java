package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class About extends JFrame implements ActionListener {
    About() {
       
       setBounds(600, 200, 500, 550);
       setLayout(null);
      getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200, 10, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);
        String s="About Projects  \n"+
        "\n"+
        "The objective of the Travel and Tourism  Management Systemproject is to develop a system that attempys"+
        "\n"+
        "This application will help users to manage their travel plans efficiently."+
        "\n"+
        "It provides features for booking tickets, managing itineraries, and accessing travel guides."+
        "\n"+
        "The system aims to enhance the overall travel experience for users."+
        "\n"+
        "Advantages of the System: \n"+
        "1. User-friendly interface for easy navigation.\n"+
        "2. Comprehensive travel information and resources.\n"+
        "3. Efficient management of travel bookings and itineraries.\n"+
        "4. Access to customer support and assistance.\n";

        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
         add(area);
         JButton back=new JButton("Back");
         back.setBounds(200, 420, 100, 25);
         back.addActionListener(this);
         add(back);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    public static void main(String[] args) {
        new About();
    }
}
