package SnakeandLadder;
import java.util.Random;
public class Game {
 public static void main(String[] args) {
	System.out.println("Welcome to Snake and Ladder Game");
	int num=1;
	int pos=0;
	int NumberDieRolled=0;
	
	Random R=new Random();
	while(pos<100) {
	int dienum=R.nextInt(6)+1;
	NumberDieRolled++;
	int value=R.nextInt(10) % 3;
	switch(value) {
	case 0 : break;
	case 1 : if(pos+dienum >100)
	            pos=pos;
           	else
	           pos+=dienum;	
	           break;
	case 2 : pos-=dienum;
	         if(pos<0)
	        	 pos=0;
	         break;
	}
	System.out.println(pos);
	
}
	if(pos==100)
		System.out.println("winner");
	System.out.println(NumberDieRolled);
	
}
}
