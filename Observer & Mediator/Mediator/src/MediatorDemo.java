import java.util.Random;
import java.util.Scanner;

public class MediatorDemo {
    public static void main(String[] args) {
        ExamController examController = new ExamController();
        Examiner examiner = new Examiner();
        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");
        Student student4 = new Student("Student4");
        Student student5 = new Student("Student5");

        examController.addStudent(student1);
        examController.addStudent(student2);
        examController.addStudent(student3);
        examController.addStudent(student4);
        examController.addStudent(student5);

        examController.addExaminer(examiner);

        examiner.setExamController(examController);
        Random random = new Random();
        examiner.addNumber(random.nextInt(100));
        examiner.addNumber(random.nextInt(100));
        examiner.addNumber(random.nextInt(100));
        examiner.addNumber(random.nextInt(100));
        examiner.addNumber(random.nextInt(100));
        examController.assignMark(examiner.getMarkByExaminer());
        examController.DisplayMarks();
        examController.MistakeRemoval();
        System.out.println("\n");
        examController.DisplayMarks();
        Scanner scanner = new Scanner(System.in);
        int request = scanner.nextInt();
        Student student = examController.findStudent(request-1);
        student.reCheckMessage();
        examController.RecheckRequest(request-1);
    }
}
