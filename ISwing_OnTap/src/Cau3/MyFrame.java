package Cau3;

import javax.swing.*;

public class MyFrame extends JFrame {
    protected PhieuBauCu bauCu;
    public MyFrame(){
        bauCu = new PhieuBauCu(this);
        setContentPane(bauCu);
        display();
    }
    public void display() {
        // for jframe
        setTitle("Phiếu Bầu Cử Các Cấp");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
