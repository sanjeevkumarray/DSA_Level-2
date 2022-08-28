package Tree;
import java.util.*;
public class Path_In_ZigZag_Labelled_Binary_Tree {
    public List<Integer> pathInZigZagTree(int label) {
        int  llv =1;
        int ctval =0;
        while(ctval<label){
            ctval+=llv;
            llv*=2;
        }

        llv/=2;
        ArrayList<Integer> ans = new ArrayList<>();
        while(label!=1){
            ans.add(label);
            int comp=(3*llv-label-1);
            int par= (comp/2);
            label=par;
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
