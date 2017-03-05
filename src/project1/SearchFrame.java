package project1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
<<<<<<< HEAD
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
=======
import javax.swing.BorderFactory;
import javax.swing.JButton;
<<<<<<< HEAD
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
<<<<<<< HEAD
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;
import java.sql.*;
import java.util.LinkedList;
import java.util.Queue;
=======
=======
import javax.swing.JFrame;
import javax.swing.JPanel;
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553

@SuppressWarnings("serial")
public class SearchFrame extends JPanel implements ActionListener {

    private JFrame f;
    private JFrame results;
    private JButton exit;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    private JButton search;    
    private JLabel nameLabel;
    private JLabel epochLabel;
    private JLabel artistLabel;
    private JLabel locationLabel;
    private JLabel dateLabel;
    private JTextField name;
    private JTextField epoch;
    private JTextField artist;
    private JTextField location;
    private JTextField date;
    private JCheckBox permanentCollection;
    private JCheckBox borrowed;
    private JCheckBox ongoingExhibition;
<<<<<<< HEAD
=======
=======
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    public SearchFrame(){
    }
    
    public SearchFrame(JFrame frame){
<<<<<<< HEAD
=======
<<<<<<< HEAD
    	
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    	nameLabel = new JLabel("Name: ");
    	epochLabel = new JLabel("Epoch: ");
    	artistLabel = new JLabel("Artist: ");
    	locationLabel = new JLabel("Location: ");
    	dateLabel = new JLabel("Date: ");
    	
    	name = new JTextField("");
    	epoch = new JTextField("");
    	artist = new JTextField("");
    	location = new JTextField("");
    	date = new JTextField("");
    	permanentCollection = new JCheckBox("Permanent Collection?");
<<<<<<< HEAD
    	permanentCollection.setOpaque(false);
    	borrowed = new JCheckBox("Borrowed?");
    	borrowed.setOpaque(false);
    	ongoingExhibition = new JCheckBox("Ongoing Exhibition?");
    	ongoingExhibition.setOpaque(false);
=======
    	borrowed = new JCheckBox("Borrowed?");
    	ongoingExhibition = new JCheckBox("Ongoing Exhibition?");
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    	
    	name.addActionListener(this);
    	epoch.addActionListener(this);
    	artist.addActionListener(this);
    	location.addActionListener(this);
    	date.addActionListener(this);
    	permanentCollection.addActionListener(this);
    	borrowed.addActionListener(this);
    	ongoingExhibition.addActionListener(this);
    	
    	
        setBorder(BorderFactory.createLineBorder(Color.black));
<<<<<<< HEAD
        setBackground(Color.lightGray);
=======
        setBackground(Color.BLACK);
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
        f=frame;
        exit = new JButton("Back");
        exit.setToolTipText("Click to go back to main menu");
        exit.addActionListener(this);

        search = new JButton("Search");
        search.setToolTipText("Click to Search");
        search.addActionListener(this);

<<<<<<< HEAD
=======
=======
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        f=frame;
        exit = new JButton("Give Up");
        exit.setToolTipText("Click to give up and skip this game");
        exit.addActionListener(this);

>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
        Action exitGame = new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        };
        
