package org.iuea.oop.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginView extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel l1, userLabel, passwordLabel;
	private JTextField userNameTextField;
	private JPasswordField passwordField;
	
	private JButton loginButton;
	private JButton resetButton;
	
	public LoginView(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setTitle(title);
		this.setVisible(true);
		
		//this.setSize(500, 500);
		//this.setBackground(Color.blue);
		
		//this.setPreferredSize(new Dimension(400, 300));
		this.pack();
		this.setLocationRelativeTo(null);
		
		this.getContentPane().add(getForm());
		setSize(500,400);
		setLocation(500,280);
		
	}
	
	private JPanel getForm() {
		
		JPanel panel = new JPanel(new BorderLayout()); //PREFERRED!
		l1 = new JLabel("Login Form");

        panel.setLayout(null);
        panel.add(l1, BorderLayout.CENTER);
        
        userLabel = new JLabel("Username");
        userNameTextField = new JTextField(15);
        
        passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(15);
        
        loginButton = new JButton("Login");
        
        resetButton = new JButton("Reset");
        
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userNameTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        //showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        
        panel.add(userLabel);
        panel.add(userNameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(resetButton);
        
        // add action listeners
        addActionListeners();
        
        return panel;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Coding Part of LOGIN button
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userNameTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("mehtab") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        
      //Coding Part of RESET button
        if (e.getSource() == resetButton) {
        	userNameTextField.setText("");
            passwordField.setText("");
        }
	}
	
	private void addActionListeners() {
		this.loginButton.addActionListener(this);
		this.resetButton.addActionListener(this);
	}

}
