package Menu;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import java.util.Random;
public class ALLCODESGAMES {
	 static Scanner q= new Scanner (System.in);
	   static String menu[] = {"1. 🏃 Start","2. 🚪 Exit"};
       
		int attack=0;
				int dragon2;
		 int dragons=0;
		 
	   Random random = new Random();
		protected static Clip clip;
		
	    static int consoleWidth = Toolkit.getDefaultToolkit().getScreenSize().width;

	    static int cursorPosition = consoleWidth /  9;
	    static int cursorPosition1 = consoleWidth / 10;
	    static int cursorPosition2 = consoleWidth / 10;
	    
	    static String textToPrint = " 🌲 Dougal Adventure's 🌲 ";
	    static String textToPrint1 = "==================================";
	    static String textToPrint2 = "Select an Option:";
	    
	    static int spacesToPrint = cursorPosition - textToPrint.length();
	    static int spacesToPrint1 = cursorPosition1  - menu[0].length();
	    static int spacesToPrint2 = cursorPosition1  - menu[1].length();
	    static int spacesToPrint3 = cursorPosition2  - textToPrint1.length();
	    
	    public static Clip clip221;
	    
	    public void main_menu () {
	  	  
		    try {
		      System.out.print("\033[36m"); // reset color
		      System.out.print("\033[H\033[2J"); // clears the console
		      System.out.print("");
		      
		  	AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("src/GameSound/chillpok.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
			
		      // adjusting setbounds of the output
		      for (int i = 0; i < spacesToPrint3; i++) {
		        System.out.print(" ");
		      }
		      
		      System.out.println(textToPrint1);
		      
		      for (int i = 0; i < spacesToPrint; i++) {
		        System.out.print(" ");
		      }
		      
		      System.out.println(textToPrint);
		      
		      for (int i = 0; i < spacesToPrint3; i++) {
		        System.out.print(" ");
		      }
		      System.out.println(textToPrint1);
		      
		      for (int i = 0; i < spacesToPrint3; i++) {
		        System.out.print(" ");
		      }
		      System.out.println("");
		      for (int i = 0; i < spacesToPrint1; i++) {
		        System.out.print(" ");
		      }
		      System.out.print("\033[32m"); 
		      System.out.println(menu[0]);
		      for (int i = 0; i < spacesToPrint3; i++) {
		        System.out.print(" ");
		      }
		      System.out.println("");
		      for (int i = 0; i < spacesToPrint2; i++) {
		        System.out.print(" ");
		      }
		      System.out.print("\033[33m"); 
		      System.out.println(menu[1]);
		      
		      
		      for (int i = 0; i < spacesToPrint3; i++) {
		        System.out.print(" ");
		      }
		      System.out.println("");
		      
		      for (int i = 0; i < spacesToPrint2; i++) {
		        System.out.print(" ");
		      }
		 
		      System.out.print("\033[36m"); 
		      System.out.println(textToPrint2);
		      int ans = q.nextInt();
		      
		      // scanner validation
		      switch (ans) {
		      
		        case 1:
		        	
		        	// call the void again
		        	ALLCODESGAMES alcode = new ALLCODESGAMES();
					alcode.loading();
		        
		          break;
		        case 2:
		        	// terminate the program
		        	   JOptionPane.showMessageDialog(null, "Program Terminated");
		          System.exit(10);
		          clip.stop();
		       
		          break;
		      }
		    } catch (Exception e) {
		      System.out.println(e.getMessage());
		    }
		    
	    }
	    
	    //void loading
	     public void loading() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	    	 
	    	 System.out.print("\033[32m"); // reset color
	 	    System.out.print("\033[H\033[2J"); // clears the console
	 	    System.out.print("");
	 	    
	 	   clip.stop();
	 	  AudioInputStream audioIn4 = AudioSystem.getAudioInputStream(new File("src/GameSound/loadingsound.wav"));
	       Clip clipl = AudioSystem.getClip();
			clipl.open(audioIn4);
			clipl.loop(Clip.LOOP_CONTINUOUSLY);
			clipl.start();
			
			
	 	    int i = 0;
	 	    while (i < 100) {
	 	    	
	 	      System.out.println("Loading the game please wait... " + i + "%" );
	 	      try {
	 	    	  
	 	        Thread.sleep(10);
	 	        
	 	      } catch (InterruptedException e) {
	 	        e.printStackTrace();
	 	      }
	 	      i++;
	 	    }
	 	   clipl.stop();
	 	    System.out.println("");
	 	    System.out.println("Loading complete.");
	 	    System.out.println("");
	 	    
	 	   ALLCODESGAMES allcodesgames1 = new ALLCODESGAMES();
       	allcodesgames1.Start_of_Adventure();
	 	    
	 	    }
	     
	     //start of the story
	     public void Start_of_Adventure() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	    	 
	    	 //used linkedlist 
	    	 LinkedList<String> myList = new LinkedList<String>();
	    	 
	   	  myList.add("Once Upon a time there is a Dog name Dougal"); //0
	   	  myList.add("He Walks to the beach and found an unknown treasure box"); // 1
	   	  myList.add("When he open it, he found a map that countains a hidden treasure"); // 2
	   	  myList.add("After he got home at night, He ready his stuff to start his expedition tomorrow"); // 3
	   	  myList.add("Today Dougal is ready for his expedition"); // 4
	   	  myList.add("Now the adventures start's"); // 5
	   	 myList.add("He leave his house, and say goodbye to his community"); //6
	   	  
	   	  Object zeroNode = myList.get(0);
	   	  Object firstNode = myList.get(1);
	   	  Object secondNode = myList.get(2);
	   	  Object thirdNode = myList.get(3);
	   	  Object fourthNode = myList.get(4);
	   	  Object fifthNode= myList.get(5);
	   	 Object sixNode= myList.get(6);
	   	  
	   	 String emojis[]= {"🐶 🐾",""};
	   	
	   	  char op=0;
	       // create an AudioInputStream object
	       AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(new File("src/GameSound/chillstart.wav"));

	       // create a Clip object
	       Clip clip1 = AudioSystem.getClip();

	       // open the Clip object
	       clip1.open(audioIn1);

	       // loop the audio file continuously
	       clip1.loop(Clip.LOOP_CONTINUOUSLY);

	       // start the audio file
	       clip1.start();
	       
