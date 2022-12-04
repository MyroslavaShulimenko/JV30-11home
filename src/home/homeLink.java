package home;

import java.util.LinkedList;

public class homeLink {
    public static void main(String[] args) {
        //First level: На основании созданного во время занятия связанного списка, создайте двунаправленный связанный список и реализуйте методы:
        //public boolean add(Type elem) {…}
        //
        //public void add(int index, Type elem) {…}
        //
        //public Type remove (int index) {…}

    var ll=new LinkedList<>();
        ll.add(1);  // [1]
        System.out.println(ll);
        ll.addFirst(8); // [2, 1]
       ll.addLast(3);
       ll.addLast(78);
       ll.addFirst(22);
        System.out.println(ll);
ll.removeLast();
        System.out.println(ll);

    }
}
//разновидности метода add () из интерфейса List <T> .