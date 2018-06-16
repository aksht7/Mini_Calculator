import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField txt1;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b10;
	private JButton b11;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	 double firstnum;
	  double secondnum;
	  double result;
	  String operation;
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
	public void disable()
	{
		txt1.setEnabled(false);
		bt1.setEnabled(false);
		bt2.setEnabled(false);
		bt3.setEnabled(false);
		bt4.setEnabled(false);
		bt5.setEnabled(false);
		bt6.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 427, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setForeground(Color.BLACK);
		txt1.setBackground(Color.WHITE);
		txt1.setBounds(10, 11, 391, 53);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JButton bt1 = new JButton("C");
		bt1.setBackground(Color.LIGHT_GRAY);
		bt1.setForeground(Color.RED);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("");
			}
		});
		bt1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt1.setBounds(180, 75, 72, 42);
		frame.getContentPane().add(bt1);
		
		JButton bt2 = new JButton("+");
		bt2.setBackground(Color.LIGHT_GRAY);
		bt2.setForeground(Color.RED);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operation = "+";
			}
		});
		bt2.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt2.setBounds(298, 75, 72, 42);
		frame.getContentPane().add(bt2);
		
		b1 = new JButton("7");
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(Color.RED);
		b1.setFont(new Font("Tahoma", Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String takein;
				takein = txt1.getText() + b1.getText();
				txt1.setText(takein);
			}
		});
		b1.setBounds(10, 145, 72, 42);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("8");
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.RED);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b2.getText();
				txt1.setText(takein);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 20));
		b2.setBounds(111, 145, 72, 42);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("9");
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.RED);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b1.getText();
				txt1.setText(takein);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 20));
		b3.setBounds(216, 145, 72, 42);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		b4.setBackground(Color.LIGHT_GRAY);
		b4.setForeground(Color.RED);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b4.getText();
				txt1.setText(takein);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 20));
		b4.setBounds(10, 211, 72, 42);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setBackground(Color.LIGHT_GRAY);
		b5.setForeground(Color.RED);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b5.getText();
				txt1.setText(takein);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 20));
		b5.setBounds(111, 211, 72, 42);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.setBackground(Color.LIGHT_GRAY);
		b6.setForeground(Color.RED);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b6.getText();
				txt1.setText(takein);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 20));
		b6.setBounds(216, 211, 72, 42);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("1");
		b7.setBackground(Color.LIGHT_GRAY);
		b7.setForeground(Color.RED);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b7.getText();
				txt1.setText(takein);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 20));
		b7.setBounds(10, 278, 72, 42);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("2");
		b8.setBackground(Color.LIGHT_GRAY);
		b8.setForeground(Color.RED);
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b8.getText();
				txt1.setText(takein);
			}
			
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 20));
		b8.setBounds(111, 278, 72, 42);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("3");
		b9.setBackground(Color.LIGHT_GRAY);
		b9.setForeground(Color.RED);
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b9.getText();
				txt1.setText(takein);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 20));
		b9.setBounds(216, 278, 72, 42);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("0");
		b10.setBackground(Color.LIGHT_GRAY);
		b10.setForeground(Color.RED);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b10.getText();
				txt1.setText(takein);
			}
		});
		b10.setFont(new Font("Tahoma", Font.BOLD, 20));
		b10.setBounds(10, 340, 72, 42);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton(".");
		b11.setBackground(Color.LIGHT_GRAY);
		b11.setForeground(Color.RED);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String takein;
				takein = txt1.getText() + b11.getText();
				txt1.setText(takein);
			}
		});
		b11.setFont(new Font("Tahoma", Font.BOLD, 25));
		b11.setBounds(111, 340, 72, 42);
		frame.getContentPane().add(b11);
		
		JButton bt6 = new JButton("=");
		bt6.setBackground(Color.LIGHT_GRAY);
		bt6.setForeground(Color.RED);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum=Double.parseDouble(txt1.getText());
				switch(operation)
				{
				case "+":
					result = firstnum+secondnum;
					answer = String.format("%.0f", result);
					txt1.setText(answer);
					break;
				case "-":
					result = firstnum-secondnum;
					answer = String.format("%.0f", result);
					txt1.setText(answer);
					break;
				case "*":
					result = firstnum*secondnum;
					answer = String.format("%.0f", result);
					txt1.setText(answer);
					break;
				case "/":
					result = firstnum/secondnum;
					txt1.setText(result + "");
					break;
				}
				
			}
		});
		bt6.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt6.setBounds(216, 340, 185, 42);
		frame.getContentPane().add(bt6);
		
		JButton bt3 = new JButton("-");
		bt3.setBackground(Color.LIGHT_GRAY);
		bt3.setForeground(Color.RED);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operation = "-";
			}
		});
		bt3.setFont(new Font("Tahoma", Font.BOLD, 30));
		bt3.setBounds(315, 145, 72, 42);
		frame.getContentPane().add(bt3);
		
		JButton bt4 = new JButton("*");
		bt4.setBackground(Color.LIGHT_GRAY);
		bt4.setForeground(Color.RED);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operation = "*";
			}
		});
		bt4.setFont(new Font("Tahoma", Font.BOLD, 27));
		bt4.setBounds(315, 211, 72, 42);
		frame.getContentPane().add(bt4);
		
		JButton bt5 = new JButton("/");
		bt5.setBackground(Color.LIGHT_GRAY);
		bt5.setForeground(Color.RED);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txt1.getText());
				txt1.setText("");
				operation = "/";
			}
		});
		bt5.setFont(new Font("Tahoma", Font.BOLD, 20));
		bt5.setBounds(315, 278, 72, 42);
		frame.getContentPane().add(bt5);
		
		JRadioButton rb1 = new JRadioButton("ON");
		rb1.setBackground(Color.BLACK);
		rb1.setForeground(Color.RED);
		rb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rb1.setBounds(10, 84, 58, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("OFF");
		rb2.setBackground(Color.BLACK);
		rb2.setForeground(Color.RED);
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				disable();
			}
		});
		rb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rb2.setBounds(10, 110, 58, 23);
		frame.getContentPane().add(rb2);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		frame.getContentPane().add(rb1);
		frame.getContentPane().add(rb2);
		
		JLabel lblCasio = new JLabel("CASIO");
		lblCasio.setForeground(Color.BLACK);
		lblCasio.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 26));
		lblCasio.setBounds(74, 87, 96, 42);
		frame.getContentPane().add(lblCasio);
	}
}
