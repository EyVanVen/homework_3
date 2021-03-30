package homework3.task2;

public class BadPupil extends Pupil{
        public void study(){
            System.out.println("Doing bad work");
        }

        public void read(){
            System.out.println("Reading like a bad student");
        }

        public void write(){
            System.out.println("Writing a bad text");
        }

        public void relax() {
            System.out.println("Relaxing like a terrible kid");
        }
    public void pupilsActions(){
        study();
        read();
        write();
        relax();
    }
}

