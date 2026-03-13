class Cricket
{
	String team1;
	String team2;
	String format;
	String venue;
	String city;
	String country;
	int overs;
	int playersPerTeam;
	String umpire1;
	String umpire2;
	String matchReferee;
	String tossWinner;
	String tossDecision;
	String matchDate;
	String matchTime;
	int stadiumCapacity;
	double ticketPrice;
	boolean isDayMatch;
	boolean isInternational;
	String sponsor;

	Cricket()
	{
		System.out.println("Default constructor invoked");
	}

	Cricket(String team1,String team2,String format,String venue,String city,String country,
	int overs,int playersPerTeam,String umpire1,String umpire2,String matchReferee,
	String tossWinner,String tossDecision,String matchDate,String matchTime,
	int stadiumCapacity,double ticketPrice,boolean isDayMatch,boolean isInternational,String sponsor)
	{
		this.team1=team1;
		this.team2=team2;
		this.format=format;
		this.venue=venue;
		this.city=city;
		this.country=country;
		this.overs=overs;
		this.playersPerTeam=playersPerTeam;
		this.umpire1=umpire1;
		this.umpire2=umpire2;
		this.matchReferee=matchReferee;
		this.tossWinner=tossWinner;
		this.tossDecision=tossDecision;
		this.matchDate=matchDate;
		this.matchTime=matchTime;
		this.stadiumCapacity=stadiumCapacity;
		this.ticketPrice=ticketPrice;
		this.isDayMatch=isDayMatch;
		this.isInternational=isInternational;
		this.sponsor=sponsor;

		System.out.println("Parameterized constructor invoked");
	}
}