import java.util.HashMap;
import java.util.Map;

public class GroupStudentsBasedOnSkill {
	
	public static void main(String[] args){
		
		int[] arr = {1,2,3,1,2,3,1,2};
		int val = singleNumber(arr);
		
		System.out.println(val);
		
		String skill = "PCMBPCM";
		
		int value;
		
		HashMap<Character,Integer> skillSet = new HashMap<Character,Integer>();
		
		for(int i=0;i<skill.length();i++){
			
			
			if(skillSet.containsKey(skill.charAt(i))){
				System.out.println("-------->"+skill.charAt(i));
				value = skillSet.get(skill.charAt(i));
				value++;
				skillSet.put(skill.charAt(i), value);
			}else{
				skillSet.put(skill.charAt(i), 1);
			}
			
		}
		
		for ( Character key : skillSet.keySet()){
            System.out.println("Character : '"+key+"' Count :"+skillSet.get(key));
        }
		
	}
	
	
	public  static int  singleNumber(final int[] A) {
        Map<Integer,Integer> cntMap = new HashMap<Integer,Integer>();
        int cnt=0;
        for(int i=0;i<A.length;i++){
            if(cntMap.containsKey(A[i])){
                int val = cntMap.get(A[i]);
                ++val;
                cntMap.put(A[i],val);
                
            }else{
                cntMap.put(A[i],1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : cntMap.entrySet()){
        	System.out.println(entry.getKey()+" -> "+ entry.getValue());
        	
        	if(entry.getValue()!=3) return entry.getKey();
        }
        
        for ( Integer key : cntMap.keySet()){
            if(cntMap.get(key)!=3) return cntMap.get(key);
            
        }
        
        return 0;
        
    }


}
