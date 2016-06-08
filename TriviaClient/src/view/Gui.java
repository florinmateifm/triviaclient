package view;

import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Player;

public class Gui extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	Vector<JLabel> pieces;
	Player player;

	public Gui(Player player)
	{
		this.player = player;
		setTitle(player.getusername() + " - TRIVIA");
		setBounds(0, 0, 1400, 1000);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1400, 1000);

		pieces = new Vector<JLabel>(15);
		for (int i = 0; i < 15; i++)
		{
			Icon icon = new ImageIcon("res/" + (i + 1) + ".jpeg");
			pieces.add(i, new JLabel(icon));
			pieces.get(i).setOpaque(true);
			pieces.get(i).setBorder(BorderFactory.createLoweredBevelBorder());
			int padding = 0;
			if (i >= 5 && i < 10)
			{
				padding = 1;
			} else if (i >= 10)
			{
				padding = 2;
			}
			pieces.get(i).setBounds(167 * (i % 5) + 10, 195 * padding + 10, 167, 195);
			panel.add(pieces.get(i));
		}

		add(panel);
		setVisible(true);
	}
}
