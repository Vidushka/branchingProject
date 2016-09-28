package src.main.java.com.hsenid.branching;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by hsenid on 9/28/16.
 */
public class branching {
    public static void main(String[] args) {
        for (int i = -5; i <= 5; i++) {
            int k;
            if (i < 0)
                k = -i;
            else
                k = i;
            int l = 5 - k;
            for (int j = -5; j <= 5 + k; j++) {
                if (j < l)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
            System.out.println("Master branch updated");
        }
    }
}
