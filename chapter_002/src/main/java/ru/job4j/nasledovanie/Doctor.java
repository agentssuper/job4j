package ru.job4j.nasledovanie;

public class Doctor extends Profession{

    private String diagnose;

    public Doctor(String name, String surname, String education, String birthday, String diagnose){
        super(name, surname, education, birthday);
        this.diagnose = diagnose;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    //Лечит пациента
    public void heal(String nameOfPatient){
	    System.out.println("Лечит" + nameOfPatient);
     }

}

