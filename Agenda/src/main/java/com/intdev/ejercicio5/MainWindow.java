package ejercicio5;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private List<Alumno> alumnos = new ArrayList<>();
	private JTextField txfName;
	private JTextField txfSurname;
	private JTextField txfemail;
	private JTextField txfAge;
	private JTextField txfTlef;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnbName = new JPanel();
		contentPane.add(pnbName);
		pnbName.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblName = new JLabel("Nombre: ");
		pnbName.add(lblName);
		
		txfName = new JTextField();
		lblName.setLabelFor(txfName);
		pnbName.add(txfName);
		txfName.setColumns(10);
		
		JPanel pnbSurname = new JPanel();
		contentPane.add(pnbSurname);
		
		JLabel lblSurname = new JLabel("Apellidos: ");
		pnbSurname.add(lblSurname);
		
		txfSurname = new JTextField();
		lblSurname.setLabelFor(txfSurname);
		pnbSurname.add(txfSurname);
		txfSurname.setColumns(10);
		
		JPanel pnbEmail = new JPanel();
		contentPane.add(pnbEmail);
		
		JLabel lblEmail = new JLabel("email: ");
		pnbEmail.add(lblEmail);
		
		txfemail = new JTextField();
		lblEmail.setLabelFor(txfemail);
		pnbEmail.add(txfemail);
		txfemail.setColumns(10);
		
		JPanel pnbAge = new JPanel();
		contentPane.add(pnbAge);
		
		JLabel lblAge = new JLabel("Edad: ");
		pnbAge.add(lblAge);
		
		txfAge = new JTextField();
		lblAge.setLabelFor(txfAge);
		pnbAge.add(txfAge);
		txfAge.setColumns(10);
		
		JPanel pnbTlef = new JPanel();
		contentPane.add(pnbTlef);
		
		JLabel lblTlef = new JLabel("Telefono: ");
		pnbTlef.add(lblTlef);
		
		txfTlef = new JTextField();
		lblTlef.setLabelFor(txfTlef);
		pnbTlef.add(txfTlef);
		txfTlef.setColumns(10);
		
		JPanel pnbBtnSend = new JPanel();
		contentPane.add(pnbBtnSend);
		
		JButton btnSend = new JButton("Enviar");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(
							!txfName.getText().isBlank() &&
							!txfSurname.getText().isBlank() &&
							!txfAge.getText().isBlank() &&
							!txfemail.getText().isBlank() &&
							!txfTlef.getText().isBlank()
							) {
						alumnos.add(new Alumno(
								txfName.getText(),
								txfSurname.getText(),
								Integer.parseInt(txfAge.getText()),
								txfemail.getText(),
								Long.parseLong(txfTlef.getText())
						));
					}else {
						JOptionPane.showMessageDialog(null,"Hay campos vacios");
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Hay campos Erroneos");
				}
				txfName.setText("");
				txfSurname.setText("");
				txfAge.setText("");
				txfemail.setText("");
				txfTlef.setText("");
			}
		});
		pnbBtnSend.add(btnSend);

	}

}
