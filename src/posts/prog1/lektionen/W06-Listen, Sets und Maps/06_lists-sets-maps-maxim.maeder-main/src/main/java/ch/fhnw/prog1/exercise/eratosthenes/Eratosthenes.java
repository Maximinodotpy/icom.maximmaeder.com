package ch.fhnw.prog1.exercise.eratosthenes;

import java.util.ArrayList;
import java.util.HashSet;

public class Eratosthenes {

    public ArrayList<Integer> eratosthenes(int n) {
        HashSet<Integer> primes = new HashSet<>(n);

        long start_time = System.currentTimeMillis();

        // Zahlen bis n einfügen
        for (int i = 2; i < n; i++) {
            if (
                    /*(i % 2 != 0 && i % 3 != 0) ||
                    i == 2 || i == 3*/
                    true
            ) primes.add(i);
        }

        IO.println("Time of creation: " + (System.currentTimeMillis() - start_time));
        long t_of_creation = System.currentTimeMillis();


        for (int i = 2; i < Math.sqrt(n); i++) {
            /*IO.println("Testing: " + i);*/
            for (int j = 2; j * i < n; j++) {
                /*IO.println("-Sub-Testing: " + j);*/
                primes.remove(j * i);
            }
        }

        /*int i = 2;
        while(i < primes.size()) {
            int index_of_quadratic = -1;
            if (primes.contains(i)) {
                index_of_quadratic = i * i;
            } else {
                continue;
            }

            for (int j = primes.size() - 1; j >= index_of_quadratic; j--) {
                if (primes.get(j) % primes.get(i) == 0 && i != j) {
                    primes.remove(j);
                }
            }

            i++;

            IO.println("Checked: " + primes.get(i) + " from \"" + index_of_quadratic + "\" to " + (primes.size() - 1) + "(" +  (System.currentTimeMillis() - t_of_creation) + ")");
            t_of_creation = System.currentTimeMillis();
        }*/


        /*IO.println(primes);
        IO.println("N: " +  n);*/

        return new ArrayList<>(primes);
    }
}
