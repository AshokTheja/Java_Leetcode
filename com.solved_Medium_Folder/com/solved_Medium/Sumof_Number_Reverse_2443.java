package com.solved_Medium;

public class Sumof_Number_Reverse_2443 {

	public static void main(String[] args) {

		Sumof_Number_Reverse_2443 snr = new Sumof_Number_Reverse_2443();
		System.out.println(snr.sumOfNumberAndReverse(0));

	}

	public boolean sumOfNumberAndReverse(int num) {

		if (num == 0) {
			return true;
		}
		
		for (int i = 1; i <= num; i++) {

			if (i + Integer.valueOf(new StringBuilder().append(i).reverse().toString()) == num) {
				return true;
			}

		}

		return false;

	}

}
