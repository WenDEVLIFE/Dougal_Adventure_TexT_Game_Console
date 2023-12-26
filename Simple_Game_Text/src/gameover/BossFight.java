package gameover;

import javax.sound.sampled.*;

import Menu.ALLCODESGAMES;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BossFight {
    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException, InterruptedException {
       Clip clip2 = null;
        int dragon_hp = 1000;
        int player_hp = 100;
        int dragons = 0;
        int attack = 0;
        Scanner word = new Scanner(System.in);
        Random random = new Random();
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

        int player_turn = 0;
        int enemy_turn = 0;

        int seconds = 10;

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
	         System.out.println("Stage:"  + 4 );

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
                if(dragons==2) {
                	
                	
		   	  	       
              	  System.out.println("That's all you got?");
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
	
			 System.out.print("\033[35m");
	         System.out.println("You have defeated the dragon!");
	         @SuppressWarnings("unused")
			String next21 =word.nextLine();
	         
	         //---------------------------------------------------------------------------------------------//
	         // Ending of the Story i think                                                                 //
	         // --------------------------------------------------------------------------------------------//
	         
	         
	         
	     }
    
	     // If the player is defeated
	     if (player_hp <= 0) {
	 
	    	 
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
}