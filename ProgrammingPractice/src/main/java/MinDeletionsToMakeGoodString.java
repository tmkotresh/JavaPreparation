import java.util.HashSet;

public class MinDeletionsToMakeGoodString {
	/*
	 * A string s is called good if there are no two different characters in s that have the same frequency
	 * Ex : "aab" is a good string
	 *      "aaabbbcc" is not good string as there is 3 occurance each for a and b 
	 */
	public static int minDeletions(String s) {
        int[] nums = new int[26];
        for(int i = 0; i < s.length(); i++) {
            nums[s.charAt(i) - 'a']++; // store Integer values in array for c will store 1 at nums[2]
        }
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>(); // use a datastructure to store and operate on values.
        for(int j = 0; j< nums.length; j++) {
            int freq = nums[j];
            while(freq > 0){   // check for freq, there can be mulitiple values such as aaaabbbbcccc all 4. 
                if(!set.contains(freq)){ /// validate if value exits in set.
                    set.add(freq);  // addd to set if does not exists
                    break;
                }
                else{
                    freq--;
                    answer++;
                }
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println("Minimum deletions to make String aaabbbcc as good is "+ minDeletions("aaabbbcc"));
	}
	

}
