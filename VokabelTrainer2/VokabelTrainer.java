import javax.swing.*;


import java.awt.*;

/** Dies ist die erste Version des Vokabel-Trainer.
 * 
 * 
 * Diese Programm ben�tigt das Java-Runtime-Environment 1.4.1 (initial)
 * oder eine h�here Version des JRE.
 * Als grafische Schnittstelle wurde Swing gew�hlt.
 */

public class VokabelTrainer
{
	/** einziger Konstruktor dieser Klasse.
	 * 
	 * Diese Klasse, enth�lt die Main-Methode, die gestartet wird.
	 * 
	 */
	public VokabelTrainer()
	{
		init();
	}
	
	private static void init()
	{
		Values.init();
		Visual.init();	
	}
	
	public static void main(String[] args)
	{
		int i = 0;
		i = 1;
		System.out.println(i);
		init();
		
		MainFrame ft = Visual.mainFrame;
		
		
		//
		Container pane = ft.getContentPane();

		JPanel mainPanel = new JPanel();
		pane.add(mainPanel, BorderLayout.CENTER);
		
		// Creating the Status-Panel
		JPanel statusPanel = new JPanel(new BorderLayout());
		statusPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		statusPanel.add(Visual.statusZeile);
		
		//Creating the Menu
		JMenuBar menuBar = Visual.createMenuBar();
		
		ft.setJMenuBar(menuBar);
		
		
		pane.add(statusPanel, BorderLayout.SOUTH);

		ft.setTitle("Vokabel-Trainer   "+Values.loadedFile);
		ft.show();		
	}
}