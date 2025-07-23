public class Main {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
    System.out.println(TextProcessor.countWords(sentence));
    System.out.println(TextProcessor.replaceWord(sentence,"Java","programming"));

    String text = "John";
    System.out.println(GradeManager.reverseStudentNames(text));

    String[] students = {"Alice","Bob","Charlie","Diana"};
    int[] scores = {95,67,45,78};
    String[] failingStudents = GradeManager.findFailingStudents(students, scores);

    for (int i = 0; i < failingStudents.length; i++) {
        System.out.println(failingStudents[i] + " Has failed!");
    }
    }
}
