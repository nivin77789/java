public class trappedwater {

    public static int cal(int height[]){
        int n=height.length, trapped=0;
int leftmax[]=new int[n];
int rightmax[]=new int[n];
leftmax[0]=height[0];
rightmax[n-1]=height[n-1];

for(int i=1; i<n; i++){
leftmax[i]=Math.max(height[i],leftmax[i-1]);
}
for(int i=n-2; i>=0; i--){
rightmax[i]=Math.max(height[i],rightmax[i+1]);
}

for(int i=0; i<n; i++){
    trapped=trapped+(Math.min(leftmax[i],rightmax[i])-height[i]);
}

return trapped;

    }
public static int trap(int height[]) {
    int n = height.length; 
    int res = 0, l = 0, r = n - 1; 
    int rMax = height[r], lMax = height[l]; 
    while (l < r) { if (lMax < rMax)
        { 
            l++; 
            lMax = Math.max(lMax, height[l]); 
            res += lMax - height[l]; } 
        else {
             r--;
              rMax = Math.max(rMax, height[r]); 
             res += rMax - height[r]; } } 
             return res; 
            }    


public static int stock(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxe=0;
        for(int i=0; i<arr.length; i++){
            if(buyprice<arr[i]){
int profit=arr[i]-buyprice;
maxe=Math.max(maxe, profit);
            } else{
                buyprice=arr[i];
            }
        }
        return maxe;
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
        int total=trap(height);
        System.out.println("max selling price = "+total);
    }

    


 
}
