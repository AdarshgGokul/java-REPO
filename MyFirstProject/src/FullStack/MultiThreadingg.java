package FullStack;

class SoftwareUpdate extends Thread{
public	void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Updating your software.........");
			try {
				Thread.sleep(2000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}

class Restart extends Thread{
public	void run() {
		for (int i=0;i<=5;i++) {
			System.out.println("Welcome");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}


public class MultiThreadingg {
	public static void main (String args[]) {
		
		SoftwareUpdate soft= new SoftwareUpdate();
		Restart re=new Restart();
		
		soft.start();
		re.start();
	}
	
}
