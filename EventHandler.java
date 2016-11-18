import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler implements ActionListener {
	CalcMonitor gui;
	
	public EventHandler(CalcMonitor calcmonitor){
		gui = calcmonitor;
	}
	
	public void actionPerformed(ActionEvent e){
		Calculator cal = new Calculator(gui.getPay(), gui.getTimes());
		cal.calc();
		
		gui.outputAllPayment.setText(Integer.toString(cal.getAllPayment()));
		gui.outputCommission.setText(Integer.toString(cal.getCommission()));
		gui.outputPpm.setText(Integer.toString(cal.getPpm()));
	}
}