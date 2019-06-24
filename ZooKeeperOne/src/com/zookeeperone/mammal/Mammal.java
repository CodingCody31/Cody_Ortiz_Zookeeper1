package com.zookeeperone.mammal;

public class Mammal {
		int energyLevel = 100;
		public int displayEnergy() {
			System.out.println("Current energy level is: " + energyLevel + "%");
			return energyLevel;
		}
}
