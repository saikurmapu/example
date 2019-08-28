package com.example.satya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.InputMismatchException;

import com.example.sai.UserException;

interface car1 {
	public abstract void cartype(String type);

	public abstract void mileage(int m);

	public abstract void seats(int s);

	void show();
}

class WagonR implements car1 {
	String cartype;
	int mileage;
	int seat;

	@Override
	public void cartype(String type) {
		cartype = type;
	}

	@Override
	public void mileage(int m) {
		mileage = m;
	}

	@Override
	public void seats(int s) {
		seat = s;
	}

	public void show() {
		System.out.println("your choosen cartype name" + " " + cartype + " " + "with mileage" + " " + mileage + " "
				+ "and seats provided" + "  " + seat);
	}
}

class Honda implements car1 {
	String cartype;
	int mileage;
	int seat;

	@Override
	public void cartype(String type) {
		cartype = type;
	}

	@Override
	public void mileage(int m) {
		mileage = m;
	}

	@Override
	public void seats(int s) {
		seat = s;
	}

	public void show() {
		System.out.println("your choosen cartype name" + " " + cartype + " " + "with mileage" + " " + mileage + "  "
				+ "seats provided" + "  " + seat);
	}
}

class Maruthi implements car1 {
	String cartype;
	int mileage;
	int seat;

	@Override
	public void cartype(String type) {
		cartype = type;
	}

	@Override
	public void mileage(int m) {
		mileage = m;
	}

	@Override
	public void seats(int s) {
		seat = s;
	}

	public void show() {
		System.out.println("your choosen cartype name" + " " + cartype + " " + "with mileage" + " " + mileage + "  "
				+ "seats provided" + "  " + seat);
	}
}

public class Car {
	// private static Scanner sc;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException, NumberFormatException, SecurityException, UserException {
		System.out.println("choose cartype");
		System.out.println("1.WagonR 2.Honda 3.Maruthi");
		// int n = Integer.parseInt(br.readLine());
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
			

		} catch (NumberFormatException | IOException e) {
			Car c = new Car();

			throw new UserException(c.getClass().getName(), new Object() {
			}.getClass().getEnclosingMethod().getName(), e);

		}

		// sc = new Scanner(System.in);
		// int n=sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("WagonR");
			WagonR w = new WagonR();
			w.cartype("WagonRR");
			w.mileage(15);
			w.seats(6);
			w.show();
			break;
		case 2:
			System.out.println("Honda");
			Honda h = new Honda();
			h.cartype("Honda");
			h.mileage(20);
			h.seats(5);
			h.show();
			break;
		case 3:
			System.out.println("Maruthi");
			Maruthi m = new Maruthi();
			m.cartype("Maruthi");
			m.mileage(20);
			m.seats(4);
			m.show();
			break;
		default:
			System.out.println("default");
		}
	}
}