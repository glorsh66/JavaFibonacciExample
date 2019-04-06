import java.util.ArrayList;

public class FibonacciNumber {

    public static ArrayList<Integer> FIbForLoop (int iter)
    {
        ArrayList<Integer> ret = new ArrayList<>();
        int prev = 0;
        int cur = 1;
        int temp = 0;

        ret.add(0);

        for (int i = 0; i < iter; i ++)
        {
            ret.add(cur);
            temp = cur;
            cur = cur + prev;
            prev = temp;
        }
        return  ret;
    }


    public static int FibNumForLoop (int iter)
    {
        if (iter == 0 ) return 0;
        if (iter <= 2 ) return 1;


        int prev = 0;
        int cur = 1;
        int temp = 0;

        for (int i = 0; i < iter-1; i ++)
        {
            temp = cur;
            cur = cur + prev;
            prev = temp;
        }
        return  cur;
    }



    public static int FibNumRec(int iter)
    {
        if (iter < 0 ) return 0;
        if (iter == 0) return 0;
        if (iter <=2 ) return 1;

        int ret = FibNumRec(iter -2) + FibNumRec(  iter -1);
        return ret;

    }



    public static void main(String[] args) {
    ArrayList<Integer> ret = FIbForLoop(5);
    ret.forEach(v -> System.out.print(v + " ") );
    System.out.println("Номера итерации");
    for (int i = 0; i < ret.size(); i++) System.out.print(i + " ");

    System.out.println("с одним числом");
    int n = 5;
    System.out.println("Число фибоначи с колличеством итераций: " + n + " = " + FibNumForLoop(n));

    System.out.println("Рекурсия фибоначи: "  + FibNumRec(5));




    }
}
