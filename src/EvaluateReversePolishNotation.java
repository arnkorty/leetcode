import java.util.LinkedList;
import java.util.List;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int result=0;
        List<Integer> arrayList=new LinkedList<Integer>();
        int temp1=0;
        int temp2=0;
        for(String temp:tokens){
            if(temp.compareTo("+")==0){
                temp1=arrayList.remove(arrayList.size()-1);
                temp2=arrayList.remove(arrayList.size()-1);
                result=temp2+temp1;
                arrayList.add(arrayList.size(),result);
            }
            else if(temp.compareTo("-")==0){
                temp1=arrayList.remove(arrayList.size()-1);
                temp2=arrayList.remove(arrayList.size()-1);
                result=temp2-temp1;
                arrayList.add(arrayList.size(),result);
            }else if(temp.compareTo("*")==0){
                temp1=arrayList.remove(arrayList.size()-1);
                temp2=arrayList.remove(arrayList.size()-1);
                result=temp2*temp1;
                arrayList.add(arrayList.size(),result);
            }else if(temp.compareTo("/")==0){
                temp1=arrayList.remove(arrayList.size()-1);
                temp2=arrayList.remove(arrayList.size()-1);
                result=temp2/temp1;
                arrayList.add(arrayList.size(),result);
            }else{
                arrayList.add(arrayList.size(),Integer.parseInt(temp));
            }
        }

        result=arrayList.get(0);
        return result;
    }
    public static void main(String[] args) {
    }
}
