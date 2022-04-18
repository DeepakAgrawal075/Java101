enum CourseCode {
    DS_530, DS_542, DS_590, DS_610, DS_642;
    @Override
    public String toString() {
        return switch (this) {
            case DS_530 -> "DS-530 : Big Data & Data Management";
            case DS_542 -> "DS-542 : Python in Data Science.";
            case DS_590 -> "DS-590 : Data Structures & Algorithms.";
            case DS_610 -> "DS-610 : Big Data Analytics.";
            case DS_642 -> "DS-642 : Advanced Python in Data Science.";
        };
    }
}
public class EnumWithSwitch {
    public static void main(String[] args) {
        System.out.println(CourseCode.DS_530);
        System.out.println(CourseCode.DS_542);
        System.out.println(CourseCode.DS_590);
        System.out.println(CourseCode.DS_610);
        System.out.println(CourseCode.DS_642);
    }
}