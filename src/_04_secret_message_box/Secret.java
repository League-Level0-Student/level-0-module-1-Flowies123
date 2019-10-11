package _04_secret_message_box;

import javax.swing.JOptionPane;

public class Secret {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Whats the secret message?");
    String password = JOptionPane.showInputDialog("Whats the password.");
    String secretmessage = "HI";

	if (password.equals("Rydergay")) {
		JOptionPane.showMessageDialog(null, secretmessage);
	} else {
		JOptionPane.showMessageDialog(null, "Intruder");
			
}
}
}
