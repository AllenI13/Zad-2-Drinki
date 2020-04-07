public class Drinki {
    public static void main(String[] args) {

        Info Drink1 = new Info();
        Drink1.nazwa = "Long island iced tea";
        Drink1.alkohol =true;
        Drink1.cena = 25;
        Drink1.składnik.składnik1 = "Wódka";
        Drink1.składnik.ilość1 = 50;
        Drink1.składnik.składnik2 = "Whiskey";
        Drink1.składnik.ilość2 = 50;
        Drink1.składnik.składnik3 = "Iced tea";
        Drink1.składnik.ilość3 = 200;
        double suma = Drink1.składnik.ilość1 + Drink1.składnik.ilość2 + Drink1.składnik.ilość3;

        System.out.println(Drink1.nazwa + " cena " + Drink1.cena + "zł \n" + "Alkohol? =" + Drink1.alkohol);
        System.out.println("Składniki :");
        System.out.println(Drink1.składnik.składnik1 + " " + Drink1.składnik.ilość1 + "ml");
        System.out.println(Drink1.składnik.składnik2 + " " + Drink1.składnik.ilość2 + "ml");
        System.out.println(Drink1.składnik.składnik3 + " " + Drink1.składnik.ilość3 + "ml");
        System.out.println("Suma objętościowa składników :" + suma + "ml");
    }
}
