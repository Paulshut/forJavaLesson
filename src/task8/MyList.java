package task8;

public interface MyList <T> {

     int getSize();

     boolean isEmpty();

     boolean contains(T value);

     boolean add(T value);

     boolean add(int index, T value);

     boolean remove(Object value);

     boolean addAll(MyArrayList<? extends T> value);

     T get(int index);

     T remove(int index);

     T set(int index, T value);

     int indexOf(T value);
}