        this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "exitGame");

        this.getActionMap().put("exitGame",exitGame);
    }
    
    @Override
    public Dimension getPreferredSize() {
<<<<<<< HEAD
        return new Dimension(390,400);
//        return new Dimension(600,400);
=======
        return new Dimension(600,400);
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
          
<<<<<<< HEAD
        exit.setForeground(Color.black);
//        exit.setBackground(Color.black);
        exit.setForeground(Color.black);
        exit.setOpaque(false);
        exit.setBounds(290, 330, 80, 40);
        add(exit);
        
        search.setForeground(Color.black);
        search.setOpaque(false);
//        search.setBackground(Color.black);
        search.setBounds(210, 330, 80, 40);
        add(search);
        
        int baseX = 70;
        int baseY = 10;
        int baseXLabel = 10;
        int baseYLabel = 10;
        int labelWidth = 300;
        int labelHeight = 40;
        int offset = 50;
        
        nameLabel.setBounds(baseXLabel, baseYLabel,labelWidth,labelHeight);
        epochLabel.setBounds(baseXLabel, baseYLabel+offset, labelWidth, labelHeight);
        artistLabel.setBounds(baseXLabel, baseYLabel+offset*2, labelWidth, labelHeight);
        locationLabel.setBounds(baseXLabel, baseYLabel+offset*3, labelWidth, labelHeight);
        dateLabel.setBounds(baseXLabel, baseYLabel+offset*4, labelWidth, labelHeight);
        
        name.setBounds(baseX,baseY,labelWidth,labelHeight);
        epoch.setBounds(baseX,baseY+offset,labelWidth,labelHeight);
        artist.setBounds(baseX,baseY+offset*2,labelWidth,labelHeight);
        location.setBounds(baseX,baseY+offset*3,labelWidth,labelHeight);
        date.setBounds(baseX,baseY+offset*4,labelWidth,labelHeight);
        
        permanentCollection.setBounds(baseXLabel, baseYLabel+offset*5, labelWidth+100, labelHeight);
        borrowed.setBounds(baseXLabel, baseYLabel+offset*6, labelWidth+100, labelHeight);
        ongoingExhibition.setBounds(baseXLabel, baseYLabel+offset*7, labelWidth+100, labelHeight);
        
        add(permanentCollection);
        add(borrowed);
        add(ongoingExhibition);

        add(epochLabel);
        add(nameLabel);
        add(artistLabel);
        add(locationLabel);
        add(dateLabel);

        add(name);
        add(epoch);
        add(artist);
        add(location);
        add(date);
        
    }

    public ResultSet getQuery(String query){
    	Connection conn = null;
    	try{
    	      Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection("jbbc:mysql://localhost:3306/artdb?"+ "user=root&password=password");
    		System.out.println("Running this query "+ query);
    		Statement stmt = conn.createStatement();
    		ResultSet rs = stmt.executeQuery(query);
    		return rs;
    	}
    	catch(SQLException e){
    		System.out.println("SQL Exception:" + e.getMessage());
    		System.out.println("SQL State:" + e.getSQLState());
    		System.out.println("SQL Vendor Error:" + e.getErrorCode());
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		System.out.println("Class.forName Error");
    	}
    	return null;
=======
        exit.setForeground(Color.blue);
        exit.setBackground(Color.black);
<<<<<<< HEAD
        exit.setBounds(510, 330, 80, 40);
        add(exit);
        
        search.setForeground(Color.blue);
        search.setBackground(Color.black);
        search.setBounds(430, 330, 80, 40);
        add(search);
        
        name.setBounds(10,10,150,20);
        add(name);
        
=======
        exit.setBounds(430, 130, 80, 40);
        add(exit);
        
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    	String nameText = "";
    	String epochText = "";
    	String artistText = "";
    	String locationText = "";
    	String dateText = "";
    	boolean permanentCollectionBool = false;
    	boolean borrowedBool = false;
    	boolean ongoingExhibitionBool = false;
    	
    	
    	if(e.getSource()==exit&&exit.isEnabled()){
            exit.setEnabled(false);
            exitGame();
        }
        else if(e.getSource() == search && search.isEnabled()){
        	nameText = name.getText();
        	epochText = epoch.getText();
        	artistText = artist.getText();
        	locationText = location.getText();
        	dateText = date.getText();
        	permanentCollectionBool = permanentCollection.isSelected();
        	borrowedBool = borrowed.isSelected();
        	ongoingExhibitionBool = ongoingExhibition.isSelected();
<<<<<<< HEAD

        	String permanentText ="";
        	String borrowedText = "";
        	String ongoingText ="";
        	
        	if(permanentCollectionBool){
        		permanentText ="1";
        	}
        	if(borrowedBool){
        		borrowedText = "1";
        	}
        	if(ongoingExhibitionBool){
        		ongoingText ="1";
        	}
        	
        	String[][] strings = new String[8][2];
        	strings[0][0]="name";
        	strings[1][0]="epoch";
        	strings[2][0]="artist";
        	strings[3][0]="date";
        	strings[4][0]="location";
        	strings[5][0]="permanent";
        	strings[6][0]="borrowed";
        	strings[7][0]="ongoing";
        	strings[0][1]=nameText;
   			strings[1][1]=epochText;
  			strings[2][1]=artistText;
  			strings[3][1]=dateText;
   			strings[4][1]=locationText;
   			strings[5][1]=permanentText;
   			strings[6][1]=borrowedText;
   			strings[7][1]=ongoingText;
   			String temp ="";
   			Queue<PeiceOfArt> queue = new LinkedList();
   			
   			ResultSet rs = getQuery(createQuery(strings));
        	try {
				while(rs.next()){
					System.out.println(rs.getString("artName"));
//					String s1 = rs.getString("artName");
//					String s2 = rs.getString("epoch");
//					String s3 = rs.getString("type");
//					String s4 = rs.getString("artistName");
//					String s6 = rs.getString("Location");
//					String s5 = rs.getString("year");
//					boolean b1 = rs.getBoolean("permanent");
//					boolean b2 = rs.getBoolean("borrowed");
//					boolean b3 = rs.getBoolean("ongoing");
//					String s7 = rs.getString("image");
//					PeiceOfArt PA = new PeiceOfArt(s1,s2,s3,s4,s6,s5, b1, b2, b3, s7);
//					queue.add(PA);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	while(!queue.isEmpty()){
        		PeiceOfArt temp1 = queue.poll();
        		System.out.println(temp1.artName);
        	}
   			
//        	search();
        }
    }
    
    public String createQuery(String[][] strings){
    	boolean allNull = true;
    	String base = "SELECT * from art Where ";

    	
    	for(int i =0; i<strings.length; i++){
    		if(allNull){
	    		if(strings[i][1].equals("")){
	    		}
	    		else{
	    			allNull = false;
	    			base += strings[i][0] +" = "+strings[i][1];
	    		}
    		}
    		else{
    			if(strings[i][1].equals("")){
	    		}
	    		else{
	    			base +=" AND "+ strings[i][0] +" = "+strings[i][1];
	    		}
    		}
    	}
    	if(allNull){
    		System.out.println("SELECT * from art");
    		return "SELECT * from art";	
    	}
    	System.out.println(base);
    	return base;
    }
    
=======
        }
=======
        if(e.getSource()==exit&&exit.isEnabled()){
            exit.setEnabled(false);
            exitGame();
        }
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    }
>>>>>>> 2f03caeb8f25b55a71212f23363fe54ff7b2a553
    @SuppressWarnings("unused")
	private void search(){
    	results = new JFrame("Results");
    	results.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void exitGame(){
        f.dispose();
        f = new JFrame("Main");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new FirstFrame(f));
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);//center the frame
    }
   
    
}

