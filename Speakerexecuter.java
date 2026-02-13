class Speakerexecuter
{
	public static void main(String[] args)
	{
		boolean ref = Speaker.onoroff();
		System.out.println("Speaker:"+ref);
		
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		//ref = Speaker.onoroff();
		//System.out.println("Speaker:"+ref);
	}
}