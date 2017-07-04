package sumave1;

public class Secondsmallarray {

	public static void main(String[] args) {
int a[]={1,5,6,2,9};
int large=a[0];
int slarge=a[0];
for(int i=0;i<a.length;i++){
	System.out.println(a[i]+"\t");
	}
for(int i=0;i<a.length;i++){
	if(a[i]>large){
		slarge=large;
		large=a[i];
	}
	else if(a[i]>slarge){
		slarge=a[i];
	}
}
System.out.println("second largest element in an array"+slarge);

	}

}
