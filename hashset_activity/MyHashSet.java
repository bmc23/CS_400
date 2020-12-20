import java.util.Hashtable;

public class MyHashSet<T> implements SetADT<T> {
  private Hashtable<T, T> table = new Hashtable<T, T>();

  @Override
  public boolean add(T el) {
    if (el == null) {
      throw new NullPointerException("Cannot add a null reference");
    } else if (this.table.contains(el)) {
      return false;
    } else {
      this.table.put((T) el, (T) el);
      return true;
    }
  }

  @Override
  public boolean contains(T el) {
    if (this.table.contains(el)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean remove(T el) {
    if (!this.table.contains(el)) {
      return false;
    }
    this.table.remove(el);
    return true;
  }

  public static void main(String[] args) {
    MyHashSet<Integer> userTable = new MyHashSet<Integer>();
    System.out.println(userTable.add(45));
    System.out.println(userTable.contains(45));
    System.out.println(userTable.remove(45));



  }
}
