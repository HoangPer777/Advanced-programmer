package decuoiki.src.bai3;

//package bai3;

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

public class Certificate extends JPanel {
	JButton butCheck;
	JButton clearCheck;
	String na,ma;
	int ira ,ia,cb;
	JTextArea area;
	JToolBar toolbar;
	JPanel topPanel,botPanel,centerPanel,checkPanel;
	JLabel id,name,interestrate,currentbalance,maturity;
	JTextField idT,nameT,interestrateT,currentbalanceT,maturityT;
	Border border;
	public Certificate() {
		
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
				
				if(idT.getText().isBlank()||nameT.getText().isBlank()||interestrateT.getText().isBlank()||maturityT.getText().isBlank()) {
					JOptionPane.showMessageDialog(Certificate.this, "Bạn đã nhập thiếu dữ liệu","Lỗi nhập liệu",JOptionPane.ERROR_MESSAGE);
					return;
				}
				try {
					ia=Integer.parseInt(idT.getText());
					na=nameT.getText();
					ira=Integer.parseInt(interestrateT.getText());
					ma=maturityT.getText();
					
					
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(Certificate.this, "Bạn đã nhập sai kiểu dữ liệu", "Lỗi nhập liệu", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				area.append("\n"+ia+"\t"+na+"\t"+ira+"\t"+cb+"\t"+ma);
				mainFrame.window.pack();
			}
		});
		
		clearCheck=new JButton("Clear");
		clearCheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				idT.setText("");
				nameT.setText("");
				interestrateT.setText("");
				currentbalanceT.setText("");
				maturityT.setText("");
				
			}
		});
		toolbar.add(butCheck);
		toolbar.add(clearCheck);
		topPanel.add(toolbar);
		
		id=new JLabel("Id");
		name=new JLabel("Name");
		interestrate=new JLabel("Minimunbalance");
		currentbalance=new JLabel("Currentbalance");
		maturity=new JLabel("Maturity");
		
		idT=new JTextField();
		interestrateT=new JTextField();
		nameT=new JTextField();
		currentbalanceT=new JTextField();
		maturityT=new JTextField();
		
		centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(5,2));
		
		centerPanel.add(id);
		centerPanel.add(idT);
		centerPanel.add(name);
		centerPanel.add(nameT);
		centerPanel.add(interestrate);
		centerPanel.add(interestrateT);
		centerPanel.add(currentbalance);
		centerPanel.add(currentbalanceT);
		centerPanel.add(maturity);
		centerPanel.add(maturityT);
		
		botPanel=new JPanel();
		border=BorderFactory.createLineBorder(Color.blue);
		botPanel.setBorder(BorderFactory.createTitledBorder(border, "Certificate of Information") );
		area=new JTextArea();
		area.setText("ID"+"\t"+"Name"+"\t"+"IR[%]"+"\t"+"CB"+"\t"+"Maturity");
		botPanel.add(area);
		add(topPanel,BorderLayout.NORTH);
		add(centerPanel,BorderLayout.CENTER);
		add(botPanel,BorderLayout.SOUTH);
		
	}

}
