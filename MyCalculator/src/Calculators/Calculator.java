package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	double num1;
	double num2;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 201, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(0, 0, 183, 29);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
	//----------------------ROW 1---------------------------------------------------	
		JButton btn0 = new JButton("<");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backspace = null;
				if(txtDisplay.getText().length()>0){
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBounds(0, 35, 45, 45);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("c");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(null);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(46, 35, 45, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("%");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btn2.setBounds(92, 35, 45, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("+");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btn3.setBounds(138, 35, 45, 45);
		frame.getContentPane().add(btn3);
		//----------------------ROW 2---------------------------------------------------	
		JButton btn4 = new JButton("7");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(0, 80, 45, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("8");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(46, 80, 45, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("9");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(92, 80, 45, 45);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("-");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btn7.setBounds(138, 80, 45, 45);
		frame.getContentPane().add(btn7);
		//----------------------ROW 3---------------------------------------------------	
		JButton btn8 = new JButton("4");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(0, 125, 45, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("5");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(46, 125, 45, 45);
		frame.getContentPane().add(btn9);
		
		JButton btn10 = new JButton("6");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn10.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn10.setBounds(92, 125, 45, 45);
		frame.getContentPane().add(btn10);
		
		JButton btn11 = new JButton("x");
		btn11.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btn11.setBounds(138, 125, 45, 45);
		frame.getContentPane().add(btn11);
		//----------------------ROW 4---------------------------------------------------	
		JButton btn12 = new JButton("1");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn12.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn12.setBounds(0, 170, 45, 45);
		frame.getContentPane().add(btn12);
		
		JButton btn13 = new JButton("2");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn13.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn13.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn13.setBounds(46, 170, 45, 45);
		frame.getContentPane().add(btn13);
		
		JButton btn14 = new JButton("3");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn14.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn14.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn14.setBounds(92, 170, 45, 45);
		frame.getContentPane().add(btn14);
		
		JButton btn15 = new JButton("/");
		btn15.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1 = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btn15.setBounds(138, 170, 45, 45);
		frame.getContentPane().add(btn15);
		//----------------------ROW 4---------------------------------------------------	
		JButton btn16 = new JButton("0");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn16.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn16.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn16.setBounds(0, 215, 45, 45);
		frame.getContentPane().add(btn16);
		
		JButton btn17 = new JButton(".");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(! txtDisplay.getText().contains(".")){
					txtDisplay.setText( txtDisplay.getText() + btn17.getText());
				}
			}
		});
		btn17.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn17.setBounds(46, 215, 45, 45);
		frame.getContentPane().add(btn17);
		
		JButton btn18 = new JButton("+/-");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btn18.setFont(new Font("Tahoma", Font.BOLD, 5));
		btn18.setBounds(92, 215, 45, 45);
		frame.getContentPane().add(btn18);
		
		JButton btn19 = new JButton("=");
		btn19.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String answer ;
				num2 = Double.parseDouble(txtDisplay.getText());
				if(operations == "+"){
					result = num1 + num2 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);	
				}
				else if(operations == "-"){
					result = num1 - num2 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "*"){
					result = num1 * num2 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
			}
				else if(operations == "/"){
					result = num1 / num2 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "%"){
					result = num1 % num2 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}	
		});
		btn19.setBounds(138, 215, 45, 45);
		frame.getContentPane().add(btn19);
		
		
	}
}
