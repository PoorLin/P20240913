package com.systex.model;

import java.util.Comparator;

public class MyDate implements Comparable<MyDate> {
	public static final int RASING = 0;
	
	public static final int LOWERING = 1;
	
	private int years;

	private int month;

	private int day;

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public MyDate() {
	}

	public MyDate(int years, int month, int day) {
		super();
		this.years = years;
		this.month = month;
		this.day = day;
	}

	@Override
	public int compareTo(MyDate d) {
		if (this.years > d.years) {
			return 1;
		} else if (this.years == d.years) {

			if (this.month > d.month) {
				return 1;
			} else if (this.month == d.month) {

				if (this.day > d.day) {
					return 1;
				} else if (this.day == d.day) {
					return 0;
				} else {
					return -1;
				}

			} else {
				return -1;
			}

		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "MyDate [years=" + years + ", month=" + month + ", day=" + day + "]";
	}

	public static final Comparator<MyDate> RASING_SORTING = new Comparator<MyDate>() {
		
	
		@Override
		public int compare(MyDate d1, MyDate d2) {
			if (d1.years > d2.years) {
				return 1;
			} else if (d1.years == d2.years) {

				if (d1.month > d2.month) {
					return 1;
				} else if (d1.month == d2.month) {

					if (d1.day > d2.day) {
						return 1;
					} else if (d1.day == d2.day) {
						return 0;
					} else {
						return -1;
					}

				} else {
					return -1;
				}

			} else {
				return -1;
			}
		}
	};
			
	public static final Comparator<MyDate> LOWERING_SORTING = new Comparator<MyDate>() {
		
		@Override
		public int compare(MyDate d1, MyDate d2) {
			if (d1.years < d2.years) {
				return 1;
			} else if (d1.years == d2.years) {

				if (d1.month < d2.month) {
					return 1;
				} else if (d1.month == d2.month) {

					if (d1.day < d2.day) {
						return 1;
					} else if (d1.day == d2.day) {
						return 0;
					} else {
						return -1;
					}

				} else {
					return -1;
				}

			} else {
				return -1;
			}
		}
	};
	
	
}
