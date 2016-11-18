
/*
 * VISA�����T�C�g(http://www.smbc-card.com/mem/revo/bunkatsu.jsp)���
 *�@�v�Z���𗬗p
 *�@���p���~�i���p���100�~������̕����x�����萔����100�~�j=���������萔���~
�@�@�@�x�����z	���p����{���������萔��=���x���z�~
�@�@�@	���x���z�~��������=�����x�����z
 * ���ȈՓI�Ɏ���
 */
public class Calculator {
	private int payment;//�w�����z
	private int times;//�x������
	private double rate;//�䗦�i100�~������̔N��)
	private int monthlyPayment = 0; //PayPerMonth�i���z�x���z�j
	private double commission = 0; //�萔��
	private int allPayment = 0;//���x���z
	
	/**
	 * �R���X�g���N�^�ɂčw�����z�Ǝx���񐔂��󂯎����
	 * @param payment
	 * @param times
	 */
	public Calculator(int payment, int times){
		this.payment = payment;
		this.times = times;
		calcRate(times);
	}
	
	//100�~������̎萔����switch
	private void calcRate(int time){
		switch(time){
		case 3:
			rate = 2.01;
			break;
		case 5:
			rate = 3.35;
			break;
		case 6:
			rate = 4.02;
			break;
		case 10:
			rate = 6.70;
			break;
		case 12:
			rate = 8.04;
			break;
		case 15:
			rate = 10.05;
			break;
		case 18:
			rate = 12.06;
			break;
		case 20:
			rate = 13.40;
			break;
		case 24:
			rate = 16.08;
			break;
		}
	}
	//�����萔�����Z�o
	private void calcCommission(){
		commission= payment * (rate / 100);
	}
	//���x���z���Z�o
	private void calcAllPayment(){
		allPayment = payment + (int)commission;
	}
	//�����x�����z���Z�o
	private void calcPpm(){
		monthlyPayment = allPayment / times;
	}
	
	//�v�Z�����s
	public void calc(){
		calcCommission();
		calcAllPayment();
		calcPpm();
	}
	
	//�����萔��getter
	public int getCommission(){
		return (int)commission;
	}
	
	//���x���zgetter
	public int getAllPayment(){
		return allPayment;
	}
	
	//�����x�����zgetter
	public int getPpm(){
		return monthlyPayment;
	}
	
	
	
	
}
