package decuoiki.src.bai3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.Border;

class Checking extends JPanel{
	JButton butCheck;
	JButton clearCheck;
	int ia, ma;
	String na,ca;
	JTextArea area;
	JToolBar toolbar;
	JPanel topPanel,botPanel,centerPanel,checkPanel;
	JLabel id,name,minimunbalance,currentbalance;
	JTextField idT,nameT,minimunbalanceT,currentbalanceT;
	Border border;
	public Checking() {
		setLayout(new BorderLayout());
		topPanel=new JPanel();
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		botPanel=new JPanel();
		centerPanel=new JPanel();
		checkPanel=new JPanel();
		
		toolbar=new JToolBar();
		butCheck=new JButton("Add");
		butCheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (minimunbalanceT.getText().isBlank() || idT.getText().isBlank()|| ca.isBlank()||currentbalanceT.getText().isBlank() ) {
					JOptionPane.showMessageDialog(Checking.this, "Bạn đã nhập thiếu dữ liệu", "Lỗi nhập liệu", JOptionPane.WARNING_MESSAGE);
					return;
				}					
				try {
					
					ia=Integer.parseInt(idT.getText());
					na=nameT.getText();
					ma=Integer.parseInt(minimunbalanceT.getText());
					ca=currentbalanceT.getText();

				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(Checking.this, "Bạn đã nhập sai kiểu dữ liệu", "Lỗi nhập liệu", JOptionPane.WARNING_MESSAGE);
					return;
				}
				area.append("\n" + ia + "\t" + na + "\t" + ma + "\t" + ca);
				mainFrame.window.pack();
			}
		});
		clearCheck=new JButton("Clear");
        clearCheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idT.setText("");
				nameT.setText("");
				minimunbalanceT.setText("");
				currentbalanceT.setText("");
				
			}
		});
		toolbar.add(butCheck);
		toolbar.add(clearCheck);
		topPanel.add(toolbar);
		
		id=new JLabel("Id");
		name=new JLabel("Name");
		minimunbalance=new JLabel("Minimunbalance");
		currentbalance=new JLabel("Currentbalance");
		
		idT=new JTextField();
		minimunbalanceT=new JTextField();
		nameT=new JTextField();
		currentbalanceT=new JTextField();
		
		centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(4,2));
		
		centerPanel.add(id);
		centerPanel.add(idT);
		centerPanel.add(name);
		centerPanel.add(nameT);
		centerPanel.add(minimunbalance);
		centerPanel.add(minimunbalanceT);
		centerPanel.add(currentbalance);
		centerPanel.add(currentbalanceT);
		
		botPanel=new JPanel();
		border=BorderFactory.createLineBorder(Color.blue);
		botPanel.setBorder(BorderFactory.createTitledBorder(border, "Checking Account Information") );
		area=new JTextArea();
		area.setText("ID"+"\t"+"Name"+"\t"+"MB"+"\t"+"CB");
		botPanel.add(area);
		add(topPanel,BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
		add(botPanel,BorderLayout.SOUTH);
		
		
	}
}
	


