import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(myClass.class.getResource("/images/icon.png")));
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Инструкция");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(520, 420, 820, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Должностная инструкция программиста");
		lblNewLabel.setBounds(10, 0, 433, 32);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 571, 207);
		contentPane.add(scrollPane);
		
		JTextPane txtpnnbsp = new JTextPane();
		txtpnnbsp.setContentType("text/html");
		txtpnnbsp.setBackground(new Color(226, 230, 254));
		txtpnnbsp.setEditable(false);
		txtpnnbsp.setText("<p><strong>1. Обязанности</strong><br />\r\n<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1.1. Программист обязан выходить"
				+ " на работу в день зарплаты.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1.2. Программист обязан проводить тестирование рабочих станций,"
				+ " используя современное программное обеспечение.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1.3. Программист обязан принимать свежий кофе "
				+ "для поднятия рабочего тонуса.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1.4. Программист обязан обходить стороной сервер, чтобы не залить "
				+ "клавиатуру кофем.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 1.5. Программист должен аргументированно доказать, почему задачу невозможно"
				+ " выполнить, если ему ее лень решать.</p>\r\n\r\n<p><strong>2. Права</strong></p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.1."
				+ " Программист имеет право спать утром до естественного пробуждения.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.2. Программист "
				+ "имеет право не выходить на работу в случае форс-мажорных обстоятельств (лень вставать, дождь на улице, плохое настроение, не удалось "
				+ "влезть в автобус и т.д.).<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.3. Программист имеет право устраивать 30-минутный перерыв "
				+ "на чай каждые 20 минут.<br />\r\n&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;2.4. Программист имеет право все свoи ошибки свалить на компанию "
				+ "Microsoft.</p>\r\n\r\n<p><strong>3. Ответственность</strong></p>\r\n\r\n<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;3.1. Программист ни"
				+ " в коем случае не несет никакой ответственности.</p>\r\n");
		txtpnnbsp.setCaretPosition(0);
		scrollPane.setViewportView(txtpnnbsp);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(220, 255, 255));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 1, true), "\u041F\u0440\u0438\u043C\u0435\u0447\u0430\u043D\u0438\u0435",
				TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel.setBounds(591, 130, 203, 120);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setContentType("text/html");
		textPane_1.setText("<p><span style=\"font-size:9px\"><strong><span style=\"color:#e74c3c\">Должностную инструкцию<br />\r\nнеобходимо выучить.</span></strong><br />\r\nИ быть способным рассказать ее<br />\r\nпри <strong>первом требовании.</strong></span></p>\r\n");
		textPane_1.setEditable(false);
		textPane_1.setBackground(new Color(220, 255, 255));
		textPane_1.setBounds(10, 21, 183, 88);
		panel.add(textPane_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(myClass.class.getResource("/images/manual_icon.png")));
		lblNewLabel_1.setBounds(615, 22, 150, 108);
		contentPane.add(lblNewLabel_1);
	}
}
