package demo;

public class Etudiant implements IEtudiant  {
    String nom = "";
    int age  = 0 ;

    Etudiant(String nom,int age){
        this.nom = nom;
        this.age = age;
    }

    public String getAll() {
        return nom.concat(" agé de (ans) ").concat(getStringAge()) ;
    }

    public String getStringAge(){
        return String.valueOf(age);
    }

}
