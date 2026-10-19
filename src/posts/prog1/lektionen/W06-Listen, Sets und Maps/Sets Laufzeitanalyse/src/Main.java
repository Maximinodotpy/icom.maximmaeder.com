void main () {
    var n = 100_000;
    var numbers = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
        numbers.add(i);
    }
    IO.println("starting search...");
    int c = 0;
    for (int i = 0; i < n; i++) {
        if (numbers.contains(i)) {
            c++;
        }
    }
    IO.println("...done. Found " + c + " elements.");
}