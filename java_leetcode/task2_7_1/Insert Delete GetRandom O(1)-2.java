//Insert Delete GetRandom O(1)
//https://leetcode.com/problems/insert-delete-getrandom-o1/
//medium
//200 ms
class RandomizedSet {
    Set <Integer> st;
    public RandomizedSet() {
        st =new HashSet<>();
    }
    
    public boolean insert(int val) {
        return st.add(val);
    }
    
    public boolean remove(int val) {
        return st.remove((Integer) val);
    }
    
    public int getRandom() {
        Random rand = new Random();
        int ind = rand.nextInt(st.size());
        Integer []arr=st.toArray(new Integer[0]);
        return arr[ind];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

