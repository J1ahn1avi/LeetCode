//1436. Destination City
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String>seen=new HashSet<>();
        for(List<String> i:paths){
            seen.add(i.get(0));
        }
        for(List<String>i:paths){
            String res=i.get(1);
            if(!seen.contains(res)){
                return res;
            }
        }
        return "";
    }
}
