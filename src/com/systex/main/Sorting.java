package com.systex.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.systex.model.MyDate;

public class Sorting {
	public static void main(String[] args) {

		try {
			int sortNum = Integer.valueOf(args[0]);

			List<MyDate> dates = new ArrayList<>();
			dates.add(new MyDate(1997, 5, 15));
			dates.add(new MyDate(2023, 7, 19));
			dates.add(new MyDate(2028, 11, 23));
			dates.add(new MyDate(2001, 11, 3));
			dates.add(new MyDate(1987, 8, 5));
			dates.add(new MyDate(2023, 7, 17));
			dates.add(new MyDate(2020, 12, 1));
			dates.add(new MyDate(1997, 5, 15));
			dates.add(new MyDate(2028, 12, 23));
			dates.add(new MyDate(1997, 5, 15));
			System.out.println("排序前");
			System.out.println("====================================");

			int count1 = 1;
			for (MyDate date : dates) {
				System.out.print(date + ",");
				if (count1 % 3 == 0) {
					System.out.println("");
				}
				count1++;
			}

			System.out.println("====================================");


			if (MyDate.RASING == sortNum) {
				System.out.println("升冪排序後");
				System.out.println("====================================");
				Collections.sort(dates, MyDate.RASING_SORTING);
				printDate(dates);
			} else if (MyDate.LOWERING == sortNum) {
				System.out.println("降冪排序後");
				System.out.println("====================================");
				Collections.sort(dates, MyDate.LOWERING_SORTING);
				printDate(dates);
			} else {
				System.out.println("請輸入正確的數字 0:升冪 1:降冪");
			}

		} catch (Exception e) {
			System.out.println("輸入值錯誤");
		}

	}

	private static void printDate(List<MyDate> dates) {
		int count = 1;
		for (MyDate date : dates) {
			System.out.print(date + ",");
			if (count % 3 == 0) {
				System.out.println("");
			}
			count++;
		}
	}

}
