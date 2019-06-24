package com.zookeeperone.mammal;

public class Gorilla extends Mammal {
	public int throwSomething(int x) {
		for (int i=1; i<=x; i++) {
		System.out.println("Watch out! The gorilla threw something!");
		}
		energyLevel = energyLevel - (x*5);
		return energyLevel;
	}
	
	public int eatBananas(int banana) {
		System.out.println("Look he's eating bananas for energy to probably throw more stuff at us.");
		energyLevel = energyLevel + (banana*10);
		if (energyLevel > 100)
			energyLevel = 100;
		return energyLevel;
	}
	
	public int climb(int climb) {
		System.out.println("Look, the gorilla is climbing!");
		energyLevel = energyLevel - (climb*10);
		return energyLevel;
	}
	
}
