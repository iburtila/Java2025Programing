package VariabilaMetoda;

import org.testng.annotations.Test;

public class Bicicleta {

    public String marca;
    public String model;
    enum valori {Cursiera, Gravel, Mtb, AllMoutains, DH};
    public Integer anul;
    public double dimensiuneTopTube;
    public double dimensiuneSeatTube;
    public Integer foaiaMare;
    public Integer foaiaMica;
    public Integer pinionMare;
    public Integer pinionMic;

    @Test
    public void listareBicicleta() {
        marca = "Triban";
        model = "ST 500";
        valori tipBicicleta;
        tipBicicleta = valori.Gravel;
        anul = 2014;
        dimensiuneSeatTube = 55.5;
        dimensiuneTopTube = 61.3;

        System.out.println("Bicicleta marca "+marca+" modelul "+model+" din anul "+anul+" este o bicicleta de tip "+tipBicicleta);
        calculRapoarte();
    }

    public void calculRapoarte(){
        pinionMare = 10;
        pinionMic= 53;
        foaiaMare = 46;
        foaiaMica = 32;
        double raportUrcare = (double) foaiaMica/ (double) pinionMic;
        String raportUrcareFormatat = String.format("%.1f", raportUrcare);
        double raportViteza =  (double) foaiaMare / (double) pinionMare;
        String raportVitezaFormatat = String.format("%.1f", raportViteza );
        System.out.println("Bicicleta are un raport de urcare: "+raportUrcareFormatat);
        System.out.println("Bicicleta are un raport de viteza: "+ raportVitezaFormatat);
    }
}
