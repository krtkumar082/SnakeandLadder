package SnakeandLadder;
import java.util.Random;
public class Game {
 public static void main(String[] args) {
	System.out.println("Welcome to Snake and Ladder Game");
	int num=1;
	int pos=0;
	Random R=new Random();
	int dienum=R.nextInt(6)+1;
	int value=R.nextInt(10) % 3;
	switch(value) {
	case 0 : break;
	case 1 : pos+=dienum;
	           break;
	case 2 : pos-=dienum;
	         break;
	}
	
}
}
