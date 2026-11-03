import java.util.ArrayList;

class MeasurementData {

    void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Messreihe 17");
        list.add("Sensor A");
        list.add("Sensor B");
        list.add("Sensor C");
        list.add("");
        list.add("15");
        list.add("18");
        list.add("42");
        list.add("17");
        list.add("55");
        list.add("13");
        list.add("16");
        list.add("77");
        list.add("");
        list.add("Alle Geräte ok");
        list.add("Status: 84");
        processList(list);
    }

    void processList(ArrayList<String> list) {
        int sum = 0;
        
        boolean shouldCount = false;
        boolean shouldPrint = false;

        var it = list.iterator();

        while(it.hasNext()) {
            String content = it.next();
            IO.println("content" + content + shouldCount + content.matches(".+"));
            IO.println(content.length() != 1);

            if (content.length() != 1) {
                if (shouldCount) {
                    sum += Integer.parseInt(content);
                }

                if (shouldPrint) {
                    IO.println(content);
                }
            } else {
                if (shouldCount) {
                    shouldPrint = true;
                    IO.println("Sum = " + sum);
                }
                IO.println("Flipping should count");
                shouldCount = !shouldCount;
            }
        }
    }
}