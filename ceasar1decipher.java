



/*


assisting modules



[1]


https://www.mkyong.com/swing/java-swing-jfilechooser-example/


package com.mkyong.jfileChooser;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser1 {

	public static void main(String[] args) {

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println(selectedFile.getAbsolutePath());
		}

	}

}


[2]




https://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/







package com.mkyong;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("filename.txt"))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);

    }

}



[3]




https://www.tutorialspoint.com/java/number_abs






public class Test { 

   public static void main(String args[]) {
      Integer a = -8;
      double d = -100;
      float f = -90;

      System.out.println(Math.abs(a));
      System.out.println(Math.abs(d));     
      System.out.println(Math.abs(f));    
   }
}







*/



//




/*

Ignore this part .... 

it provide instructions, on how the three step forward cisar cipher works ..... 

###############################################################################

Caesar cipher version 1.00

CEATED BY <tinoC23/> @ 07/2019

###############################################################################

The Caesar cipher is named after Julius Caesar, who used it with a shift of three to protect messages of military significance. 

If he had anything confidential to say, he wrote it in cipher, that is, by so changing the order of the letters of the alphabet, that not a word could be made out. 

If anyone wishes to decipher these, and get at their meaning, he must substitute the fourth letter of the alphabet, namely D, for A, and so with the others.

###############################################################################

  CEASAR CIPHER FLOW
 +++++++++++++++++++
 
 [1] user exeutes the program
 [2] user enters a text in order to be ciphered or user may need to reset the message before the user press the 'cipher' button
 [3] user press the cipher button 
[4] program stores the total number of text lines in an integer
 [5] program store the text to be executed in a string array. Each line of text, is separated/stored in a different array cell
 [6] loop execution initiated
 [7] program goes in each line of the stored text and tokenize the each line words. program stores the total number of words/ lines in an [int] array.
 [8] loop execution terminated
 [9] program initite values to a 2D [string] array. 
        the 2D array values are String [name] [][]= new String [number of text lines][];
	 In a loop, program initiate the word values to the 2D array, as : [name] = new String [number of text lines][number of words per line];
	 create an identical 2d [string] array[][], with the same name space as the primary 2d string array.
[10] loop starts. 
        loop stracture : 
	outer loop turns : 0 to 2D [string] array length - 1
	inner loop 1 turns : 0 to 2D [string] array [][number of words per line]-1
	inner loop 2 turns : 0 to 1D [char] array length-1
	inner loop 3 turns : 0 to 1D [char] array length-1
[11] access each 2D [string] array line
[12] access each word of the 2D [string] array lines
[13] inner loop start
[14] tokenize each line word into characters
[15] count total word characters and parse the number as the length of a 1D [char] array
[16] inner loop end
[17] inner loop 2 start
[18] tokenize each line word into characters. store each line character in the [char] array
[19] inner loop 2 end
[20] inner loop 3 start
[21] cipher each 1d [char] array characters, combine them together, form the ciphered word and store it on the appropriate location of the alternate 2d [string] array
[22] inner loop 3 end
[23] store the alternate 2d [string] array contents(the cipher message) in a text file on computer hard drive 

[error exception handling] -> symbols other than latin alfabet(special symbols, other alfabets than latin one), are not processed by the cipher algoritm 
									 -> numbers, are not processed by the cipher algoritm 

###############################################################################



PROGRAM FLOW THROUGH ARRAYS ::::: 

[1] int linesNumber=0;

[2]  String [] textLinesCarrier=new String[linesNumber];

[3] store text lines to String [] textLinesCarrier <-- for loop 
      
[4] int lineTotalWords=0; --> find after each text line tokkenization 

[5] int [] spacePerLine=new int[linesNumber] <-- each array cell, will include lineTotalWords for error correction ....

[6] String [][] textModules[linesNumber][spacePerLine[i]] --> dynamic array .... 

[7] create an identical array of : String [][] textModules[linesNumber][spacePerLine[i]] --> String [][] textModulesTwinArray[linesNumber][spacePerLine[i]]

	initiate a characters array -> char [] charCarrier=new char[]; 
	
										-> int charNUM=0;
	
										-> char [] charCarrierTwin=new char[];
										
										-> string prseWORD="";

[8] words taken from the String [][] textModules[linesNumber][spacePerLine[i]]  :::

		a) init for loop :  turns -> 0 to linesNumber -> for(int i=0; i<linesNumber ; i++)
		
			b) inner loop of init loop : turns -> for(int y=0; i<textModules[i][pacePerLine[i]].length ; i++) ::: executes text line . Gives the words of each line to it inner for loop
			
				c1) words tokenizer  -> gives the total number of characters in a word through : int charNUM
				
				c2) result is charCarrier=new char[charNUM] ->  charCarrierTwin=new char[charNUM]
				
				c3) words tokenizer -> parse the word characters to char charCarrier[] ;
				
						d1) for loop inside the inner loop -> runs 0 to  charCarrier[].length times ::: for(int z=0; z<charCarrier.length ; z++)
						
									@ cipher each word character with a shift of three patern
									
									@ [error exception handling] -> symbols other than latin alfabet(special symbols, other alfabets than latin one), are not processed by the cipher algoritm 
																		-> numbers, are not processed by the cipher algoritm 
																		
									@ each ciphered word is passed to the  charCarrierTwin[] CHAR ARRAY .....
									
									@ at the charCarrier.length-1 for loop turn 
											
											# the final outcome of the charCarrierTwin[] CHAR ARRAY is converted to a single string/word
								
											# the single string/word is passed to the String [][] textModulesTwinArray[i][spacePerLine[i]]
								
[9] after process [8] completed, the whole data of the String [][] textModulesTwinArray[i][spacePerLine[i]] string array will be exported to a text file, that will contain the ciphered text
	 on a directory of the user terminal. 
								
			
This is the whole process of the ::: shift of three Caesar cipher program ...... ;-) ....... enjoy 




@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

 :::: helping code chunks ::::
 
 [1] Java: Simple way to convert String to Char Array 
				--> it takes as input a line of text(a string) and 
					 outputs a dynamically created char array with the inputed line of text(including the spaces between words),
					 tokenized as a seperate char in the array cells .... 

	url :	https://crunchify.com/java-simple-way-to-convert-string-to-char-array/

package com.crunchify;
 
public class CrunchifyStringToCharArray {
 
	public static void main(String[] args) {
		String testString = "This Is Test";
		char[] stringToCharArray = testString.toCharArray();
 
		for (char output : stringToCharArray) {
			System.out.println(output);
		}
	}
}


@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


FILE JUNK CODE .....

///////////////////////////////////////////////////////////////////////////////////////////////
			
[1]
            
		JLabel saveTHEcontent=new JLabel("set a new path(folder/directory) ....");
	  saveTHEcontent.setBackground(Color.WHITE);
	   saveTHEcontent.setForeground(Color.BLACK);
	 saveTHEcontent.setEnabled(true);
    saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =saveTHEcontent.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           saveTHEcontent.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          saveTHEcontent.setForeground(oldcolor);
         }
      }
      );
	saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		
		//
		
		String fN = JOptionPane.showInputDialog(null, "Please enter your preferred folder/directory/path name : ");
		
		//
		
		FILEname=fN;
		
		//
		
		currentPATHdirectory.setText("current directory path is : "+FILEname);
		
		//
		
		 		
        }
		
      }
      );
       options.add(new JSeparator());//add a seperator line
	 options.add(saveTHEcontent);	
       options.add(new JSeparator());//add a seperator line


///////////////////////////////////////////////////////////////////////////////////////////////

[2]



		//


		public String [] menu=new String[]{"Date"};


	//
	
	public int one = 1 ;
	
	
	//
	
	public JLabel [] fnLabel=new JLabel[one];
		
		//
		
	public JTextField [] fnTF=new JTextField[one];


	  //
	  
	for(int i=0;i<fnLabel.length;i++)
	{
	  
	for(int j=0;j<fnTF.length;j++)
	{
			  
		if(i==0)
		{
				  
			// 
			  
	   fnLabel[i]=new JLabel(menu[i]);
	 fnLabel[i].setHorizontalAlignment(JLabel.CENTER);
	   fnLabel[i].setBackground(Color.WHITE);
	   fnLabel[i].setForeground(Color.BLACK);			
		 fnLabel[i].setFont(f);
		createFILE.add(fnLabel[i]);		  
				  
				//
			
		 fnTF[i]=new JTextField("",45);
	  fnTF[i].setBackground(Color.WHITE);
	  fnTF[i].setForeground(Color.BLACK);			
		fnTF[i].setFont(f);
		createFILE.add(fnTF[i]);
			
		 //     
			  
		}
	  
	}
		
	}


///////////////////////////////////////////////////////////////////////////////////////////////


[3] https://stackoverflow.com/questions/10253409/how-to-read-line-by-line-from-a-text-area

		What you get from TextArea is just a String. Split it at newline and you've got your String[].

for (String line : textArea.getText().split("\\n")) doStuffWithLine(line);


[or]



[4]

				
				
				for (String line : TA.getText().split("\\n"))
				{
					
					out.newLine(); 
					
					out.write(line);
					
				}
				
	


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



[5] https://www.techiedelight.com/convert-char-array-string-java/



// Convert char array to String in Java
class Util
{
	public static void main(String[] args)
	{
		char[] chars = {'T', 'e', 'c', 'h', 'i', 'e', ' ', 
						'D', 'e', 'l', 'i', 'g', 'h', 't'};

		String string = new String(chars);
		System.out.println(string);
	}
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




  get jtextarea text -> tokenize text line by line -> convert each line from string line to char line -> cipher each char separaterly 
  
-> error handling mechanism -> convert char array to string -> store the cipher  string to an array string -> loop the process ->

store final string array to memory ..... 





///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



public int lines = 0 ; // --> j text area lines number 


public String [] JTextAreaCarrier = new String[lines];


public char[] StringToCharCarrier = new char [lines]; 



	public String [] LatinUpperCase=new String[]{"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};  --> cipher text array one
	
	
	
	public String [] LatinLowerCase=new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};  --> cipher text array two



*/


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.lang.Math;

