package com.taly.SimpleDotComGame;

import java.util.ArrayList;

/**
 * Created by Taly on 02.03.2018.
 */
class DotCom {
	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public String checkYourself(String userInput){
		String result = "Мимо";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				result = "Потопил";
			}else {
				result = "Попал";
			}
		}
		System.out.println(result);
		return result;
	}
}
