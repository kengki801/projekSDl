package proyeksdl;

public class ManajemenData {
    protected Pasien pasien;
    private ListBantu head;
    private int size;
    
    public ManajemenData(Pasien pasien) {
        this.pasien = pasien;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    
    
    
    public void LinkedList(){
        
        head = new ListBantu();
        head.next = head;
        head.prev = head;
        size = 0;
    }
    private void addBefore(Object data,ListBantu bantu ){
        ListBantu baru = new ListBantu(data,bantu,bantu.prev);
        bantu.prev.next = baru;
        bantu.prev = baru;
        size = size + 1;
    }
    
    public void addFirst(Object data){
        addBefore(data,head.next);
    }
    
    public void addLast(Object data){
        addBefore(data,head);
    }
    
    public boolean isEmpty(){
        return head.next == head;
    }
    
    public int size(){
        return size;
    }
    
    public void printList(){
        System.out.print("Isi senarai: ");
        ListBantu current = head.next;
        while(current != head){
            System.out.print(current.elemen +" ");
            current = current.next;
        }
        System.out.println();
    }
    public Object remove(ListBantu bantu) {
        
        if (bantu == head) {
            throw new IllegalArgumentException("Tidak bisa menghapus node sentinel (head)");
        }
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        size--;
        return bantu.elemen;
    }
    public Object removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List kosong");
        }
        return remove(head.next);
    }
    public Object removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("List kosong");
        }
        return remove(head.prev);
    }
    
    public ListBantu search(Object data) {
        ListBantu current = head.next;
        while (current != head) {
            if (current.elemen == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListBantu current = head.next;
        while (current != head) {
            sb.append(current.elemen).append(" ");
            current = current.next;
        }
        return sb.toString();
    }
    
   
}


