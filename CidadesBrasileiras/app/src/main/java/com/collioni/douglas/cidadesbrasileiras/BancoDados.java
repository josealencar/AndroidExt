package com.collioni.douglas.cidadesbrasileiras;

import java.util.ArrayList;

/**
 * Created by Douglas.Collioni on 19/03/2015.
 */
public class BancoDados {

    public static ArrayList<CharSequence> getEstadosSudeste() {

        ArrayList<CharSequence> estadosSudeste = new ArrayList<>();
        estadosSudeste.add("ES");
        estadosSudeste.add("MG");
        estadosSudeste.add("RJ");
        estadosSudeste.add("SP");

        return estadosSudeste;
    }

    public static ArrayList<CharSequence> getEstadosSul() {

        ArrayList<CharSequence> estadosSul = new ArrayList<>();
        estadosSul.add("PR");
        estadosSul.add("RS");
        estadosSul.add("SC");

        return estadosSul;
    }

    public static ArrayList<Cidade> getCidadesES() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Vitória", 313300, 93, R.drawable.vitoria));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesMG() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Belo Horizonte", 2475000, 331, R.drawable.belo_horizonte));
        cidades.add(new Cidade("Contagem", 379044, 194, R.drawable.contagem));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesRJ() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Búzios", 23463, 69, R.drawable.buzios));
        cidades.add(new Cidade("Rio de Janeiro", 6320000, 1255, R.drawable.rio_de_janeiro));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesSP() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Santos", 419086, 280, R.drawable.santos));
        cidades.add(new Cidade("São Paulo", 11320000, 1523, R.drawable.sao_paulo));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesPR() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Cascavel", 266835, 2100, R.drawable.cascavel));
        cidades.add(new Cidade("Curitiba", 1752000, 430, R.drawable.curitiba));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesRS() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Porto Alegre", 1409000, 496, R.drawable.porto_alegre));
        cidades.add(new Cidade("São Leopoldo", 213238, 102, R.drawable.sao_leopoldo));

        return cidades;
    }

    public static ArrayList<Cidade> getCidadesSC() {

        ArrayList<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Blumenau", 309214, 519, R.drawable.blumenau));
        cidades.add(new Cidade("Florianópolis", 421203, 436, R.drawable.florianopolis));

        return cidades;
    }
}
