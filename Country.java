class Country
{
	public static String[] findStatesByCountry(String countryName)
	{
		System.out.println("Invoked findStatesByCountry\n");

		if(countryName == "India")
		{
			String[] indiaStates = {
				"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
				"Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand",
				"Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur",
				"Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
				"Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura",
				"Uttar Pradesh","Uttarakhand","West Bengal"
			};
			return indiaStates;
		}
		else if(countryName == "USA")
		{
			String[] usaStates = {
				"Alabama","Alaska","Arizona","Arkansas","California",
				"Colorado","Connecticut","Delaware","Florida","Georgia",
				"Hawaii","Idaho","Illinois","Indiana","Iowa",
				"Kansas","Kentucky","Louisiana","Maine","Maryland",
				"Massachusetts","Michigan","Minnesota","Mississippi","Missouri",
				"Montana","Nebraska","Nevada","New Hampshire","New Jersey",
				"New Mexico","New York","North Carolina","North Dakota","Ohio",
				"Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina",
				"South Dakota","Tennessee","Texas","Utah","Vermont",
				"Virginia","Washington","West Virginia","Wisconsin","Wyoming"
			};
			return usaStates;
		}
		else if(countryName == "Canada")
		{
			String[] canadaStates = {
				"Alberta","British Columbia","Manitoba","New Brunswick",
				"Newfoundland and Labrador","Nova Scotia","Ontario",
				"Prince Edward Island","Quebec","Saskatchewan"
			};
			return canadaStates;
		}
		else if(countryName == "Australia")
		{
			String[] australiaStates = {
				"New South Wales","Victoria","Queensland","Western Australia",
				"South Australia","Tasmania","Northern Territory",
				"Australian Capital Territory"
			};
			return australiaStates;
		}
		else if(countryName == "China")
		{
			String[] chinaStates = {
				"Anhui","Fujian","Gansu","Guangdong","Guizhou",
				"Hainan","Hebei","Heilongjiang","Henan","Hubei",
				"Hunan","Jiangsu","Jiangxi","Jilin","Liaoning",
				"Qinghai","Shaanxi","Shandong","Shanxi","Sichuan",
				"Yunnan","Zhejiang"
			};
			return chinaStates;
		}
		else if(countryName == "Japan")
		{
			String[] japanStates = {
				"Hokkaido","Aomori","Iwate","Miyagi","Akita",
				"Yamagata","Fukushima","Ibaraki","Tochigi","Gunma",
				"Saitama","Chiba","Tokyo","Kanagawa","Niigata",
				"Toyama","Ishikawa","Fukui","Yamanashi","Nagano",
				"Gifu","Shizuoka","Aichi","Mie","Shiga",
				"Kyoto","Osaka","Hyogo","Nara","Wakayama",
				"Tottori","Shimane","Okayama","Hiroshima","Yamaguchi",
				"Tokushima","Kagawa","Ehime","Kochi","Fukuoka",
				"Saga","Nagasaki","Kumamoto","Oita","Miyazaki",
				"Kagoshima","Okinawa"
			};
			return japanStates;
		}
		else if(countryName == "Germany")
		{
			String[] germanyStates = {
				"Bavaria","Berlin","Brandenburg","Bremen","Hamburg",
				"Hesse","Lower Saxony","Mecklenburg-Vorpommern",
				"North Rhine-Westphalia","Rhineland-Palatinate",
				"Saarland","Saxony","Saxony-Anhalt",
				"Schleswig-Holstein","Thuringia"
			};
			return germanyStates;
		}
		else if(countryName == "France")
		{
			String[] franceStates = {
				"Auvergne-Rhone-Alpes","Bourgogne-Franche-Comte","Brittany",
				"Centre-Val de Loire","Corsica","Grand Est",
				"Hauts-de-France","Ile-de-France","Normandy",
				"Nouvelle-Aquitaine","Occitanie","Pays de la Loire",
				"Provence-Alpes-Cote dAzur"
			};
			return franceStates;
		}
		else if(countryName == "UK")
		{
			String[] ukStates = {
				"England","Scotland","Wales","Northern Ireland"
			};
			return ukStates;
		}
		else if(countryName == "Brazil")
		{
			String[] brazilStates = {
				"Acre","Alagoas","Amapa","Amazonas","Bahia",
				"Ceara","Espirito Santo","Goias","Maranhao",
				"Mato Grosso","Mato Grosso do Sul","Minas Gerais",
				"Para","Paraiba","Parana","Pernambuco","Piaui",
				"Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul",
				"Rondonia","Roraima","Santa Catarina","Sao Paulo",
				"Sergipe","Tocantins"
			};
			return brazilStates;
		}
		else if(countryName == "Russia")
{
	String[] russiaStates = {
		"Adygea","Altai Republic","Bashkortostan","Buryatia","Chechnya",
		"Chuvashia","Dagestan","Ingushetia","Kalmykia","Karachay-Cherkessia",
		"Karelia","Khakassia","Komi","Mari El","Mordovia",
		"North Ossetia","Sakha","Tatarstan","Tuva","Udmurtia"
	};
	return russiaStates;
}
else if(countryName == "Italy")
{
	String[] italyStates = {
		"Abruzzo","Aosta Valley","Apulia","Basilicata","Calabria",
		"Campania","Emilia-Romagna","Friuli-Venezia Giulia","Lazio",
		"Liguria","Lombardy","Marche","Molise","Piedmont",
		"Sardinia","Sicily","Trentino-Alto Adige","Tuscany",
		"Umbria","Veneto"
	};
	return italyStates;
}
else if(countryName == "Spain")
{
	String[] spainStates = {
		"Andalusia","Aragon","Asturias","Balearic Islands","Basque Country",
		"Canary Islands","Cantabria","Castile and Leon","Castile-La Mancha",
		"Catalonia","Extremadura","Galicia","La Rioja","Madrid",
		"Murcia","Navarre","Valencian Community"
	};
	return spainStates;
}
else if(countryName == "Mexico")
{
	String[] mexicoStates = {
		"Aguascalientes","Baja California","Baja California Sur","Campeche",
		"Chiapas","Chihuahua","Coahuila","Colima","Durango",
		"Guanajuato","Guerrero","Hidalgo","Jalisco","Mexico City",
		"Michoacan","Morelos","Nayarit","Nuevo Leon","Oaxaca",
		"Puebla","Queretaro","Quintana Roo","San Luis Potosi",
		"Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala",
		"Veracruz","Yucatan","Zacatecas"
	};
	return mexicoStates;
}
else if(countryName == "SouthAfrica")
{
	String[] southAfricaStates = {
		"Eastern Cape","Free State","Gauteng","KwaZulu-Natal",
		"Limpopo","Mpumalanga","Northern Cape",
		"North West","Western Cape"
	};
	return southAfricaStates;
}
else if(countryName == "Argentina")
{
	String[] argentinaStates = {
		"Buenos Aires","Catamarca","Chaco","Chubut","Cordoba",
		"Corrientes","Entre Rios","Formosa","Jujuy","La Pampa",
		"La Rioja","Mendoza","Misiones","Neuquen","Rio Negro",
		"Salta","San Juan","San Luis","Santa Cruz","Santa Fe",
		"Santiago del Estero","Tierra del Fuego","Tucuman"
	};
	return argentinaStates;
}
else if(countryName == "NewZealand")
{
	String[] newZealandStates = {
		"Northland","Auckland","Waikato","Bay of Plenty",
		"Gisborne","Hawkes Bay","Taranaki","Manawatu-Wanganui",
		"Wellington","Tasman","Nelson","Marlborough",
		"West Coast","Canterbury","Otago","Southland"
	};
	return newZealandStates;
}
else if(countryName == "SouthKorea")
{
	String[] southKoreaStates = {
		"Seoul","Busan","Daegu","Incheon","Gwangju",
		"Daejeon","Ulsan","Sejong","Gyeonggi","Gangwon",
		"North Chungcheong","South Chungcheong",
		"North Jeolla","South Jeolla",
		"North Gyeongsang","South Gyeongsang","Jeju"
	};
	return southKoreaStates;
}
else if(countryName == "NorthKorea")
{
	String[] northKoreaStates = {
		"Chagang","North Hamgyong","South Hamgyong","North Hwanghae",
		"South Hwanghae","Kangwon","North Pyongan",
		"South Pyongan","Ryanggang","Pyongyang"
	};
	return northKoreaStates;
}
else if(countryName == "SaudiArabia")
{
	String[] saudiArabiaStates = {
		"Riyadh","Makkah","Madinah","Eastern Province","Asir",
		"Tabuk","Hail","Northern Borders","Jazan",
		"Najran","Al Bahah","Al Jawf","Qassim"
	};
	return saudiArabiaStates;
}
else if(countryName == "UAE")
{
	String[] uaeStates = {
		"Abu Dhabi","Dubai","Sharjah","Ajman",
		"Umm Al Quwain","Ras Al Khaimah","Fujairah"
	};
	return uaeStates;
}
else if(countryName == "Qatar")
{
	String[] qatarStates = {
		"Doha","Al Rayyan","Al Wakrah","Umm Salal",
		"Al Khor","Al Daayen","Madinat ash Shamal"
	};
	return qatarStates;
}
else if(countryName == "Kuwait")
{
	String[] kuwaitStates = {
		"Al Asimah","Hawalli","Farwaniya",
		"Ahmadi","Jahra","Mubarak Al Kabeer"
	};
	return kuwaitStates;
}
else if(countryName == "Oman")
{
	String[] omanStates = {
		"Muscat","Dhofar","Al Batinah North","Al Batinah South",
		"Al Dakhiliyah","Ash Sharqiyah North","Ash Sharqiyah South",
		"Al Dhahirah","Al Buraimi","Musandam"
	};
	return omanStates;
}
else if(countryName == "Iran")
{
	String[] iranStates = {
		"Tehran","Isfahan","Fars","Khuzestan","East Azerbaijan",
		"West Azerbaijan","Kerman","Khorasan Razavi","Mazandaran",
		"Gilan","Yazd","Qom","Alborz","Hormozgan"
	};
	return iranStates;
}
else if(countryName == "Iraq")
{
	String[] iraqStates = {
		"Baghdad","Basra","Nineveh","Anbar","Karbala",
		"Najaf","Dhi Qar","Maysan","Wasit","Kirkuk",
		"Salah ad Din","Dohuk","Erbil","Sulaymaniyah"
	};
	return iraqStates;
}
else if(countryName == "Turkey")
{
	String[] turkeyStates = {
		"Adana","Ankara","Antalya","Bursa","Istanbul",
		"Izmir","Konya","Gaziantep","Kayseri","Mersin",
		"Sanliurfa","Trabzon","Van","Samsun","Eskisehir"
	};
	return turkeyStates;
}
else if(countryName == "Egypt")
{
	String[] egyptStates = {
		"Cairo","Giza","Alexandria","Aswan","Asyut",
		"Beheira","Beni Suef","Dakahlia","Damietta",
		"Faiyum","Gharbia","Ismailia","Kafr El Sheikh",
		"Luxor","Matruh","Minya","Monufia","New Valley",
		"North Sinai","Port Said","Qalyubia","Qena",
		"Red Sea","Sharqia","Sohag","South Sinai","Suez"
	};
	return egyptStates;
}
else if(countryName == "Nigeria")
{
	String[] nigeriaStates = {
		"Abia","Adamawa","Akwa Ibom","Anambra","Bauchi",
		"Bayelsa","Benue","Borno","Cross River","Delta",
		"Ebonyi","Edo","Ekiti","Enugu","Gombe",
		"Imo","Jigawa","Kaduna","Kano","Katsina",
		"Kebbi","Kogi","Kwara","Lagos","Nasarawa",
		"Niger","Ogun","Ondo","Osun","Oyo",
		"Plateau","Rivers","Sokoto","Taraba","Yobe","Zamfara"
	};
	return nigeriaStates;
}
else if(countryName == "Kenya")
{
	String[] kenyaStates = {
		"Nairobi","Mombasa","Kisumu","Nakuru","Eldoret",
		"Thika","Machakos","Meru","Nyeri","Embu",
		"Kericho","Bomet","Kakamega","Bungoma","Busia",
		"Kilifi","Malindi","Garissa","Wajir","Mandera"
	};
	return kenyaStates;
}
else if(countryName == "Pakistan")
{
	String[] pakistanStates = {
		"Punjab","Sindh","Khyber Pakhtunkhwa","Balochistan",
		"Gilgit-Baltistan","Azad Kashmir","Islamabad Capital Territory"
	};
	return pakistanStates;
}
else if(countryName == "Bangladesh")
{
	String[] bangladeshStates = {
		"Dhaka","Chattogram","Rajshahi","Khulna","Barishal",
		"Sylhet","Rangpur","Mymensingh"
	};
	return bangladeshStates;
}
else if(countryName == "SriLanka")
{
	String[] sriLankaStates = {
		"Western","Central","Southern","Northern","Eastern",
		"North Western","North Central","Uva","Sabaragamuwa"
	};
	return sriLankaStates;
}
else if(countryName == "Nepal")
{
	String[] nepalStates = {
		"Koshi","Madhesh","Bagmati","Gandaki",
		"Lumbini","Karnali","Sudurpashchim"
	};
	return nepalStates;
}
else if(countryName == "Bhutan")
{
	String[] bhutanStates = {
		"Bumthang","Chukha","Dagana","Gasa","Haa",
		"Lhuntse","Mongar","Paro","Pemagatshel",
		"Punakha","Samdrup Jongkhar","Samtse",
		"Sarpang","Thimphu","Trashigang",
		"Trashiyangtse","Trongsa","Tsirang",
		"Wangdue Phodrang","Zhemgang"
	};
	return bhutanStates;
}
else if(countryName == "Myanmar")
{
	String[] myanmarStates = {
		"Ayeyarwady","Bago","Chin","Kachin","Kayah",
		"Kayin","Magway","Mandalay","Mon",
		"Naypyidaw","Rakhine","Sagaing","Shan","Tanintharyi","Yangon"
	};
	return myanmarStates;
}
else if(countryName == "Thailand")
{
	String[] thailandStates = {
		"Bangkok","Chiang Mai","Chiang Rai","Phuket","Krabi",
		"Chonburi","Rayong","Nakhon Ratchasima","Udon Thani",
		"Khon Kaen","Surat Thani","Songkhla","Trang","Satun"
	};
	return thailandStates;
}
else if(countryName == "Malaysia")
{
	String[] malaysiaStates = {
		"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan",
		"Pahang","Penang","Perak","Perlis","Sabah",
		"Sarawak","Selangor","Terengganu","Kuala Lumpur","Putrajaya","Labuan"
	};
	return malaysiaStates;
}
else if(countryName == "Singapore")
{
	String[] singaporeStates = {
		"Central Region","East Region","North Region","North-East Region","West Region"
	};
	return singaporeStates;
}
else if(countryName == "Indonesia")
{
	String[] indonesiaStates = {
		"Aceh","Bali","Banten","Bengkulu","Central Java",
		"Central Kalimantan","Central Sulawesi","East Java","East Kalimantan",
		"East Nusa Tenggara","Gorontalo","Jakarta","Jambi",
		"Lampung","Maluku","North Kalimantan","North Maluku",
		"North Sulawesi","North Sumatra","Papua","Riau",
		"Riau Islands","South Kalimantan","South Sulawesi",
		"South Sumatra","Southeast Sulawesi","West Java",
		"West Kalimantan","West Nusa Tenggara","West Papua","West Sulawesi","West Sumatra","Yogyakarta"
	};
	return indonesiaStates;
}
else if(countryName == "Philippines")
{
	String[] philippinesStates = {
		"Abra","Agusan del Norte","Agusan del Sur","Aklan","Albay",
		"Antique","Apayao","Aurora","Basilan","Bataan",
		"Batanes","Batangas","Benguet","Biliran","Bohol",
		"Bukidnon","Bulacan","Cagayan","Camarines Norte","Camarines Sur",
		"Capiz","Catanduanes","Cavite","Cebu","Cotabato",
		"Davao del Norte","Davao del Sur","Davao Oriental","Dinagat Islands",
		"Eastern Samar","Guimaras","Ifugao","Ilocos Norte","Ilocos Sur",
		"Iloilo","Isabela","Kalinga","La Union","Laguna",
		"Lanao del Norte","Lanao del Sur","Leyte","Maguindanao","Marinduque",
		"Masbate","Misamis Occidental","Misamis Oriental","Mountain Province",
		"Negros Occidental","Negros Oriental","Northern Samar","Nueva Ecija",
		"Nueva Vizcaya","Occidental Mindoro","Oriental Mindoro","Palawan",
		"Pampanga","Pangasinan","Quezon","Quirino","Rizal",
		"Romblon","Samar","Sarangani","Siquijor","Sorsogon",
		"South Cotabato","Southern Leyte","Sultan Kudarat","Sulu",
		"Surigao del Norte","Surigao del Sur","Tarlac","Tawi-Tawi",
		"Zambales","Zamboanga del Norte","Zamboanga del Sur","Zamboanga Sibugay"
	};
	return philippinesStates;
}
else if(countryName == "Vietnam")
{
	String[] vietnamStates = {
		"An Giang","Ba Ria-Vung Tau","Bac Giang","Bac Kan","Bac Lieu",
		"Bac Ninh","Ben Tre","Binh Dinh","Binh Duong","Binh Phuoc",
		"Binh Thuan","Ca Mau","Can Tho","Cao Bang","Da Nang",
		"Dak Lak","Dak Nong","Dien Bien","Dong Nai","Dong Thap",
		"Gia Lai","Ha Giang","Ha Nam","Ha Noi","Ha Tinh",
		"Hai Duong","Hai Phong","Hau Giang","Hoa Binh","Hung Yen",
		"Khanh Hoa","Kien Giang","Kon Tum","Lai Chau","Lam Dong",
		"Lang Son","Lao Cai","Long An","Nam Dinh","Nghe An",
		"Ninh Binh","Ninh Thuan","Phu Tho","Phu Yen","Quang Binh",
		"Quang Nam","Quang Ngai","Quang Ninh","Quang Tri",
		"Soc Trang","Son La","Tay Ninh","Thai Binh","Thai Nguyen",
		"Thanh Hoa","Thua Thien-Hue","Tien Giang","Tra Vinh",
		"Tuyen Quang","Vinh Long","Vinh Phuc","Yen Bai"
	};
	return vietnamStates;
}
else if(countryName == "Cambodia")
{
	String[] cambodiaStates = {
		"Banteay Meanchey","Battambang","Kampong Cham","Kampong Chhnang",
		"Kampong Speu","Kampong Thom","Kampot","Kandal","Kep",
		"Koh Kong","Kratie","Mondulkiri","Oddar Meanchey","Pailin",
		"Phnom Penh","Preah Sihanouk","Preah Vihear","Pursat",
		"Ratanakiri","Siem Reap","Stung Treng","Svay Rieng",
		"Takeo","Tboung Khmum"
	};
	return cambodiaStates;
}
else if(countryName == "Laos")
{
	String[] laosStates = {
		"Attapeu","Bokeo","Bolikhamxai","Champasak","Houaphanh",
		"Khammouane","Luang Namtha","Luang Prabang","Oudomxay",
		"Phongsaly","Salavan","Savannakhet","Sekong","Vientiane",
		"Xaisomboun","Xayaboury","Xiangkhouang"
	};
	return laosStates;
}
else if(countryName == "Mongolia")
{
	String[] mongoliaStates = {
		"Arkhangai","Bayan-Olgii","Bayankhongor","Bulgan","Darkhan-Uul",
		"Dornod","Dornogovi","Dundgovi","Govi-Altai","Govisumber",
		"Khentii","Khovd","Khovsgol","Orkhon","Ovorkhangai",
		"Selenge","Sukhbaatar","Tov","Uvs","Zavkhan","Ulaanbaatar"
	};
	return mongoliaStates;
}
else if(countryName == "Afghanistan")
{
	String[] afghanistanStates = {
		"Badakhshan","Badghis","Baghlan","Balkh","Bamyan",
		"Daykundi","Farah","Faryab","Ghazni","Ghor",
		"Helmand","Herat","Jowzjan","Kabul","Kandahar",
		"Kapisa","Khost","Kunar","Kunduz","Laghman",
		"Logar","Nangarhar","Nimruz","Nuristan","Paktia",
		"Paktika","Panjshir","Parwan","Samangan","Sar-e Pol",
		"Takhar","Uruzgan","Wardak","Zabul"
	};
	return afghanistanStates;
}
else if(countryName == "Israel")
{
	String[] israelStates = {
		"Jerusalem","Tel Aviv","Haifa","Northern District",
		"Southern District","Central District","Judea and Samaria"
	};
	return israelStates;
}
else if(countryName == "Jordan")
{
	String[] jordanStates = {
		"Amman","Balqa","Irbid","Jerash","Ajloun",
		"Mafraq","Zarqa","Madaba","Karak","Tafilah",
		"Maan","Aqaba"
	};
	return jordanStates;
}
else if(countryName == "Lebanon")
{
	String[] lebanonStates = {
		"Beirut","Mount Lebanon","North Lebanon",
		"Akkar","Bekaa","Baalbek-Hermel","South Lebanon","Nabatieh"
	};
	return lebanonStates;
}
else if(countryName == "Syria")
{
	String[] syriaStates = {
		"Damascus","Aleppo","Homs","Hama","Latakia",
		"Tartus","Idlib","Raqqa","Deir ez-Zor",
		"Hasakah","Daraa","As-Suwayda","Quneitra","Rif Dimashq"
	};
	return syriaStates;
}
else if(countryName == "Iran")
{
	String[] iranStates = {
		"Tehran","Isfahan","Fars","Khuzestan","East Azerbaijan",
		"West Azerbaijan","Kerman","Khorasan Razavi","Mazandaran",
		"Gilan","Yazd","Qom","Alborz","Hormozgan"
	};
	return iranStates;
}
else if(countryName == "Yemen")
{
	String[] yemenStates = {
		"Aden","Sanaa","Taiz","Al Hudaydah","Ibb",
		"Dhamar","Amran","Saada","Hajjah","Al Bayda",
		"Shabwah","Hadhramaut","Al Mahrah","Raymah","Al Jawf"
	};
	return yemenStates;
}
else if(countryName == "Oman")
{
	String[] omanStates = {
		"Muscat","Dhofar","Al Batinah North","Al Batinah South",
		"Al Dakhiliyah","Ash Sharqiyah North","Ash Sharqiyah South",
		"Al Dhahirah","Al Buraimi","Musandam"
	};
	return omanStates;
}
else if(countryName == "Morocco")
{
	String[] moroccoStates = {
		"Tanger-Tetouan-Al Hoceima","Oriental","Fes-Meknes",
		"Rabat-Sale-Kenitra","Beni Mellal-Khenifra",
		"Casablanca-Settat","Marrakesh-Safi",
		"Draa-Tafilalet","Souss-Massa",
		"Guelmim-Oued Noun","Laayoune-Sakia El Hamra","Dakhla-Oued Ed-Dahab"
	};
	return moroccoStates;
}
else if(countryName == "Algeria")
{
	String[] algeriaStates = {
		"Adrar","Chlef","Laghouat","Oum El Bouaghi","Batna",
		"Bejaia","Biskra","Bechar","Blida","Bouira",
		"Tamanrasset","Tebessa","Tlemcen","Tiaret","Tizi Ouzou",
		"Algiers","Djelfa","Jijel","Setif","Saida",
		"Skikda","Sidi Bel Abbes","Annaba","Guelma","Constantine"
	};
	return algeriaStates;
}
else if(countryName == "Tunisia")
{
	String[] tunisiaStates = {
		"Tunis","Ariana","Ben Arous","Manouba","Nabeul",
		"Zaghouan","Bizerte","Beja","Jendouba","Kef",
		"Siliana","Sousse","Monastir","Mahdia","Sfax",
		"Kairouan","Kasserine","Sidi Bouzid","Gabes","Medenine",
		"Tataouine","Gafsa","Tozeur","Kebili"
	};
	return tunisiaStates;
}
else if(countryName == "Libya")
{
	String[] libyaStates = {
		"Tripoli","Benghazi","Misrata","Zawiya","Zliten",
		"Sirte","Derna","Tobruk","Ajdabiya","Sabha",
		"Murzuq","Ghat","Nalut","Gharyan","Al Bayda"
	};
	return libyaStates;
}
else if(countryName == "Sudan")
{
	String[] sudanStates = {
		"Khartoum","Gezira","Blue Nile","Sennar","White Nile",
		"North Darfur","South Darfur","West Darfur","Central Darfur",
		"North Kordofan","South Kordofan","River Nile","Northern","Red Sea"
	};
	return sudanStates;
}
else if(countryName == "Ethiopia")
{
	String[] ethiopiaStates = {
		"Addis Ababa","Afar","Amhara","Benishangul-Gumuz","Dire Dawa",
		"Gambela","Harari","Oromia","Sidama","Somali",
		"South West Ethiopia","Southern Nations","Tigray"
	};
	return ethiopiaStates;
}
else if(countryName == "Tanzania")
{
	String[] tanzaniaStates = {
		"Dar es Salaam","Dodoma","Arusha","Kilimanjaro","Tanga",
		"Morogoro","Pwani","Iringa","Mbeya","Ruvuma",
		"Mtwara","Lindi","Singida","Tabora","Shinyanga",
		"Kagera","Mara","Simiyu","Geita","Katavi"
	};
	return tanzaniaStates;
}
else if(countryName == "Uganda")
{
	String[] ugandaStates = {
		"Central","Eastern","Northern","Western"
	};
	return ugandaStates;
}
else if(countryName == "Rwanda")
{
	String[] rwandaStates = {
		"Northern","Southern","Eastern","Western","Kigali City"
	};
	return rwandaStates;
}
else if(countryName == "Burundi")
{
	String[] burundiStates = {
		"Bubanza","Bujumbura Mairie","Bujumbura Rural","Bururi","Cankuzo",
		"Cibitoke","Gitega","Karuzi","Kayanza","Kirundo",
		"Makamba","Muramvya","Muyinga","Mwaro","Ngozi","Rutana","Ruyigi"
	};
	return burundiStates;
}
else if(countryName == "Ghana")
{
	String[] ghanaStates = {
		"Ashanti","Ahafo","Bono","Bono East","Central",
		"Eastern","Greater Accra","North East","Northern",
		"Oti","Savannah","Upper East","Upper West",
		"Volta","Western","Western North"
	};
	return ghanaStates;
}
else if(countryName == "IvoryCoast")
{
	String[] ivoryCoastStates = {
		"Abidjan","Bas-Sassandra","Comoe","Denguele","Goh-Djiboua",
		"Lagunes","Montagnes","Sassandra-Marahoue",
		"Savanes","Vallee du Bandama","Woroba","Yamoussoukro","Zanzan"
	};
	return ivoryCoastStates;
}
else if(countryName == "Senegal")
{
	String[] senegalStates = {
		"Dakar","Diourbel","Fatick","Kaffrine","Kaolack",
		"Kedougou","Kolda","Louga","Matam","Saint-Louis",
		"Sedhiou","Tambacounda","Thies","Ziguinchor"
	};
	return senegalStates;
}
else if(countryName == "Cameroon")
{
	String[] cameroonStates = {
		"Adamawa","Centre","East","Far North","Littoral",
		"North","Northwest","South","Southwest","West"
	};
	return cameroonStates;
}
else if(countryName == "Angola")
{
	String[] angolaStates = {
		"Bengo","Benguela","Bie","Cabinda","Cuando Cubango",
		"Cuanza Norte","Cuanza Sul","Cunene","Huambo","Huila",
		"Luanda","Lunda Norte","Lunda Sul","Malanje",
		"Moxico","Namibe","Uige","Zaire"
	};
	return angolaStates;
}
else if(countryName == "Zambia")
{
	String[] zambiaStates = {
		"Central","Copperbelt","Eastern","Luapula","Lusaka",
		"Muchinga","Northern","North-Western",
		"Southern","Western"
	};
	return zambiaStates;
}
else if(countryName == "Zimbabwe")
{
	String[] zimbabweStates = {
		"Bulawayo","Harare","Manicaland","Mashonaland Central",
		"Mashonaland East","Mashonaland West",
		"Masvingo","Matabeleland North","Matabeleland South","Midlands"
	};
	return zimbabweStates;
}
else if(countryName == "Norway")
{
	String[] norwayStates = {
		"Oslo","Viken","Innlandet","Vestfold og Telemark",
		"Agder","Rogaland","Vestland","More og Romsdal",
		"Trondelag","Nordland","Troms og Finnmark"
	};
	return norwayStates;
}
else if(countryName == "Sweden")
{
	String[] swedenStates = {
		"Stockholm","Uppsala","Sodermanland","Ostergotland",
		"Jonkoping","Kronoberg","Kalmar","Gotland",
		"Blekinge","Skane","Halland","Vastra Gotaland",
		"Varmland","Orebro","Vastmanland","Dalarna",
		"Gavleborg","Vasternorrland","Jamtland","Vasterbotten","Norrbotten"
	};
	return swedenStates;
}
else if(countryName == "Finland")
{
	String[] finlandStates = {
		"Uusimaa","Varsinais-Suomi","Satakunta","Kanta-Hame",
		"Pirkanmaa","Paijat-Hame","Kymenlaakso","South Karelia",
		"Etela-Savo","Pohjois-Savo","North Karelia","Central Finland",
		"South Ostrobothnia","Ostrobothnia","Central Ostrobothnia",
		"North Ostrobothnia","Kainuu","Lapland","Aland Islands"
	};
	return finlandStates;
}
else if(countryName == "Denmark")
{
	String[] denmarkStates = {
		"Capital Region","Central Denmark","North Denmark",
		"Region Zealand","Region of Southern Denmark"
	};
	return denmarkStates;
}
else if(countryName == "Netherlands")
{
	String[] netherlandsStates = {
		"Drenthe","Flevoland","Friesland","Gelderland",
		"Groningen","Limburg","North Brabant","North Holland",
		"Overijssel","South Holland","Utrecht","Zeeland"
	};
	return netherlandsStates;
}
else if(countryName == "Belgium")
{
	String[] belgiumStates = {
		"Flanders","Wallonia","Brussels-Capital Region"
	};
	return belgiumStates;
}
else if(countryName == "Switzerland")
{
	String[] switzerlandStates = {
		"Zurich","Bern","Lucerne","Uri","Schwyz",
		"Obwalden","Nidwalden","Glarus","Zug","Fribourg",
		"Solothurn","Basel-Stadt","Basel-Landschaft","Schaffhausen",
		"Appenzell Ausserrhoden","Appenzell Innerrhoden",
		"St. Gallen","Graubunden","Aargau","Thurgau",
		"Ticino","Vaud","Valais","Neuchatel","Geneva","Jura"
	};
	return switzerlandStates;
}
else if(countryName == "Austria")
{
	String[] austriaStates = {
		"Burgenland","Carinthia","Lower Austria","Upper Austria",
		"Salzburg","Styria","Tyrol","Vorarlberg","Vienna"
	};
	return austriaStates;
}
else if(countryName == "Poland")
{
	String[] polandStates = {
		"Lower Silesian","Kuyavian-Pomeranian","Lublin","Lubusz",
		"Lodz","Lesser Poland","Masovian","Opole",
		"Subcarpathian","Podlaskie","Pomeranian","Silesian",
		"Swietokrzyskie","Warmian-Masurian","Greater Poland","West Pomeranian"
	};
	return polandStates;
}
else if(countryName == "CzechRepublic")
{
	String[] czechRepublicStates = {
		"Prague","Central Bohemian","South Bohemian","Plzen",
		"Karlovy Vary","Usti nad Labem","Liberec","Hradec Kralove",
		"Pardubice","Vysocina","South Moravian","Olomouc",
		"Zlin","Moravian-Silesian"
	};
	return czechRepublicStates;
}
else if(countryName == "Slovakia")
{
	String[] slovakiaStates = {
		"Bratislava","Trnava","Trencin","Nitra",
		"Zilina","Banska Bystrica","Presov","Kosice"
	};
	return slovakiaStates;
}
else if(countryName == "Hungary")
{
	String[] hungaryStates = {
		"Budapest","Bacs-Kiskun","Baranya","Bekes","Borsod-Abauj-Zemplen",
		"Csongrad-Csanad","Fejer","Gyor-Moson-Sopron","Hajdu-Bihar",
		"Heves","Jasz-Nagykun-Szolnok","Komarom-Esztergom","Nograd",
		"Pest","Somogy","Szabolcs-Szatmar-Bereg","Tolna","Vas",
		"Veszprem","Zala"
	};
	return hungaryStates;
}
else if(countryName == "Romania")
{
	String[] romaniaStates = {
		"Alba","Arad","Arges","Bacau","Bihor",
		"Bistrita-Nasaud","Botosani","Braila","Brasov","Bucuresti",
		"Buzau","Calarasi","Caras-Severin","Cluj","Constanta",
		"Covasna","Dambovita","Dolj","Galati","Giurgiu",
		"Gorj","Harghita","Hunedoara","Ialomita","Iasi",
		"Ilfov","Maramures","Mehedinti","Mures","Neamt",
		"Olt","Prahova","Salaj","Satu Mare","Sibiu",
		"Suceava","Teleorman","Timis","Tulcea","Valcea","Vaslui","Vrancea"
	};
	return romaniaStates;
}
else if(countryName == "Bulgaria")
{
	String[] bulgariaStates = {
		"Blagoevgrad","Burgas","Dobrich","Gabrovo","Haskovo",
		"Kardzhali","Kyustendil","Lovech","Montana","Pazardzhik",
		"Pernik","Pleven","Plovdiv","Razgrad","Ruse",
		"Shumen","Silistra","Sliven","Smolyan","Sofia City",
		"Sofia Province","Stara Zagora","Targovishte","Varna","Veliko Tarnovo","Vidin","Vratsa","Yambol"
	};
	return bulgariaStates;
}
else if(countryName == "Greece")
{
	String[] greeceStates = {
		"Attica","Central Greece","Central Macedonia","Crete",
		"East Macedonia and Thrace","Epirus","Ionian Islands",
		"North Aegean","Peloponnese","South Aegean","Thessaly","West Greece","West Macedonia"
	};
	return greeceStates;
}
else if(countryName == "Portugal")
{
	String[] portugalStates = {
		"Aveiro","Beja","Braga","Braganca","Castelo Branco",
		"Coimbra","Evora","Faro","Guarda","Leiria",
		"Lisbon","Portalegre","Porto","Santarem","Setubal",
		"Viana do Castelo","Vila Real","Viseu",
		"Azores","Madeira"
	};
	return portugalStates;
}
else if(countryName == "Ireland")
{
	String[] irelandStates = {
		"Carlow","Cavan","Clare","Cork","Donegal",
		"Dublin","Galway","Kerry","Kildare","Kilkenny",
		"Laois","Leitrim","Limerick","Longford","Louth",
		"Mayo","Meath","Monaghan","Offaly","Roscommon",
		"Sligo","Tipperary","Waterford","Westmeath","Wexford","Wicklow"
	};
	return irelandStates;
}
else if(countryName == "Iceland")
{
	String[] icelandStates = {
		"Capital Region","Southern Peninsula","West","Westfjords",
		"Northwest","Northeast","East","South"
	};
	return icelandStates;
}
else if(countryName == "Estonia")
{
	String[] estoniaStates = {
		"Harju","Hiiu","Ida-Viru","Jogeva","Jarva",
		"Laane","Laane-Viru","Parnu","Polva","Rapla",
		"Saare","Tartu","Valga","Viljandi","Voru"
	};
	return estoniaStates;
}
else if(countryName == "Latvia")
{
	String[] latviaStates = {
		"Riga","Vidzeme","Latgale","Kurzeme","Zemgale"
	};
	return latviaStates;
}
else if(countryName == "Lithuania")
{
	String[] lithuaniaStates = {
		"Alytus","Kaunas","Klaipeda","Marijampole","Panevezys",
		"Siauliai","Taurage","Telsiai","Utena","Vilnius"
	};
	return lithuaniaStates;
}
else if(countryName == "Belarus")
{
	String[] belarusStates = {
		"Brest","Gomel","Grodno","Minsk","Minsk City","Mogilev","Vitebsk"
	};
	return belarusStates;
}
else if(countryName == "Ukraine")
{
	String[] ukraineStates = {
		"Cherkasy","Chernihiv","Chernivtsi","Dnipro","Donetsk",
		"Ivano-Frankivsk","Kharkiv","Kherson","Khmelnytskyi","Kyiv",
		"Kyiv City","Kirovohrad","Luhansk","Lviv","Mykolaiv",
		"Odesa","Poltava","Rivne","Sumy","Ternopil",
		"Vinnytsia","Volyn","Zakarpattia","Zaporizhzhia","Zhytomyr"
	};
	return ukraineStates;
}
else if(countryName == "Moldova")
{
	String[] moldovaStates = {
		"Anenii Noi","Balti","Basarabeasca","Briceni","Cahul",
		"Calarasi","Cantemir","Chisinau","Cimislia","Criuleni",
		"Donduseni","Drochia","Dubasari","Edinet","Falesti",
		"Floresti","Glodeni","Hincesti","Ialoveni","Leova",
		"Nisporeni","Ocnita","Orhei","Rezina","Riscani",
		"Sangerei","Soroca","Stefan Voda","Straseni","Taraclia",
		"Telenesti","Ungheni"
	};
	return moldovaStates;
}
else if(countryName == "Croatia")
{
	String[] croatiaStates = {
		"Zagreb","Split-Dalmatia","Dubrovnik-Neretva","Istria",
		"Karlovac","Koprivnica-Krizevci","Krapina-Zagorje",
		"Lika-Senj","Medimurje","Osijek-Baranja",
		"Pozega-Slavonia","Primorje-Gorski Kotar","Sibenik-Knin",
		"Sisak-Moslavina","Varazdin","Virovitica-Podravina",
		"Vukovar-Syrmia","Zadar","Zagreb County","Bjelovar-Bilogora"
	};
	return croatiaStates;
}
else if(countryName == "Slovenia")
{
	String[] sloveniaStates = {
		"Ajdovscina","Bled","Bovec","Celje","Domzale",
		"Idrija","Izola","Jesenice","Koper","Kranj",
		"Ljubljana","Maribor","Murska Sobota","Nova Gorica",
		"Novo Mesto","Piran","Postojna","Ptuj","Skofja Loka","Velenje"
	};
	return sloveniaStates;
}
else if(countryName == "Serbia")
{
	String[] serbiaStates = {
		"Belgrade","Vojvodina","Sumadija","Pomoravlje","Bor",
		"Branicevo","Jablanica","Kolubara","Macva","Morava",
		"Nisava","Pcinja","Pirot","Rasina","Raska",
		"Toplica","Zajecar","Zlatibor"
	};
	return serbiaStates;
}
else if(countryName == "Bosnia")
{
	String[] bosniaStates = {
		"Una-Sana","Posavina","Tuzla","Zenica-Doboj","Bosnian Podrinje",
		"Central Bosnia","Herzegovina-Neretva","West Herzegovina",
		"Sarajevo","Canton 10","Republika Srpska","Brcko District"
	};
	return bosniaStates;
}
else if(countryName == "Montenegro")
{
	String[] montenegroStates = {
		"Andrijevica","Bar","Berane","Bijelo Polje","Budva",
		"Cetinje","Danilovgrad","Herceg Novi","Kolasin","Kotor",
		"Mojkovac","Niksic","Plav","Pljevlja","Pluzine",
		"Podgorica","Rozaje","Savnik","Tivat","Ulcinj","Zabljak"
	};
	return montenegroStates;
}
else if(countryName == "Albania")
{
	String[] albaniaStates = {
		"Berat","Diber","Durres","Elbasan","Fier",
		"Gjirokaster","Korce","Kukes","Lezhe","Shkoder",
		"Tirana","Vlore"
	};
	return albaniaStates;
}
else if(countryName == "NorthMacedonia")
{
	String[] northMacedoniaStates = {
		"Skopje","Bitola","Kumanovo","Prilep","Tetovo",
		"Veles","Stip","Ohrid","Gostivar","Strumica"
	};
	return northMacedoniaStates;
}
else if(countryName == "Kosovo")
{
	String[] kosovoStates = {
		"Pristina","Prizren","Peja","Gjakova","Gjilan",
		"Mitrovica","Ferizaj"
	};
	return kosovoStates;
}
else if(countryName == "Armenia")
{
	String[] armeniaStates = {
		"Aragatsotn","Ararat","Armavir","Gegharkunik",
		"Kotayk","Lori","Shirak","Syunik","Tavush","Vayots Dzor","Yerevan"
	};
	return armeniaStates;
}
else if(countryName == "Georgia")
{
	String[] georgiaStates = {
		"Abkhazia","Adjara","Guria","Imereti","Kakheti",
		"Kvemo Kartli","Mtskheta-Mtianeti","Racha-Lechkhumi",
		"Samegrelo-Zemo Svaneti","Samtskhe-Javakheti","Shida Kartli","Tbilisi"
	};
	return georgiaStates;
}
else if(countryName == "Azerbaijan")
{
	String[] azerbaijanStates = {
		"Absheron","Agdam","Agdash","Agjabadi","Agstafa",
		"Astara","Baku","Balakan","Barda","Beylagan",
		"Bilasuvar","Dashkasan","Fuzuli","Ganja","Goychay",
		"Lankaran","Masally","Mingachevir","Nakhchivan","Quba",
		"Qusar","Shaki","Shamakhi","Sumqayit","Tartar"
	};
	return azerbaijanStates;
}
else if(countryName == "Kazakhstan")
{
	String[] kazakhstanStates = {
		"Akmola","Aktobe","Almaty","Atyrau","East Kazakhstan",
		"Jambyl","Karaganda","Kostanay","Kyzylorda","Mangystau",
		"North Kazakhstan","Pavlodar","Turkistan","West Kazakhstan","Astana","Shymkent"
	};
	return kazakhstanStates;
}
else if(countryName == "Uzbekistan")
{
	String[] uzbekistanStates = {
		"Andijan","Bukhara","Fergana","Jizzakh","Karakalpakstan",
		"Namangan","Navoiy","Qashqadaryo","Samarkand","Sirdaryo",
		"Surxondaryo","Tashkent","Xorazm"
	};
	return uzbekistanStates;
}
else if(countryName == "Turkmenistan")
{
	String[] turkmenistanStates = {
		"Ahal","Balkan","Dashoguz","Lebap","Mary","Ashgabat"
	};
	return turkmenistanStates;
}
else if(countryName == "Kyrgyzstan")
{
	String[] kyrgyzstanStates = {
		"Bishkek","Chuy","Issyk-Kul","Jalal-Abad",
		"Naryn","Osh","Talas","Batken"
	};
	return kyrgyzstanStates;
}
else if(countryName == "Tajikistan")
{
	String[] tajikistanStates = {
		"Dushanbe","Gorno-Badakhshan","Khatlon","Sughd"
	};
	return tajikistanStates;
}
else if(countryName == "SriLanka")
{
	String[] sriLankaStates = {
		"Western","Central","Southern","Northern","Eastern",
		"North Western","North Central","Uva","Sabaragamuwa"
	};
	return sriLankaStates;
}
else if(countryName == "Maldives")
{
	String[] maldivesStates = {
		"Male","Addu City","Fuvahmulah","North Thiladhunmathi",
		"South Thiladhunmathi","North Miladhunmadulu","South Miladhunmadulu",
		"North Maalhosmadulu","South Maalhosmadulu","Faadhippolhu",
		"North Ari","South Ari","Felidhu","Mulaku","Nilandhe North",
		"Nilandhe South","Kolhumadulu","Hadhunmathi","Huvadhu North",
		"Huvadhu South"
	};
	return maldivesStates;
}
else if(countryName == "Myanmar")
{
	String[] myanmarStates = {
		"Ayeyarwady","Bago","Chin","Kachin","Kayah",
		"Kayin","Magway","Mandalay","Mon","Naypyidaw",
		"Rakhine","Sagaing","Shan","Tanintharyi","Yangon"
	};
	return myanmarStates;
}
else if(countryName == "Brunei")
{
	String[] bruneiStates = {
		"Brunei-Muara","Belait","Tutong","Temburong"
	};
	return bruneiStates;
}
else if(countryName == "PapuaNewGuinea")
{
	String[] papuaNewGuineaStates = {
		"Central","Chimbu","Eastern Highlands","East New Britain",
		"East Sepik","Enga","Gulf","Hela","Jiwaka",
		"Madang","Manus","Milne Bay","Morobe","National Capital District",
		"New Ireland","Northern","Southern Highlands","West New Britain",
		"Western","Western Highlands"
	};
	return papuaNewGuineaStates;
}
else if(countryName == "Fiji")
{
	String[] fijiStates = {
		"Central","Eastern","Northern","Western","Rotuma"
	};
	return fijiStates;
}
else if(countryName == "SolomonIslands")
{
	String[] solomonIslandsStates = {
		"Central","Choiseul","Guadalcanal","Honiara",
		"Isabel","Makira-Ulawa","Malaita","Rennell and Bellona",
		"Temotu","Western"
	};
	return solomonIslandsStates;
}
else if(countryName == "Samoa")
{
	String[] samoaStates = {
		"Aana","Aiga-i-le-Tai","Atua","Fa'asaleleaga",
		"Gaga'emauga","Gagaifomauga","Palauli",
		"Satupa'itea","Tuamasaga","Vaisigano"
	};
	return samoaStates;
}
else if(countryName == "Tonga")
{
	String[] tongaStates = {
		"Eua","Haapai","Niuas","Tongatapu","Vavau"
	};
	return tongaStates;
}
else if(countryName == "Vanuatu")
{
	String[] vanuatuStates = {
		"Malampa","Penama","Sanma","Shefa","Tafea","Torba"
	};
	return vanuatuStates;
}
else if(countryName == "NewZealand")
{
	String[] newZealandStates = {
		"Northland","Auckland","Waikato","Bay of Plenty",
		"Gisborne","Hawkes Bay","Taranaki","Manawatu-Whanganui",
		"Wellington","Tasman","Nelson","Marlborough",
		"West Coast","Canterbury","Otago","Southland"
	};
	return newZealandStates;
}
else if(countryName == "Japan")
{
	String[] japanStates = {
		"Hokkaido","Aomori","Iwate","Miyagi","Akita","Yamagata","Fukushima",
		"Ibaraki","Tochigi","Gunma","Saitama","Chiba","Tokyo","Kanagawa",
		"Niigata","Toyama","Ishikawa","Fukui","Yamanashi","Nagano",
		"Gifu","Shizuoka","Aichi","Mie","Shiga","Kyoto","Osaka","Hyogo",
		"Nara","Wakayama","Tottori","Shimane","Okayama","Hiroshima",
		"Yamaguchi","Tokushima","Kagawa","Ehime","Kochi","Fukuoka",
		"Saga","Nagasaki","Kumamoto","Oita","Miyazaki","Kagoshima","Okinawa"
	};
	return japanStates;
}
else if(countryName == "SouthKorea")
{
	String[] southKoreaStates = {
		"Seoul","Busan","Daegu","Incheon","Gwangju","Daejeon","Ulsan",
		"Sejong","Gyeonggi","Gangwon","North Chungcheong","South Chungcheong",
		"North Jeolla","South Jeolla","North Gyeongsang","South Gyeongsang","Jeju"
	};
	return southKoreaStates;
}
else if(countryName == "NorthKorea")
{
	String[] northKoreaStates = {
		"Pyongyang","Chagang","North Hamgyong","South Hamgyong",
		"North Hwanghae","South Hwanghae","Kangwon",
		"North Pyongan","South Pyongan","Ryanggang"
	};
	return northKoreaStates;
}
else if(countryName == "Taiwan")
{
	String[] taiwanStates = {
		"Taipei","New Taipei","Taoyuan","Taichung","Tainan",
		"Kaohsiung","Keelung","Hsinchu","Chiayi","Miaoli",
		"Changhua","Nantou","Yunlin","Pingtung","Yilan",
		"Hualien","Taitung","Penghu","Kinmen","Lienchiang"
	};
	return taiwanStates;
}
else if(countryName == "HongKong")
{
	String[] hongKongStates = {
		"Hong Kong Island","Kowloon","New Territories"
	};
	return hongKongStates;
}
else if(countryName == "Macau")
{
	String[] macauStates = {
		"Macau Peninsula","Taipa","Coloane"
	};
	return macauStates;
}
else if(countryName == "Thailand")
{
	String[] thailandStates = {
		"Bangkok","Chiang Mai","Chiang Rai","Phuket","Krabi",
		"Chonburi","Rayong","Udon Thani","Khon Kaen","Surat Thani"
	};
	return thailandStates;
}
else if(countryName == "Malaysia")
{
	String[] malaysiaStates = {
		"Johor","Kedah","Kelantan","Malacca","Negeri Sembilan",
		"Pahang","Penang","Perak","Perlis","Sabah",
		"Sarawak","Selangor","Terengganu","Kuala Lumpur","Putrajaya","Labuan"
	};
	return malaysiaStates;
}
else if(countryName == "Indonesia")
{
	String[] indonesiaStates = {
		"Aceh","Bali","Banten","Bengkulu","Central Java",
		"East Java","West Java","Jakarta","Yogyakarta",
		"South Sumatra","North Sumatra","Riau","Riau Islands",
		"West Sumatra","Lampung","Jambi","Bangka Belitung"
	};
	return indonesiaStates;
}
else if(countryName == "SouthAfrica")
{
	String[] southAfricaStates = {
		"Eastern Cape","Free State","Gauteng","KwaZulu-Natal",
		"Limpopo","Mpumalanga","Northern Cape","North West","Western Cape"
	};
	return southAfricaStates;
}
else if(countryName == "Namibia")
{
	String[] namibiaStates = {
		"Erongo","Hardap","Karas","Kavango East","Kavango West",
		"Khomas","Kunene","Ohangwena","Omaheke","Omusati",
		"Oshana","Oshikoto","Otjozondjupa","Zambezi"
	};
	return namibiaStates;
}
else if(countryName == "Botswana")
{
	String[] botswanaStates = {
		"Central","Chobe","Ghanzi","Kgalagadi",
		"Kgatleng","Kweneng","North-East","North-West","South-East","Southern"
	};
	return botswanaStates;
}
else if(countryName == "Mozambique")
{
	String[] mozambiqueStates = {
		"Cabo Delgado","Gaza","Inhambane","Manica","Maputo",
		"Maputo City","Nampula","Niassa","Sofala","Tete","Zambezia"
	};
	return mozambiqueStates;
}
else if(countryName == "Malawi")
{
	String[] malawiStates = {
		"Central","Northern","Southern"
	};
	return malawiStates;
}
else if(countryName == "Madagascar")
{
	String[] madagascarStates = {
		"Antananarivo","Antsiranana","Fianarantsoa",
		"Mahajanga","Toamasina","Toliara"
	};
	return madagascarStates;
}
else if(countryName == "Mauritius")
{
	String[] mauritiusStates = {
		"Black River","Flacq","Grand Port","Moka","Pamplemousses",
		"Plaines Wilhems","Port Louis","Riviere du Rempart","Savanne","Rodrigues"
	};
	return mauritiusStates;
}
else if(countryName == "Seychelles")
{
	String[] seychellesStates = {
		"Anse Boileau","Anse Royale","Beau Vallon","Bel Air",
		"Cascade","English River","Glacis","Mont Fleuri",
		"Plaisance","Port Glaud","Roche Caiman","Takamaka"
	};
	return seychellesStates;
}
else if(countryName == "Somalia")
{
	String[] somaliaStates = {
		"Galmudug","Hirshabelle","Jubaland","Puntland",
		"South West","Somaliland","Banadir"
	};
	return somaliaStates;
}
else if(countryName == "Eritrea")
{
	String[] eritreaStates = {
		"Anseba","Debub","Gash-Barka","Maekel","Northern Red Sea","Southern Red Sea"
	};
	return eritreaStates;
}
else if(countryName == "Gambia")
{
	String[] gambiaStates = {
		"Banjul","Kanifing","Brikama","Mansakonko","Kerewan","Janjanbureh"
	};
	return gambiaStates;
}
else if(countryName == "Guinea")
{
	String[] guineaStates = {
		"Boke","Conakry","Faranah","Kankan","Kindia","Labe","Mamou","Nzerekore"
	};
	return guineaStates;
}
else if(countryName == "GuineaBissau")
{
	String[] guineaBissauStates = {
		"Bafata","Biombo","Bissau","Bolama","Cacheu",
		"Gabu","Oio","Quinara","Tombali"
	};
	return guineaBissauStates;
}
else if(countryName == "Liberia")
{
	String[] liberiaStates = {
		"Bomi","Bong","Gbarpolu","Grand Bassa","Grand Cape Mount",
		"Grand Gedeh","Grand Kru","Lofa","Margibi",
		"Maryland","Montserrado","Nimba","River Gee","Rivercess","Sinoe"
	};
	return liberiaStates;
}
else if(countryName == "SierraLeone")
{
	String[] sierraLeoneStates = {
		"Eastern","Northern","North Western","Southern","Western Area"
	};
	return sierraLeoneStates;
}
else if(countryName == "Togo")
{
	String[] togoStates = {
		"Centrale","Kara","Maritime","Plateaux","Savanes"
	};
	return togoStates;
}
else if(countryName == "Benin")
{
	String[] beninStates = {
		"Alibori","Atakora","Atlantique","Borgou","Collines",
		"Donga","Kouffo","Littoral","Mono","Oueme","Plateau","Zou"
	};
	return beninStates;
}
else if(countryName == "BurkinaFaso")
{
	String[] burkinaFasoStates = {
		"Boucle du Mouhoun","Cascades","Centre","Centre-East","Centre-North",
		"Centre-South","East","Hauts-Bassins","North",
		"Plateau-Central","Sahel","Southwest"
	};
	return burkinaFasoStates;
}
else if(countryName == "Mali")
{
	String[] maliStates = {
		"Bamako","Gao","Kayes","Kidal","Koulikoro",
		"Mopti","Segou","Sikasso","Taoudenit","Tombouctou"
	};
	return maliStates;
}
else if(countryName == "Niger")
{
	String[] nigerStates = {
		"Agadez","Diffa","Dosso","Maradi",
		"Niamey","Tahoua","Tillaberi","Zinder"
	};
	return nigerStates;
}
else if(countryName == "Chad")
{
	String[] chadStates = {
		"Batha","Borkou","Chari-Baguirmi","Ennedi-Est","Ennedi-Ouest",
		"Guera","Hadjer-Lamis","Kanem","Lac","Logone Occidental",
		"Logone Oriental","Mandoul","Mayo-Kebbi Est","Mayo-Kebbi Ouest",
		"Moyen-Chari","Ouaddai","Salamat","Sila","Tandjile","Tibesti","Wadi Fira","N'Djamena"
	};
	return chadStates;
}
else if(countryName == "CentralAfricanRepublic")
{
	String[] carStates = {
		"Bamingui-Bangoran","Bangui","Basse-Kotto","Haut-Mbomou",
		"Haute-Kotto","Kemo","Lobaye","Mambere-Kadei",
		"Mbomou","Nana-Grebizi","Nana-Mambere","Ombella-MPoko",
		"Ouaka","Ouham","Ouham-Pende","Sangha-Mbaere","Vakaga"
	};
	return carStates;
}
else if(countryName == "EquatorialGuinea")
{
	String[] equatorialGuineaStates = {
		"Annobon","Bioko Norte","Bioko Sur","Centro Sur",
		"Kie-Ntem","Litoral","Wele-Nzas"
	};
	return equatorialGuineaStates;
}
else if(countryName == "Gabon")
{
	String[] gabonStates = {
		"Estuaire","Haut-Ogooue","Moyen-Ogooue","Ngounie",
		"Nyanga","Ogooue-Ivindo","Ogooue-Lolo","Ogooue-Maritime","Woleu-Ntem"
	};
	return gabonStates;
}
else if(countryName == "RepublicOfCongo")
{
	String[] congoStates = {
		"Bouenza","Brazzaville","Cuvette","Cuvette-Ouest",
		"Kouilou","Lekoumou","Likouala","Niari",
		"Plateaux","Pointe-Noire","Pool","Sangha"
	};
	return congoStates;
}
else if(countryName == "DRCongo")
{
	String[] drCongoStates = {
		"Bas-Uele","Equateur","Haut-Katanga","Haut-Lomami","Haut-Uele",
		"Ituri","Kasai","Kasai-Central","Kasai-Oriental","Kinshasa",
		"Kongo-Central","Kwango","Kwilu","Lomami","Lualaba",
		"Mai-Ndombe","Maniema","Mongala","Nord-Kivu","Nord-Ubangi",
		"Sankuru","Sud-Kivu","Sud-Ubangi","Tanganyika","Tshopo","Tshuapa"
	};
	return drCongoStates;
}
else if(countryName == "SouthSudan")
{
	String[] southSudanStates = {
		"Central Equatoria","Eastern Equatoria","Jonglei",
		"Lakes","Northern Bahr el Ghazal","Unity",
		"Upper Nile","Warrap","Western Bahr el Ghazal","Western Equatoria"
	};
	return southSudanStates;
}
else if(countryName == "Lesotho")
{
	String[] lesothoStates = {
		"Berea","Butha-Buthe","Leribe","Mafeteng",
		"Maseru","Mohale's Hoek","Mokhotlong","Qacha's Nek",
		"Quthing","Thaba-Tseka"
	};
	return lesothoStates;
}
else if(countryName == "Eswatini")
{
	String[] eswatiniStates = {
		"Hhohho","Lubombo","Manzini","Shiselweni"
	};
	return eswatiniStates;
}
else if(countryName == "CapeVerde")
{
	String[] capeVerdeStates = {
		"Boa Vista","Brava","Fogo","Maio","Mosteiros",
		"Paul","Porto Novo","Praia","Ribeira Brava",
		"Ribeira Grande","Sal","Santa Catarina","Santa Cruz",
		"Sao Domingos","Sao Filipe","Sao Miguel","Sao Vicente","Tarrafal"
	};
	return capeVerdeStates;
}
else if(countryName == "SaoTomeAndPrincipe")
{
	String[] saoTomeStates = {
		"Cantagalo","Caua","Lemba","Lobata","Me-Zochi",
		"Pague","Agua Grande"
	};
	return saoTomeStates;
}
else if(countryName == "Jamaica")
{
	String[] jamaicaStates = {
		"Kingston","St Andrew","St Catherine","Clarendon","Manchester",
		"St Elizabeth","Westmoreland","Hanover","St James",
		"Trelawny","St Ann","St Mary","Portland","St Thomas"
	};
	return jamaicaStates;
}
else if(countryName == "Cuba")
{
	String[] cubaStates = {
		"Pinar del Rio","Artemisa","Havana","Mayabeque","Matanzas",
		"Cienfuegos","Villa Clara","Sancti Spiritus","Ciego de Avila",
		"Camaguey","Las Tunas","Holguin","Granma",
		"Santiago de Cuba","Guantanamo","Isla de la Juventud"
	};
	return cubaStates;
}
else if(countryName == "Haiti")
{
	String[] haitiStates = {
		"Artibonite","Centre","Grand Anse","Nippes",
		"Nord","Nord-Est","Nord-Ouest","Ouest","Sud","Sud-Est"
	};
	return haitiStates;
}
else if(countryName == "DominicanRepublic")
{
	String[] drStates = {
		"Azua","Baoruco","Barahona","Dajabon","Distrito Nacional",
		"Duarte","El Seibo","Espaillat","Hato Mayor","Hermanas Mirabal",
		"Independencia","La Altagracia","La Romana","La Vega","Maria Trinidad Sanchez",
		"Monte Cristi","Monte Plata","Pedernales","Peravia","Puerto Plata",
		"Samana","San Cristobal","San Jose de Ocoa","San Juan",
		"San Pedro de Macoris","Sanchez Ramirez","Santiago",
		"Santiago Rodriguez","Valverde"
	};
	return drStates;
}
else if(countryName == "Bahamas")
{
	String[] bahamasStates = {
		"New Providence","Grand Bahama","Abaco","Acklins","Andros",
		"Berry Islands","Bimini","Cat Island","Crooked Island",
		"Eleuthera","Exuma","Inagua","Long Island","Mayaguana",
		"Ragged Island","San Salvador"
	};
	return bahamasStates;
}
else if(countryName == "Barbados")
{
	String[] barbadosStates = {
		"Christ Church","Saint Andrew","Saint George","Saint James",
		"Saint John","Saint Joseph","Saint Lucy","Saint Michael",
		"Saint Peter","Saint Philip","Saint Thomas"
	};
	return barbadosStates;
}
else if(countryName == "TrinidadAndTobago")
{
	String[] trinidadStates = {
		"Arima","Chaguanas","Couva-Tabaquite-Talparo",
		"Diego Martin","Mayaro-Rio Claro","Penal-Debe",
		"Point Fortin","Port of Spain","Princes Town",
		"San Fernando","San Juan-Laventille","Sangre Grande",
		"Siparia","Tunapuna-Piarco","Tobago"
	};
	return trinidadStates;
}
else if(countryName == "Grenada")
{
	String[] grenadaStates = {
		"Saint Andrew","Saint David","Saint George",
		"Saint John","Saint Mark","Saint Patrick","Carriacou and Petite Martinique"
	};
	return grenadaStates;
}
else if(countryName == "SaintLucia")
{
	String[] saintLuciaStates = {
		"Anse la Raye","Canaries","Castries","Choiseul",
		"Dennery","Gros Islet","Laborie","Micoud",
		"Soufriere","Vieux Fort"
	};
	return saintLuciaStates;
}
else if(countryName == "SaintVincentAndGrenadines")
{
	String[] svgStates = {
		"Charlotte","Grenadines","Saint Andrew",
		"Saint David","Saint George","Saint Patrick"
	};
	return svgStates;
}
else if(countryName == "AntiguaAndBarbuda")
{
	String[] antiguaStates = {
		"Saint George","Saint John","Saint Mary",
		"Saint Paul","Saint Peter","Saint Philip","Barbuda","Redonda"
	};
	return antiguaStates;
}
else if(countryName == "Dominica")
{
	String[] dominicaStates = {
		"Saint Andrew","Saint David","Saint George","Saint John",
		"Saint Joseph","Saint Luke","Saint Mark","Saint Patrick","Saint Paul","Saint Peter"
	};
	return dominicaStates;
}
else if(countryName == "SaintKittsAndNevis")
{
	String[] sknStates = {
		"Christ Church Nichola Town","Saint Anne Sandy Point",
		"Saint George Basseterre","Saint George Gingerland",
		"Saint James Windward","Saint John Capisterre",
		"Saint John Figtree","Saint Mary Cayon",
		"Saint Paul Capisterre","Saint Paul Charlestown",
		"Saint Peter Basseterre","Saint Thomas Lowland",
		"Saint Thomas Middle Island","Trinity Palmetto Point"
	};
	return sknStates;
}
else if(countryName == "Belize")
{
	String[] belizeStates = {
		"Belize","Cayo","Corozal","Orange Walk","Stann Creek","Toledo"
	};
	return belizeStates;
}
else if(countryName == "Guatemala")
{
	String[] guatemalaStates = {
		"Alta Verapaz","Baja Verapaz","Chimaltenango","Chiquimula","El Progreso",
		"Escuintla","Guatemala","Huehuetenango","Izabal","Jalapa",
		"Jutiapa","Peten","Quetzaltenango","Quiche","Retalhuleu",
		"Sacatepequez","San Marcos","Santa Rosa","Solola","Suchitepequez",
		"Totonicapan","Zacapa"
	};
	return guatemalaStates;
}
else if(countryName == "Honduras")
{
	String[] hondurasStates = {
		"Atlantida","Choluteca","Colon","Comayagua","Copan",
		"Cortes","El Paraiso","Francisco Morazan","Gracias a Dios",
		"Intibuca","Islas de la Bahia","La Paz","Lempira","Ocotepeque",
		"Olancho","Santa Barbara","Valle","Yoro"
	};
	return hondurasStates;
}
else if(countryName == "ElSalvador")
{
	String[] elSalvadorStates = {
		"Ahuachapan","Cabanas","Chalatenango","Cuscatlan","La Libertad",
		"La Paz","La Union","Morazan","San Miguel","San Salvador",
		"San Vicente","Santa Ana","Sonsonate","Usulutan"
	};
	return elSalvadorStates;
}
else if(countryName == "Nicaragua")
{
	String[] nicaraguaStates = {
		"Boaco","Carazo","Chinandega","Chontales","Esteli",
		"Granada","Jinotega","Leon","Madriz","Managua",
		"Masaya","Matagalpa","Nueva Segovia","Rio San Juan",
		"Rivas","North Caribbean Coast","South Caribbean Coast"
	};
	return nicaraguaStates;
}
else if(countryName == "Panama")
{
	String[] panamaStates = {
		"Bocas del Toro","Chiriqui","Cocle","Colon","Darien",
		"Herrera","Los Santos","Panama","Panama Oeste","Veraguas",
		"Guna Yala","Embera","Ngabe-Bugle"
	};
	return panamaStates;
}
else if(countryName == "CostaRica")
{
	String[] costaRicaStates = {
		"Alajuela","Cartago","Guanacaste","Heredia",
		"Limon","Puntarenas","San Jose"
	};
	return costaRicaStates;
}
else if(countryName == "Mexico")
{
	String[] mexicoStates = {
		"Aguascalientes","Baja California","Baja California Sur","Campeche",
		"Chiapas","Chihuahua","Coahuila","Colima","Durango","Guanajuato",
		"Guerrero","Hidalgo","Jalisco","Mexico City","Michoacan",
		"Morelos","Nayarit","Nuevo Leon","Oaxaca","Puebla",
		"Queretaro","Quintana Roo","San Luis Potosi","Sinaloa",
		"Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz",
		"Yucatan","Zacatecas"
	};
	return mexicoStates;
}
else if(countryName == "Colombia")
{
	String[] colombiaStates = {
		"Amazonas","Antioquia","Arauca","Atlantico","Bolivar",
		"Boyaca","Caldas","Caqueta","Casanare","Cauca",
		"Cesar","Choco","Cordoba","Cundinamarca","Guainia",
		"Guaviare","Huila","La Guajira","Magdalena","Meta",
		"Narino","Norte de Santander","Putumayo","Quindio",
		"Risaralda","San Andres","Santander","Sucre","Tolima",
		"Valle del Cauca","Vaupes","Vichada","Bogota"
	};
	return colombiaStates;
}
else if(countryName == "Venezuela")
{
	String[] venezuelaStates = {
		"Amazonas","Anzoategui","Apure","Aragua","Barinas",
		"Bolivar","Carabobo","Cojedes","Delta Amacuro","Falcon",
		"Guarico","Lara","Merida","Miranda","Monagas",
		"Nueva Esparta","Portuguesa","Sucre","Tachira",
		"Trujillo","Yaracuy","Zulia","Capital District"
	};
	return venezuelaStates;
}
else if(countryName == "Peru")
{
	String[] peruStates = {
		"Amazonas","Ancash","Apurimac","Arequipa","Ayacucho",
		"Cajamarca","Callao","Cusco","Huancavelica","Huanuco",
		"Ica","Junin","La Libertad","Lambayeque","Lima",
		"Loreto","Madre de Dios","Moquegua","Pasco","Piura",
		"Puno","San Martin","Tacna","Tumbes","Ucayali"
	};
	return peruStates;
}
else if(countryName == "Chile")
{
	String[] chileStates = {
		"Arica y Parinacota","Tarapaca","Antofagasta","Atacama",
		"Coquimbo","Valparaiso","Metropolitana","OHiggins",
		"Maule","Nuble","Biobio","Araucania","Los Rios",
		"Los Lagos","Aysen","Magallanes"
	};
	return chileStates;
}
else if(countryName == "Bolivia")
{
	String[] boliviaStates = {
		"Chuquisaca","Cochabamba","El Beni","La Paz",
		"Oruro","Pando","Potosi","Santa Cruz","Tarija"
	};
	return boliviaStates;
}
else if(countryName == "Paraguay")
{
	String[] paraguayStates = {
		"Alto Paraguay","Alto Parana","Amambay","Boqueron",
		"Caaguazu","Caazapa","Canindeyu","Central","Concepcion",
		"Cordillera","Guaira","Itapua","Misiones","Neembucu",
		"Paraguari","Presidente Hayes","San Pedro","Asuncion"
	};
	return paraguayStates;
}
else if(countryName == "Uruguay")
{
	String[] uruguayStates = {
		"Artigas","Canelones","Cerro Largo","Colonia","Durazno",
		"Flores","Florida","Lavalleja","Maldonado","Montevideo",
		"Paysandu","Rio Negro","Rivera","Rocha","Salto",
		"San Jose","Soriano","Tacuarembo","Treinta y Tres"
	};
	return uruguayStates;
}
else if(countryName == "Guyana")
{
	String[] guyanaStates = {
		"Barima-Waini","Pomeroon-Supenaam","Essequibo Islands-West Demerara",
		"Demerara-Mahaica","Mahaica-Berbice","East Berbice-Corentyne",
		"Cuyuni-Mazaruni","Potaro-Siparuni","Upper Takutu-Upper Essequibo","Upper Demerara-Berbice"
	};
	return guyanaStates;
}
else if(countryName == "Suriname")
{
	String[] surinameStates = {
		"Brokopondo","Commewijne","Coronie","Marowijne","Nickerie",
		"Para","Paramaribo","Saramacca","Sipaliwini","Wanica"
	};
	return surinameStates;
}
else if(countryName == "Monaco")
{
	String[] monacoStates = {
		"Monaco-Ville","Monte Carlo","La Condamine","Fontvieille"
	};
	return monacoStates;
}
else if(countryName == "VaticanCity")
{
	String[] vaticanStates = {
		"Vatican City"
	};
	return vaticanStates;
}
else if(countryName == "SanMarino")
{
	String[] sanMarinoStates = {
		"Acquaviva","Borgo Maggiore","Chiesanuova","Domagnano",
		"Faetano","Fiorentino","Montegiardino","San Marino",
		"Serravalle"
	};
	return sanMarinoStates;
}
else if(countryName == "Liechtenstein")
{
	String[] liechtensteinStates = {
		"Balzers","Eschen","Gamprin","Mauren","Planken",
		"Ruggell","Schaan","Schellenberg","Triesen","Triesenberg","Vaduz"
	};
	return liechtensteinStates;
}
else if(countryName == "Andorra")
{
	String[] andorraStates = {
		"Andorra la Vella","Canillo","Encamp","Escaldes-Engordany",
		"La Massana","Ordino","Sant Julia de Loria"
	};
	return andorraStates;
}
		else
		{
			System.out.println(countryName + " not found");
			return null;
		}
	}

	public static void getStates(String[] states)
	{

		for(String state : states)
		{
			System.out.println(state);
		}
		System.out.println();
	}
}