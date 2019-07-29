package ru.job4j.nasledovanie;

public class Programmer extends Engineer{

    private String nameOfProgramm;
    //Имя программы, которую пишет программист.

    public String getNameOfProgramm() {
        return nameOfProgramm;
    }

    public void setNameOfProgramm(String nameOfProgramm) {
        this.nameOfProgramm = nameOfProgramm;
    }

    public Programmer(String name, String surname, String education, String birthday, boolean pencilOrPan, String nameOfProgramm){
        super(name, surname, education, birthday, pencilOrPan);
        this.nameOfProgramm = nameOfProgramm;
    }

    public void makeProgramm(){
        System.out.println("Пишет код программы");
        //пишет код программы
    }
}




