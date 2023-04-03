import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for(int i=0;i<items.size();i++){
            if(items.get(i).compareTo(term)==0){
                return i;
            }
        }
        return -1;
    }
    public static int orderedLinearSearch(ArrayList<Integer> items, int term){
        for(int i=0;i<items.size();i++){
            if(items.get(i)>term){
                return-1;
            }else if(items.get(i)==term){
                return i;
            }
        }
        return -1;
        }
    public static int orderedBinarySearch(ArrayList<Integer> items, int term){
        int high=items.size()-1;
        int low=0;
        int mid=items.size()/2;
        while(low<=high){
            if(items.get(mid)==term){
                return mid;
            }else if(items.get(mid)<term){
                low=mid+1;
                mid=(low+high)/2;
            }else{
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}