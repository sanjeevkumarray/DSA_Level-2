package HashMap_And_Heap;
import java.util.*;
public class Maximum_Frequency_Stack {
//   895. Maximum Frequency Stack
    class FreqStack {
        HashMap<Integer,LinkedList<Integer>> st;
        HashMap<Integer,Integer> fmap;
        int maxfreq;
        public FreqStack() {
            st = new HashMap<>();
            fmap = new HashMap<>();
            maxfreq=0;
        }

        public void push(int val) {
            int cfreq =fmap.getOrDefault(val,0);
            cfreq++;
            fmap.put(val,cfreq);
            if(st.containsKey(cfreq)==false){
                st.put(cfreq,new LinkedList<Integer>());

            }
            st.get(cfreq).addFirst(val);
            maxfreq=Math.max(maxfreq,cfreq);
        }

        public int pop() {
            int ans = st.get(maxfreq).removeFirst();
            int cfreq= fmap.get(ans);
            cfreq--;
            fmap.put(ans,cfreq);
            if(st.get(maxfreq).size()==0){
                maxfreq--;
            }
            return ans;

        }
    }

}
