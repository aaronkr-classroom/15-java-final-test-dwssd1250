
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import java.util.Stack;

public class cal extends JFrame {
	static int oper;
	public cal() {
		setTitle("계산기");
		setSize(300, 395);
		
		int firNumber;
		int secNumber;
		
		//Stack<Integer> count = new Stack<>();
		
		// 제목 페널
		//JPanel titlePanel = new JPanel();
		//titlePanel.setBounds(0, 0, 300, 40);
		//add(titlePanel);
		//JLabel title = new JLabel("계산기", JLabel.CENTER);
		//title.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		//titlePanel.add(title);
		
		

		
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		menuBar.add(m1);
		menuBar.add(m2);
		menuBar.add(m3);
		
		JMenuItem mf1 = new JMenuItem("New");
		JMenuItem mf2 = new JMenuItem("Open");
		m1.add(mf1);
		m1.add(mf2);
		
		JMenuItem me1 = new JMenuItem("Copy");
		JMenuItem me2 = new JMenuItem("Paste");
		m1.add(me1);
		m1.add(me2);
		
		setJMenuBar(menuBar);
		
		// 버튼 페널
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(-1, 50, 290, 290); // 수정
		// 추가 (수평 간격이 10, 수직 간격이 5인 2행 2열의 GridLayout 설정)
		btnPanel.setLayout(new GridLayout(4, 4, 0, 0));
		
		add(btnPanel);
		
		JButton seven = new JButton("7");
		btnPanel.add(seven);
		JButton eig = new JButton("8");
		btnPanel.add(eig);
		JButton nine = new JButton("9");
		btnPanel.add(nine);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		JButton four = new JButton("4");
		btnPanel.add(four);
		JButton five = new JButton("5");
		btnPanel.add(five);
		JButton six = new JButton("6");
		btnPanel.add(six);
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		JButton one = new JButton("1");
		btnPanel.add(one);
		JButton two = new JButton("2");
		btnPanel.add(two);
		JButton thr = new JButton("3");
		btnPanel.add(thr);
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		JButton zero = new JButton("0");
		btnPanel.add(zero);
		JButton del = new JButton("AC");
		btnPanel.add(del);
		JButton equ = new JButton("=");
		btnPanel.add(equ);
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		
		// 결과 페널
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 10, 100, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel("결과값: ");
		resPanel.add(lbl1);
		JLabel lbl2 = new JLabel("");
		resPanel.add(lbl2);
		
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == zero) {
					int result = 0;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == one) {
					int result = 1;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == two) {
					int result = 2;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		thr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == thr) {
					int result = 3;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == four) {
					int result = 4;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == five) {
					int result = 5;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == six) {
					int result = 6;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == seven) {
					int result = 7;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		eig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == eig) {
					int result = 8;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == nine) {
					int result = 9;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		
		
		
		
		
		//+ActionListener
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == plus) {
					char result = '+';
					oper = 1;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		//-ActionListener
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == minus) {
					char result = '-';
					oper = 2;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		//*ActionListener
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == mult) {
					char result = '*';
					oper = 3;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		///ActionListener
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == div) {
					char result = '/';
					oper = 4;
					lbl2.setText(lbl2.getText() + String.valueOf(result));
				}
			}
		});
		
		
		
		
		
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == del) {
					lbl2.removeAll();
					lbl2.setText(String.valueOf(""));
				}
			}
		});
		equ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == equ) {
					int result = 0;
					int num01 = Integer.parseInt(lbl2.getText());
					int num02 = Integer.parseInt(lbl2.getText());
					if(oper==1) {
						result = num01 + num02;
					}
					else if(oper==2) {
						result = num01 - num02;
					}
					else if(oper==3) {
						result = num01 * num02;
					}
					else if(oper==4) {
						result = num01 / num02;
					}
					
					
					lbl2.setText(String.valueOf(result));
				}
			}
		});
		// 프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new cal();
	}

}
