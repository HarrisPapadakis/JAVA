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
        System.out.println("\n �� �������� ��� ������� �����: \n\t �������:: \t" + epvnymo +
        "\n\t ����:: \t" + onoma +
        "\n\t ����� ����:: \t" + average +
        "\n\t ������:: \t" + age);
    }
}