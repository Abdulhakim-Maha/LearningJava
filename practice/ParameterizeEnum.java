public class ParameterizeEnum {
	public static void main(String[] args) {

		TrafficSignal[] trafficSignals = TrafficSignal.values();

		for (TrafficSignal trafficSignal : trafficSignals) {
			System.out.println("name: " + trafficSignal.name() + " action: " + trafficSignal.getAction());
		}

		
	}	

	enum TrafficSignal {
		RED("STOP"),
		GREEN("GO"),
		ORANGE("SLOW DOWN");
		
		// state
		private String action; 

		// getter
		public String getAction() {
			return action;
		}

		// Constructor
		private TrafficSignal(String action){
			this.action = action;
		}
	}
}
