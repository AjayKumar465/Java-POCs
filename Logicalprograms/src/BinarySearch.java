import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) throws IOException {
	System.out.println("Enter how many numbers Do you want and lastly wirte stop whent list is completed  :");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	List<Integer> al=new ArrayList<Integer>();
	
	//System.out.println("enter "+n+" numers:");
	String stop="";
	while(!(stop=br.readLine()).equalsIgnoreCase("stop")){
	al.add(Integer.parseInt(stop));
	}
	int[] array=new int[al.size()];
	Iterator<Integer> it=al.iterator();
	for(int i=0;it.hasNext();i++){
		array[i]=it.next();
	}
System.out.println("Search for location of number : ");
int search=sc.nextInt();
//System.out.println("search n"+search);

//StringBuilder location=new StringBuilder();
//System.out.println("number not found"+location.capacity());
String location=searchLocation(search,array);

//System.out.println("capacity"+location.capacity());
	//if(location.capacity()==16){
if(location.isEmpty()){		
System.out.println("number not found");
	}else{
		System.out.println(+search+" at location of "+location);
	}
}

private static String searchLocation(int search, int[] array) {
	//int location=-1;
	String location="";
			
			
			//location.append("sdg");
	for(int i=0;i<=array.length-1;i++){
		//System.out.println(array[i]);
		if(array[i]==search){
			//location.append(""+i+",");
			location=location+""+i+",";
		}
	}
	//System.out.println(locationn);
	return location;
}
}
