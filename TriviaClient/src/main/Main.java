package main;

import javax.swing.SwingUtilities;

import view.Login;

public class Main
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{

			@Override
			public void run()
			{
				new Login();
			}
		});
	}
}
