package com.boyd.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateTest {

	public static void main(String[] args) {

		for (String s:TimeZone.getAvailableIDs()) {
			System.out.println(s);
		}

		//Ÿ�� ���� �ѱ�ǥ�ؽ÷� �Ѵ�.
		//�������� ������ �׸���ġǥ�ؽð� �ȴ�.
		TimeZone tz = new SimpleTimeZone(9*60*60*1000, "KST"); //+9 hours
		TimeZone.setDefault(tz);


		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		//Calendar date = Calendar.getInstance();
		Calendar date = new GregorianCalendar();

		//TimeZone tzLA = TimeZone.getTimeZone("America/Los_Angeles");
		//TimeZone tzEU = TimeZone.getTimeZone("Europe/Copenhagen");
		//TimeZone tzAU = TimeZone.getTimeZone("Australia/Canberra");
		//TimeZone tzKo = TimeZone.getTimeZone("Asia/Seoul");
		//date.setTimeZone(tzKo);

		System.out.println(date.getTimeZone().getDisplayName());


		//������ ��
		//date.add(Calendar.MONTH, 1);
		//date.set(Calendar.DAY_OF_MONTH, 1);
		//date.add(Calendar.DAY_OF_MONTH , -1);

		//ù°��
		//date.set(Calendar.DAY_OF_MONTH, 1);

		String firstDay = sdf.format(date.getTime());

		System.out.println(firstDay);



		Date m = new Date();
		String dTime = sdf.format(m);
		System.out.println("----------------------------");
		System.out.println(dTime);
		System.out.println("----------------------------");

		String ch = null;
		date.add(Calendar.DAY_OF_MONTH, -7);
		ch = sdf.format(date.getTime());
		System.out.println(ch);

	}

}