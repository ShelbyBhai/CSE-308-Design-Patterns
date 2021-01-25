import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner implements User {
    public List<Double> getMarkByExaminer() {
        return markByExaminer;
    }
    private List<Double> markByExaminer = new ArrayList<Double>();
    ExamController examController;
    public void setExamController(ExamController examController) {
        this.examController = examController;
    }
    public void addNumber(double number){
        markByExaminer.add(number);
    }
    public void reCheckRequestConfirmation(Student student,int i){
        Random random = new Random();
        boolean test = random.nextBoolean();
        if (test == true){
            double temp = student.getMark();
            int rand = (int)(100-temp);
            double n=temp+random.nextInt(rand);
            examController.updateOfRecheck(n,i);
        }
        else{
            examController.updateOfRecheck(student.getMark(),i);
        }
    }
}
