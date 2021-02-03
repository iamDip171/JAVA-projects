package Projects.TicTacToe;

import javax.swing.*;
import java.awt.*;

public class LayoutManager extends JFrame {
    public JPanel top, bottom ;
    public JLabel label = new JLabel("Tic Tac Toe", JLabel.CENTER) ;
    public JButton[][] button = new JButton[3][3] ;
    public JButton resetBtn = new JButton("Reset") ;


    public LayoutManager() {
        setTitle("Tic Tac Toe");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(515, 540);
        setLayout(null);
        //panels
        top = new JPanel() ;
        bottom = new JPanel() ;


        top.setBounds(0, 0 , 400, 90);
        top.setBackground(Color.BLACK);

        bottom.setBounds(0,90, 500, 410);
        bottom.setLayout(new GridLayout(3,3));

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                button[i][j] = new JButton() ;
                bottom.add(button[i][j]) ;
                button[i][j].setFont(new Font("Arial", Font.ITALIC, 70));
            }
        }
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Serif", Font.BOLD, 60));
        top.add(label) ;
        //top.add(resetBtn) ;
        resetBtn.setBounds(401, 0, 100, 90);
        resetBtn.setBackground(Color.DARK_GRAY);
        resetBtn.setForeground(Color.WHITE);
        add(top) ;
        add(bottom) ;
        add(resetBtn) ;
        setVisible(true);
    }
}
