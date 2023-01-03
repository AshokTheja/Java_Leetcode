package com.solved_Puzzles;

import java.util.ArrayList;
import java.util.List;

// Program to find an object type with count.
public class ObjType_WithCount {

	static ObjType_WithCount p;

	public static void main(String[] args) {
		List<Object> test = new ArrayList<>();
		int[] test1 = { 1, 1, 2, 3, 3, 2, 2 };

		for (int i : test1) {
			if (test1[i] == 1) {
				p = new Mobile();
				test.add(p);
			} else if (test1[i] == 2) {
				p = new PersonalComputer();
				test.add(p);
			} else if (test1[i] == 3) {
				p = new PersonalTab();
				test.add(p);
			}
		}
		printComputingDevicesCount(test);
	}

	static void printComputingDevicesCount(final List<Object> computingDevices) {
		int Mobiles = 0;
		int PersonalComputers = 0;
		int PersonalTabs = 0;

		for (Object ob : computingDevices) {
			if (ob.getClass() == Mobile.class) {
				Mobiles += 1;
			} else if (ob.getClass() == PersonalComputer.class) {
				PersonalComputers += 1;
			} else if (ob.getClass() == PersonalTab.class) {
				PersonalTabs += 1;
			}
		}

		System.out.println("Mobiles count: " + Mobiles + " PersonalComputers count: " + PersonalComputers
				+ " PersonalTabs: " + PersonalTabs);
	}

}

class Mobile extends ObjType_WithCount {

}

class PersonalComputer extends ObjType_WithCount {

}

class PersonalTab extends ObjType_WithCount {

}
