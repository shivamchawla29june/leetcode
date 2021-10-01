class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> dataStorage = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            if(dataStorage.containsKey(s.charAt(i))){
                dataStorage.replace(s.charAt(i), dataStorage.get(s.charAt(i)), dataStorage.get(s.charAt(i)) +1);
            }else{
                dataStorage.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(dataStorage.containsKey(t.charAt(i))){
                if(dataStorage.get(t.charAt(i)) == 1){
                    dataStorage.remove(t.charAt(i));
                }
                else{
                    dataStorage.replace(t.charAt(i), dataStorage.get(t.charAt(i)), dataStorage.get(t.charAt(i)) - 1);                    
                }
            }else{
                return false;
            }
        }
         return dataStorage.size() == 0 ? true : false;
    }
}