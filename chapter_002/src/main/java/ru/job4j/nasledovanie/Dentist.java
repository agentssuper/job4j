package ru.job4j.nasledovanie;

public class Dentist extends Doctor{

    private boolean maskOn;
    //Значение true - врачебная маска одета. false - снята.

    public boolean isMaskOn() {
        return maskOn;
    }

    public void setMaskOn(boolean maskOn) {
        this.maskOn = maskOn;
    }

    public Dentist(String name, String surname, String education, String birthday, String diagnose, boolean maskOn){
        super(name, surname, education, birthday, diagnose);
        this.maskOn = maskOn;
    }

	public void pullTooth() {
        System.out.println("Выдирает зуб");
		//Выдиарет зуб пациенту
	}
}

