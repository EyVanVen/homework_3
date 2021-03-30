package homework3;

import homework3.add_task.Printer;
import homework3.task2.*;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task3.Саr;
import homework3.task4.DocumentWorker;
import homework3.task4.ExpertDocumentWorker;
import homework3.task4.ProDocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {
        Pupil pupil = new Pupil();
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        ClassRoom room = new ClassRoom(pupil, badPupil, goodPupil, excelentPupil);
        room.mainPrint(pupil, badPupil, goodPupil, excelentPupil);
        System.out.println("");
        System.out.println("==============================================================================");
    }

    void startTask3() {
        Plane plane = new Plane();
        Ship ship = new Ship();
        Саr car = new Саr();

        plane.toString();
        ship.toString();
        car.toString();
        System.out.println("");
        System.out.println("==============================================================================");
    }

    void startTask4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ключа доступа");
        int accessKey = in.nextInt();
        if (accessKey == 0000){
            System.out.println("Добро пожаловать, expert user!");
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();
        }
        else if (accessKey == 1111){
            System.out.println("Добро пожаловать, pro user!");
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        }
        else {
            System.out.println("Добро пожаловать, user!");
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
        System.out.println("");
        System.out.println("==============================================================================");


    }

    void startAddTask() {
    }
}
