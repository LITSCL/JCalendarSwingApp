package cl.inacap.jcalendarswingapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCalendar calendarFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		setTitle("JCalendarSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		calendarFecha = new JCalendar();
		calendarFecha.setBounds(10, 11, 184, 153);
		contentPane.add(calendarFecha);
		
		JButton btnMostrarFecha = new JButton("Mostrar Fecha en Consola");
		btnMostrarFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int dia = calendarFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
				int mes = (calendarFecha.getCalendar().get(Calendar.MONTH)+1);
				int year = calendarFecha.getCalendar().get(Calendar.YEAR);
				
				System.out.println("El dia seleccionado es: " + dia);
				System.out.println("El mes seleccionado es: " + mes);
				System.out.println("El año seleccionado es: " + year);
				
			}
		});
		btnMostrarFecha.setBounds(240, 227, 184, 23);
		contentPane.add(btnMostrarFecha);
	}
}
