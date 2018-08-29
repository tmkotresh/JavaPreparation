package Generics;

public class TestGenerics {
	
	public static <T extends Comparable<T>> T findMax(T a, T b){
		int n = a.compareTo(b);
		if(n<0){
			return b;
		}else{
			return a;
		}
	}
	
	public static  <T> void printArray(T[] array){
        for(T elements: array){
            System.out.println(elements);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Max value "+findMax(2,3));
       
       System.out.println("Max value "+findMax("abc","cbae"));
       
       Integer[] intArray ={1,2,3};
       printArray(intArray);
	}

}
