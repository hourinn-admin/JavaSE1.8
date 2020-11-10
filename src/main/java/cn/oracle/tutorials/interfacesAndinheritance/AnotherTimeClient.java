package cn.oracle.tutorials.interfacesAndinheritance;

import java.time.ZonedDateTime;

public interface AnotherTimeClient extends TimeClient{
	//Redeclare the default method, which makes it abstract.
	public abstract ZonedDateTime getZonedDateTime(String zoneString);
}
