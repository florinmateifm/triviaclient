package model;

import javax.xml.bind.annotation.XmlRootElement;

import view.Gui;

@XmlRootElement
public class Player extends Thread
{
	private int pid;
	private String username;
	private int score;
	private int color;
	private Gui gui;
	
	public Player()
	{
		// TODO Auto-generated constructor stub
	}

	public Player(int pid, String username, int score, int color)
	{
		this.pid = pid;
		this.username = username;
		this.score = score;
		this.color = color;
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getusername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public int getColor()
	{
		return color;
	}

	public void setColor(int color)
	{
		this.color = color;
	}

	public Gui getGui()
	{
		return gui;
	}

	public void setGui(Gui gui)
	{
		this.gui = gui;
	}

}
