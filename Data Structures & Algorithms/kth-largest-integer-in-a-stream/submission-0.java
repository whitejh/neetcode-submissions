class KthLargest {

    private final PriorityQueue<Integer> q;
    private final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        q = new PriorityQueue<Integer>(k);
        for(int a : nums) {
            add(a);
        }
    }
    
    public int add(int val) {
        q.offer(val);
        if(q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}
// 우선순위 큐를 이용하여 k사이즈보다 큰 값은 poll해가며 우선순위를 유지한뒤 가장 큰값을 peek 해줍니다.