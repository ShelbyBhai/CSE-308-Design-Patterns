import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamController {
    List<Double> markList = new ArrayList<Double>();
    List<Student> students = new ArrayList<Student>();
    Examiner examiner;

    public void addStudent(Student student){
        students.add(student);
    }

    public void addExaminer(Examiner examiner){
        this.examiner=examiner;
    }
    public void assignMark(List<Double> list){
        System.out.println("scripts and marks of student id 1,2,3,4,5 sent to exam controller office");
        for(int i = 0;i<list.size();i++){
            markList.add(list.get(i));
            students.get(i).setMark(list.get(i));
        }
    }
    public void DisplayMarks(){
        for(int i = 0 ;i<students.size();i++){
            System.out.println("Student " + students.get(i).getName() + " has scored marks: " + students.get(i).getMark());
        }
    }
    public void MistakeRemoval(){
        for (int i = 0;i<students.size();i++){
            Random random = new Random();
            boolean test = random.nextBoolean();
            if (test == true){
                double temp = students.get(i).getMark();
                int rand = (int)(100-temp);
                students.get(i).setMark(students.get(i).getMark()+random.nextInt((rand)));
                markList.set(i,students.get(i).getMark()+random.nextInt((rand)));
                System.out.println(students.get(i).getName()+" previous marks: "+temp+" current marks: "+students.get(i).getMark());
            }
        }
    }
    public void RecheckRequest(int i){
        System.out.println("reexamine request got from "+students.get(i).getName());
        examiner.reCheckRequestConfirmation(students.get(i),i);
    }
    public Student findStudent(int i){
        return students.get(i);
    }
    public void updateOfRecheck(double mark,int i){
        System.out.println("MarkList "+markList.get(i));
        if(markList.get(i)!=mark){
            System.out.println("Marks of student"+i+" has been updated from "+markList.get(i)+" to "+mark);
            markList.set(i,mark);
        }
        else {
            System.out.println("Marks of student"+i+" has not been updated");
        }
    }
}
