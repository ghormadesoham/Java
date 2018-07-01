public class FixedCapacityStack<T>
{
  private T[] a;
  private int n;

  public FixedCapacityStack(int capacity)// always specify the access specifier for constructor
 {
  a = (T[])new Object[capacity];
  n = 0;

 }
 public void push(T t)// add item 
 {
   a[n++] = t;

 }

public T pop()// remove item from stack in O(1) constant time 
{
   return a[n--];
}

private test_push()
{}

private test_pop()
{
    
}
}