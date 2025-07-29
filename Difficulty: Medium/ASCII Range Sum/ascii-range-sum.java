class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
         int len = s.length();
        ArrayList<Integer> result = new ArrayList<>();
        Map<Character , Integer> map = new HashMap<>();
        int[] prefix = new int[len];
        prefix[0] = (int) (s.charAt(0));
        map.put(s.charAt(0) , 0);
        for(int i = 1; i < len ; i++){
            prefix[i] = prefix[i - 1] + (int) (s.charAt(i));
            map.put(s.charAt(i) , i);
        }
  
        for(int i = 0; i < len ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) > i){
               //System.out.print(c);
               int val = map.get(c);
               int num = prefix[val - 1] - prefix[i];
               if(num != 0){
               result.add(num);
               }
               map.remove(c);
           }
        }
        
        return result;
    }
}