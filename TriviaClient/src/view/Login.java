package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.LoginButtonListener;

public class Login extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel panel;
	JTextField nameField;
	JLabel nameLabel;
	JButton loginButton;

	public Login()
	{
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		nameLabel = new JLabel("Insert your name!");
		nameLabel.setOpaque(true);
		nameLabel.setForeground(Color.black);
		nameField = new JTextField(30);
		nameField.setSize(200, 100);
		loginButton = new JButton("LOGIN");
		loginButton.setBackground(Color.lightGray);
		loginButton.setForeground(Color.DARK_GRAY);

		LoginButtonListener listener = new LoginButtonListener(this);
		loginButton.addActionListener(listener);

		this.getContentPane().add(panel, BorderLayout.CENTER);

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(loginButton);

		this.setTitle("Login");
		this.setSize(800, 500);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setResizable(false);

		KeyListener kl = new KeyListener()
		{

			@Override
			public void keyTyped(KeyEvent e)
			{
			}

			@Override
			public void keyReleased(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					loginButton.doClick();
				}
			}

			@Override
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					e.consume();
				}
			}
		};

		nameField.addKeyListener(kl);
	}

	public JButton getLoginButton()
	{
		return loginButton;
	}

	public String getNameFieldValue()
	{
		return nameField.getText();
	}
}
