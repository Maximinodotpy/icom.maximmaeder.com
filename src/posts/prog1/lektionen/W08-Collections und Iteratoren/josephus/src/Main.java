void main() {
    IO.println(this.josephus(12));
    IO.println(this.josephus(41));
    IO.println(this.josephus(1_000_000));
    IO.println(this.josephus(10_000_000));
    IO.println(this.josephus(100_000_000));
}

public LinkedList<Integer> josephus(int count) {
    long start = System.currentTimeMillis();

    LinkedList<Integer> circle = new LinkedList<Integer>();

    for(int i = 1; i <= count; i++) {
        circle.add(i);
    }

    /*IO.println(circle);*/

    var it = circle.iterator();
    var current = it.next();
    int index = 1;
    while (circle.size() != 2) {
        /*IO.println(current);*/

        if (index % 3 == 0) {
            it.remove();
            /*IO.println("Remove: " + current);*/
        } else {
            /*IO.println("Not remove: " + current);*/
        }
        index++;

        if (!it.hasNext()) {
            it = circle.iterator();
        }
        it.next();
    }

    IO.println("Finished after " + (System.currentTimeMillis() - start) + "ms");

    return circle;
}