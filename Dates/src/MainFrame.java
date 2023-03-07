import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private JPanel contentPane;
	private JTextField textSeason;
	private JLabel lblNewLabel_1;
	private JTextField textSummer;
	private JLabel lblNewLabel_2;
	private JTextField textNY;
	private JLabel lblNewLabel_3;
	private JTextField textBD;
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
	
	public GregorianCalendar difDate(GregorianCalendar date1, GregorianCalendar date2) {
	     GregorianCalendar tempDate1 = new GregorianCalendar();
	     GregorianCalendar tempDate2 = new GregorianCalendar();
	     tempDate1.setTime(date1.getTime());
	     tempDate2.setTime(date2.getTime());
	     
	     if (tempDate2.after(tempDate1)){
	         GregorianCalendar temp = tempDate1;
	         tempDate1 = tempDate2;
	         tempDate2 = temp;
	     }

	     tempDate1.add(Calendar.YEAR, -tempDate2.get(Calendar.YEAR));
	     tempDate1.add(Calendar.MONTH, -tempDate2.get(Calendar.MONTH));
	     tempDate1.add(Calendar.DATE, -tempDate2.get(Calendar.DATE));
	     tempDate1.add(Calendar.HOUR, -tempDate2.get(Calendar.HOUR));
	     tempDate1.add(Calendar.MINUTE, -tempDate2.get(Calendar.MINUTE));

	     return tempDate1;
	 }
	
	public void mathDate(){
		GregorianCalendar nowDate = new GregorianCalendar();
		GregorianCalendar NYDate = new GregorianCalendar(nowDate.get(Calendar.YEAR) + 1, 0, 1, 0, 0);
		GregorianCalendar summerDate = new GregorianCalendar(nowDate.get(Calendar.YEAR), 5, 1, 0, 0);
		GregorianCalendar BDDate = new GregorianCalendar(nowDate.get(Calendar.YEAR), 3, 26, 0, 0);
		int m = nowDate.get(Calendar.MONTH);
		String Season = "Зима";
		if(m == 2 || m == 3 || m == 4) {
			Season = "Весна";
		}
		else if(m == 5 || m == 6 || m == 7) {
			Season = "Лето";
		}
		else if(m == 8 || m == 9 || m == 10) {
			Season = "Осень";
		}
		textSeason.setText(Season);
		
		if(m == 5 || m == 6 || m == 7) {
			String textSdate = "Уже лето!";
			textSummer.setText(textSdate);
		}
		else {
			GregorianCalendar sDate = difDate(nowDate, summerDate);
			String textSdate = sDate.get(Calendar.MONTH) + " месяця(ев) "
			+ sDate.get(Calendar.DATE) + " дня(ей) " +  sDate.get(Calendar.HOUR) + " часa(ов) " + 
					sDate.get(Calendar.MINUTE) + " минут(ы)";
			textSummer.setText(textSdate);
		}
		
		GregorianCalendar NYsDate = difDate(nowDate, NYDate);
		String textNYdate = NYsDate.get(Calendar.MONTH) + " месяця(ев) "
		+ NYsDate.get(Calendar.DATE) + " дня(ей) " +  NYsDate.get(Calendar.HOUR) + " часa(ов) " + 
		NYsDate.get(Calendar.MINUTE) + " минут(ы)";
		textNY.setText(textNYdate);
		
		if (nowDate.get(Calendar.MONTH) == BDDate.get(Calendar.MONTH) ||
				nowDate.get(Calendar.DATE) == BDDate.get(Calendar.DATE)) {
			String textBDdate = "С днём рождения!";
			textBD.setText(textBDdate);
		}
		else {
		GregorianCalendar BDsDate = difDate(nowDate, BDDate);
		String textBDdate = BDsDate.get(Calendar.MONTH) + " месяця(ев) "
		+ BDsDate.get(Calendar.DATE) + " дня(ей) " +  BDsDate.get(Calendar.HOUR) + " часa(ов) " + 
		BDsDate.get(Calendar.MINUTE) + " минут(ы)";
		textBD.setText(textBDdate);
		}
		
		
	}


	public MainFrame() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle(" Даты");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 195);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Сейчас время года:");
		lblNewLabel.setBounds(10, 11, 137, 23);
		contentPane.add(lblNewLabel);
		
		textSeason = new JTextField();
		textSeason.setBounds(157, 12, 65, 20);
		contentPane.add(textSeason);
		textSeason.setColumns(10);
		
		lblNewLabel_1 = new JLabel("До лета:");
		lblNewLabel_1.setBounds(10, 82, 52, 14);
		contentPane.add(lblNewLabel_1);
		
		textSummer = new JTextField();
		textSummer.setBounds(72, 78, 295, 23);
		contentPane.add(textSummer);
		textSummer.setColumns(10);
		
		lblNewLabel_2 = new JLabel("До нового года:");
		lblNewLabel_2.setBounds(10, 45, 111, 14);
		contentPane.add(lblNewLabel_2);
		
		textNY = new JTextField();
		textNY.setBounds(131, 43, 282, 20);
		contentPane.add(textNY);
		textNY.setColumns(10);
		
		lblNewLabel_3 = new JLabel("До моего дня рождения:");
		lblNewLabel_3.setBounds(10, 118, 145, 14);
		contentPane.add(lblNewLabel_3);
		
		textBD = new JTextField();
		textBD.setBounds(159, 115, 290, 20);
		contentPane.add(textBD);
		textBD.setColumns(10);
		mathDate();
	}
}
