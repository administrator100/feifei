package com.java1995;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour > 24 || hour < 0) {
			Time.this.hour = -1;
		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 60) {
			this.minute = -1;
		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second > 60 || second < 0) {
			this.second = -1;
		}
		this.second = second;
	}
}
