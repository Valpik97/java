import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int randomRange(int min, int max){
	    double rnd = Math.random();
	    return min + (int)(rnd * ((max - min) + 1));
	}
	public int randomRange(int max){
	    return randomRange(0, max);
	}
	
	public void printWelcome() {
		int nowDate = new GregorianCalendar().get(Calendar.HOUR_OF_DAY);
		int morningHour = 7;
		int dayHour = 12;
		int eveningHour = 18;
		int nightHour = 23;
		
		String strHello = "Доброй ночи!";
		if (nowDate > morningHour)
		    strHello = "Доброе утро!";
		if (nowDate > dayHour)
		    strHello = "Добрый день!";
		if (nowDate > eveningHour && nowDate < nightHour)
		    strHello = "Добрый вечер!";
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);
		
		int max = 1000;

		for (int i = 0; i < max; i++) {
			JLabel label = new JLabel(strHello);
			int fontSize = randomRange(2, 60);
		    label.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
		    label.setForeground(new Color(randomRange(255), randomRange(255), randomRange(255)));

		    Dimension size = label.getPreferredSize();
		    int h = size.height;
		    int w = size.width;
		    int x = randomRange(getWidth() - w);
		    int y = randomRange(getHeight() - h);
		    label.setBounds(x,y, w, h);
		    contentPane.add(label);
		    contentPane.setComponentZOrder(label, 0);
		}
	}
	
	


	public MainFrame() {
		setTitle("Приветствие");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		printWelcome();
		
	}

}
