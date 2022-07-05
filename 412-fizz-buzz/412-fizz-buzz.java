class Solution {
    public List<String> fizzBuzz(int n) {
      List<String> list = new ArrayList<>();
      
        for (int i = 1; i <= n; i++) {
          list.add(calc(i));
        }
      return list;
    }
  
    private String calc(int n) {
      if (n % 3 == 0 && n % 5 == 0) {
        return "FizzBuzz";
      }
      if (n % 3 == 0) {
        return "Fizz";
      }
      if (n % 5 == 0) {
        return "Buzz";
      }
      return String.valueOf(n);
    }
}