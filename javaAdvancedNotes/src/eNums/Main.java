package eNums;

import eNums.Colors.xColors;

public class Main {

	public static void main(String[] args) {

		xColors c1 = xColors.RED;
		
		System.out.println(c1.name());
		System.out.println(c1.getValue());
		
		// Get All Names and Values
		for (xColors allxColors : xColors.values()) {
			System.out.println(allxColors.name() );
			System.out.println("Value: " + allxColors.getValue());
		}

	}

}
