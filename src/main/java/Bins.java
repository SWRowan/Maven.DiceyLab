import java.util.TreeMap;

public class Bins {

    static TreeMap<Integer, Integer> Bin = new TreeMap<Integer, Integer>();

    public Bins(){

    }
    public Bins(Integer min, Integer max){
        for (int i = min; i <= max; i++) {
            Bin.put(i, 0);

        }
    }

//    public static TreeMap<Integer, Integer> getBin() {
//
//        return Bin;
//    }

    public void binEntry(Integer result){

        Bin.put(result, Bin.get(result)+1);

    }

    public int getBin(int binNumber){
        return Bin.get(binNumber);
    }

}
