
public class LotteryDrawClass {
	public static void main (String[] args) {
		int[] lottery= new int[6];
		int randomNumber;
		
		for(int i=0; i<6;i++) {
			randomNumber= (int)(Math.random()*50);//math.random() * ((49-0+1)+0)
			for(int x=0; x<=i; x++) {
				if(lottery[x]==randomNumber) {
					randomNumber= (int)(Math.random()*50);// If random number is same, another number generated
					x=-1;//we'll verify again from the beggining
				}
			}
			lottery[i]=randomNumber;
		}
		 for (int i = 0; i < lottery.length; i++)
		        System.out.print(lottery[i] + " ");
		
	}
	
}
