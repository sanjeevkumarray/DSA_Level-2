package Graph;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.util.LinkedList;
public class Reconstruct_Itinerary {
    class Solution {
        HashMap<String,PriorityQueue<String>> graph;
        LinkedList<String> ans;
        public List<String> findItinerary(List<List<String>> tickets) {
            graph = new HashMap<>();
            ans = new LinkedList<>();
            for(List<String> ticket:tickets){
                PriorityQueue<String> temp= graph.getOrDefault(ticket.get(0), new PriorityQueue<>());
                temp.add(ticket.get(1));
                graph.put(ticket.get(0),temp);

            }
            dfs("JFK");
            return ans;
        }

        public void dfs(String src){
            PriorityQueue<String> nbrs = graph.get(src);
            while( nbrs!=null && nbrs.size()>0){
                String nbr = nbrs.remove();
                dfs(nbr);
            }
            ans.addFirst(src);
        }
    }

}
