class Selection{

    // it is running well in (Run java in vs code) & any othe compiler;
    public static void selection(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            //Swapping

            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Printval(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args){
        int arr[] = {2,6,4,1,0,3};
        selection(arr);
        Printval(arr);
        
    }
}