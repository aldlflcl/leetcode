class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      char[] arr = ransomNote.toCharArray();
      for (int i = 0; i < arr.length; i++) {
        int idx = magazine.indexOf(arr[i]);
        if (idx == -1) return false;
        
        magazine = magazine.replaceFirst(String.valueOf(arr[i]), "");
      }
      return true;
    }
}