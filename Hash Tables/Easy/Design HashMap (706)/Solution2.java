import java.util.LinkedList;
import java.util.List;

public class Solution2 {
    private List<Pair>[] map;
    private static int SIZE = 769;
    public Solution2() {
        map = new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
        int hashKey = key % SIZE;
        if(map[hashKey] == null){
            map[hashKey] = new LinkedList<>();
            map[hashKey].add(new Pair(key, value));
        }else{
            for(Pair pa: map[hashKey]){
                if(pa.key == key){
                    pa.value = value;
                    return;
                }
            }
            map[hashKey].add(new Pair(key, value));
        }
    }
    
    public int get(int key) {
        int hashKey = key % SIZE;
        List<Pair> entries = map[hashKey];
        if(entries == null) return -1;
        for(Pair pa: entries){
            if(pa.key == key){
                return pa.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int hashKey = key % SIZE;
        if(map[hashKey] == null) return;
        for(Pair pa: map[hashKey]){
            if(pa.key == key){
                map[hashKey].remove(pa);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.put(1,1);
        s.put(2,2);
        System.out.println(s.get(1));
        System.out.println(s.get(3));
        s.put(2,1);
        System.out.println(s.get(2));
        s.remove(2);
        System.out.println(s.get(2));
    }
}

class Pair{
    public int key;
    public int value;
    public Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}