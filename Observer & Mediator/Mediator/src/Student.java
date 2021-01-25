public class Student implements User {
    private String name;
    private double mark;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    public void reCheckMessage(){
        System.out.println(name+" has requested for recheck");
    }
}
