import java.util.Arrays;

public class Solution1 {
    int[] hashmap = new int[1000001];
    public Solution1() {
        Arrays.fill(hashmap,-1);
    }
    
    public void put(int key, int value) {
        hashmap[key] = value;
    }
    
    public int get(int key) {
        return hashmap[key];
    }
    
    public void remove(int key) {
        hashmap[key] = -1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
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
