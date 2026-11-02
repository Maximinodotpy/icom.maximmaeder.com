void main() {
    IO.println(this.josephus(12));
}

public LinkedList<Integer> josephus(int count) {
    LinkedList<Integer> circle = new LinkedList<Integer>();

    for(int i = 1; i <= count; i++) {
        circle.add(i);
    }

    IO.println(circle);

    var it = circle.iterator();
    it.next();
    int index = 0;
    while (circle.size() != 2) {
        if (index % 3 == 0) {
            it.remove();
        }
        index++;

        if (!it.hasNext()) {
            it = circle.iterator();
            it.next();
        } else {
            it.next();
        }
    }

    return circle;
}