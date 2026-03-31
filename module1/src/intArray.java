public class IntArray {

    private int length;
    private int[] myArray;

    // constructor
    public IntArray(int size) {
        length = size;
        myArray = new int[length];
    }

    // returns size
    public int size() {
        return length;
    }

    // fill with random numbers 1–6
    public void fillRand() {
        for (int i = 0; i < length; i++) {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // set value
    public void set(int index, int value) {
        myArray[index] = value;
    }

    // get value
    public int get(int index) {
        return myArray[index];
    }

    // clear array
    public void clear() {
        length = 0;
        myArray = new int[0];
    }

    // check if empty
    public boolean isEmpty() {
        return length == 0;
    }

    // sort (basic bubble sort style)
    public void sort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }

    // toString method
    public String toString() {
        String s = "";

        for (int i = 0; i < length; i++) {
            s += myArray[i] + " ";
        }

        return s;
    }
}