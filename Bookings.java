package com.TravelsProject;

public class Bookings {
String number;
String fromCity;
String destinationCity;
String seats;
String amount;
String date;

	public Bookings(String number,String fromCity, String destinationCity, String seats, String amount) {
		super();
		this.number=number;
		this.fromCity = fromCity;
		this.destinationCity = destinationCity;
		this.seats = seats;
		this.amount = amount;
	}

	public Bookings() {
		
	}


	@Override
	public String toString() 
	{
		return "Services [number=" + number + ", fromCity=" + fromCity + ", destinationCity=" + destinationCity
				+ ", seats=" + seats + ", amount=" + amount ;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static void main(String[] args) {

	}
	public static final String name = "C:\\Users\\PAVANKALYAN\\Downloads\\Kalyan Banner.txt";
	public static final String paylogo = "C:\\Users\\PAVANKALYAN\\Downloads\\Pay Banner.txt";
	public static final int count = 5;




}
