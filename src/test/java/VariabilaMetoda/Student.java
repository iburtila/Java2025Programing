package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    //Clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    // intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui
    // nu este bine sa avem mai multe clase cu acelasi nume

    //intr-o clasa putem defini propietatile si actiunile entitatii

    //variabila = proprietatea unei clase

    //variabilele pot fi de doua feluri: globale si locale

    //variabile globale =  sunt vizibile peste tot in proiect

    //variabile locale =  sunt vizibile doar in locul unde sunt declarate

    // ca sa definim o variabila globala:
    //  -> accesscontrol (public)/
    //  -> tip variabila /nume variabila
    //cand definim o variabila nu este obligatoriu sa ii dam o valoare

    //Metoda = actiunea unei clase
    //Exista 2 tipuri de metode: VOID si RETURN

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adress;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

    @Test
    public void prezentareStudent(){
        Nume = "Burtila";
        Prenume = "Bogdan Ioan";
        Varsta = 41;
        Adress = "Calea Fericirii 28";
        Inaltime = 1.83;
        Greutate = 98.99f;
        Sex = 'M';
        AreDiploma = true;

        //System.out.println(Nume+" "+Prenume+" "+Varsta+" "+Adress);
        //System.out.println(Inaltime);

        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele studentului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Adresa studentului este: "+Adress);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Greutatea studentului este: "+Greutate);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are studentul diploma? "+AreDiploma);

        calculMedia();
    }

    public void calculMedia(){
        double nota1 = 8.5;
        double nota2 = 7.5;
        double nota3 = 9.0;
        double medie = (nota1+nota2+nota3)/3;
        System.out.println("Media Studentului "+Nume+" "+Prenume+" este: "+medie);
    }
}
