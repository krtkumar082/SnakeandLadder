package SnakeandLadder;
import java.util.Random;
public class Game {
 public static void main(String[] args) {
	System.out.println("Welcome to Snake and Ladder Game");
	int num=2;
	int pos1=0;
	int pos2=0;
	int NumberDieRolled=0;
	int owner=1;
	Random R=new Random();
	while(pos1!=100 && pos2!=100) {
	int dienum=R.nextInt(6)+1;
	NumberDieRolled++;
	int value=R.nextInt(10) % 3;
	switch(value) {
	case 0 : break;
	case 1 :if(owner==1) {
		    if(pos1+dienum >100)
	            pos1=pos1;
           	else
	           pos1+=dienum;
	         }
	        if(owner==2) {
	        	if(pos2+dienum >100)
		            pos2=pos2;
	           	else
		           pos2+=dienum;
	        }
	           break;
	case 2 : if(owner==1) {
		     pos1-=dienum;
	         if(pos1<0)
	        	 pos1=0;}
	         if(owner==2) {
	        	 pos2-=dienum;
		         if(pos2<0)
		        	 pos2=0;
	         }
	         break;
	}
	if(value==1)
		continue;
	if(owner==1)
	 { System.out.println("p1 " +pos1);
	    owner=2;
	    
	 }
	else {
		System.out.println("p2 " +pos2);
	   owner=1;  
	}

	}	
 
	if(pos1==100)
		System.out.println("winner is player 1");
	else
		System.out.println("winner is player 2");
	System.out.println(NumberDieRolled);
	
}
}

