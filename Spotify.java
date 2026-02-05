class Spotify
{
	public static void main(String[] args)
	{
		String songNames[] = {"Bargad", " Kaise Hua", "Still With You", "Love Yourself", "innunu bekagide", 
		"marali mareyagide", "soul of dia", "aalochane", "Finding Her", "Closer"};
		int length=songNames.length;
		System.out.println("The No of Songs are"+":"+length);
		
		String bargad = songNames[0];
		String kaisehua = songNames[1];
	
		System.out.println("hindi songs are"+":"+bargad+" " +kaisehua);
		
		//
		System.out.println("The list of song names using for each");
		for(String songName:songNames)
		{
			System.out.println(songName);
		}
	}
}
	