class DynamicArray {

    private int[] arr;
    private int size;
    private int capacity;


    public DynamicArray(int capacity) {

        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0; 

    }

    public int get(int i) {

        return arr[i];

    }

    public void set(int i, int n) {
        arr[i] = n;

    }

    public void pushback(int n) {

        if(size == capacity){
            resize();
        }

        arr[size] = n;
        size++;
        // arr[arr.length - 1] = n;

    }

    public int popback() {

        int val = arr[size -1];
        size--;
        return val;

    }

    private void resize() {

        capacity = capacity * 2;

       arr = Arrays.copyOf(arr,capacity);

    }

    public int getSize() {

        return size;

    }

    public int getCapacity() {

        return capacity;

    }
}
