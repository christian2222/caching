/*
 * Created on 04.10.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author chrissy
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.awt.event.*;

public class BearbeitenListener implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
	    Data.sort();
	    Visual.bd.load();
	    Visual.bd.show();
	}
}
