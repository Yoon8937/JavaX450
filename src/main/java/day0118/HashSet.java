package day0118;

public class HashSet implements Set{
    public int[] arr = {};

    @Override
    public void add(int element) {
        int[] temp = new int[arr.length + 1];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        temp[temp.length] = element;
        arr = temp;
    }

    @Override
    public boolean contains(int element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(int element) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(int index, int element) {
        arr[index] = element;
    }

    @Override
    public void removeByIndex(int index) {
        int[] tmp = new int[arr.length - 1];
        for(int i=0;i<index;i++){
            tmp[i] = arr[i];
        }
        for(int i=index+1;i<arr.length;i++){
            tmp[i-1] = arr[i];
        }
        arr = tmp;
    }

    @Override
    public void removeByElement(int element) {
        if(contains(element)){
        removeByIndex(indexOf(element));
        }
    }
}
