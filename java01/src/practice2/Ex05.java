package practice2;

public class Ex05 {

	public static void main(String[] args) {
		final double pi=3.14;
		double banzi=2.2;
		double zi=pi*(banzi*banzi);
		Solution a = new Solution();
		int b[] = {1,2,3,4};
		System.out.println(a.solution(b));
		System.out.println(zi);
	}

}

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int tmp = common[1] - common[0];
        boolean flag = true;

        for(int i=0; i<common.length-1; i++){
            if(tmp != common[i+1] - common[i]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);

        if(flag){
            answer = common[common.length - 1] + tmp;
        }else{
            tmp = common[1] / common[0];
            answer = common[common.length - 1] * tmp;
        }
        
        return answer;
    }
}