package ru.job4j.nasledovanie;

public class Surgeon extends Doctor{

    private int getNumberOfDoctorKnifes;
    //Количество ножей для операции.

    public int getGetNumberOfDoctorKnifes() {
        return getNumberOfDoctorKnifes;
    }

    public void setGetNumberOfDoctorKnifes(int getNumberOfDoctorKnifes) {
        this.getNumberOfDoctorKnifes = getNumberOfDoctorKnifes;   }

    public Surgeon(String name, String surname, String education, String birthday, String diagnose, int getNumberOfDoctorKnifes){
        super(name, surname, education, birthday, diagnose);
        this.getNumberOfDoctorKnifes = getNumberOfDoctorKnifes;
    }

	public void сut(){
        System.out.println("Режет пациента на хирургическом столе");
	}
}


