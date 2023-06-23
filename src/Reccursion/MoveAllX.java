package Reccursion;

public class MoveAllX {

    public static void moveChar(int index,String str,int count,String newString){

        if(index==str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(index);
        if(curChar == 'x'){
            count++;
            moveChar(index+1,str,count,newString);
        }else{
            newString += curChar;
            moveChar(index+1,str,count,newString);
        }


    }
    public static void main(String[] args) {
        String str = "abxxbxxdd";
        moveChar(0,str,0,"");
    }
}
