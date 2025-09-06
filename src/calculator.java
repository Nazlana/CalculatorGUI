package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-17,14
	 */
	private final JPanel panel = new JPanel();
	private JPanel OperationPanel;
	private JTextField screenTextField;
	private double result, number;
	int operation; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator(); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  
	
	
	public void changeScreenTextField(String str) {
		screenTextField.setText(screenTextField.getText() +str); //we write this code instead of giving action events to the buttons one by one
		
	}
	
	public void calculate() {
		switch(operation) { 
		case 1: 
			result = number + Double.parseDouble(screenTextField.getText());
			screenTextField.setText(Double.toString(result));
			break;
		case 2: 
			result = number - Double.parseDouble(screenTextField.getText());
			screenTextField.setText(Double.toString(result));
			break;
		case 3: 
			result = number * Double.parseDouble(screenTextField.getText());
			screenTextField.setText(Double.toString(result));
			break;
		case 4: 
			result = number / Double.parseDouble(screenTextField.getText());
			screenTextField.setText(Double.toString(result));
			break;
		case 5: 
			result = Math.pow(number, Double.parseDouble(screenTextField.getText() ));
			screenTextField.setText(Double.toString(result));
			break;
		case 6: 
			result = number % Double.parseDouble(screenTextField.getText());
			screenTextField.setText(Double.toString(result));
			break;
		}
		
	}
	/**
	 * Create the frame.
	 */
	public calculator() {
		setTitle("Calculator"); 
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screenPanel = new JPanel();
		screenPanel.setBounds(10, 11, 364, 60);
		contentPane.add(screenPanel);
		screenPanel.setLayout(null);
		
		screenTextField = new JTextField();
		screenTextField.setBackground(new Color(200, 200, 227));
		screenTextField.setEditable(false);
		screenTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		screenTextField.setFont(new Font("Calibri", Font.BOLD, 18));
		screenTextField.setBounds(0, 24, 364, 36);
		screenPanel.add(screenTextField);
		screenTextField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 255, 255));
		label.setFont(new Font("Calibri", Font.BOLD, 15));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 0, 364, 23);
		screenPanel.add(label);
		
		OperationPanel = new JPanel();
		OperationPanel.setBackground(new Color(255, 234, 244));
		OperationPanel.setBounds(8, 81, 366, 376);
		contentPane.add(OperationPanel);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(0, 0, 57, 79);
		btn9.setBackground(new Color(255, 213, 234));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		OperationPanel.setLayout(null);
		btn9.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(77, 0, 57, 79);
		btn8.setBackground(new Color(255, 213, 234));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(154, 0, 57, 79);
		btn7.setBackground(new Color(255, 213, 234));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		OperationPanel.add(btn7);
		btn7.setFont(new Font("Calibri", Font.BOLD, 23));
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(231, 0, 57, 79);
		btnPlus.setBackground(new Color(176, 176, 217));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=1;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand());
				
			}
		});
		btnPlus.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btnPlus);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(0, 99, 57, 79);
		btn6.setBackground(new Color(255, 213, 234));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(308, 0, 57, 79);
		btnMinus.setBackground(new Color(176, 176, 217));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=2;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand()); //getActionCommand= - 
			}
		});
		btnMinus.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btnMinus);
		btn6.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(77, 99, 57, 79);
		btn5.setBackground(new Color(255, 213, 234));
		btn5.setFont(new Font("Calibri", Font.BOLD, 23));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		OperationPanel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(154, 99, 57, 79);
		btn4.setBackground(new Color(255, 213, 234));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn4);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(77, 198, 57, 79);
		btn2.setBackground(new Color(255, 213, 234));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		
		JButton btnMultiple = new JButton("*");
		btnMultiple.setBounds(231, 99, 57, 79);
		btnMultiple.setBackground(new Color(176, 176, 217));
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=3;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		});
		btnMultiple.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btnMultiple);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(308, 99, 57, 79);
		btnDivide.setBackground(new Color(176, 176, 217));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=4;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
	
		});
		btnDivide.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btnDivide);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(0, 198, 57, 79);
		btn3.setBackground(new Color(255, 213, 234));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand());  
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn3);
		btn2.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(154, 198, 57, 79);
		btn1.setBackground(new Color(255, 213, 234));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenTextField(e.getActionCommand()); 
			}
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btn1);
		
		JButton btnExponential = new JButton("^");
		btnExponential.setBounds(231, 198, 57, 79);
		btnExponential.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=5;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand());
				
			}
		});
		btnExponential.setFont(new Font("Calibri", Font.BOLD, 23));
		btnExponential.setBackground(new Color(176, 176, 217));
		OperationPanel.add(btnExponential);
		
		JButton btnYuzde = new JButton("% ");
		btnYuzde.setBounds(308, 198, 57, 79);
		btnYuzde.setBackground(new Color(176, 176, 217));
		btnYuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number= Double.parseDouble(screenTextField.getText());
				operation=6;
				screenTextField.setText(" ");
				label.setText(number + e.getActionCommand());
			}
		}); 
		btnYuzde.setFont(new Font("Calibri", Font.BOLD, 23));
		OperationPanel.add(btnYuzde);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(0, 297, 57, 79);
		btn0.setFont(new Font("Calibri", Font.BOLD, 23));
		btn0.setBackground(new Color(255, 213, 234));
		OperationPanel.add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(77, 297, 57, 79);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				label.setText(" ");
			}
		}); 
		btnEqual.setFont(new Font("Calibri", Font.BOLD, 23));
		btnEqual.setBackground(new Color(176, 176, 217));
		OperationPanel.add(btnEqual);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(154, 297, 202, 79);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				screenTextField.setText(" ");
			}
		});
		btnClear.setFont(new Font("Calibri", Font.BOLD, 23));
		btnClear.setBackground(new Color(176, 176, 217));
		OperationPanel.add(btnClear);
		 
		

	}
}
