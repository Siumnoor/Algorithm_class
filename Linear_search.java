public class Linear_search {



    public static void main(String[] args) {
        int [] num = {90,10,23,45,12,67,36,87}; //it can be user intput of from a file  

        int key = -9; //any number to search for

        boolean flag = false;
        int i=0;

        while(i<num.length){
            if(num[i] == key){
                flag=true;

                break;
            }
            i++;
        }
        if(flag){
            System.out.println(key+" found at index: "+ i);
        }else{
            System.out.println(key+" not found");
        }
    }
}
