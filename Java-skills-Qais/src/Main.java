public class Main {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
    System.out.println("the sentence " + sentence + " has "+ TextProcessor.countWords(sentence)+ " words");
    System.out.println(TextProcessor.replaceWord(sentence,"Java","programming"));

    String text = "John";
    System.out.println(text + " reversed is: "+GradeManager.reverseStudentNames(text));

    System.out.println("The letter grade for 45 is: " + GradeManager.getLetterGrade(45));
    System.out.println("The letter grade for 79 is: " + GradeManager.getLetterGrade(79));



        String[] students = {"Alice","Bob","Charlie","Diana"};
    int[] scores = {95,67,45,78};
    String[] failingStudents = GradeManager.findFailingStudents(students, scores);

    for (int i = 0; i < failingStudents.length; i++) {
        System.out.println(failingStudents[i] + " Has failed!");
    }
    }
}