	       try (Scanner meow = new Scanner(System.in)) {
			try (Scanner c = new Scanner(System.in)) {
				// print a message
				// create an AudioInputStream object
			       AudioInputStream audioIn12 = AudioSystem.getAudioInputStream(new File("src/GameSound/dogwoof.wav"));

			       // create a Clip object
			       Clip clip12 = AudioSystem.getClip();

			       // open the Clip object
			       clip12.open(audioIn12);
			       
			       clip12.start();
				System.out.print("\033[33m");
				System.out.println(emojis[0]);
				
				System.out.print("\033[36m");
				System.out.println(zeroNode );
				
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				System.out.print("\033[36m");
				System.out.println(firstNode);
				AudioInputStream audioIn1277c = AudioSystem.getAudioInputStream(new File("src/GameSound/beachsound.wav"));

			       // create a Clip object
			       Clip clip1277c = AudioSystem.getClip();

			       // open the Clip object
			       clip1277c.open(audioIn1277c);
			       
			       clip1277c.start();
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				System.out.print("\033[36m");
				System.out.println(secondNode);
				AudioInputStream audioIn127c = AudioSystem.getAudioInputStream(new File("src/GameSound/CHESTSOUDN.wav"));

			       // create a Clip object
			       Clip clip127c = AudioSystem.getClip();

			       // open the Clip object
			       clip127c.open(audioIn127c);
			       
			       clip127c.start();
			       
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				System.out.print("\033[36m");
				
				//to stop the sea sound audio
				clip1277c.stop();
				System.out.println(thirdNode);
				
				//night sound audio
				AudioInputStream audioIn127c15 = AudioSystem.getAudioInputStream(new File("src/GameSound/nightsoudn.wav"));

			       // create a Clip object
			       Clip clip127c15 = AudioSystem.getClip();

			       // open the Clip object
			       clip127c15.open(audioIn127c15);
			       
			       clip127c15.start();
			       
				AudioInputStream audioIn127c1 = AudioSystem.getAudioInputStream(new File("src/GameSound/bagsound.wav"));

			       // create a Clip object
			       Clip clip127c1 = AudioSystem.getClip();

			       // open the Clip object
			       clip127c1.open(audioIn127c1);
			       
			       clip127c1.start();
			       
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				//to stop the nightsound
				clip127c15.stop();
				
				System.out.print("\033[36m");
				AudioInputStream audioIn127c11 = AudioSystem.getAudioInputStream(new File("src/GameSound/morningsound.wav"));

			       // create a Clip object
			       Clip clip127c11 = AudioSystem.getClip();

			       // open the Clip object
			       clip127c11.open(audioIn127c11);
			       
			       clip127c11.start();
				System.out.println(fourthNode);
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				System.out.print("\033[36m");
				System.out.println(sixNode);
				System.out.print("\033[32m");
				System.out.println("Type to Continue");
				meow.nextLine();
				
				System.out.print("\033[36m");
				System.out.println(fifthNode);
				System.out.print("\033[32m");
				System.out.println("Type Y/y to Continue");
				op=c.next().charAt(0);
				
				//stop morning sound
				clip127c11.stop();
				
				// stop chillsound
				clip1.stop();
				if (op=='Y'||op=='y') {
					
					ALLCODESGAMES alcode = new ALLCODESGAMES();
			    	alcode.treasure_hunting_quiz();
				}
				else {
					
					System.out.println("Next Time Follow The Instruction OK?");
					
					ALLCODESGAMES alcode = new ALLCODESGAMES();
			    	alcode.treasure_hunting_quiz();
				}
				
			}
		}
	     }
	     
	     public void treasure_hunting_quiz() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    	   
	    	try (// Create a scanner to read user input
			Scanner word = new Scanner(System.in)) {
				// Create an ArrayList of creatures
				 ArrayList<String> creatures = new ArrayList<>();
				 creatures.add("skeleton");
				 creatures.add("zombie");
				 creatures.add("creeper");
				 creatures.add("spider");
				 creatures.add("dragon");

				 // Get the index of the first creature
				 int creat1 = creatures.indexOf("skeleton");
				 int creat2 = creatures.indexOf("zombie");
				 int creat3 = creatures.indexOf("creeper");
				 int creat4 = creatures.indexOf("spider");
				 int creat5 = creatures.indexOf("dragon");
				 
				 // Initialize the skeleton's health
				 int skeleton_hp = 100;
				 int zombie_hp=100;
				 int creeper_hp=100;
				 int spider_hp= 100;
				 int dragon_hp= 1000;
				  
				 int player_turn=0;
				 int enemy_turn=0;

				 // Initialize the player's health
				 int player_hp = 100;
				 
				 // background song for lower lvl
				 final String BATTLESONG_FILE = "src/GameSound/BATTLESONG.wav";
				 
				// create an AudioInputStream object
			       AudioInputStream audioIn123 = AudioSystem.getAudioInputStream(new File("src/GameSound/walksound.wav"));

			       // create a Clip object
			       Clip clip123 = AudioSystem.getClip();

			       // open the Clip object
			       clip123.open(audioIn123);
			       
			       clip123.start();
			       
				 // Start the battle music
				 AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(BATTLESONG_FILE));
				 Clip clip2 = AudioSystem.getClip();
				 clip2.open(audioIn);
				 clip2.loop(Clip.LOOP_CONTINUOUSLY);
				 clip2.start();

				 // The main loop
				 while (skeleton_hp > 0 && player_hp > 0) {
					 
				     // Display the current stage
					 System.out.print("\033[37m");
				     System.out.println("===============================================");
				     
				     System.out.println("Stage:" +1);

				     // Display the creature
				     System.out.println(creatures.get(creat1));

				     // Display the creature's health
				     System.out.print("\033[31m");
				     System.out.println("HP: " + skeleton_hp);

				     // Display the player's health
				     System.out.print("\033[31m");
				     System.out.println("Your HP: " + player_hp);
				     AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(new File("src/GameSound/skeleton_sound.wav"));

				   // create a Clip object
				   Clip clip21 = AudioSystem.getClip();

				   // open the Clip object
				   clip21.open(audioIn1);
				   clip21.start();
				     // Get the user's input
				   System.out.print("\033[37m");
				   
				   //rounds or turn
				   System.out.println("Player Turn:"+player_turn);
				   System.out.println("Enemy Turn:"+enemy_turn);
				   
				     System.out.println("===============================================");
				     
				     System.out.print("\033[32m");
				     
				     System.out.println("Type attack to damage the creature ");
				     
				     System.out.print("\033[31m");
				     
				     //rounds or turn
					   System.out.println("Player Turn:"+player_turn);
					   System.out.println("Enemy Turn:"+enemy_turn);
				     
				     System.out.println("Type heal to heal yourself ");
				     String input = word.nextLine();

				     // If the user attacks
				     if (input.equals("attack")) {
				    	 
				    	 player_turn++;
				    	 
				         // Reduce the creature's health by 10
				    	  AudioInputStream audioIn113 = AudioSystem.getAudioInputStream(new File("src/GameSound/swordsweng.wav"));

				       // create a Clip object
				       Clip clip211 = AudioSystem.getClip();

				       // open the Clip object
				       clip211.open(audioIn113);
				       clip211.start();
				       
				    	 int damageskele = random.nextInt(30 - 10 + 1) + 10;
				    	 skeleton_hp -= damageskele;

				         // Display the creature's new health
				    	  System.out.println("The you damage the creature by" + damageskele);
				         System.out.println("The creature's health is now " + skeleton_hp);
				     }

				     // If the user heals
				     if (input.equals("heal")) {
				    	 // Increase the player's health by 10
				    	 if(player_hp<100){
				    		 
				    		 player_turn++;
				    		 
				    		//start of healing sound effect
				        	 AudioInputStream audioIn1113 = AudioSystem.getAudioInputStream(new File("src/GameSound/healsound.wav"));

				   	  	       // create a Clip object
				   	  	       Clip clip2113 = AudioSystem.getClip();

				   	  	       // open the Clip object
				   	  	       clip2113.open(audioIn1113);
				   	  	       clip2113.start();
				   	  	       
				    		 int healing = random.nextInt(50 - 10 + 1) + 10;
				    		 int randomdamage = random.nextInt(10 - 5 + 1) + 5;
				        	 player_hp += healing;
				        	 player_hp-=randomdamage;
				        	 player_turn++;
				             // Display the player's new health
				             System.out.println("Your health is now " + player_hp);
				            
				         }else{
				        	 System.out.println("You are already at max health");
				         }
				     }

				     // If the user does nothing
				     
				     else {
				    	 System.out.println("Wrong Spelling");
				    	 enemy_turn++;
				    	  AudioInputStream audioIn1134 = AudioSystem.getAudioInputStream(new File("src/GameSound/shootarrow.wav"));
				    		 enemy_turn++;
					       // create a Clip object
					       Clip clip2115 = AudioSystem.getClip();

					       // open the Clip object
					       clip2115.open(audioIn1134);
					       clip2115.start();
				    	 // The zombie attacks
				         int damage0 = random.nextInt(25 - 10 + 1) + 10;
				         player_hp -= damage0;
				         AudioInputStream audioIn1111 = AudioSystem.getAudioInputStream(new File("src/GameSound/screampain.wav"));

				  	       // create a Clip object
				  	       Clip clip21111 = AudioSystem.getClip();

				  	       // open the Clip object
				  	       clip21111.open(audioIn1111);
				  	       clip21111.start();
				         System.out.println("The skeleton attacked you for " + damage0 + " damage!");
				     }
				    

				 }

				//---------------------------------------------------------------------------------------------//
				 // If the zombie is defeated
				//---------------------------------------------------------------------------------------------//
				 
				 if (skeleton_hp <= 0) {
					 
				     // Display a victory message
					 System.out.print("\033[37m");
				     System.out.println("You have defeated the skeleton!");
				     AudioInputStream audioIn111 = AudioSystem.getAudioInputStream(new File("src/GameSound/skeledeath.wav"));

				       // create a Clip object
				       Clip clip2111 = AudioSystem.getClip();

				       // open the Clip object
				       clip2111.open(audioIn111);
				       clip2111.start();
				       
				       AudioInputStream audioIn1243 = AudioSystem.getAudioInputStream(new File("src/GameSound/walksound.wav"));

				       // create a Clip object
				       Clip clip1243 = AudioSystem.getClip();

				       // open the Clip object
				       clip1243.open(audioIn1243);
				       
				       clip1243.start();
				       
				         //---------------------------------------------------------------------------------------------//
				         // zombie function                                                                             //
				         // --------------------------------------------------------------------------------------------//
				     while (zombie_hp > 0 && player_hp > 0) {
				    	 
				    	 AudioInputStream audioIn1111 = AudioSystem.getAudioInputStream(new File("src/GameSound/zombiesound.wav"));

			   	  	       // create a Clip object
			   	  	       Clip clip21111 = AudioSystem.getClip();

			   	  	       // open the Clip object
			   	  	       clip21111.open(audioIn1111);
			   	  	       clip21111.start();
			   	  	       
				         // Display the current stage
			   	  	  System.out.print("\033[32m");
				         System.out.println("===============================================");
				         System.out.println("Stage:"  + 2 );

				         // Display the creature
				         System.out.println(creatures.get(creat2));

				         // Display the creature's health
				         System.out.print("\033[31m");
				         System.out.println("HP: " + zombie_hp);

				         // Display the player's health
				         System.out.println("Your HP: " + player_hp);
				         //rounds or turn
						   System.out.println("Player Turn:"+player_turn);
						   System.out.println("Enemy Turn:"+enemy_turn);
				         // Get the user's input
				         System.out.print("\033[32m");
				         System.out.println("===============================================");
				         System.out.print("\033[37m");
				         System.out.println("Type attack to damage the creature ");
				         System.out.print("\033[31m");
				         System.out.println("Type heal to heal yourself ");
				         String input = word.nextLine();

				         // If the user attacks
				         if (input.equals("attack")) {
				        	 
				        	 player_turn++;
				        	 
				        	 // sword slash background
				        	 AudioInputStream audioIn11 = AudioSystem.getAudioInputStream(new File("src/GameSound/swordsweng.wav"));

				   	  	       // create a Clip object
				   	  	       Clip clip211 = AudioSystem.getClip();

				   	  	       // open the Clip object
				   	  	       clip211.open(audioIn11);
				   	  	       clip211.start();
				   	  	       
				             // Reduce the creature's health by 10
				        	 int damage2 = random.nextInt(30 - 10 + 1) + 10;
				        	 zombie_hp -= damage2;
				        	
				   	  	       
				             // Display the creature's new health
				        	 System.out.print("\033[31m");
				        	 System.out.println("The you damage the creature by" + damage2);
				             System.out.println("The creature's health is now " + zombie_hp);
				         }

				         // If the user heals
				         if (input.equals("heal")) {
				        	 // Increase the player's health by 10
				        	 if(player_hp<100){
				        		 player_turn++;
				        		 //start of healing sound effect
					        	 AudioInputStream audioIn1113 = AudioSystem.getAudioInputStream(new File("src/GameSound/healsound.wav"));

					   	  	       // create a Clip object
					   	  	       Clip clip2113 = AudioSystem.getClip();

					   	  	       // open the Clip object
					   	  	       clip2113.open(audioIn1113);
					   	  	       clip2113.start();
					   	  	       
				        		 int healing = random.nextInt(50 - 10 + 1) + 10;
				            	 player_hp += healing;
				            	 int randomdamage = random.nextInt(10 - 5 + 1) + 5;
				            	 player_hp-=randomdamage;
				            	 
				            	 
				                 // Display the player's new health
				            	 
				            	 System.out.print("\033[31m");
				                 System.out.println("Your health is now " + player_hp);
				                 
				             }else{
				            	 
				            	 System.out.println("You are already at max health");
				             }
				         }

				         // If the user does nothing
				         
				         else {
				        	 
				        	 enemy_turn++;
				        	 
				        	 // The zombie attacks
				             int damage2 = random.nextInt(25 - 10 + 1) + 10;
				             player_hp -= damage2;
				             AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/screampain.wav"));

				   	  	       // create a Clip object
				   	  	       Clip clip211111= AudioSystem.getClip();

				   	  	       // open the Clip object
				   	  	       clip211111.open(audioIn11111);
				   	  	       clip211111.start();
				   	  	       
				   	  	       //display the stat damage of the zombie to the player
				   	  	  System.out.print("\033[31m");
				             System.out.println("The zombie attacked you for " + damage2 + " damage!");
				         }
				        

				     }

				     // If the skeleton is defeated
				     if (zombie_hp <= 0) {
				         // Display a victory message
						 AudioInputStream audioIn11113 = AudioSystem.getAudioInputStream(new File("src/GameSound/zombiedeath.wav"));

					       // create a Clip object
					       Clip clip211116 = AudioSystem.getClip();

					       // open the Clip object
					       clip211116.open(audioIn11113);
					       clip211116.start();
					       
					     // Display a defeat message
					
						 System.out.print("\033[37m");
				         System.out.println("You have defeated the zombie!");
				      
				         
				         //---------------------------------------------------------------------------------------------//
				         // we will add the creeper function here                                                       //
				         // --------------------------------------------------------------------------------------------//
				         
				         AudioInputStream audioIn1111 = AudioSystem.getAudioInputStream(new File("src/GameSound/skeledeath.wav"));

					       // create a Clip object
					       Clip clip21111 = AudioSystem.getClip();

					       // open the Clip object
					       clip21111.open(audioIn1111);
					       clip21111.start();
					       
					       AudioInputStream audioIn12431 = AudioSystem.getAudioInputStream(new File("src/GameSound/walksound.wav"));

					       // create a Clip object
					       Clip clip12431 = AudioSystem.getClip();

					       // open the Clip object
					       clip12431.open(audioIn12431);
					       
					       clip12431.start();
					       
					       clip2.stop();
					       
					       //start the creaper soundtrack
					       AudioInputStream audioIn111119 = AudioSystem.getAudioInputStream(new File("src/GameSound/creepertheme.wav"));

			   	  	       // create a Clip object
			   	  	       Clip clip211111980 = AudioSystem.getClip();

			   	  	       // open the Clip object
			   	  	       clip211111980.open(audioIn111119);
			   	  	       clip211111980.start();
					         //---------------------------------------------------------------------------------------------//
					         // creeper function                                                                             //
					         // --------------------------------------------------------------------------------------------//
					     while (creeper_hp > 0 && player_hp > 0) {
					    
				   	  	       
					    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/creeperhiss.wav"));

				   	  	       // create a Clip object
				   	  	       Clip clip211111 = AudioSystem.getClip();

				   	  	       // open the Clip object
				   	  	       clip211111.open(audioIn11111);
				   	  	       clip211111.start();
				   	  	       
					         // Display the current stage
				   	  	  System.out.print("\033[92m");
					         System.out.println("===============================================");
					         System.out.println("Stage:"  + 3 );

					         // Display the creature
					         System.out.println(creatures.get(creat3));

					         // Display the creature's health
					         System.out.print("\033[97m");
					         System.out.println("HP: " + creeper_hp);

					         // Display the player's health
					         System.out.println("Your HP: " + player_hp);

					         
					         //rounds or turn
							   System.out.println("Player Turn:"+player_turn);
							   System.out.println("Enemy Turn:"+enemy_turn);
							   
							   
					         // Get the user's input
					         System.out.print("\033[92m");
					         System.out.println("===============================================");
					         System.out.print("\033[37m");
					         System.out.println("Type attack to damage the creature ");
					         System.out.print("\033[31m");
					         System.out.println("Type heal to heal yourself ");
					         String input = word.nextLine();

					         // If the user attacks
					         if (input.equals("attack")) {
					        	 
					        	 player_turn++;
					        	 
					        	 // sword slash background
					        	 AudioInputStream audioIn11 = AudioSystem.getAudioInputStream(new File("src/GameSound/swordsweng.wav"));

					   	  	       // create a Clip object
					   	  	       Clip clip211 = AudioSystem.getClip();

					   	  	       // open the Clip object
					   	  	       clip211.open(audioIn11);
					   	  	       clip211.start();
					   	  	       
					             // Reduce the creature's health by 10
					        	 int damage2 = random.nextInt(30 - 10 + 1) + 10;
					        	 creeper_hp -= damage2;
					        	
					   	  	       
					             // Display the creature's new health
					        	 System.out.print("\033[97m");
					        	 System.out.println("The you damage the creature by" + damage2);
					             System.out.println("The creature's health is now " + creeper_hp);
					         }

					         // If the user heals
					         if (input.equals("heal")) {
					        	 // Increase the player's health by 10
					        	 if(player_hp<100){
					        		 
					        		 player_turn++;
					        		 
					        		 //start of healing sound effect
						        	 AudioInputStream audioIn1113 = AudioSystem.getAudioInputStream(new File("src/GameSound/healsound.wav"));

						   	  	       // create a Clip object
						   	  	       Clip clip2113 = AudioSystem.getClip();

						   	  	       // open the Clip object
						   	  	       clip2113.open(audioIn1113);
						   	  	       clip2113.start();
						   	  	       
					        		 int healing = random.nextInt(50 - 10 + 1) + 10;
					            	 player_hp += healing;
					            	 int randomdamage = random.nextInt(10 - 5 + 1) + 5;
					            	 player_hp-=randomdamage;
					            	 
					            	 
					                 // Display the player's new health
					            	 
					            	 System.out.print("\033[31m");
					                 System.out.println("Your health is now " + player_hp);
					                 
					             }else{
					            	 
					            	 System.out.println("You are already at max health");
					             }
					         }

					         // If the user does nothing
					         
					         else {
					        	 
					        	 enemy_turn++;
					        	 
					        	 // The creeper attacks
					             int damage2 = random.nextInt(25 - 10 + 1) + 10;
					             player_hp -= damage2;
					             
					             //creeper sound effect
					             AudioInputStream audioIn111111 = AudioSystem.getAudioInputStream(new File("src/GameSound/screampain.wav"));

					   	  	       // create a Clip object
					   	  	       Clip clip2111111= AudioSystem.getClip();

					   	  	       // open the Clip object
					   	  	       clip2111111.open(audioIn111111);
					   	  	       clip2111111.start();
					   	  	       
					   	  	       //display the stat damage of the zombie to the player
					   	  	  System.out.print("\033[31m");
					             System.out.println("The creeper attacked you for " + damage2 + " damage!");
					         }
					        
					        
					     }
					    
					     // If the creeper is defeated
					     if (creeper_hp <= 0) {
					         // Display a victory message
							 AudioInputStream audioIn111131 = AudioSystem.getAudioInputStream(new File("src/GameSound/creeperboom.wav"));

						       // create a Clip object
						       Clip clip2111161 = AudioSystem.getClip();

						       // open the Clip object
						       clip2111161.open(audioIn111131);
						       clip2111161.start();
						       
						     // Display a defeat message
						       clip211111980.stop();
							 System.out.print("\033[92m");
					         System.out.println("You have defeated the creeper!");
				
							
					         AudioInputStream audioIn1111196 = AudioSystem.getAudioInputStream(new File("src/GameSound/intense.wav"));

					  	       // create a Clip object
					  	       Clip clip2111119 = AudioSystem.getClip();

					  	       // open the Clip object
					  	       clip2111119.open(audioIn1111196);
					  	       clip2111119.start();
					         //---------------------------------------------------------------------------------------------//
					         // we will add the spider function here                                                        //
					         // --------------------------------------------------------------------------------------------//
					         
					         while (spider_hp > 0 && player_hp > 0) {
						
					   	  	       
						    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/spidersound.wav"));

					   	  	       // create a Clip object
					   	  	       Clip clip211111 = AudioSystem.getClip();

					   	  	       // open the Clip object
					   	  	       clip211111.open(audioIn11111);
					   	  	       clip211111.start();
					   	  	       
						         // Display the current stage
					   	  	  System.out.print("\033[31m");
						         System.out.println("===============================================");
						         System.out.println("Stage:"  + 4 );

						         // Display the creature
						         System.out.println(creatures.get(creat4));

						         // Display the creature's health
						         System.out.print("\033[31m");
						         System.out.println("HP: " + spider_hp);

						         // Display the player's health
						         System.out.println("Your HP: " + player_hp);

						         
						         //rounds or turn
								   System.out.println("Player Turn:"+player_turn);
								   System.out.println("Enemy Turn:"+enemy_turn);
								   
								   
								   
						         // Get the user's input
						         System.out.print("\033[31m");
						         System.out.println("===============================================");
						         System.out.print("\033[35m");
						         System.out.println("Type attack to damage the creature ");
						         System.out.print("\033[95m");
						         System.out.println("Type heal to heal yourself ");
						         String input = word.nextLine();

						         // If the user attacks
						         if (input.equals("attack")) {
						        	 
						        	 player_turn++;
						        	 
						        	 // sword slash background
						        	 AudioInputStream audioIn11 = AudioSystem.getAudioInputStream(new File("src/GameSound/swordsweng.wav"));

						   	  	       // create a Clip object
						   	  	       Clip clip211 = AudioSystem.getClip();

						   	  	       // open the Clip object
						   	  	       clip211.open(audioIn11);
						   	  	       clip211.start();
						   	  	       
						             // Reduce the creature's health by 10
						        	 int damage2 = random.nextInt(30 - 10 + 1) + 10;
						        	 spider_hp -= damage2;
						        	
						   	  	       
						             // Display the creature's new health
						        	 System.out.print("\033[97m");
						        	 System.out.println("The you damage the creature by" + damage2);
						             System.out.println("The creature's health is now " +  spider_hp);
						         }

						         // If the user heals
						         if (input.equals("heal")) {
						        	 // Increase the player's health by 10
						        	 if(player_hp<100){
						        		
						        		 player_turn++;
						        		 
						        		 //start of healing sound effect
							        	 AudioInputStream audioIn1113 = AudioSystem.getAudioInputStream(new File("src/GameSound/healsound.wav"));

							   	  	       // create a Clip object
							   	  	       Clip clip2113 = AudioSystem.getClip();

							   	  	       // open the Clip object
							   	  	       clip2113.open(audioIn1113);
							   	  	       clip2113.start();
							   	  	       
						        		 int healing = random.nextInt(50 - 10 + 1) + 10;
						            	 player_hp += healing;
						            	 int randomdamage = random.nextInt(10 - 5 + 1) + 5;
						            	 player_hp-=randomdamage;
						            	 
						            	 
						                 // Display the player's new health
						            	 
						            	 System.out.print("\033[31m");
						                 System.out.println("Your health is now " + player_hp);
						                 
						             }else{
						            	 
						            	 System.out.println("You are already at max health");
						             }
						         }

						         // If the user does nothing
						         
						         else {
						        	 
						        	enemy_turn++;
						        	 
						        	 // The creeper attacks
						             int damage2 = random.nextInt(35 - 10 + 1) + 10;
						             player_hp -= damage2;
						             
						             //creeper sound effect
						             AudioInputStream audioIn111111 = AudioSystem.getAudioInputStream(new File("src/GameSound/screampain.wav"));

						   	  	       // create a Clip object
						   	  	       Clip clip2111111= AudioSystem.getClip();

						   	  	       // open the Clip object
						   	  	       clip2111111.open(audioIn111111);
						   	  	       clip2111111.start();
						   	  	       
						   	  	       //display the stat damage of the zombie to the player
						   	  	  System.out.print("\033[31m");
						             System.out.println("The spider attacked you for " + damage2 + " damage!");
						         }
						        
						        
						     }
						    
						     // If the creeper is defeated
						     if (spider_hp <= 0) {
						         // Display a victory message
								 AudioInputStream audioIn1111310 = AudioSystem.getAudioInputStream(new File("src/GameSound/spiderdeath.wav"));

							       // create a Clip object
							       Clip clip21111610 = AudioSystem.getClip();

							       // open the Clip object
							       clip21111610.open(audioIn1111310);
							       clip21111610.start();
							       
							     // Display a defeat message
							       clip2111119.stop();
								 System.out.print("\033[31m");
						         System.out.println("You have defeated the spider!");
						         @SuppressWarnings("unused")
							
						    	 AudioInputStream audioIn111112 = AudioSystem.getAudioInputStream(new File("src/GameSound/dragonboss.wav"));

					   	  	       // create a Clip object
					   	  	       Clip clip2111112 = AudioSystem.getClip();

					   	  	       // open the Clip object
					   	  	       clip2111112.open(audioIn111112);
					   	  	       clip2111112.start();
						         //---------------------------------------------------------------------------------------------//
						         // we will add the dragon function here                                                        //
						         // --------------------------------------------------------------------------------------------//
						         
						         
						         while (dragon_hp > 0 && player_hp > 0) {
							
							    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/dragongroal.wav"));

						   	  	       // create a Clip object
						   	  	       Clip clip211111 = AudioSystem.getClip();

						   	  	       // open the Clip object
						   	  	       clip211111.open(audioIn11111);
						   	  	       clip211111.start();
						   	  	       
							         // Display the current stage
						   	  	  System.out.print("\033[35m");
							         System.out.println("===============================================");
							         System.out.println("Boss Mode");
							         System.out.print("🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉🐉");
							         System.out.println("Stage:"  + 5 );

							         // Display the creature
							         System.out.println(creatures.get(creat5));

							         // Display the creature's health
							         System.out.print("\033[35m");
							         System.out.println("HP: " + dragon_hp);

							         // Display the player's health
							         System.out.println("Your HP: " + player_hp);

							         //rounds or turn
									   System.out.println("Player Turn:"+player_turn);
									   System.out.println("Enemy Turn:"+enemy_turn);
									   System.out.println("Player Attck:"+attack);
									   System.out.println("Dragon Attck:"+dragons);
									   
							         // Get the user's input
							         System.out.print("\033[35m");
							         System.out.println("===============================================");
							         System.out.print("\033[36m");
							         System.out.println("Type attack to damage the creature ");
							         System.out.print("\033[31m");
							         System.out.println("Type heal to heal yourself ");
							         String input = word.nextLine();

							         // If the user attacks
							         if (input.equals("attack")) {
							        
							        	 
							        	 attack++;
							        	 player_turn++;
							        	 
							        	 // sword slash background
							        	 AudioInputStream audioIn11 = AudioSystem.getAudioInputStream(new File("src/GameSound/swordsweng.wav"));
							        
							        	 
							   	  	       // create a Clip object
							   	  	       Clip clip211 = AudioSystem.getClip();

							   	  	       // open the Clip object
							   	  	       clip211.open(audioIn11);
							   	  	       clip211.start();
							   	  	       
							          
							   	  	 
							             if(attack>=10) {
							            	 int damage21 = 70;
								        	 dragon_hp -= damage21;
							            	 System.out.print("\033[36m");
							            	 System.out.println("Your Attack has been increased to 70");
							            	 System.out.println("The you damage the creature by" + damage21);
								             System.out.println("The creature's health is now " +  dragon_hp);
							             }
							             else {
							            	// Display the creature's new health
								        	 System.out.print("\033[35m");
								        	 int damage2 = random.nextInt(30 - 10 + 1) + 10;
								        	 dragon_hp -= damage2;
								        	 System.out.println("The you damage the creature by" + damage2);
								             System.out.println("The creature's health is now " +  dragon_hp);
							             }
							         }

							         // If the user heals
							         if (input.equals("heal")) {
							        	 // Increase the player's health by 10
							        	 if(player_hp<100){
							        		 
							        		 player_turn++;
							        		 
							        		 //start of healing sound effect
								        	 AudioInputStream audioIn1113 = AudioSystem.getAudioInputStream(new File("src/GameSound/healsound.wav"));

								   	  	       // create a Clip object
								   	  	       Clip clip2113 = AudioSystem.getClip();

								   	  	       // open the Clip object
								   	  	       clip2113.open(audioIn1113);
								   	  	       clip2113.start();
								   	  	       
							        		 int healing = random.nextInt(100 - 10 + 1) + 10;
							            	 player_hp += healing;
							            	 int randomdamage = random.nextInt(10 - 5 + 1) + 5;
							            	 player_hp-=randomdamage;
							            	 
							            	 
							                 // Display the player's new health
							            	 
							            	 System.out.print("\033[31m");
							                 System.out.println("Your health is now " + player_hp);
							                 
							             }else{
							            	 
							            	 System.out.println("You are already at max health");
							             }
							         }

							         // If the user does nothing
							         
							         else {
							        
							        	enemy_turn++;
							        	dragons++;
							        
							        	 // The dragon attacks
							        	 // random damage 
							             int damage2 = random.nextInt(60 - 20 + 5) + 20;
							             player_hp -= damage2;
							             
							             //creeper sound effect
							             AudioInputStream audioIn111111 = AudioSystem.getAudioInputStream(new File("src/GameSound/screampain.wav"));
							        	
							        	 
							   	  	       // create a Clip object
							   	  	       Clip clip2111111= AudioSystem.getClip();

							   	  	       // open the Clip object
							   	  	       clip2111111.open(audioIn111111);
							   	  	       clip2111111.start();
							   	  	       
							   	  	       //display the stat damage of the zombie to the player
							   	  	  AudioInputStream audioIn1111111 = AudioSystem.getAudioInputStream(new File("src/GameSound/fireburn.wav"));
					                   Clip clip21111111 = AudioSystem.getClip();
					                   clip21111111.open(audioIn1111111);
					                   clip21111111.start();
					                   System.out.println("The dragon attack damage has been increased to " + damage2);
                                      
					                   // dialog 1
                                        if(dragons==2) {
                                        	System.out.print("\033[36m");
                                        	 System.out.println("Player: I challenge you, dragon! I will defeat you and claim your treasure");
                             		   	  	 System.out.print("\033[31m");
                                           	  System.out.println(creatures.get(creat5) + ": That's all you got?");
                                           }
                                        
                                        // dialog 2
                                        else if(dragons==5) {
                                        	System.out.print("\033[36m");
                                       	 System.out.println("Player: You may be powerful, but I am the hero of this story! I will not give up until you are defeated!");
                                        	System.out.print("\033[31m");
                                         	  System.out.println(creatures.get(creat5) + ":  You are no match for me, mortal! I will crush you like a bug!");
                                        }
                                        
                                        // dialog 3
                                        else if(dragons==8) {
                                        	System.out.print("\033[36m");
                                          	 System.out.println("Player: Ahhh! i got hit, this dragon is so powerful. I need to find its weakspots before it gets more stronger");
                                          	 
                                        	System.out.print("\033[31m");
                                        	
                                         	  System.out.println(creatures.get(creat5) + ": I am the master of this dungeon! You are nothing but a trespasser! I will destroy you!");
                                        }
                                        
                                        // dialog 4
                                        else if(dragons==10) {
                                        	System.out.print("\033[36m");
                                         	 System.out.println("Player: I am not afraid of you, dragon! I will face you head-on and show you that I am the better warrior!");
                                        	System.out.print("\033[31m");
                                         	  System.out.println(creatures.get(creat5) + ": You think you can defeat me? You are mistaken! I am the most powerful creature in this land!");
                                        }
                                        
                                        // dialog 5
                                        else if(dragons==12) {
                                        	System.out.print("\033[36m");
                                         	 System.out.println("Player: You're going to die!!");
                                        	System.out.print("\033[31m");
                                         	  System.out.println(creatures.get(creat5) + ": Show me who really you are!");
                                        }
						        
							         }
							        
							        
							     }
							    
							     // If the dragon is defeated
							     if (dragon_hp <= 0) {
							         // Display a victory message
									 AudioInputStream audioIn11113101 = AudioSystem.getAudioInputStream(new File("src/GameSound/dragondeath.wav"));

								       // create a Clip object
								       Clip clip211116101 = AudioSystem.getClip();

								       // open the Clip object
								       clip211116101.open(audioIn11113101);
								       clip211116101.start();
								       
								     // Display a defeat message
								       clip2111112.stop();
									 System.out.print("\033[35m");
							         System.out.println("You have defeated the dragon!");
							         @SuppressWarnings("unused")
									String next21 =word.nextLine();
							         
							         //---------------------------------------------------------------------------------------------//
							         // Ending of the Story i think                                                                 //
							         // --------------------------------------------------------------------------------------------//
							         
							         ALLCODESGAMES alcode = new ALLCODESGAMES();
										alcode.Ending();
							         
							     }
						     
							     // If the player is defeated
							     if (player_hp <= 0) {
							    	 
							    	  clip2111112.stop();
							    	 
							    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/deathsound.wav"));

							  	       // create a Clip object
							  	       Clip clip211111 = AudioSystem.getClip();

							  	       // open the Clip object
							  	       clip211111.open(audioIn11111);
							  	       clip211111.start();
							  	       
							  	       
							         // Display a defeat message
							  	 
							         System.out.println("You have been defeated!");
							         
							         ALLCODESGAMES alcode = new ALLCODESGAMES();
							 	    	alcode.Game_over();
							     }
						         
						     }
					     
						     // If the player is defeated
						     if (player_hp <= 0) {
						    	 
						    	 clip2111119.stop();
						    	 
						    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/deathsound.wav"));

						  	       // create a Clip object
						  	       Clip clip211111 = AudioSystem.getClip();

						  	       // open the Clip object
						  	       clip211111.open(audioIn11111);
						  	       clip211111.start();
						  	       
						  	       
						         // Display a defeat message
						  	 
						         System.out.println("You have been defeated!");
						         
						         ALLCODESGAMES alcode = new ALLCODESGAMES();
						 	    	alcode.Game_over();
						     }
					     
						 
					         
					     
					         
					         
					     }
				     
					     // If the player is defeated
					     if (player_hp <= 0) {
					    	 
					    	 clip211111980.stop();
					    	 
					    	 AudioInputStream audioIn11111 = AudioSystem.getAudioInputStream(new File("src/GameSound/deathsound.wav"));

					  	       // create a Clip object
					  	       Clip clip211111 = AudioSystem.getClip();

					  	       // open the Clip object
					  	       clip211111.open(audioIn11111);
					  	       clip211111.start();
					  	    
					  	       
					         // Display a defeat message
					  	 
					         System.out.println("You have been defeated!");
					         
					         ALLCODESGAMES alcode = new ALLCODESGAMES();
					 	    	alcode.Game_over();
					     }
				     
					 
				         
				     }

				     // If the player is defeated
				     if (player_hp <= 0) {
				    	 AudioInputStream audioIn1111 = AudioSystem.getAudioInputStream(new File("src/GameSound/deathsound.wav"));

				  	       // create a Clip object
				  	       Clip clip21111 = AudioSystem.getClip();

				  	       // open the Clip object
				  	       clip21111.open(audioIn1111);
				  	       clip21111.start();
				  	       
				         // Display a defeat message
				    	 clip2.stop();
				         System.out.println("You have been defeated!");
				         
				         ALLCODESGAMES alcode = new ALLCODESGAMES();
				 	    	alcode.Game_over();
				     }
				     
				 }
	    	
				 // If the player is defeated
				 if (player_hp <= 0) {
					 AudioInputStream audioIn1111 = AudioSystem.getAudioInputStream(new File("src/GameSound/deathsound.wav"));

				       // create a Clip object
				       Clip clip21111 = AudioSystem.getClip();

				       // open the Clip object
				       clip21111.open(audioIn1111);
				       clip21111.start();
				       
				     // Display a defeat message
					 clip2.stop();
					 
				     System.out.println("You have been defeated!");
				     ALLCODESGAMES alcode = new ALLCODESGAMES();
					alcode.Game_over();
				 }
			}
	    	 
	    	 
	     }
	     // the story will start talking until the end
	     
	     public void Ending() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    	 clip.stop();
	    	 AudioInputStream audioIn1 = AudioSystem.getAudioInputStream(new File("src/GameSound/chillstart.wav"));
	    	 
	    	    // create a Clip object
	    	    Clip clip1 = AudioSystem.getClip();

	    	    // open the Clip object
	    	    clip1.open(audioIn1);

	    	    // loop the audio file continuously
	    	    clip1.loop(Clip.LOOP_CONTINUOUSLY);

	    	    // start the audio file
	    	    clip1.start();
	    	    LinkedList<String> myList = new LinkedList<String>();
		    	 
	  	   	  myList.add(" Yey I finally Killed the Dragon!!"); //0
	  	   	  myList.add("Now it's time to go into the chest room"); // 1
	  	   	  myList.add("When he open the chest it was full with gold coins and artifacts"); // 2
	  	   	  myList.add("Finally dougal is now very rich and help the people in needs"); // 3
	  	   	  myList.add("Dougal escape the dungeon and go back to his place"); // 4
	  	   	  myList.add("Now he live peacefully , safe and sound"); // 5
	  	   	  myList.add("THE END"); //6
	  	      myList.add("Player"); // 7
	  	      myList.add("Writer"); // 8
	  	   	  
	  	   	  Object zeroNode = myList.get(0);
	  	   	  Object firstNode = myList.get(1);
	  	   	  Object secondNode = myList.get(2);
	  	   	  Object thirdNode = myList.get(3);
	  	   	  Object fourthNode = myList.get(4);
	  	   	  Object fifthNode= myList.get(5);
	  	   	  Object sixNode= myList.get(6);
	  	      Object sevenNode= myList.get(7);
	  	      Object eightnode= myList.get(8);
	    	  Scanner meow = new Scanner(System.in);
	    	  

	    	
                String f, l;
	            System.out.print("\033[33m");
	            System.out.println("==========================================================================");
	            System.out.println(sevenNode + ":" + "" + zeroNode);
	            System.out.println("Type to continue");
	            f=meow.nextLine();
	            
	            System.out.println(sevenNode + ":" + "" + firstNode);
	            System.out.println("Type to continue");
	            f=meow.nextLine();
	            
	            System.out.println(eightnode + ":" + "" + secondNode);
	            System.out.println("Type to continue");
	            f=meow.nextLine();
	            
	            System.out.println(eightnode + ":" + "" + thirdNode);
	            AudioInputStream audioIn127c = AudioSystem.getAudioInputStream(new File("src/GameSound/CHESTSOUDN.wav"));

			       // create a Clip object
			       Clip clip127c = AudioSystem.getClip();

			       // open the Clip object
			       clip127c.open(audioIn127c);
			       
			       clip127c.start();

	            System.out.println("Type to continue");
	            f=meow.nextLine();
	            

					            System.out.println(eightnode + ":" + "" + fourthNode);
	            System.out.println("Type to continue");
	            f=meow.nextLine();
	            
	            System.out.println(eightnode + ":" + "" + fifthNode);
	            System.out.println("Type to continue");
	            f=meow.nextLine();
	           
	            System.out.println(eightnode + ":" + "" + sixNode);
	            System.out.println("Type to C continue");
	            l=meow.nextLine();
	            
	    	    System.out.println("=========================================================================");
	    	
	    	    

	    	    clip1.stop();
	    	    ALLCODESGAMES alcode = new ALLCODESGAMES();
				alcode.credits();	
				
				
			
	     }
	     
	     public void credits() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	    	 clip.stop();
	    	 AudioInputStream audioIn189 = AudioSystem.getAudioInputStream(new File("src/GameSound/happyending.wav"));
	    	 
	    Scanner l = new Scanner (System.in);
	    	    // create a Clip object
	    	    Clip clip12 = AudioSystem.getClip();

	    	    // open the Clip object
	    	    clip12.open(audioIn189);

	    	    // loop the audio file continuously
	    	    clip12.loop(Clip.LOOP_CONTINUOUSLY);

	    	    // start the audio file
	    	    clip12.start();
	    	  LinkedList<String> myList = new LinkedList<String>();
		    	 
	  	   	  myList.add("Developer: WenDevLife"); //0
	  	   	  myList.add("soundtrack"); // 1
	  	   	  myList.add("CREEPER AW MAN - By Captain Sparkle"); // 2
	  	   	  myList.add("The Ender Dragon: Remastered - fan made minecraft boss theme - by Thaetaa-terraainn"); // 3
	  	   	  myList.add("creeper hiss - minecraft"); // 4
	  	   	  myList.add("zombie sound - minecraft"); // 5
	  	   	  myList.add("ingame sound was credit to youtube"); //6
	  	      myList.add("Credits"); // 7
	  	      myList.add("creeper sounds - minecraft"); // 8
	  	      myList.add("Pokemon Littleroot Town - by Pokemon"); // 9
	  	    myList.add("I did not own all of things song instead i put a credit.");
	  	      
	  	  Object zeroNode = myList.get(0);
  	   	  Object firstNode = myList.get(1);
  	   	  Object secondNode = myList.get(2);
  	   	  Object thirdNode = myList.get(3);
  	   	  Object fourthNode = myList.get(4);
  	   	  Object fifthNode= myList.get(5);
  	   	  Object sixNode= myList.get(6);
  	      Object sevenNode= myList.get(7);
  	      Object eightnode= myList.get(8);
  	      Object ninenode= myList.get(9);
  	      Object tenthnode= myList.get(10);
  	      
	  	   
    	    System.out.println("");
    	    System.out.println("==========================================");
    	    System.out.println(sevenNode);
    	    System.out.println("==========================================");
    	    System.out.println(zeroNode);
    	    System.out.println("==========================================");
    	    System.out.println(firstNode);
      	    System.out.println("==========================================");
      	   System.out.println(secondNode);
      	  System.out.println(thirdNode);
      	  System.out.println(fourthNode);
      	  System.out.println(fifthNode);
      	  System.out.println(sixNode);
      	  System.out.println(eightnode);
      	  System.out.println(ninenode);
      	  System.out.println(tenthnode);
      	  System.out.println("Type to 1 to continue play the game");
      	  
	    	int hehe =l.nextInt();
	    	if (hehe==1) {
	    		 clip12.stop();
	    		ALLCODESGAMES alcode = new ALLCODESGAMES();
		    	alcode.main_menu();
	    	}
	    	else {
	    		System.exit(10);
	    	}
	     }
	     
	   //when the player is game over it calls the method
	     public void Game_over() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
	    	 try (Scanner e = new Scanner (System.in)) {
				Toolkit.getDefaultToolkit().getScreenSize();
				
				//game over sound
				 AudioInputStream audioIn11113 = AudioSystem.getAudioInputStream(new File("src/GameSound/gameover.wav"));

			       // create a Clip object
			       Clip clip211116 = AudioSystem.getClip();

			       // open the Clip object
			       clip211116.open(audioIn11113);
			       clip211116.start();
			       
			       // ask the player to try again
			       System.out.print("\033[31m"); 
				    String textToPrint11 = "Game Over";
				    String textToPrint111 = "==================================";
				    String textToPrint21 = "Try Again? Type Y:";
				    
				    textToPrint.length();
				    menu[0].length();
				    textToPrint1.length();
				    
				    char y=0;
				    
				  
						// adjusting setbounds of the  main menu output
					      for (int i = 0; i < spacesToPrint3; i++) {
					        System.out.print(" ");
					      }
					      System.out.println(textToPrint111);
					      
					      for (int i = 0; i < spacesToPrint; i++) {
					        System.out.print(" ");
					      }
					      System.out.println(textToPrint11);
					      
					      for (int i = 0; i < spacesToPrint3; i++) {
					        System.out.print(" ");
					      }
					      System.out.println(textToPrint111);
					      for (int i = 0; i < spacesToPrint3; i++) {
						        System.out.print(" ");
						      }
						      System.out.println("");
						      
						   for (int i = 0; i < spacesToPrint3; i++) {
							        System.out.print(" ");
							  }
							      System.out.println(textToPrint21);
							      y = e.next().charAt(0);
							      switch(y) {
							      case 'Y':
							    	  // go to main menu
							    	ALLCODESGAMES alcode = new ALLCODESGAMES();
							    	alcode.main_menu();
				
							    	break;
							      
							      case 'N':
							    	  // exit the program
							      System.exit(10);
							      break;
							      default:
							      System.out.println("You should select from the option next time");
							      break;
							      
							      }
			} catch (HeadlessException e) {
				e.printStackTrace();
			}
	  	    }

	    //main method
	    public static void main(String[] args) {
	    	
	    	//call the main menu
	    	ALLCODESGAMES alcode = new ALLCODESGAMES();
	    	alcode.main_menu();
	    	

	    }
}
