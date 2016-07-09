package com.util;

public class BirthDate implements MyDate
{
	private int date;
	private int month;
	private int year;

	public BirthDate(int date,int month, int year)
	{ 
		System.out.println("inside constructor BirthDate(int,int,int)");
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public int getMonth()
	{
		return this.month;
	}
	public int getDate()
	{
		return this.date;
	}
	public int getYear()
	{
		return this.year;
	}

	public boolean equals(Object obj)
	{
		BirthDate bday = (BirthDate)obj;
		if( this.date == bday.date && this.month == bday.month && this.year == bday.year )
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		return "Date: " + getDate() + "Month: " + getMonth() + "Year: " + getYear();  
	}
}
