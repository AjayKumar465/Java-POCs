import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class InsertionSort {
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> allist=new ArrayList<Integer>();
	System.out.println("");
	String list="";
	 System.out.println("Please enter the list of elements,one element per line");
     System.out.println(" write 'STOP' when list is completed ");
     System.out.print("Lets Start:");
	while(!(list=br.readLine()).equalsIgnoreCase("stop")){
		allist.add(Integer.parseInt(list));
	}
	int[] elementlist=new int[allist.size()];
	Iterator<Integer> it=allist.iterator();
	for(int i=0;it.hasNext();i++){
		elementlist[i]=it.next();
	}
	System.out.println("your numbers are");
	for(int i=0;i<elementlist.length-1;i++){
		System.out.print(elementlist[i]+"\t");
		}
	System.out.println();
	System.out.println("after insertion sort");
	elementlist=insertionSort(elementlist);
	for(int i=0;i<elementlist.length-1;i++){
	System.out.print(elementlist[i]+"\t");
	}
}

private static int[] insertionSort(int[] elementlist) {
	
	
	//int i=1;
	for(int i=1;i<elementlist.length;i++){
		int next=elementlist[i];
		int j=i;
		while(j>0&&elementlist[j-1]<next){
		elementlist[j]=elementlist[j-1];
		j--;
		
		}
		elementlist[j]=next;
		
	}
	return elementlist;
}
}
