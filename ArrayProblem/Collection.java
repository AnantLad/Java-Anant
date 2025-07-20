import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Deque;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class Collection {
    
    public static void main(String[] args) {
         
    //Package
    //Interface
    //Class 
    //Wrapper class
    //Generics
    //Objects
    //Iterator
    //Collection
    //Arrays
    //Compartor
    
    
    
    //list ordered data structure

    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(2,25);
    System.out.println(list);

    //ArrayList

    ArrayList<Integer> lists = new ArrayList<Integer>();
    lists.add(10);
    lists.add(20);
    lists.add(30);
    lists.add(2,25);
    System.out.println(lists);

    //LinkedList

    LinkedList <Integer>Lists = new LinkedList<>();
    Lists.add(0,10);
    Lists.add(1,40);
    Lists.add(20);
    System.out.println(Lists);

    //Vector

    Vector<String> vec = new Vector<>();
    vec.add("20");
    vec.add("25");
    vec.add("30");
    System.out.println("Vector = "+vec); 
    vec.clear();
    System.out.println(vec);

    //Stack

    Stack <Integer> stack = new Stack<>();
    stack.add(11);
    stack.add(12);
    System.out.println(stack);
    stack.pop();
   /*  System.out.println(stack);
    stack.push(24);
    System.out.println(stack);
    stack.remove(0);
    System.out.println(stack);*/

    //Queue 
    //offer() used because value enter in queue then it give true or fasle but in add() it thorw exception create problem 
    // same as in poll() and remove(). poll() retuen null value, where value not be removed.

    Queue<Integer> queue = new LinkedList<>();
    queue.add(10);
    queue.offer(20);
    queue.offer(16);
    queue.add(50);
    System.out.println(queue);
    System.out.println("Q remove "+queue.remove());
    System.out.println("Queue = "+queue);
    System.out.println("Q poll = "+queue.poll());
    System.out.println("Queue = "+queue);
    System.out.println("Q peek "+queue.peek());

        
    //Priority Queue

    // In priority queue it will give always min heap,
    // but use Comparator.reverse order we get max heap.

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(10);
    pq.offer(14);
    pq.add(13);
    System.out.println("Priority peek "+pq.peek());


    //ArrayQueue
    //DeQueue

    Deque<Integer> adq = new ArrayDeque<>();
    adq.offer(10);
    adq.offer(25);
    adq.offerFirst(5);
    adq.offerLast(50);
    System.out.println("Deque "+adq);
    
    




    //Set ordered or not data structure
    //Hashset
    Set<Integer> set = new HashSet<>();
    set.add(10);
    set.add(30);
    set.add(16);
    set.add(10);
    System.out.println("Set"+set);

    //LinkedHashSet

    LinkedHashSet<Integer> Linked = new LinkedHashSet();
    Linked.add(10);
    Linked.add(20);
    Linked.add(30);
    Linked.add(20);
    System.out.println(Linked);

    //TreeSet
    //SortedSet

    TreeSet<Integer> tree = new TreeSet<>();
    tree.add(5);
    tree.add(3);
    tree.add(6);
    tree.add(5);
    System.out.println(tree);


    //EnumMap
    //HashMap unsorted
    HashMap<String,Integer> hmap = new HashMap<>();
    hmap.put("First", 35);
    hmap.put("Second", 25);
    System.out.println("HashMap "+hmap);
    //AbstractMap
    //Map
    //NavigableMap

    //TreeMap sorted 
    //SortedMap
    TreeMap<String,Integer> tmap = new TreeMap<>();
    tmap.put("First", 35);
    tmap.put("Second", 25);
    System.out.println("TreeMap "+tmap);



    int arr[] = {2,6,4,8,7,3,4};
    for(int e : arr)
    System.out.print(e+",");
    Arrays.sort(arr); 
    System.out.println();
    for(int e : arr)
    System.out.print(e+",");

    System.out.println(Arrays.binarySearch(arr, 6));

    ArrayList<String> mylist = new ArrayList<>();
    mylist.add("Second");
    mylist.add("First");
    mylist.add("Third");
    System.out.println(mylist);
    Collections.sort(mylist);
    System.out.println(mylist);
    
    System.out.println(Collections.min(lists));

    Iterator it = mylist.iterator();
    while(it.hasNext())
    System.out.println("List val = "+it.next());
    


    }

    public static void sort(List<Integer> dup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}
