package homework3.task2;

public class ClassRoom {
    public ClassRoom(Pupil Pupil1, Pupil Pupil2, Pupil Pupil3, Pupil Pupil4){

    }

    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        pupil.pupilsActions();
        badPupil.pupilsActions();
        goodPupil.pupilsActions();
        excelentPupil.pupilsActions();

    }

    public void mainPrint(Pupil Pupil1, Pupil Pupil2, Pupil Pupil3, Pupil Pupil4){
        Pupil1.pupilsActions();
        Pupil2.pupilsActions();
        Pupil3.pupilsActions();
        Pupil4.pupilsActions();
    }
}
