package fly_weight;

public class Main {
    public static void main(String[] args) {
        StudentCache cache = new StudentCache();
        StudentUniversityInfo one = cache.getStudentUniversityInfo("Management");
        StudentUniversityInfo two = cache.getStudentUniversityInfo("Management");

        System.out.println(one == two);
    }
}