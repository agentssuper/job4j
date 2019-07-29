package ru.job4j.nasledovanie;

public class Engineer extends Profession{

    private boolean pencilOrPan;
    //Чем пользуется: карандашом или ручкой

    public boolean isPencilOrPan() {
        return pencilOrPan;
    }

    public void setPencilOrPan(boolean pencilOrPan) {
        this.pencilOrPan = pencilOrPan;
    }

    public Engineer(String name, String surname, String education, String birthday, boolean pencilOrPan){
        super(name, surname, education, birthday);
        this.pencilOrPan = pencilOrPan;
    }

    public void readingPlan(){
        System.out.println("Изучает план проекта");
    }

}



