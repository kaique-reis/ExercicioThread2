package controller;

public class ThreadID extends Thread{

		private int idThread;
		
		public ThreadID(int idThread){
			this.idThread = idThread;
		}
		
		@Override
		public void run() {
			System.out.println("TID #" + idThread);
		}
	}
