package ru.job4j.nasledovanie;

public class Builder extends Engineer{

    private boolean smokeOrJob;
    //Курит (перекур) или работает

    public boolean isSmokeOrJob() {
        return smokeOrJob;
    }

    public void setSmokeOrJob(boolean smokeOrJob) {
        this.smokeOrJob = smokeOrJob;
    }

    public Builder(String name, String surname, String education, String birthday, boolean pencilOrPan, boolean smokeOrJob){
        super(name, surname, education, birthday, pencilOrPan);
        this.smokeOrJob = smokeOrJob;
    }

	public void workWithShovel() {
        System.out.println("Копает лопатой");
    }
}


