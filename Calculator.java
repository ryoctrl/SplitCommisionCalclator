
/*
 * VISAŒö®ƒTƒCƒg(http://www.smbc-card.com/mem/revo/bunkatsu.jsp)‚æ‚è
 *@ŒvZ®‚ğ—¬—p
 *@—˜—p—¿~i—˜—p‘ã‹à100‰~‚ ‚½‚è‚Ì•ªŠ„x•¥‚¢è”—¿€100‰~j=•ªŠ„•¥‚¢è”—¿‰~
@@@x•¥‘Šz	—˜—p‘ã‹à{•ªŠ„•¥‚¢è”—¿=‘x•¥Šz‰~
@@@	‘x•¥Šz‰~€•ªŠ„‰ñ”=•ªŠ„x•¥‚¢Šz
 * ‚ğŠÈˆÕ“I‚ÉÀ‘•
 */
public class Calculator {
	private int payment;//w“ü‹àŠz
	private int times;//x•¥‚¢‰ñ”
	private double rate;//”ä—¦i100‰~‚ ‚½‚è‚Ì”N—˜)
	private int monthlyPayment = 0; //PayPerMonthiŒŠzx•¥Šzj
	private double commission = 0; //è”—¿
	private int allPayment = 0;//‘x•¥Šz
	
	/**
	 * ƒRƒ“ƒXƒgƒ‰ƒNƒ^‚É‚Äw“ü‹àŠz‚Æx•¥‰ñ”‚ğó‚¯æ‚è‘ã“ü
	 * @param payment
	 * @param times
	 */
	public Calculator(int payment, int times){
		this.payment = payment;
		this.times = times;
		calcRate(times);
	}
	
	//100‰~‚ ‚½‚è‚Ìè”—¿‚ğswitch
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
	//•ªŠ„è”—¿‚ğZo
	private void calcCommission(){
		commission= payment * (rate / 100);
	}
	//‘x•¥Šz‚ğZo
	private void calcAllPayment(){
		allPayment = payment + (int)commission;
	}
	//•ªŠ„x•¥‚¢Šz‚ğZo
	private void calcPpm(){
		monthlyPayment = allPayment / times;
	}
	
	//ŒvZ‚ğÀs
	public void calc(){
		calcCommission();
		calcAllPayment();
		calcPpm();
	}
	
	//•ªŠ„è”—¿getter
	public int getCommission(){
		return (int)commission;
	}
	
	//‘x•¥Šzgetter
	public int getAllPayment(){
		return allPayment;
	}
	
	//•ªŠ„x•¥‚¢Šzgetter
	public int getPpm(){
		return monthlyPayment;
	}
	
	
	
	
}
