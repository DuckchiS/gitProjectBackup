package com.pay.java.calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Calendar n = Calendar.getInstance();
		int y = n.get(Calendar.YEAR);
		int m = n.get(Calendar.MONTH) + 1;
		int d = n.get(Calendar.DAY_OF_MONTH);
		int week = n.get(Calendar.DAY_OF_WEEK);
		
		String strweek = null;
		switch(week) {
		case Calendar.MONDAY:
			strweek = "월요일";
			break;
		case Calendar.THURSDAY:
			strweek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			strweek = "수요일";
			break;
		case Calendar.TUESDAY:
			strweek = "목요일";
			break;
		case Calendar.FRIDAY:
			strweek = "금요일";
			break;
		case Calendar.SATURDAY:
			strweek = "토요일";
			break;
		default:
			strweek = "일요일";
			break;
		}
		
		int amPm = n.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = n.get(Calendar.HOUR);
		int minute = n.get(Calendar.MINUTE);
		int second = n.get(Calendar.SECOND);
		
		System.out.print(y + "년 ");
		System.out.print(m + "월 ");
		System.out.print(d + "일 ");
		System.out.print(strweek + " ");
		System.out.print(strAmPm +" ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = sdf.format(now);
		
		System.out.println(strNow);
		System.out.println(now);
	}
}
