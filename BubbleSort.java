public class BubbleSort {

    public static void Sorting(int nums[]){

        for(int turn=0; turn < nums.length-1; turn++){
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void Printval(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args){
        int nums[]={1,4,2,7,9,0};
        Sorting(nums);
        Printval(nums);
    }
}
