package lab5_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

 public final class DateRange {
 private final  LocalDate startDate,endDate;
 
 

public DateRange(LocalDate startDate, LocalDate endDate) {
	super();
	this.startDate = startDate;
	this.endDate = endDate;
}
public boolean isInRange(Date mdate) {
	return true;
	
}
@Override
public String toString() {
	return startDate.getMonth()+"/"+startDate.getYear()+" - "+
			endDate.getMonth()+"/"+endDate.getYear();
	
}
static LocalDate getFirstDayOfMonth(LocalDate jd) {
	return jd;
}
static LocalDate getLastDayOfMonth(LocalDate jd) {
	return jd;
}

public LocalDate getStartDate() {
	return startDate;
}

public LocalDate getEndDate() {
	return endDate;
}




}
