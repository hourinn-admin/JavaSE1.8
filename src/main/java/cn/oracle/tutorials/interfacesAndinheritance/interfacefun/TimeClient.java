package cn.oracle.tutorials.interfacesAndinheritance.interfacefun;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface TimeClient {
	
	public abstract void setTime(int hour,int minute,int second);
	
	public abstract void setDate(int day,int month,int year);
	
	public abstract void setDateAndTime(int day,int month,int year,int hour,int minute,int second);
	
	abstract public LocalDateTime getLocalDateTime();
	
	default public ZonedDateTime getZonedDateTime(String zoneString) {
		return ZonedDateTime.of(getLocalDateTime(),getZoneId(zoneString));
	};
	
	static public ZoneId getZoneId(String zoneString) {
		return ZoneId.of(zoneString);
	}
}
