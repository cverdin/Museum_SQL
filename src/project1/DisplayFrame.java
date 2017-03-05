package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;


import javax.swing.JPanel;

public class DisplayFrame extends JPanel implements ActionListener  {
	Queue<PeiceOfArt> current;
	public DisplayFrame(){
		
	}
	public DisplayFrame(Queue<PeiceOfArt> poaList){
		current = poaList;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub	
	}
	
	
	
}
