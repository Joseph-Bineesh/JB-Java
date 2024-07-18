package com.jb.feature._2024.july;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class Prng {

	public IntStream getPseudoInts(String algo, int size) {
		return RandomGeneratorFactory.of(algo).create().ints(size,0,1000);
	}
	
	public static void main(String[] args) {
		Prng obj = new Prng();
		obj.getPseudoInts("Random", 100).forEach(i->System.out.println(i));
		
		
	}
}
