package com.solved_Medium;

public class Integer_to_Roman_12 {

	public static String intToRoman(int num) {
		int[] weights={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] tokens={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder rs=new StringBuilder("");
        int start=0;
        while(num>0 && start < weights.length){
            if(num >= weights[start]){
                num = num - weights[start];
                rs.append(tokens[start]);
            }else{
                start++;
            }
        }
        return rs.toString();
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(1234));
	}

}
