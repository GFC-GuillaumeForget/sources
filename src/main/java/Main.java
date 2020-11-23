import demo.mydemo;


public class Main {

    /* Objectif de ce pilote
  - observer le niveau de connaissances des principaux concepts
  A- main/ imports / interfaces
  B- methodes privées publiques, properties, static ou methodes d'instances
  C- réponse synchrone / asynchrone
  - utilisation de l'IDE IntelliJ
  - compilation maven, generation de builds
  D - objectif : composan intégré à un projet EJB suivant
     pour ce faire generer artifact JAR
   */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--BEGIN--Date : ");
        //static call
        System.out.println(mydemo.testDate());

        //instance test
        String myname = "Guillaume";
        mydemo d = new mydemo(myname,25);

        //tests appels objets etudiant
        System.out.println (d.giveAllEtudiant() );
        // attendre 3 sec
        Thread.sleep(3000);
        System.out.println (d.giveAllEtudiantBachelor3());
    }
}