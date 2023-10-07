package eNums;

public class Colors {
	public enum xColors{
		
		RED ("blood"), BLUE("ocean") , PURPLE("wockhardt") , GREY("in between"), BLACK("Absence of light");
		
		private String value;
		
		xColors(String value){
			this.value = value;
		}
		
		public String getValue(){
			return value;
		}
	}
}
