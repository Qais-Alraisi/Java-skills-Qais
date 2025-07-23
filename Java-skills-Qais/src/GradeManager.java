public class GradeManager {

    public static String reverseStudentNames(String name) {
        String[] nameArray = name.split("");
        String reversedName = "";
        for (int i = nameArray.length - 1; i >= 0; i--) {
            reversedName += nameArray[i];
        }
        return reversedName;
    }

    public static char getLetterGrade(int score){
        if(score >= 90 && score <= 100){
            return 'A';
        }
        else if(score >= 80 && score <= 89){
            return 'B';
        }
        else if(score >= 70 && score <= 79){
            return 'C';
        }
        else if(score >= 60 && score <= 59){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static String[] findFailingStudents(String[] names, int[]scores){
        int numFailingStudents = 0;
        for (int i = 0; i < names.length; i++) {
            if (scores[i] < 60) {
                numFailingStudents++;
            }
        }
        String[] failingStudents = new String[numFailingStudents];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (scores[i] < 60) {
                failingStudents[index] = names[i];
                index++;
            }
            }

        return failingStudents;
        }
    }


