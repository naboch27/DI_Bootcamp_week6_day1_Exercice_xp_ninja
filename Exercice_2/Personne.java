public class Personne {

    public static void main(String[] args) {
        
        //Declaration des variable

         String nom = "Mouhamed";
         int phone = 0101010101;
         double poids = 50.5;
         char sexe = 'M';
         boolean etat = true;


        //Affichage de tous les variable

        System.out.println("nom : "+nom);
        System.out.println("phone : "+phone);
        System.out.println("poids : "+poids);
        System.out.println("sexe : "+sexe);
        System.out.println("etat : "+etat);


        //Modification des valeur des variables
          nom = "Coulibaly";
         phone = 02020202;
          poids = 60.5;
         sexe = 'F';
          etat = false;

          //Affichage des valeur modifier
          System.out.println("nom : "+nom);
          System.out.println("phone : "+phone);
          System.out.println("poids : "+poids);
          System.out.println("sexe : "+sexe);
          System.out.println("etat : "+etat);


          //Convertion d'un double en int
          int phone_1 = (int)poids;

          System.out.println("convertion : "+phone_1);

          //Somme de deux variable
          double somme = phone +poids;

          //Affichage du resultat
          System.out.println("somme : "+somme);

          //La condition qui verifie si somme des deux variable est superieur a 1000.execute l'instruction 
         
          if(somme>1000){

            System.out.println("somme : "+somme+" est superieur a 1000");
          }
    }

   

    
}
