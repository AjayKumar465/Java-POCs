import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class InsertionSortWithDesc {
public static void main(String[] args)throws Exception {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer>alist=new ArrayList<Integer>();
	String list="";
	while(!(list=br.readLine()).equalsIgnoreCase("stop")){
		alist.add(Integer.parseInt(list));
	}
	int array[]=new int[alist.size()];
	Iterator<Integer>it=alist.iterator();
	for(int i=0;it.hasNext();i++){
		array[i]=it.next();
	}
	array=InsertionSort(array);
	for(int i=0;i<array.length;i++)
		System.out.print(array[i]+" ,");
}

private static int[] InsertionSort(int[] array) {
	for(int i=1;i<array.length;i++){
		
		int next=array[i];
		int j=i;
		while(j>0&&array[j-1]<next){
			array[j]=array[j-1];
			j--;
		}
		array[j]=next;
	}
	return array;
}
}
