
/*
 * VISA公式サイト(http://www.smbc-card.com/mem/revo/bunkatsu.jsp)より
 *　計算式を流用
 *　利用料×（利用代金100円あたりの分割支払い手数料÷100円）=分割払い手数料円
　　　支払総額	利用代金＋分割払い手数料=総支払額円
　　　	総支払額円÷分割回数=分割支払い額
 * を簡易的に実装
 */
public class Calculator {
	private int payment;//購入金額
	private int times;//支払い回数
	private double rate;//比率（100円あたりの年利)
	private int monthlyPayment = 0; //PayPerMonth（月額支払額）
	private double commission = 0; //手数料
	private int allPayment = 0;//総支払額
	
	/**
	 * コンストラクタにて購入金額と支払回数を受け取り代入
	 * @param payment
	 * @param times
	 */
	public Calculator(int payment, int times){
		this.payment = payment;
		this.times = times;
		calcRate(times);
	}
	
	//100円あたりの手数料をswitch
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
	//分割手数料を算出
	private void calcCommission(){
		commission= payment * (rate / 100);
	}
	//総支払額を算出
	private void calcAllPayment(){
		allPayment = payment + (int)commission;
	}
	//分割支払い額を算出
	private void calcPpm(){
		monthlyPayment = allPayment / times;
	}
	
	//計算を実行
	public void calc(){
		calcCommission();
		calcAllPayment();
		calcPpm();
	}
	
	//分割手数料getter
	public int getCommission(){
		return (int)commission;
	}
	
	//総支払額getter
	public int getAllPayment(){
		return allPayment;
	}
	
	//分割支払い額getter
	public int getPpm(){
		return monthlyPayment;
	}
	
	
	
	
}
