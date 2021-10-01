class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> storedConnections = new HashMap<>();
        for(String current : strs){
            char[] characters = current.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);
            if(storedConnections.containsKey(sorted))
            {
                storedConnections.get(sorted).add(current);
            }
            else{
                List<String> data = new ArrayList<>();
                data.add(current);
                storedConnections.put(sorted, data);
            }
        }
        groupedAnagrams.addAll(storedConnections.values());
        return groupedAnagrams;
    }
}