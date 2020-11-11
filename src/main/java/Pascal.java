import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter N: ");
        int n = br.read();
        int[] currentArray = new int[n];
        currentArray[0] = 1;
        for (int i = 0; i < n; i++)
        {
            int[] a = new int[i+1];
            for (int j = 0; j <= i; j++)
            {
                if (j == 0)
                {
                    a[j] = currentArray[j];
                } else if (j == i){
                    a[j] = currentArray[j-1];
                } else
                {
                    a[j] = currentArray[j - 1] + currentArray[j];
                }
            }
            System.arraycopy(a, 0, currentArray, 0, a.length);
            for (int element: a) {
                System.out.print(element);
            }
            System.out.printf("%n");
        }
    }
}

