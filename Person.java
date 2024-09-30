import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Person {
    private String name;
    private int birthYear;
    private String MSV;

    public static class teacher {
        public String name;
        public int birthYear;

        public teacher(String name, int birthYear) {
            this.name = name;
            this.birthYear = birthYear;
        }
    }

    public static class Student {
        public String name;
        public int birthYear;
        public String MSV;
        public Student(String name, int birthYear, String MSV) {
            this.name = name;
            this.birthYear = birthYear;
            this.MSV = MSV;
        }
        public String getInfo() {
            return "Name: " + name + ", Birth Year: " + birthYear + ", MSV: " + MSV;
        }
    }

    private static String getInfoteacher(teacher a) {
        return a.name + " " + a.birthYear;
    }
    private static String getInfostudent(Student a) {
        return a.name + " " + a.birthYear + " " + a.MSV;
    }

    public static void main(String[] args) {
        teacher a = new teacher("Nguyen Van A", 1993);
        teacher b = new teacher("Nguyen Van B", 1991);
        Student c = new Student("Nguyen Van C", 2005, "23002000");
        Student d = new Student("Nguyen Van D", 2004, "23002001");
        System.out.printf(getInfoteacher(a));
    }

}