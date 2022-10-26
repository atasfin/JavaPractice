public class Solution
{
    public static int solution(int[] A){
        int n = A.length;
        int ans = 1;
        int len = 1;
        for(int i = 1; i < n; ++i){
            if(A[i] > A[i-1]){
                ++len;
            }else{
                if(len > ans){
                    ans = len;
                }
                len = 1;
            }
        }
        if(len > ans){
            ans = len;
        }
        return ans;
    }
//    public static void main(String[] args) {
//        int A[] = {2,2,2,2,1,2,-1,2,1,3};
//        System.out.print(solution(A));
//    }
}