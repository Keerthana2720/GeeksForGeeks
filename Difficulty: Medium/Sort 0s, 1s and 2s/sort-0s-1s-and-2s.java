class Solution {
    public void sort012(int[] arr) {
        // code here
        int c0 =0;
        int c1=0;
        int c2=0;
        int n = arr.length;
        for(int i=0; i< n;i++ ){
        if(arr[i] == 0){
            c0 = c0+1;
        }
        else if(arr[i] == 1){
            c1=c1+1;
            }
            else{
                c2=c2+1;
        }
        }
        int ind=0;
        for(int i=1;i<=c0;i++){
            arr[ind]=0;
            ind++;
        }
        for( int i=1;i<=c1;i++){
            arr[ind]=1;
            ind++;
            }
        for( int i=1;i<=c2;i++){
            arr[ind] = 2;
            ind++;
        }
    }
}
