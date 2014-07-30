
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	public class MyWin extends JFrame{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	JTextField username, password;
	MyWin(String login){
	super(login);
	this.setSize(400, 650);
	this.pack();
	this.setVisible(true);
	}
	void init() {
		username = new JTextField(10);
		password = new JTextField(10);
		JPanel panel = new JPanel();
		panel.add(username);
		panel.add(password);	
		this.add(panel);
	}
	}
