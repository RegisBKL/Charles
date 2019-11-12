package yougota;

public class Friendinme {
private double longueur;
private double largeur;
private double origine_x;
private double origine_y;
private double rayon;
private double base;
private double hauteur;
private double cote;
private String finnagetit;

//constructeur rectangles
/**
 * 
 * @param longueur
 * @param largeur
 * @param origine_x
 * @param origine_y
 * @param finnagetit
 */
public Friendinme(double longueur, double largeur, double origine_x, double origine_y, String finnagetit){
    this.longueur = longueur;
    this.largeur = largeur;
    this.origine_x = origine_x;
    this.origine_y = origine_y;
    this.finnagetit = finnagetit;
}

//constructeur cercles
/**
 * 
 * @param origine_x
 * @param origine_y
 * @param rayon
 * @param finnagetit
 */
public Friendinme(double origine_x, double origine_y, double rayon, String finnagetit){
    this.origine_x = origine_x;
    this.origine_y = origine_y;
    this.rayon = rayon;
    this.finnagetit = finnagetit;
}

//constructeur triangles
/**
 * 
 * @param finnagetit
 * @param base
 * @param hauteur
 * @param origine_x
 * @param origine_y
 */
public Friendinme(String finnagetit, double base, double hauteur, double origine_x, double origine_y){
    this.base = base;
    this.hauteur = hauteur;
    this.origine_x = origine_x;
    this.origine_y = origine_y;
    this.finnagetit = finnagetit;
}

//constructeur losanges
/**
 * 
 * @param cote
 * @param hauteur
 * @param finnagetit
 * @param origine_x
 * @param origine_y
 */
public Friendinme(double cote, double hauteur, String finnagetit, double origine_x, double origine_y){
    this.cote = cote;
    this.hauteur = hauteur;
    this.origine_x = origine_x;
    this.origine_y = origine_y;
    this.finnagetit = finnagetit;
}

/**
 * 
 * @return
 */
public String finnagetit(){
    return finnagetit;
}

/**
 * 
 * @return
 */
public double surface4(){
    return cote * hauteur;
}

/**
 * 
 * @return
 */
public double surface3(){
    return (base * hauteur) / 2;
}

/**
 * 
 * @return
 */
public double pricesurface(){
    return surface1() * 500;
}

/**
 * 
 * @return
 */
public double longueur1(){
    return longueur;
}
/**
 * 
 * @return
 */
public double largeur2(){
    return largeur;
}

/**
 * 
 * @return
 */
public double surface1(){
    return longueur * largeur;
}

/**
 * 
 * @return
 */
public double surface2(){
    return Math.PI * rayon * rayon;
}
    public static void main(String[] args) throws Exception {
        //constructeurs des terrains rectangulaires
        Friendinme terrain1r = new Friendinme(15, 2, 5, 3, "Finnagetit");
        Friendinme terrain2r = new Friendinme(15, 21, 3, 4, "Glennn");
        Friendinme terrain3r = new Friendinme(25, 25, 2, 9, "BethanyTrash");

        //constructeurs des terrains circulaires
        Friendinme terrain4c = new Friendinme(5, 4, 13, "DogboyDimples");
        Friendinme terrain5c = new Friendinme(3, 5, 15, "Daddy");
        Friendinme terrain6c = new Friendinme(2, 8, 14, "GaleGobble");

        //constructeurs des terrains triangulaires
        Friendinme terrain7t = new Friendinme("BetteMenforever", 5, 7, 9, 4);
        Friendinme terrain8t = new Friendinme("DannyWarbucks", 11, 14, 5, 6);
        Friendinme terrain9t = new Friendinme("CrystalLake", 24, 27, 7, 8);

        //constructeurs des terrains rhombiques
        Friendinme terrain10l = new Friendinme(15, 13, "BuckFruckster", 3, 5);
        Friendinme terrain11l = new Friendinme(25, 23, "ChunchCucumbers", 7, 8);
        Friendinme terrain12l = new Friendinme(5, 3, "TwinkMarmelade", 12, 15);

        //noms public des terrains rectangulaires
        String name1 = terrain1r.finnagetit();
        String name2 = terrain2r.finnagetit();
        String name3 = terrain3r.finnagetit();

        //noms publics des terrains circulaires
        String name4 = terrain4c.finnagetit();
        String name5 = terrain5c.finnagetit();
        String name6 = terrain6c.finnagetit();

        //noms publics des terrains triangulaires
        String name7 = terrain7t.finnagetit();
        String name8 = terrain8t.finnagetit();
        String name9 = terrain9t.finnagetit();

        //noms publics des terrains rhombiques
        String name10 = terrain10l.finnagetit();
        String name11 = terrain11l.finnagetit();
        String name12 = terrain12l.finnagetit();

        //nom technique des surfaces
        double surface1 = terrain1r.surface1();
        double surface2 = terrain2r.surface1();
        double surface3 = terrain3r.surface1();
        double surface4 = terrain4c.surface2();
        double surface5 = terrain5c.surface2();
        double surface6 = terrain6c.surface2();
        double surface7 = terrain7t.surface3();
        double surface8 = terrain8t.surface3();
        double surface9 = terrain9t.surface3();
        double surface10 = terrain10l.surface4();
        double surface11 = terrain11l.surface4();
        double surface12 = terrain12l.surface4();

        //texte de la console debug
        System.out.println(name1);
        System.out.println(surface1);
        System.out.println(name2);
        System.out.println(surface2);
        System.out.println(name3);
        System.out.println(surface3);
        System.out.println(name4);
        System.out.println(surface4);
        System.out.println(name5);
        System.out.println(surface5);
        System.out.println(name6);
        System.out.println(surface6);
        System.out.println(name7);
        System.out.println(surface7);
        System.out.println(name8);
        System.out.println(surface8);
        System.out.println(name9);
        System.out.println(surface9);
        System.out.println(name10);
        System.out.println(surface10);
        System.out.println(name11);
        System.out.println(surface11);
        System.out.println(name12);
        System.out.println(surface12);
    }
}