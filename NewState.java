package zhuangtai;

public class NewState extends ThreadState {
	public NewState() {
		state = StateSet.NEW;
		System.out.println("�����߳�");
	}
	public void start(ThreadContext sc) {
		System.out.println("��ʼ����start����");
		if(state == StateSet.NEW) {
			sc.setThreadstate(new RunnableState());
		}else {
			System.out.println("��ǰ�̲߳����½�״̬");
		}
	}
	
}
