import javax.swing.*;
import java.awt.*;

public class JScrollPaneExample extends JFrame {
    public JScrollPaneExample() {
        // Tạo một JTextArea với nội dung dài hơn kích thước của khu vực hiển thị
        JTextArea textArea = new JTextArea("Đây là một ví dụ về cách sử dụng JScrollPane trong Java Swing. JTextArea này có rất nhiều nội dung để cuộn khi kích thước của khu vực hiển thị bị giới hạn.");

        // Tạo một JScrollPane và thiết lập JTextArea là thành phần hiển thị của nó
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Thiết lập kích thước ưu tiên cho JScrollPane
        scrollPane.setPreferredSize(new Dimension(400, 300));

        // Thêm JScrollPane vào JFrame
        getContentPane().add(scrollPane);

        // Thiết lập các thuộc tính khác của JFrame
        setTitle("JScrollPane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollPaneExample();
    }
}
