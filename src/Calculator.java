import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 335, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(10, 5, 299, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblByWwwabdurrahmangcom = new JLabel("By: www.AbdurRahmanG.com");
		lblByWwwabdurrahmangcom.setHorizontalAlignment(SwingConstants.CENTER);
		lblByWwwabdurrahmangcom.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblByWwwabdurrahmangcom.setBounds(10, 35, 299, 15);
		frame.getContentPane().add(lblByWwwabdurrahmangcom);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField.setBounds(10, 55, 300, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.setEnabled(false);
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton7.getText();
				textField.setText(number);
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton7.setBounds(70, 305, 60, 60);
		frame.getContentPane().add(btnNewButton7);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.setEnabled(false);
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton4.getText();
				textField.setText(number);
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton4.setBounds(70, 365, 60, 60);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.setEnabled(false);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton1.getText();
				textField.setText(number);
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton1.setBounds(70, 425, 60, 60);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.setEnabled(false);
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton8.getText();
				textField.setText(number);
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton8.setBounds(130, 305, 60, 60);
		frame.getContentPane().add(btnNewButton8);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.setEnabled(false);
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton5.getText();
				textField.setText(number);
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton5.setBounds(130, 365, 60, 60);
		frame.getContentPane().add(btnNewButton5);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.setEnabled(false);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton2.getText();
				textField.setText(number);
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton2.setBounds(130, 425, 60, 60);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.setEnabled(false);
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton0.getText();
				textField.setText(number);
			}
		});
		btnNewButton0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton0.setBounds(70, 485, 120, 60);
		frame.getContentPane().add(btnNewButton0);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.setEnabled(false);
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton9.getText();
				textField.setText(number);
			}
		});
		btnNewButton9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton9.setBounds(190, 305, 60, 60);
		frame.getContentPane().add(btnNewButton9);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.setEnabled(false);
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton6.getText();
				textField.setText(number);
			}
		});
		btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton6.setBounds(190, 365, 60, 60);
		frame.getContentPane().add(btnNewButton6);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.setEnabled(false);
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton3.getText();
				textField.setText(number);
			}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton3.setBounds(190, 425, 60, 60);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButtonDot = new JButton(".");
		btnNewButtonDot.setEnabled(false);
		btnNewButtonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButtonDot.getText();
				textField.setText(number);
			}
		});
		btnNewButtonDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonDot.setBounds(190, 485, 60, 60);
		frame.getContentPane().add(btnNewButtonDot);
		
		JButton btnNewButtonDivision = new JButton("/");
		btnNewButtonDivision.setEnabled(false);
		btnNewButtonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnNewButtonDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonDivision.setBounds(250, 425, 60, 60);
		frame.getContentPane().add(btnNewButtonDivision);
		
		JButton btnNewButtonEqual = new JButton("=");
		btnNewButtonEqual.setEnabled(false);
		btnNewButtonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "X^Y") {
					double result = 1;
					for(int i = 0; i < second; i++) {
						result = first * result;
					}
					
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnNewButtonEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonEqual.setBounds(250, 485, 60, 60);
		frame.getContentPane().add(btnNewButtonEqual);
		
		JButton btnNewButtonMultiplication = new JButton("*");
		btnNewButtonMultiplication.setEnabled(false);
		btnNewButtonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNewButtonMultiplication.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonMultiplication.setBounds(250, 365, 60, 60);
		frame.getContentPane().add(btnNewButtonMultiplication);
		
		JButton btnNewButtonSubtraction = new JButton("-");
		btnNewButtonSubtraction.setEnabled(false);
		btnNewButtonSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnNewButtonSubtraction.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonSubtraction.setBounds(250, 305, 60, 60);
		frame.getContentPane().add(btnNewButtonSubtraction);
		
		JButton btnNewButtonAddition = new JButton("+");
		btnNewButtonAddition.setEnabled(false);
		btnNewButtonAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnNewButtonAddition.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonAddition.setBounds(250, 245, 60, 60);
		frame.getContentPane().add(btnNewButtonAddition);
		
		JButton btnNewButtonTanh = new JButton("Tanh");
		btnNewButtonTanh.setEnabled(false);
		btnNewButtonTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonTanh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButtonTanh.setBounds(250, 185, 60, 60);
		frame.getContentPane().add(btnNewButtonTanh);
		
		JButton btnNewButtonTan = new JButton("Tan");
		btnNewButtonTan.setEnabled(false);
		btnNewButtonTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonTan.setBounds(250, 126, 60, 60);
		frame.getContentPane().add(btnNewButtonTan);
		
		JButton btnNewButtonCos = new JButton("Cos");
		btnNewButtonCos.setEnabled(false);
		btnNewButtonCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonCos.setBounds(190, 126, 60, 60);
		frame.getContentPane().add(btnNewButtonCos);
		
		JButton btnNewButtonCosh = new JButton("Cosh");
		btnNewButtonCosh.setEnabled(false);
		btnNewButtonCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonCosh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonCosh.setBounds(190, 185, 60, 60);
		frame.getContentPane().add(btnNewButtonCosh);
		
		JButton btnNewButtonBackSpace = new JButton("\uF0E7");
		btnNewButtonBackSpace.setEnabled(false);
		btnNewButtonBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButtonBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 20));
		btnNewButtonBackSpace.setBounds(190, 245, 60, 60);
		frame.getContentPane().add(btnNewButtonBackSpace);
		
		JButton btnNewButtonSin = new JButton("Sin");
		btnNewButtonSin.setEnabled(false);
		btnNewButtonSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonSin.setBounds(130, 126, 60, 60);
		frame.getContentPane().add(btnNewButtonSin);
		
		JButton btnNewButtonSinh = new JButton("Sinh");
		btnNewButtonSinh.setEnabled(false);
		btnNewButtonSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonSinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonSinh.setBounds(130, 185, 60, 60);
		frame.getContentPane().add(btnNewButtonSinh);
		
		JButton btnNewButtonClear = new JButton("C");
		btnNewButtonClear.setEnabled(false);
		btnNewButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButtonClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonClear.setBounds(130, 245, 60, 60);
		frame.getContentPane().add(btnNewButtonClear);
		
		JButton btnNewButtonEx = new JButton("e^x");
		btnNewButtonEx.setEnabled(false);
		btnNewButtonEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonEx.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonEx.setBounds(70, 126, 60, 60);
		frame.getContentPane().add(btnNewButtonEx);
		
		JButton btnNewButtonLog = new JButton("Log");
		btnNewButtonLog.setEnabled(false);
		btnNewButtonLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButtonLog.setBounds(70, 185, 60, 60);
		frame.getContentPane().add(btnNewButtonLog);
		
		JButton btnNewButtonPercentage = new JButton("%");
		btnNewButtonPercentage.setEnabled(false);
		btnNewButtonPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnNewButtonPercentage.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButtonPercentage.setBounds(70, 245, 60, 60);
		frame.getContentPane().add(btnNewButtonPercentage);
		
		JButton btnNewButtonSqrt = new JButton("\u221A");
		btnNewButtonSqrt.setEnabled(false);
		btnNewButtonSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonSqrt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButtonSqrt.setBounds(10, 126, 60, 60);
		frame.getContentPane().add(btnNewButtonSqrt);
		
		JButton btnNewButton1X = new JButton("1/X");
		btnNewButton1X.setEnabled(false);
		btnNewButton1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButton1X.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton1X.setBounds(10, 185, 60, 60);
		frame.getContentPane().add(btnNewButton1X);
		
		JButton btnNewButtonXy = new JButton("X^Y");
		btnNewButtonXy.setEnabled(false);
		btnNewButtonXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "X^Y";
			}
		});
		btnNewButtonXy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonXy.setBounds(10, 245, 60, 60);
		frame.getContentPane().add(btnNewButtonXy);
		
		JButton btnNewButtonX3 = new JButton("X^3");
		btnNewButtonX3.setEnabled(false);
		btnNewButtonX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);
			}
		});
		btnNewButtonX3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonX3.setBounds(10, 305, 60, 60);
		frame.getContentPane().add(btnNewButtonX3);
		
		JButton btnNewButtonX2 = new JButton("X^2");
		btnNewButtonX2.setEnabled(false);
		btnNewButtonX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a = a * a;
				textField.setText("");
				textField.setText(textField.getText() + a);				
			}
		});
		btnNewButtonX2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonX2.setBounds(10, 365, 60, 60);
		frame.getContentPane().add(btnNewButtonX2);
		
		JButton btnNewButtonNFactorial = new JButton("n!");
		btnNewButtonNFactorial.setEnabled(false);
		btnNewButtonNFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				double factorial = 1;
				while(a != 0) {
					factorial = factorial * a;
					a--;
					
				}
				
				textField.setText("");
				textField.setText(textField.getText() + factorial);
				
			}
		});
		btnNewButtonNFactorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonNFactorial.setBounds(10, 425, 60, 60);
		frame.getContentPane().add(btnNewButtonNFactorial);
		
		JButton btnNewButtonPlusMinus = new JButton("+/-");
		btnNewButtonPlusMinus.setEnabled(false);
		btnNewButtonPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (1);
				textField.setText(String.valueOf(a));
			}
		});
		btnNewButtonPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButtonPlusMinus.setBounds(10, 485, 60, 60);
		frame.getContentPane().add(btnNewButtonPlusMinus);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton0.setEnabled(true);
				btnNewButton1.setEnabled(true);
				btnNewButton2.setEnabled(true);
				btnNewButton3.setEnabled(true);
				btnNewButton4.setEnabled(true);
				btnNewButton5.setEnabled(true);
				btnNewButton6.setEnabled(true);
				btnNewButton7.setEnabled(true);
				btnNewButton8.setEnabled(true);
				btnNewButton9.setEnabled(true);
				
				btnNewButtonDot.setEnabled(true);
				btnNewButtonEqual.setEnabled(true);
				btnNewButtonDivision.setEnabled(true);
				btnNewButtonMultiplication.setEnabled(true);
				btnNewButtonSubtraction.setEnabled(true);
				btnNewButtonAddition.setEnabled(true);
				btnNewButtonBackSpace.setEnabled(true);
				btnNewButtonClear.setEnabled(true);
				btnNewButtonPercentage.setEnabled(true);
												
				btnNewButtonPlusMinus.setEnabled(true);
				btnNewButtonNFactorial.setEnabled(true);
				btnNewButtonX2.setEnabled(true);
				btnNewButtonX3.setEnabled(true);
				btnNewButtonXy.setEnabled(true);
				btnNewButton1X.setEnabled(true);
				btnNewButtonSqrt.setEnabled(true);
				btnNewButtonEx.setEnabled(true);
				btnNewButtonSin.setEnabled(true);
				btnNewButtonCos.setEnabled(true);
				btnNewButtonTan.setEnabled(true);
				btnNewButtonTanh.setEnabled(true);
				btnNewButtonCosh.setEnabled(true);
				btnNewButtonSinh.setEnabled(true);
				btnNewButtonLog.setEnabled(true);
				
				textField.setEnabled(true);
			
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(10, 105, 60, 20);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
				btnNewButton0.setEnabled(false);
				btnNewButton1.setEnabled(false);
				btnNewButton2.setEnabled(false);
				btnNewButton3.setEnabled(false);
				btnNewButton4.setEnabled(false);
				btnNewButton5.setEnabled(false);
				btnNewButton6.setEnabled(false);
				btnNewButton7.setEnabled(false);
				btnNewButton8.setEnabled(false);
				btnNewButton9.setEnabled(false);
				
				btnNewButtonDot.setEnabled(false);
				btnNewButtonEqual.setEnabled(false);
				btnNewButtonDivision.setEnabled(false);
				btnNewButtonMultiplication.setEnabled(false);
				btnNewButtonSubtraction.setEnabled(false);
				btnNewButtonAddition.setEnabled(false);
				btnNewButtonBackSpace.setEnabled(false);
				btnNewButtonClear.setEnabled(false);
				btnNewButtonPercentage.setEnabled(false);
												
				btnNewButtonPlusMinus.setEnabled(false);
				btnNewButtonNFactorial.setEnabled(false);
				btnNewButtonX2.setEnabled(false);
				btnNewButtonX3.setEnabled(false);
				btnNewButtonXy.setEnabled(false);
				btnNewButton1X.setEnabled(false);
				btnNewButtonSqrt.setEnabled(false);
				btnNewButtonEx.setEnabled(false);
				btnNewButtonSin.setEnabled(false);
				btnNewButtonCos.setEnabled(false);
				btnNewButtonTan.setEnabled(false);
				btnNewButtonTanh.setEnabled(false);
				btnNewButtonCosh.setEnabled(false);
				btnNewButtonSinh.setEnabled(false);
				btnNewButtonLog.setEnabled(false);
				
				textField.setEnabled(false);
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnOff.setBounds(70, 105, 60, 20);
		frame.getContentPane().add(rdbtnOff);
	}
}
