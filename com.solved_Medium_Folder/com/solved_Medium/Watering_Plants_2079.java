package com.solved_Medium;

public class Watering_Plants_2079 {

	public static int wateringPlants(int[] plants, int capacity) {

		int steps = 0;
		int capacityNow = capacity;

		for (int i = 0; i <= plants.length - 1; i++) {

			if (capacityNow >= plants[i]) {
				capacityNow = capacityNow - plants[i];
				steps += 1;
				continue;
			} else {
				steps = steps + (i) + (i);
				capacityNow = capacity;
				i--;
			}

		}

		return steps;

	}

	public static void main(String[] args) {

		int[] plants = { 7, 7, 7, 7, 7, 7, 7 };
		int capacity = 8;

		System.out.println(wateringPlants(plants, capacity));

	}

}
