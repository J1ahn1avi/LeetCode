//399. Evaluate Division
class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> map = new HashMap<>();

        for(int i=0;i<equations.size();i++){
            String u=equations.get(i).get(0);
            String v=equations.get(i).get(1);
            double val=values[i];
            map.put(u,map.getOrDefault(u,new HashMap<>()));
            map.put(v,map.getOrDefault(v,new HashMap<>()));
            map.get(u).put(v,val);
            map.get(v).put(u,1/val);
        }

        double res[]=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String src=queries.get(i).get(0);
            String dest=queries.get(i).get(1);
            Set<String> seen=new HashSet<>();

            double w=dfs(map,src,dest,seen);
            res[i]=w;
        }
        return res;
    }

    public double dfs(Map<String,Map<String,Double>> map,String src,String dest,Set<String> visited){
        if(!map.containsKey(src) || !map.containsKey(dest)){
            return -1.0;
        }

        if(map.get(src).containsKey(dest)){
            return map.get(src).get(dest);
        }
        visited.add(src);

        for(Map.Entry<String,Double> i : map.get(src).entrySet()){
            String next=i.getKey();
            if(!visited.contains(next)){
                double temp=dfs(map,next,dest,visited);
                if(temp!=-1.0){
                    return temp*i.getValue();
                }
            }
        }
        return -1.0;
    }
}
