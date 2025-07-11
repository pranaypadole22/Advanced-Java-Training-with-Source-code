package ADV_JAVA_DAY3;

public class Array8 {
    public static  int maxArea(int []height){
        int maxArea=0;
        int left=0;
        int right= height.length-1;
        while(left<right){
            int width=right-left;
            int minheight=Math.min(height[left],height[right] );
            int area=width*minheight;
            maxArea=Math.max(maxArea,area);
            //Move the pointer pointing to the shorter line.
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;

    }
    public static void main(String[] args) {
int h[]={1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be contained: "+maxArea(h));
    }
}
