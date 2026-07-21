class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        for (String word : a) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : b) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}