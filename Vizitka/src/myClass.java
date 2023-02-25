import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class myClass extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myClass frame = new myClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public myClass() {
		setTitle("Моя визитка");
		setResizable(false);
		setAlwaysOnTop(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(myClass.class.getResource("/Images/icons8-magnetic-card-50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1300, 90, 480, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 218, 218));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(myClass.class.getResource("/Images/2_Dfq-90zkc.jpg")));
		lblNewLabel.setBounds(222, 25, 198, 174);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("FormattedTextField.border"));
		panel.setBounds(10, 25, 182, 174);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 162, 152);
		panel.add(textPane);
		textPane.setContentType("text/html");
		textPane.setText("<p><span style=\"font-size:10px\"><strong>Ф.И.О.</strong>:"
				+ " Алексеев Тимофей Валерьевич<br />\r\n<strong>Возраст</strong>:"
				+ " 15 лет<br />\r\n<strong>Город</strong>: Санкт-Петербург<br />\r\n<strong>Телефон</strong>:"
				+ " +79819651200<br />\r\n<strong>Школа и класс</strong>: Вторая СПб Гимназия, 9-2 класс</span></p>\r\n");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(93, 210, 275, 90);
		contentPane.add(scrollPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setContentType("text/html");
		textPane_1.setText("<p><span style=\"font-size:18px\"><strong>Коротко о себе:</strong></span><br />\r\n<span style=\"font-family:Comic Sans MS,cursive\"><span style=\"color:#e74c3c\">Привет!</span> Меня зовут <strong>Тима</strong>, живу в <u>Санкт-Петербурге</u> и учусь в <span style=\"color:#3498db\">9</span> <span style=\"color:#3498db\">классе</span>. Люблю играть в компьютерные игры и программировать на <span style=\"color:#2ecc71\"><em>Java</em></span>, <span style=\"color:#2ecc71\"><em>C++</em> </span>и <span style=\"color:#2ecc71\"><em>Python</em></span>. Мои любимые предметы - <span style=\"color:#c0392b\">информатика</span>, <span style=\"color:#c0392b\">физика </span>и <span style=\"color:#c0392b\">математика</span>. Также увлекаюсь комиксами, а мой любимый супергерой - <em><span style=\"color:#f1c40f\">Бэтмен</span></em>.</span></p>");
		textPane_1.setCaretPosition(0);
		scrollPane.setViewportView(textPane_1);
	}
}
