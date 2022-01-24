package fly_weight;


import java.util.WeakHashMap;

public class StudentCache {
    private static final WeakHashMap<String, StudentUniversityInfo> studentUniversityInfos =
            new WeakHashMap<>();

    public StudentUniversityInfo getStudentUniversityInfo(String name) {
        StudentUniversityInfo studentUniversityInfo = studentUniversityInfos.get(name);
        if (studentUniversityInfo == null) {
            studentUniversityInfo = createStudentInfo(name);
            studentUniversityInfos.put(name, studentUniversityInfo);
        }
        return studentUniversityInfo;
    }

    private StudentUniversityInfo createStudentInfo(String faculty) {
        return switch (faculty) {
            case "Informatic" -> new StudentUniversityInfo(faculty, "New York", new Hostel());
            case "Management" -> new StudentUniversityInfo(faculty, "Los Angeles", new Hostel());
            default -> throw new IllegalArgumentException("No faculty");
        };
    }
}