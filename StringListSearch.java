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
    public static int orderedLinearSearch(ArrayList<String> items, String term){
        for(int i=0;i<items.size();i++){
            if(items.get(i).compareTo(term)==0){
                return i;
            }else if(items.get(i).compareTo(term)>=0){
                return -1;
            }
        }
        return -1;
        }
    public static int orderedBinarySearch(ArrayList<String> items, String term){
        int high=items.size()-1;
        int low=0;
        int mid=items.size()/2;
        while(low<=high){
            if(items.get(mid).compareTo(term)==0){
                return mid;
            }else if(items.get(mid).compareTo(term)>0){
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