package com.test.multitheading;

public class Waiter implements Runnable{

	/*
	 * A class that will wait for other threads to invoke notify methods to complete it�s
	 *  processing. Notice that Waiter thread is owning monitor on Message object 
	 *  using synchronized block.
	 */
		private Message msg;

		public Waiter(Message m){
			this.msg=m;
		}

		public void run() {
			String name = Thread.currentThread().getName();
			synchronized (msg) {
				try{
					System.out.println(name+ " waiting to get notified at time:"+System.currentTimeMillis());
					msg.wait();
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(name+ " waiter thread got notified at time:"+System.currentTimeMillis());
				//process the message now
				System.out.println(name+ " processed: "+msg.getMsg());
			}
		}
}