package proyeksdl;

public class ListBantu {
    Object elemen;
    ListBantu next;
    ListBantu prev;
    
    public ListBantu(){
        elemen = 0;
        next = null;
        prev = null;
    }
     public ListBantu(Object e) {
        elemen = e;
        next = null;
        prev = null;
    }
     public ListBantu(Object e, ListBantu n, ListBantu p){
        elemen = e;
        next = n;
        prev = p;
     } 
}
