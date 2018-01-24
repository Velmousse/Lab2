/**
 * Created by DufVi1731300 on 2018-01-22.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean continuer = true;
        int entree = 0, contactActuel = 0;
        String rouge = (char)27 + "[31m";

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
            switch (entree) {
                case 1:
                    contactActuel = Contact.nbContacts;
                    ct[contactActuel] = new Contact();
                    System.out.print("\nCe contact sera entré à la position #" + Contact.nbContacts + ".\n" +
                            "Veuillez entrer les informations suivantes (laisser vide si correct):\n" +
                            "Prénom: ");
                    ct[contactActuel].setPrenom(sc.next());
                    System.out.print("Nom: ");
                    ct[contactActuel].setNom(sc.next());
                    System.out.print("Adresse:\n" +
                            " Numéro civique: ");
                    ct[contactActuel].ad.setNumeroCivique(sc.nextInt());
                    System.out.print(" Rue: ");
                    ct[contactActuel].ad.setRue(sc.nextLine());
                    System.out.print(" Appartement: ");
                    ct[contactActuel].ad.setAppartement(sc.next());
                    System.out.print(" Ville: ");
                    ct[contactActuel].ad.setVille(sc.nextLine());
                    System.out.print(" Province: ");
                    ct[contactActuel].ad.setProvince(sc.nextLine());
                    System.out.print(" Pays: ");
                    ct[contactActuel].ad.setPays(sc.nextLine());
                    System.out.print("Occupation:\n" +
                            " Poste: ");
                    ct[contactActuel].setPoste(sc.nextLine());
                    System.out.print(" Entreprise:\n" +
                            "  Nom: ");



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
                        System.out.println("\nPrénom: " + ct[contactActuel].getPrenom() + "\n" +
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

                case 3:

                    break;
                case 4: continuer = false;
            }
        }
    }
}
