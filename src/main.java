/**
 * Created by DufVi1731300 on 2018-01-22.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean continuer = true;
        int entree = 0, contactActuel = 0;
        String rouge = (char)27 + "[31m";
        char entreeChar = ' ';

        Scanner sc = new Scanner(System.in);
        Contact ct[] = new Contact[20];

        System.out.println("Bienvenue!\n");
        while (continuer) {
            System.out.print("1- Ajouter un contact\n" +
                    "2- Modifier un contact\n" +
                    "3- Afficher les contacts\n" +
                    "4- Quitter\n" +
                    "> ");
            entree = sc.nextInt();
            if (entree == 3) entree = 1;
            switch (entree) {
                case 1:  //Tout mettre en nextLine()
                    contactActuel = Contact.nbContacts;
                    ct[contactActuel] = new Contact();
                    System.out.print("\nCe contact sera entré à la position #" + Contact.nbContacts + ".\n" +
                            "Veuillez entrer les informations suivantes (* si vide, _ pour un espace):\n" +
                            "Prénom: " + ct[contactActuel].getPrenom());
                    ct[contactActuel].setPrenom(sc.next());
                    System.out.print("Nom: " + ct[contactActuel].getNom());
                    ct[contactActuel].setNom(sc.next());
                    System.out.print("Adresse:\n");
                    if (ct[contactActuel].ad.getNumeroCivique() != 0) System.out.print(" Numéro civique: " + ct[contactActuel].ad.getNumeroCivique());
                    else System.out.print(" Numéro civique: ");
                    ct[contactActuel].ad.setNumeroCivique(sc.nextInt());
                    System.out.print(" Rue: " + ct[contactActuel].ad.getRue());
                    ct[contactActuel].ad.setRue(sc.next());
                    System.out.print(" Appartement: " + ct[contactActuel].ad.getAppartement());
                    ct[contactActuel].ad.setAppartement(sc.next());
                    System.out.print(" Ville: " + ct[contactActuel].ad.getVille());
                    ct[contactActuel].ad.setVille(sc.next());
                    System.out.print(" Province: " + ct[contactActuel].ad.getProvince());
                    ct[contactActuel].ad.setProvince(sc.next());
                    System.out.print(" Pays: " + ct[contactActuel].ad.getPays());
                    ct[contactActuel].ad.setPays(sc.next());
                    System.out.print("Occupation:\n" +
                            " Poste: " + ct[contactActuel].occ.getPoste());
                    ct[contactActuel].occ.setPoste(sc.next());
                    System.out.print(" Entreprise:\n" +
                            "  Nom: " + ct[contactActuel].occ.ent.getNom());
                    ct[contactActuel].occ.ent.setNom(sc.next());
                    System.out.print("  Addresse:\n");
                    if (ct[contactActuel].occ.ent.ad.getNumeroCivique() != 0) System.out.print(" Numéro civique: " + ct[contactActuel].occ.ent.ad.getNumeroCivique());
                    else System.out.print("   Numéro civique: ");
                    ct[contactActuel].occ.ent.ad.setNumeroCivique(sc.nextInt());
                    System.out.print("   Rue: " + ct[contactActuel].occ.ent.ad.getRue());
                    ct[contactActuel].occ.ent.ad.setRue(sc.next());
                    System.out.print("   Appartement: " + ct[contactActuel].occ.ent.ad.getAppartement());
                    ct[contactActuel].occ.ent.ad.setAppartement(sc.next());
                    System.out.print("   Ville: " + ct[contactActuel].occ.ent.ad.getRue());
                    ct[contactActuel].occ.ent.ad.setVille(sc.next());
                    System.out.print("   Province: " + ct[contactActuel].occ.ent.ad.getProvince());
                    ct[contactActuel].occ.ent.ad.setProvince(sc.next());
                    System.out.print("   Pays: " + ct[contactActuel].occ.ent.ad.getPays());
                    ct[contactActuel].occ.ent.ad.setPays(sc.next());
                    System.out.print("\nEntrer un numéro de téléphone (o/n) ? ");
                    entreeChar = sc.next().toLowerCase().charAt(0);


                    break;
                case 2:
                    if (Contact.nbContacts != 0) {
                        if (Contact.nbContacts == 1) {
                            System.out.print("\nVous avez un contact:");
                            contactActuel = 0;
                        }
                        else {
                            System.out.print("\nÀ quelle position voulez-vous voir la fiche du contact?\n" +
                                    "> ");
                            entree = sc.nextInt() - 1;
                        }
                        System.out.println("\nContact #" + (contactActuel + 1) + "\n" +
                                "Prénom: " + ct[contactActuel].getPrenom() + "\n" +
                                "Nom: " + ct[contactActuel].getNom() + "\n" +
                                "Adresse:\n" +
                                " Numéro civique: " + ct[contactActuel].ad.getNumeroCivique() + "\n" +
                                " Rue: " + ct[contactActuel].ad.getRue() + "\n" +
                                " Appartement: " + ct[contactActuel].ad.getAppartement() + "\n" +
                                " Ville: " + ct[contactActuel].ad.getVille() + "\n" +
                                " Province: " + ct[contactActuel].ad.getProvince() + "\n" +
                                " Pays: " + ct[contactActuel].ad.getPays() + "\n" +
                                "");
                    }
                    else System.out.println("\nVous n'avez pas de contacts.");
                    break;
                case 4: continuer = false;
            }
        }
    }
}
