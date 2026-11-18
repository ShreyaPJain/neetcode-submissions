class Solution {
    public boolean isAnagram(String s, String t) {
     
      Map<Character, Integer> sCnt = new TreeMap<Character, Integer>();
      Map<Character, Integer> tCnt = new TreeMap<Character, Integer>();
      sCnt = charCount(sCnt, s);
      tCnt = charCount(tCnt, t);
      if(sCnt.size() != tCnt.size()){
        return false;
      }
      for(Map.Entry<Character,Integer> sEntry : sCnt.entrySet()){
        if(!((sEntry.getValue()).equals((tCnt.get(sEntry.getKey()))))){
            return false;
        }
      }
      return true;
    }

    public static Map<Character, Integer> charCount(Map<Character, Integer> cnt, String str){
        for(char c: str.toCharArray() ){
            if(cnt.containsKey(c)){
                cnt.put(c,(cnt.get(c)+1));
            }
            else{
                cnt.put(c,1);
            }
        }
        return cnt;
    }

}
