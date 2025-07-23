public class GradeManager {
    private String _name;

    public String GradeManager(String name) {
        return _name;
    }

    public static String reverseStudentNames(String name) {
        String[] nameArray = name.split("");
        String reversedName = "";
        for (int i = nameArray.length - 1; i >= 0; i--) {
            reversedName += nameArray[i];
        }
        return reversedName;
    }
}