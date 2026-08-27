class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone : stones) {
            pq.add(stone);
        }

        while(pq.size() > 1) {
            int first = pq.poll(); // 제일 큰 수
            int second = pq.poll(); // 2번째로 큰 수
            if(first != second) {
                pq.add(first - second);
            }
        }

        if(pq.isEmpty()) {
            return 0;
        } else {
            return pq.poll();
        }
    }
}
