public class Foithths
{
   private String onoma, epvnymo;
   private double average;
   private int age;
   
   public Foithths(String onoma, String epvnymo, double average, int age)
   {
       this.onoma = onoma;
       this.epvnymo = epvnymo;
       this.average = average;
       this.age = age;
    }
    public String getOnoma()
    {
        return onoma;
    }
    public String getEpvnymo()
    {
        return epvnymo;
    }
    public double getAverage()
    {
        return average;
    }
    public void print()
    {
        System.out.println("\n Τα στοιχεία του φοιτητή είναι: \n\t Επώνυµο:: \t" + epvnymo +
        "\n\t Όνοµα:: \t" + onoma +
        "\n\t Μέσος Όρος:: \t" + average +
        "\n\t Ηλικία:: \t" + age);
    }
}