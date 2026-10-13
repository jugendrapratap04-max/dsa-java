public class searching_an_element{
    public static void main(String[] args){
        int arr[]= {3,5,7,2,9};
        int key = 2;
        boolean found= false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                System.out.println("found");
            break;
            }
        }
        if(!found){
        System.out.println("not found");}
        
    }
}