package firstJavaClass;

public class incrment {
    public static void main(String[] args) {
        String[] str={"--X","X++","X++"};
        System.out.println(str[0]);
        int ans=finalValueAfterOperations(str);
        System.out.println(ans);
    }
    public static int finalValueAfterOperations(String[] operations) {
        int count=0;
        for(int i=0;i<operations.length;i++)
        {
            /* if(operations[i]=="++x" || operations[i]=="x++")
            {
                count+=1;
            }
    
            else if(operations[i]=="--x" || operations[i]=="x--")
            {
                count-=1;
            } */
            if(operations[i].contains("++"))
            {
                count+=1;
            }
    
            else 
            {
                count-=1;
            }
        }
        return count;
    }
}
