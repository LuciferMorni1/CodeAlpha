package AttendanceManagementSystem;
import java.time.LocalDate;

public class Attendance {
    private LocalDate date;
    private boolean isPresent;

    public Attendance(LocalDate date, boolean isPresent) {
        this.date = date;
        this.isPresent = isPresent;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isPresent() {
        return isPresent;
    }

    @Override
    public String toString() {
        return "Attendance [date=" + date + ", isPresent=" + isPresent + "]";
    }
}
