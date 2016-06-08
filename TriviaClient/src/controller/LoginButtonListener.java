package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import view.Login;

public class LoginButtonListener implements ActionListener
{
	Login loginWindow;

	public LoginButtonListener(Login login)
	{
		this.loginWindow = login;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == loginWindow.getLoginButton())
		{
			if (loginWindow.getNameFieldValue() != null && loginWindow.getNameFieldValue().length() > 0)
			{
				Client client = Client.create();
				WebResource webResource;
				String s = null;
				webResource = client.resource("http://localhost:8080/TriviaServer/webapi/myresource/");
				s = webResource.get(String.class);

				System.out.println(s);
			}
		}
	}
}
