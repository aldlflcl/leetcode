import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        
      List<Integer> list = Arrays
            .stream(stones)
            .boxed()
            .collect(Collectors.toList());
      
      return solution(list);
    }
  
    public int solution(List<Integer> stones) {
      
      if (stones.size() == 0) return 0;

        if (stones.size() < 2) return stones.get(0);

        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;

        for (Integer stone : stones) {
            if (stone >= y) {
                x = y;
                y = stone;
            } else if (stone > x && stone != y) {
                x = stone;
            }
        }
        if (y == Integer.MIN_VALUE) {
            return 0;
        }

        if (x == y) {
            stones.remove((Integer) x);
            stones.remove((Integer) y);
        } else {
            stones.set(stones.indexOf(y), y - x);
            stones.remove((Integer) x);
        }

        return solution(stones);
    }
}