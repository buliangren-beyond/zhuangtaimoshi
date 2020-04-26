package zhuangtai;

public class ThreadContext {
	private ThreadState threadstate;
	public ThreadContext() {
		threadstate = new NewState();
	}
	public ThreadState getThreadstate() {
		return threadstate;
	}
	public void setThreadstate(ThreadState threadstate) {
		this.threadstate = threadstate;
	}
	public void start() {
		((NewState)threadstate).start(this);
	}
	public void getCpu() {
		((RunnableState)threadstate).getCpu(this);
	}
	public void suspect() {
		((RunningState)threadstate).suspect(this);
	}
	public void resume() {
		((StockedState)threadstate).resume(this);
	}
	public void stop() {
		((RunningState)threadstate).stop(this);
	}
}
