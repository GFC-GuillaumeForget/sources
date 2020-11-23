package demo;

public class EtudiantBachelor3 extends  Etudiant {
    public static String NIVEAU = "BACHELOR";
    public static Integer BACHELOR_NIVEAU = 3;

    EtudiantBachelor3(String nom,int age){
        //construire Etudiant
        super(nom,age);
    }

    @Override
    public String getAll() {
        return nom.concat(" agé de (ans) ")
                .concat(getStringAge())
                .concat(" - PROFIL : ").concat(this.getTitle());
    }

    private  String getTitle(){
        return NIVEAU.concat(BACHELOR_NIVEAU.toString());
    }
}
