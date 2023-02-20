package task8;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    int capacity;
    private Object[] objects;

    public MyArrayList(int capacity) {
        if (capacity == 0) {
            this.capacity = 10;
            objects = new Object[this.capacity];
        } else {
            this.capacity = capacity;
            objects = new Object[capacity];
        }
    }

    public MyArrayList() {
        this.capacity = 10;
        objects = new Object[capacity];
    }

    @Override
    public int getSize() {
        int count = 0;
        for (Object object : objects) {
            if (object != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        if (getSize() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == value)
                return true;
        }
        return false;
    }

    @Override
    public boolean add(T value) {
        if (getSize() == objects.length)
            getClone();
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = value;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(int index, T value) {
        if (index >= getSize()) {
            return false;
        }
        Object[] tmpArray = new Object[objects.length + 1];
        System.arraycopy(objects, 0, tmpArray, 0, index);
        tmpArray[index] = value;
        System.arraycopy(objects, index, tmpArray, index + 1, objects.length - index);
        objects = tmpArray;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        for(int index = 0; index < objects.length; index++) {
            if((objects[index]) == value) {
                copy(objects.length - 1, index);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(MyArrayList<? extends T> value) {
        objects = Arrays.copyOf(objects, getSize());
        Object[] tmpArray = new Object[value.objects.length + objects.length];
        for (int i = 0; i < tmpArray.length; i++) {
            if (i < objects.length) {
                tmpArray[i] = objects[i];
            } else
                tmpArray[i] = value.objects[i - objects.length];
        }
        objects = tmpArray;
        return true;
    }

    @Override
    public T remove(int index) {
        if (index > objects.length) {
        }
        Object tmp = objects[index];
        copy(objects.length-1,index);
        objects = Arrays.copyOf(objects, getSize());
        return (T) tmp;
    }

    private void copy(int size, int index){
        T[] tmpArray = (T[]) new Object[size];
        System.arraycopy(objects, 0, tmpArray, 0, index);
        System.arraycopy(objects, index + 1, tmpArray, index, tmpArray.length - index);
        objects = tmpArray;
    }


    private Object[] getClone() {
        Object[] temp = objects.clone();
        this.capacity = (int) Math.round(capacity + 1);
        objects =  new Object[capacity];
        for (int i = 0; i < temp.length; i++) {
            objects[i] = temp[i];
        }
        return objects;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "capacity=" + capacity +
                ", objects=" + Arrays.toString(objects) +
                '}';
    }

    @Override
    public T get(int index) {
        if (index > getSize()) {
            System.out.println("Объекта с таким индекс нет");

        }
        return (T) objects[index];

    }

    @Override
    public T set(int index, T value) {
        if (index > getSize()) {
            System.out.println("Индекс введен не верно");
        }
        objects[index] = value;
        return  (T) objects[index];
    }

    @Override
    public int indexOf(Object value) {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == value) {
                return i;
            }
        }
        return -1;
    }
}