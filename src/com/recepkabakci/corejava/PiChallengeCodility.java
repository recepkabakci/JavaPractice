package com.recepkabakci.corejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;

public class PiChallengeCodility {

	public static void main(String[] args) {
		Random random = new Random();
		
		HashSet hash= new HashSet();
		String P="recep";
		String Q="akbas";
		int N= P.toCharArray().length;
		char[] newsArray = P.concat(Q).toCharArray();
		String last="";
		for(int i=0;i<N;i++) {
			int randomX = random.nextInt(i);
			last.concat(newsArray[randomX]);		
		}
		for(int i=0;i< vowelArray.length;i++) {
			hash.add(vowelArray[i]);			
		}
		System.out.println(hash.size());
	}

}
