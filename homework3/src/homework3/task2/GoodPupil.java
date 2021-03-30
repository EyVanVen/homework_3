package homework3.task2;

public class GoodPupil extends Pupil{
    public void study(){
        System.out.println("Doing good work");
    }

    public void read(){
        System.out.println("Reading like a good student");
    }

    public void write(){
        System.out.println("Writing a good text");
    }

    public void relax() {
        System.out.println("Relaxing like a good kid");
    }
    public void pupilsActions(){
        study();
        read();
        write();
        relax();
    }
}
