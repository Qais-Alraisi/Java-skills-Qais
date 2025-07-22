public class GradeManager {
    private String _name;

    public String GradeManager(String name){
        return _name;
    }

    public static String[] reverseStudentNames (String[] names){
        String[] reversedNames = new String[names.length];
        for(int i=0; i<names.length();i++){
            reversedNames[i] = names[-i];
        }
        return reversedNames;
    }
}
