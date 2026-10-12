int n = 100;  // problem size

int progA(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < 500; j++) {
            sum = sum + i * j * rand.nextInt(100);
        }
    }
    return sum;
}

int progB(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            sum = sum + i * j * rand.nextInt(100);
        }
    }
    return sum;
}

Random rand = new Random();

void main() {
    int repetitions = 100;

    progA(n);  // warm-up
    int sumA = 0;
    long timeA = System.nanoTime();
    for (int i = 0; i < repetitions; i++) {
        sumA = sumA + progA(n);
    }
    timeA = System.nanoTime() - timeA;

    progB(n);  // warm-up
    int sumB = 0;
    long timeB = System.nanoTime();
    for (int i = 0; i < repetitions; i++) {
        sumB = sumB + progB(n);
    }
    timeB = System.nanoTime() - timeB;

    IO.println(sumA + sumB);  // just to "use" computed results, value ist random
    IO.println();
    IO.println((timeA + 500_000) / 1_000_000);
    IO.println((timeB + 500_000) / 1_000_000);
}