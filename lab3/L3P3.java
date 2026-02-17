class L3P1{
	static int view;
	public static void display(){
	System.out.println(view);
	}
	public static int show(){
	return (view);	 
	}
	public static void main(String args[]){
	view=10;	
	display();
	System.out.println(show());
	}
}
