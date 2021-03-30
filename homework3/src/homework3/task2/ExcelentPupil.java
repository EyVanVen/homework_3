package homework3.task2;

public class ExcelentPupil extends Pupil{
    public void study(){
        System.out.println("Doing excellent work");
    }

    public void read(){
        System.out.println("Reading like an excellent student");
    }

    public void write(){
        System.out.println("Writing an excellent text");
    }

    public void relax() {
        System.out.println("Relaxing like an excellent kid");
    }
    public void pupilsActions(){
        study();
        read();
        write();
        relax();
    }
}
