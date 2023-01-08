//Insert Delete GetRandom O(1)
//https://leetcode.com/problems/insert-delete-getrandom-o1/
//medium
//240 ms

class RandomizedSet {
    List <Integer> list;
    public RandomizedSet() {
        list =new LinkedList<>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)) return false;
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        return list.remove((Integer) val);
    }
    
    public int getRandom() {
        Random rand = new Random();
        int ind = rand.nextInt(list.size());
        return list.get(ind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

