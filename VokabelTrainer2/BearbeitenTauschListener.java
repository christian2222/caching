/*
 * Created on 10.10.2004
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

public class BearbeitenTauschListener implements ActionListener
{
    public void actionPerformed(ActionEvent ae)
    {
        Data.saveVisualList();
        Data.swipList();
        Data.sort();
        Data.loadVisualList();
	    Values.liste.setSelectedIndex(0);
	    Values.liste.ensureIndexIsVisible(0);

    }
}
