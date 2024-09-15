package com.systex.main;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
	public static void main(String[] args) {
		Set<Integer> nowExist = new HashSet<>();
		boolean isSixNum = true;
		if (args.length != 2) {
			System.out.println("請輸入兩組數字");
		} else {
			for (String wholeStr : args) {
				String[] eachStr = wholeStr.split(",");
				if (eachStr.length != 6) {
					isSixNum = false;
					break;
				} else {
					for (String eachNum : eachStr) {
						nowExist.add(Integer.valueOf(eachNum));
					}

				}
			}
			if (isSixNum) {
				System.out.println("這是您的兩組可重複的樂透號碼");
				getRepeatLotter(nowExist);
				getRepeatLotter(nowExist);
				System.out.println("這是您的兩組不重複的樂透號碼");
				Set<Integer> selectSet = new TreeSet<>();
				getNonRepeatLotter(nowExist, selectSet);
				getNonRepeatLotter(nowExist, selectSet);
			} else {
				System.out.println("請輸入六個數字");
			}

		}
	}

	private static void getNonRepeatLotter(Set<Integer> nowExist, Set<Integer> selectSet) {
		Set<Integer> newSet = new TreeSet<>();
		for (int newNum = 1; newNum < 7; newNum++) {
			int randanNum = ((int) (Math.random() * 49) + 1);
			if (nowExist.contains(randanNum)) {
				newNum--;
			} else {
				if (selectSet.contains(randanNum)) {
					newNum--;
				} else {
					selectSet.add(randanNum);
					newSet.add(randanNum);
				}
			}
		}

		System.out.println(newSet);
	}

	private static void getRepeatLotter(Set<Integer> nowExist) {

		Set<Integer> newSet = new TreeSet<>();
		for (int newNum = 1; newNum < 7; newNum++) {
			int randanNum = ((int) (Math.random() * 49) + 1);
			if (nowExist.contains(randanNum)) {
				newNum--;
			} else {
				if (newSet.contains(randanNum)) {
					newNum--;
				} else {
					newSet.add(randanNum);
				}
			}
		}

		System.out.println(newSet);
	}

}
