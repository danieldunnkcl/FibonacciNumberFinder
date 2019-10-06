import java.util.HashMap;
import java.util.Map;

public class RememberingFib {
    private Map<Integer,Integer> foundFibs;

    public RememberingFib(){
         foundFibs = new HashMap<Integer,Integer>();
    }

    public int findFib(int n){
        if(!foundFibs.containsKey(n)){
            if(n>1){
                foundFibs.put(n,findFib(n-1) + findFib (n-2));
            }
            else{
                foundFibs.put(n,1);
            }
        }
        return (int)foundFibs.get(n);
    }
}