import java.io.BufferedReader;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.io.File;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileSystemView;

import java.text.Format;

import java.util.Formatter;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Calendar;

import java.util.Date;

import java.time.LocalDate;

import java.io.FileWriter;

import java.io.BufferedWriter;

import java.util.*;

import java.util.List;

import java.util.LinkedList;

import java.util.Scanner;

import java.io.*;

import java.util.MissingResourceException;

import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;

import javax.swing.JComboBox;

import java.util.Arrays;

import javax.swing.JCheckBox;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.*;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;

import java.lang.Object;

import java.util.StringTokenizer;

import java.lang.Math;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.*;

import java.util.MissingResourceException;

//

public class ceasar1decipher extends JFrame
{
	
	
	//
	
				
		
	public   String info=" ";
	
	
	//
		
		public String x=" ";
	
	
	
	//
	
	
	
		
		public String keyString=" ";
	
	

	
	
	//
	
	
	public JTextArea TA;
	
	
	
	
	//
	
	
	public  JLabel currentPATHdirectory;
	
	
	//
	
	public String FILEname="C:/decipher.text/";
	
	//
	
	public  Font f = new Font("Serif", Font.BOLD, 14);
	
	//
	
	
	public int lines = 0 ; 		// --> j text area lines number 
	
	//


public String [] JTextAreaCarrier = new String[lines];


//


public char[] StringToCharCarrier; 


//


public String [] JTextAreaCarrierTwin = new String[lines];


//


public char[] StringToCharCarrierTwin; 


//


/*



ISO basic Latin alphabet


Uppercase Latin alphabet	A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z


Lowercase Latin alphabet	a	b	c	d	e	f	g	h	i	j	k	l	m	n	o	p	q	r	s	t	u	v	w	x	y	z



*/


//
	
	
	public String [] LatinUpperCase=new String[]{	"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	//
	
	public String [] LatinLowerCase=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
        //
	
	
	public JFileChooser jfc;
	
	
	//
	
	
	
	public File selectedFile;
	
	
	
	//
	
	
				public FileReader reader;
	
	
	//
	
				
		public BufferedReader br;
	
	
	//
	
	
		
		
		public StringBuilder sb;
		
		
		
		
		//
		
		
	
	
	public ceasar1decipher() // constractor class 
	{
		
		
		
	
		
		
		
		//
		
		// if not exist, create the directory C:/cipher.text/2019/  on the user system ..... 
		
	String [] dirMAP={"C:/decipher.text/","C:/decipher.text/2019/"};
		

	File file1;
	
	
	try
	{
	for(int s=0;s<dirMAP.length;s++)	
	 {
	file1 = new File(dirMAP[s]);
	try{
	if (!file1.exists())
	{
	file1.mkdir();
	}}
	catch(SecurityException se1)
	{
        se1.printStackTrace();
         }        
         }
       }
     catch(SecurityException  se)
        {
	se.printStackTrace();
        }
		
		
		//
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel currentDIRECTORY=new JPanel(); 
		
		
		JPanel createFILE=new JPanel(); 
	
			JPanel jtextareaheader = new JPanel(); 
		
		JPanel currentDIRECTORYjTextArea = new JPanel(); 
		
			JPanel fireJButton = new JPanel(); 
		
		//
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//
	
					header.setLayout(new FlowLayout(FlowLayout.LEFT));    // jmenubar
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			currentDIRECTORY.setLayout(new FlowLayout(FlowLayout.CENTER));    // directory Layout
			currentDIRECTORY.setBackground(Color.GRAY); 
			currentDIRECTORY.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			createFILE.setLayout(new GridLayout(1,2,5,5)); // JLabel and JTextField Layout
		createFILE.setBackground(Color.CYAN);
		createFILE.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
		
			jtextareaheader.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea header ..... 
			jtextareaheader.setBackground(Color.GRAY); 
			jtextareaheader.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
			currentDIRECTORYjTextArea.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea Layout
			currentDIRECTORYjTextArea.setBackground(Color.GRAY); 
			currentDIRECTORYjTextArea.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
					fireJButton.setLayout(new FlowLayout(FlowLayout.CENTER));    // footer layout
			fireJButton.setBackground(Color.GRAY); 
			fireJButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			//
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  // add all layouts in one main layout ..... 
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			//
			
			
			  JMenuBar KBMenuBar = new JMenuBar();
			
			      JMenu  options = new JMenu("MENU");
		options.setForeground(Color.BLACK);
		options.setBackground(Color.WHITE);
		
		
			JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(options);
		 KBMenuBar.add(ABOUT);
		
		
			
			
			//
			
			
			
			
				JLabel deciph=new JLabel("choose a ciphered text, in order to be deciphered");
	  deciph.setBackground(Color.WHITE);
	   deciph.setForeground(Color.BLACK);
	 deciph.setEnabled(true);
    deciph.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =deciph.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           deciph.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          deciph.setForeground(oldcolor);
         }
      }
      );
	deciph.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
					
					
					
	JOptionPane.showMessageDialog(null," \n Choose a ciphered text, in order to be deciphered, \n using the ceasar 3 step decipher !!! \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
					
		
						
		 jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);    // int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) 
		{
			
			 selectedFile = jfc.getSelectedFile();
			
			System.out.println(selectedFile.getAbsolutePath());
			
		}
		
		
					
		 	
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 options.add(deciph);	
	options.add(new JSeparator());//add a seperator line
			

	  

			//
	  
					
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 options.add(EXIT);	
	options.add(new JSeparator());//add a seperator line
      
	  
	  //
	  
	  
	  
	    
      
      		JLabel programAuthor=new JLabel("author");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n program created by: \n <tinoC23/> \n @ 07/2019 \n email : c.constantinou.24@gmail.com \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
	  ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
				
				 //
	  
	  
	    
      
      		JLabel programVsion=new JLabel("about ");
	  programVsion.setBackground(Color.WHITE);
	  programVsion.setForeground(Color.BLACK);
	 programVsion.setEnabled(true);
   programVsion.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programVsion.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programVsion.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programVsion.setForeground(oldcolor);
         }
      }
      );
	programVsion.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n three step caesar decipher - version 1.00 - \n 07/2019 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programVsion);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
	  
	  //
	  
	  
	  	JLabel technologyUSED=new JLabel("technologies used");
	  technologyUSED.setBackground(Color.WHITE);
	  technologyUSED.setForeground(Color.BLACK);
	 technologyUSED.setEnabled(true);
   technologyUSED.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =technologyUSED.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           technologyUSED.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         technologyUSED.setForeground(oldcolor);
         }
      }
      );
	technologyUSED.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Program created by using the following technologies : \n 1) Java JDK version 8 \n 2) SciTE text editor version 4 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(technologyUSED);
	  ABOUT.add(new JSeparator());//add a seperator line
	  
	  
	  //
	  
	  
	  header.add(KBMenuBar);	
	  
	  
	  //
	  
	  
	  
	  
	   currentPATHdirectory=new JLabel("current directory path is : "+FILEname);
	  currentPATHdirectory.setBackground(Color.WHITE);
	  currentPATHdirectory.setForeground(Color.GREEN);			
		currentPATHdirectory.setFont(f);
      currentDIRECTORY.add(currentPATHdirectory);
	  
	  
	  
	  


		
				
		
	      // 
		  
		  
		  
		  
		  
		  
		  
		  /*
		
		
		
		
			TA=new JTextArea(" ");
			TA.setEditable(true);
                     TA.setBounds(5,5,650,350);
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
	       TA.setCaretPosition(TA.getDocument().getLength());
		TA.setFont(new Font("Serif",Font.PLAIN,12));
		TA.addKeyListener(new KeyListener()
			 {
				 
				 
				 //			 
				 
    public void keyReleased(KeyEvent e)
        {
	    
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        } 
	    
	}
    
    //
    
    public void keyPressed(KeyEvent e)
	{
		
		
      int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
			
	char c = e.getKeyChar();
			
	keyString=String.valueOf(c);
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
        } 		
		
	try
	{
		
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        }
	
        }
	catch(StringIndexOutOfBoundsException StringIndexOutOfBoundsException)
	{
		
		StringIndexOutOfBoundsException.printStackTrace();
		
	}
		
	}
    
    //
	    
	                    
			
	public void keyTyped(KeyEvent e) 
	{
			
	}
	
	
			
		//
	    
		
				 
			 });
			 
			 
	JScrollPane scrollPane = new JScrollPane(TA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		 scrollPane.setPreferredSize(new Dimension(650, 350));
		scrollPane.setBounds(5, 5, 650, 350);
                scrollPane.setBorder(BorderFactory.createTitledBorder("Enter the text to be ciphered here ..... "));
		scrollPane.setViewportView(TA);			 


                    jtextareaheader.add(scrollPane);	
			 
		
			  //
			 
			 
			 */
			 
			 
			 //
			 
			 
			 
			 
			 /*
			 
	  
	  
	         JButton reset=new JButton("Reset Fields");
	reset.setBackground(Color.WHITE);
	reset.setForeground(Color.BLACK);			
	reset.setFont(f);
	reset.setEnabled(true);
	reset.setToolTipText("reset button");
	reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
	//
	// reset components :::
	//
	// reset string [] carrier
	// reset char [] carrier 
	// reset jtextarea 
	//
				
				TA.setText("");
			
		// reset components 
				
				
				
			}
		});
      
      
      fireJButton.add(reset);
		
		
		*/
	  
	  
	  //
	  
	  JButton createFile=new JButton("decipher text");
	createFile.setBackground(Color.WHITE);
	createFile.setForeground(Color.BLACK);			
	createFile.setFont(f);
	createFile.setToolTipText("");
	createFile.setEnabled(true);
	  createFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
				
				
				
				
				// file is selectedFile 
				
				
				/*
				
				
				
				package com.mkyong;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample2 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("filename.txt");
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}
				
				
				
				*/
				
				
				
				//
				
				/*
				
				for (String line : TA.getText().split("\\n"))
				{
					
				lines++;
					
				}
				
				*/
				
				//
				
				
				
				
				
				
				
				lines = 0 ; 
				
				
				

        try
		{
			
			
			
			 reader = new FileReader(selectedFile);
			
              br = new BufferedReader(reader);
			

            // read line by line
			
            String line;
			
            while ((line = br.readLine()) != null) 
			{
				
                // sb.append(line).append("\n");
				
					lines++; 
				
            }

        } 
		catch (IOException e1) 
		{
		System.err.format("IOException: %s%n", e1);
        }

    //    System.out.println(sb);
				
				
				
				
				
				

				
			
				
				
				
				
				
				
				
				/*
				
				
				for (String line : TA.getText().split("\\n"))
				{
					
				JTextAreaCarrier[steps]=line;
					
				steps++;
					
				}
				
				
				*/
				
				
				
				int steps=0;
				
				
				
				
				
				JTextAreaCarrier = new String[lines]; // ciphered text carrier
				
				
				
				
				JTextAreaCarrierTwin = new String[lines]; // deciphered text carrier 
				
				
				
				
				
				
				
				
		try
		{

			
						 reader = new FileReader(selectedFile);
			
              br = new BufferedReader(reader);
			
			
            // read line by line
			
            String line;
			
            while ((line = br.readLine()) != null) 
			{
				
                JTextAreaCarrier[steps]=line; // sb.append(line).append(" \n"); // parse text line to string array ....  
					
				steps++;
				
            }

        } 
		catch (IOException e2) 
		{
		System.err.format("IOException: %s%n", e2);
        }
				
				
				
				

				
				
				
				
					System.out.println("\n total jtextarea lines are : "+lines+
				"\n JTextAreaCarrier length is :"+JTextAreaCarrier.length+
				"\n"+JTextAreaCarrierTwin.length);
				
				
				
				
				
				
				for(int i=0;i<JTextAreaCarrier.length;i++)
				{
					
					
					System.out.println(JTextAreaCarrier[i]);
					
					
				}
				
				
				
				
				//  ciphered text decipher operation  .....  :-) 
				
				
				for(int i=0;i<JTextAreaCarrier.length;i++)
				{
					
					
						System.out.println("\n\n i is "+i);
					
					
					
					
					
					StringToCharCarrier = JTextAreaCarrier[i].toCharArray(); // carries the ciphered text letters .... 
					
					
					
					StringToCharCarrierTwin = new char[StringToCharCarrier.length]; // carries the deciphered text letters ..... 
					
					
					
					
					System.out.println("\n"+StringToCharCarrier.length+" , "+StringToCharCarrierTwin.length+"\n"); // character arrays length test .... 
					
					
					
					
						for(int j=0;j<StringToCharCarrier.length;j++)
						{
					
					
							System.out.println(" \n\n j is "+j);

							
							
							
							// null carrier ..... 
							
							
							
							
									for(int k=0;k<LatinUpperCase.length;k++)
									{
					
										System.out.println(" k is "+k);
					
										/*
										
										
										for reference only ..... 
										
										public String [] LatinUpperCase=new String[]{	"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
										public String [] LatinLowerCase=new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
										
										
										
										*/
										
										
										
										
									//	char c1=LatinUpperCase[k].charAt(0);  .... not count ....
										
										
										
										
									//	char c2=LatinLowerCase[k].charAt(0);  .... not count ....
										
										
										
										// decipher algorithm initiation ..... 
										
										// arrays length/range is from 0 to 25 
										
										
										
										
										
										if(LatinUpperCase[k].charAt(0) == StringToCharCarrier[j])
										{
											
											
											
											
										
												
												
											
												
												/*
												
												
												
												
												  three(3)  step  forward  ceasar  decipher  explanation  ......  
												
												
												if ak == 3 to 25  :::  just do ak-3
												
												if ak== o to 2 ::: do ak-3 ; then take the absolute value of k and subtract it from the array length value 
												
												
												
												*/
												
												
												//
												
												/*
												
												
												
												
												  three(3)  step  forward  ceasar  cipher  explanation  ......  
												
												
												
												
												
												why   ak=ak-25-1   ? 
												
												
												
												let assume ak=28;
												
												
												
												that means k=25. that means the letter to be ciphered is the letter Z
												- letter Z is the 26th letter in the latin alphabet, thus the object carried in the cell 25 of the array
												- an array cell begins with the number 0 and goes through the Nth number
												- in our case, the latin alphabet is carried in a string array of 26 places, which provide the cells 0 to 25 for the letters storage
												
												
												The letter Z cipher representation, is the letter C, the letter occupied the cell with number 2.
												thus 28-25=3
												thus 3-1=2
												thus the array cell that carries the correct letter, is the cell number 2.
												
												
												
												*/
												
												
											int ak=0; 
											
											ak=k;
											
											
											System.out.println(ak);
												
												
											if(ak>=3)
											{	
												
												
												
												  ak=ak-3;
												
												System.out.println(ak);
												
											}
											else if(ak<3)
											{
												
												
												 ak=ak-3;
												
												ak=Math.abs(ak);
												
												ak=LatinUpperCase.length-ak;
												
												System.out.println(ak);
												
											}
											
											
											
											StringToCharCarrierTwin[j]=LatinUpperCase[ak].charAt(0);
											
											
											System.out.println(StringToCharCarrierTwin[j]);
											
											
											k=LatinUpperCase.length;
											
											
										}
										else if(LatinLowerCase[k].charAt(0) == StringToCharCarrier[j])
										{
											
											
											int bk=0; 
											
											bk=k;
											
											
											System.out.println(bk);
											
											
											if(bk>=3)
											{	
												
												
												
												  bk=bk-3;
												
												
												
										System.out.println(bk);

												
												
												
											}
											else if(bk<3)
											{
												
												
												 bk=bk-3;
												
												bk=Math.abs(bk);
												
												bk=LatinUpperCase.length-bk;
												
													System.out.println(bk);
												
											}
											
											
											
											StringToCharCarrierTwin[j]=LatinLowerCase[bk].charAt(0);
											
											
											System.out.println(StringToCharCarrierTwin[j]);
											
											
											
												k=LatinUpperCase.length;
											
											
											
										}
 										else if( ( k == ( LatinUpperCase.length-1 ) ) && ( LatinUpperCase[k].charAt(0) != StringToCharCarrier[j] )  && ( LatinLowerCase[k].charAt(0) != StringToCharCarrier[j] )    )
										{
											
										
											StringToCharCarrierTwin[j]=StringToCharCarrier[j];
											
											
											
											System.out.println(StringToCharCarrierTwin[j]);
											
											
											
										}
										
										
										
										
										
					
					
									}
							
							
					
					
						}
						
						
						
						
						
						JTextAreaCarrierTwin[i] = new String(StringToCharCarrierTwin);
						
						
						
					
					
				}
				
				
				
				
				/////////////////
				
				
				
				
				
				
				/*
				
				
				-> storage file reminder ..... 
				
				public String FILEname="C:/cipher.text/";   
				
				
				
			package com.mkyong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

    }

}


Output

2016/11/16 12:08:43
2016/11/16 12:08:43
2016/11/16 12:08:43
2016/11/16
				
				
				
				
				*/
				
				
				
				
				
				
				// Instantiate a Date object
				
				
             Date date = new Date();
	
	
	Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
				
				
				String sometext=FILEname+"three.step.forward.ceasar.decipher."+(formatter.format(date))+".txt";
				

				
				File file = new File(sometext);
								
			
				System.out.println(file);
			


	try
	{
	  if (!file.exists()) 
	{
	     file.createNewFile();
	  }
        }
     catch(IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
	
		
		
		
				
	
	try 
	{
		
		
	
		
	BufferedWriter out = new BufferedWriter(new FileWriter(file));
		    
		
		
		
		
		
		
	
			for(int f=0;f<JTextAreaCarrierTwin.length;f++)		
			{		
				
				out.newLine(); 
				
				out.write(JTextAreaCarrierTwin[f]);
				
			}
				
			
			
			
			out.newLine(); 
	
			
	    
				out.close();
		
		
		
		
		
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
	

		
	//
	// reset components :::
	// reset string [] carrier
	// reset char [] carrier 
	// reset jtextarea 
	//
				
				
		//		TA.setText("");
			
		// reset components 
				
				
		}});		
		
		
		fireJButton.add(createFile);
		
		
		
		
		
		//
	  
		
		
		box.add(header);
		   box.add(currentDIRECTORY);
		   box.add(createFILE);
		box.add(jtextareaheader);
		box.add(currentDIRECTORYjTextArea);
		     box.add(fireJButton);
		     
		     //
		
		JFrame frame=new JFrame(" Three Step Forward Ceasar decipher V1.00");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
		
		
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String [] ceasar1decipher)
	{
		
			
	
		
	JOptionPane.showMessageDialog(null," \n Three Step Forward Ceasar decipher V1.00 \n\n\n  Brief description : \n\n Three Step Forward Ceasar decipher, is a clockwise/forward ciphered text decipher. \n Three Step Forward Ceasar decipher, deciphers a plain text message, \n that was ciphered using a Three Step Forward Ceasar cipher \n\n\n For example, by using a Three Step Forward Ceasar Cipher, \n the letter A will become D if ciphered. \n By using a Three Step Forward Ceasar decipher, the ciphered letter D returns to it initial state, which is the letter A. \n\n\n In any sense ..... \n\n Enjoy !!! \n\n ;-) \n ",
		"INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
		
	
        
		
		new ceasar1decipher();
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




