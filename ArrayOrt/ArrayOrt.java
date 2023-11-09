package ArrayOrt;

public class ArrayOrt {
    public static void main(String[] args)
    {
        double[] number = {1,2,3,4,5};
        double hseri = 0;
        for (int i = 0; i < number.length;i++)
        {
            hseri += 1/number[i];
        }
        double hortalama = 0;
        hortalama = number.length / hseri;
        System.out.println("Harmonik ortalama : "+hortalama);
    }
}
