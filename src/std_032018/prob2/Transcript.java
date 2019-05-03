package std_032018.prob2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transcript {
List<TranscriptEntry> tentries=new ArrayList<TranscriptEntry>();


Transcript() {
}
public void addTranscriptEntry(LocalDate courseDate,String grade,Course course) {
	tentries.add(new TranscriptEntry(courseDate, grade, course));
}
public List<TranscriptEntry> getTentries() {
	return tentries;
}
public void setTentries(List<TranscriptEntry> tentries) {
	this.tentries = tentries;
}

}
