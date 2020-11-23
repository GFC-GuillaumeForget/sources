package demo;

import java.util.Date;

public class mydemo {
    private String name="";
    private int age=0;

    static public Date testDate(){
        System.out.println("Methode STATIC Date DEBUT");
        return new Date();
    }

    /* coonstructor */
    public mydemo(String name, int age){
        System.out.println("Mon premier message pour ".concat(name));
        this.name = name;
        this.age = age;
    }

    public String giveAllEtudiant(){
        Etudiant etu = new Etudiant(this.name,this.age);
        return etu.getAll();

    }
    public String giveAllEtudiantBachelor3(){
        EtudiantBachelor3 etu = new EtudiantBachelor3(this.name,this.age);
        return etu.getAll();

    }

}
