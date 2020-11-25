package cn.oracle.tutorials.interfacesAndinheritance.interfacefun;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SimpleTimeClient implements TimeClient{
	
	private LocalDateTime dateAndTime = LocalDateTime.now();

	@Override
	public void setTime(int hour, int minute, int second) {
		LocalDate currentDate = LocalDate.from(this.dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute,second);
		this.dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}

	@Override
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(year, month, day);
		LocalTime currentTime = LocalTime.from(this.dateAndTime);
		this.dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		LocalDate dateToSet = LocalDate.of(year, month, day);
		LocalTime timeToSet = LocalTime.of(hour, minute,second);
		this.dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return this.dateAndTime;
	}
	
	@Override
	public String toString() {
		return this.dateAndTime.toString();
	}
}
