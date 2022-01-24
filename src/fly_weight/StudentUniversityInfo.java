package fly_weight;

public class StudentUniversityInfo {
    String faculty;
    String university;
    Hostel address;

    public StudentUniversityInfo(String faculty, String university, Hostel address) {
        this.faculty = faculty;
        this.university = university;
        this.address = address;
    }
}