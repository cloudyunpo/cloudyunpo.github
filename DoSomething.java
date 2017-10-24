package cic;

public class DoSomething implements Runnable {

	private String name;
	public DoSomething(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			for(long k=0;k<10;k++){
				System.out.println(name+":"+i);
			}
		}
	}

}
