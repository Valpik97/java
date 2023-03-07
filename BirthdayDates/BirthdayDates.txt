import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame {
	
	private JPanel contentPane;
	private JTextField textName1;
	private JTextField textBD1;
	private JTextField textFullYear1;
	private JTextField textNextBD1;
	private JTextField textName2;
	private JTextField textBD2;
	private JTextField textFullYear2;
	private JTextField textNextBD2;
	private JTextField textLeap1;
	private JTextField textLeap2;
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

	     return tempDate1;
	 }
	
	public GregorianCalendar nextBD(GregorianCalendar date) {
	    int nextYear = new GregorianCalendar().get(Calendar.YEAR) + 1;
	    return new GregorianCalendar(
	            nextYear,
	            date.get(Calendar.MONTH),
	            date.get(Calendar.DATE));
	}
	
	
	public void mathDate (){
		String name1 = "Вася";
		String name2 = "Вера";
		GregorianCalendar date1 = new GregorianCalendar(1996,9-1,30);
		GregorianCalendar date2 = new GregorianCalendar(1996,9-1,30);
		
		textName1.setText(name1);
		textName2.setText(name2);
		SimpleDateFormat displayFormat = new SimpleDateFormat("dd/MMMM/yyyy");
		textBD1.setText(displayFormat.format(date1.getTime()));
		textBD2.setText(displayFormat.format(date2.getTime()));
		
		String result = name2 + " старше, чем " + name1;
		if (date2.after(date1)) {
		    result = name1 + " старше, чем " + name2;
		}
		
		GregorianCalendar dif = difDate(date1, date2);

		int year = dif.get(Calendar.YEAR);
		if (date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR)) year = 0;
		if(date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR) &&
				date1.get(Calendar.MONTH) == date2.get(Calendar.MONTH) && 
				date1.get(Calendar.DATE) == date2.get(Calendar.DATE)) {
			result = "<html>" + name1 + " одного возраста с " + name2 + "</html>";
		}
		else {
			result = "<html>" + result + ",<br> на " + year + " лет, " + dif.get(Calendar.MONTH) +
					" месяцев и " + dif.get(Calendar.DATE) + " дней </html>";
		}
		JLabel labelDif = new JLabel(result);
		labelDif.setForeground(new Color(0, 128, 0));
		labelDif.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelDif.setBounds(10, 253, 362, 51);
		contentPane.add(labelDif);
		
		int dateFullYear1 = difDate(new GregorianCalendar(), date1).get(Calendar.YEAR);
	    int dateFullYear2 = difDate(new GregorianCalendar(), date2).get(Calendar.YEAR);

	    textFullYear1.setText(String.valueOf(dateFullYear1));
	    textFullYear2.setText(String.valueOf(dateFullYear2));
	    
	    
	    GregorianCalendar nextBD1 = nextBD(date1);
	    GregorianCalendar nextBD2 = nextBD(date2);
	    nextBD1 = difDate(new GregorianCalendar(), nextBD1);
	    nextBD2 = difDate(new GregorianCalendar(), nextBD2);

	    textNextBD1.setText(nextBD1.get(Calendar.MONTH) + " месяцев и " +
	                nextBD1.get(Calendar.DATE) + " дней");
	    textNextBD2.setText(nextBD2.get(Calendar.MONTH) + " месяцев и " +
	                nextBD2.get(Calendar.DATE) + " дней");
	    
	    if(date1.isLeapYear(date1.get(Calendar.YEAR))) {
	    	textLeap1.setText("високосный");
	    }
	    else {
	    	textLeap1.setText("не високосный");
	    }
	    if(date1.isLeapYear(date2.get(Calendar.YEAR))) {
	    	textLeap2.setText("високосный");
	    }
	    else {
	    	textLeap2.setText("не високосный");
	    }

	}

	public MainFrame() {
		
		setTitle("Рассчёт дат");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 347);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u041F\u0435\u0440\u0432\u044B\u0439 \u043E\u0431\u044A\u0435\u043A\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 11, 171, 231);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Имя");
		lblNewLabel.setBounds(10, 18, 28, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ДР");
		lblNewLabel_1.setBounds(10, 49, 22, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Полных лет:");
		lblNewLabel_2.setBounds(10, 74, 79, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("До след. ДР:");
		lblNewLabel_3.setBounds(10, 130, 79, 14);
		panel_1.add(lblNewLabel_3);
		
		textName1 = new JTextField();
		textName1.setBounds(42, 15, 119, 20);
		panel_1.add(textName1);
		textName1.setColumns(10);
		
		textBD1 = new JTextField();
		textBD1.setBounds(42, 46, 119, 20);
		panel_1.add(textBD1);
		textBD1.setColumns(10);
		
		textFullYear1 = new JTextField();
		textFullYear1.setBounds(10, 99, 151, 20);
		panel_1.add(textFullYear1);
		textFullYear1.setColumns(10);
		
		textNextBD1 = new JTextField();
		textNextBD1.setBounds(10, 155, 151, 20);
		panel_1.add(textNextBD1);
		textNextBD1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Високосный ли год:");
		lblNewLabel_5.setBounds(10, 180, 119, 20);
		panel_1.add(lblNewLabel_5);
		
		textLeap1 = new JTextField();
		textLeap1.setBounds(10, 200, 151, 20);
		panel_1.add(textLeap1);
		textLeap1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u0412\u0442\u043E\u0440\u043E\u0439 \u043E\u0431\u044A\u0435\u043A\u0442", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(201, 11, 171, 231);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("До след. ДР:");
		lblNewLabel_3_1.setBounds(10, 130, 79, 14);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Полных лет:");
		lblNewLabel_2_1.setBounds(10, 74, 79, 14);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ДР");
		lblNewLabel_1_1.setBounds(10, 49, 28, 14);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Имя");
		lblNewLabel_4.setBounds(10, 18, 28, 14);
		panel_2.add(lblNewLabel_4);
		
		textName2 = new JTextField();
		textName2.setBounds(48, 15, 113, 20);
		panel_2.add(textName2);
		textName2.setColumns(10);
		
		textBD2 = new JTextField();
		textBD2.setBounds(48, 46, 113, 20);
		panel_2.add(textBD2);
		textBD2.setColumns(10);
		
		textFullYear2 = new JTextField();
		textFullYear2.setBounds(10, 99, 151, 20);
		panel_2.add(textFullYear2);
		textFullYear2.setColumns(10);
		
		textNextBD2 = new JTextField();
		textNextBD2.setBounds(10, 155, 151, 20);
		panel_2.add(textNextBD2);
		textNextBD2.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Високосный ли год:");
		lblNewLabel_5_1.setBounds(10, 180, 119, 20);
		panel_2.add(lblNewLabel_5_1);
		
		textLeap2 = new JTextField();
		textLeap2.setBounds(10, 200, 151, 20);
		panel_2.add(textLeap2);
		textLeap2.setColumns(10);
		mathDate();
	}
}
