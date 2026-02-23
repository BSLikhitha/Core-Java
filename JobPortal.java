class JobPortal
{
	public static String[] searchJobsByCompany(String companyName)
	{
		if(companyName == "LinkedIn")
		{
			String[] linkedInJobs = {
				"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
				"Java Developer","Python Developer","Data Engineer","Data Scientist",
				"ML Engineer","Cloud Engineer","DevOps Engineer","SRE",
				"Product Manager","Program Manager","Business Analyst","QA Engineer",
				"Automation Tester","Security Engineer","Mobile App Developer","Tech Lead"
			};
			return linkedInJobs;
		}
		else if(companyName == "Naukri")
		{
			String[] naukriJobs = {
				"Java Developer","Python Developer","C++ Developer","React Developer",
				"Angular Developer","NodeJS Developer","PHP Developer","Full Stack Developer",
				"Backend Engineer","Frontend Engineer","QA Analyst","Automation Tester",
				"Business Analyst","System Analyst","Support Engineer","Application Engineer",
				"Cloud Engineer","DevOps Engineer","Data Engineer","Project Manager"
			};
			return naukriJobs;
		}
		else if(companyName == "Hirect")
		{
			String[] hirectJobs = {
				"Startup Developer","Mobile App Developer","Android Developer","iOS Developer",
				"React Native Developer","Flutter Developer","UI Designer","UX Designer",
				"Product Designer","Frontend Developer","Backend Developer","Full Stack Developer",
				"Java Developer","Python Developer","DevOps Engineer","Cloud Engineer",
				"QA Engineer","Automation Tester","Tech Lead","Engineering Manager"
			};
			return hirectJobs;
		}
		else if(companyName == "Indeed")
		{
			String[] indeedJobs = {
				"Software Engineer","System Engineer","Platform Engineer","Cloud Architect",
				"DevOps Engineer","Data Engineer","Data Analyst","ML Engineer",
				"AI Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
				"QA Engineer","Automation Tester","Security Analyst","Product Manager",
				"Program Manager","UX Designer","UI Designer","Technical Lead"
			};
			return indeedJobs;
		}
		else if(companyName == "Monster")
		{
			String[] monsterJobs = {
				"Java Developer","Python Developer","DotNet Developer","SAP Consultant",
				"Salesforce Developer","Business Analyst","Data Analyst","Data Scientist",
				"Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester",
				"Support Engineer","System Admin","Network Engineer","Security Engineer",
				"UI Developer","UX Designer","Product Manager","Project Manager"
			};
			return monsterJobs;
		}
		else if(companyName == "Glassdoor")
		{
			String[] glassdoorJobs = {
				"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
				"Data Scientist","Data Analyst","ML Engineer","AI Engineer",
				"Cloud Engineer","DevOps Engineer","QA Engineer","Automation Tester",
				"Security Engineer","Product Manager","Program Manager","Business Analyst",
				"UX Designer","UI Designer","Mobile Developer","Tech Lead"
			};
			return glassdoorJobs;
		}
		else if(companyName == "ZipRecruiter")
		{
			String[] zipRecruiterJobs = {
				"Java Developer","Python Developer","React Developer","Angular Developer",
				"NodeJS Developer","Full Stack Developer","Backend Developer","Frontend Developer",
				"Data Engineer","Data Scientist","Cloud Engineer","DevOps Engineer",
				"QA Engineer","Automation Tester","Business Analyst","System Analyst",
				"Support Engineer","Product Manager","Project Manager","Technical Lead"
			};
			return zipRecruiterJobs;
		}
		else if(companyName == "Shine")
		{
			String[] shineJobs = {
				"Java Developer","Python Developer","PHP Developer","DotNet Developer",
				"Frontend Developer","Backend Developer","Full Stack Developer","React Developer",
				"Angular Developer","QA Engineer","Automation Tester","Manual Tester",
				"Business Analyst","System Analyst","Support Engineer","Cloud Engineer",
				"DevOps Engineer","Data Engineer","Project Manager","Team Lead"
			};
			return shineJobs;
		}
		else if(companyName == "TimesJobs")
		{
			String[] timesJobsJobs = {
				"Software Engineer","Senior Software Engineer","Java Developer","Python Developer",
				"Full Stack Developer","Backend Developer","Frontend Developer","Cloud Engineer",
				"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
				"Automation Tester","Business Analyst","System Analyst","Product Manager",
				"Project Manager","UX Designer","UI Designer","Technical Lead"
			};
			return timesJobsJobs;
		}
		else if(companyName == "Foundit")
		{
			String[] founditJobs = {
				"Java Developer","Python Developer","C Developer","C++ Developer",
				"Frontend Developer","Backend Developer","Full Stack Developer","React Developer",
				"Angular Developer","NodeJS Developer","QA Engineer","Automation Tester",
				"Cloud Engineer","DevOps Engineer","Data Engineer","Business Analyst",
				"System Analyst","Support Engineer","Project Manager","Tech Lead"
			};
			return founditJobs;
		}
		else if(companyName == "Freshersworld")
		{
			String[] freshersworldJobs = {
				"Graduate Trainee","Software Trainee","Java Developer","Python Developer",
				"Web Developer","Frontend Developer","Backend Developer","Full Stack Developer",
				"QA Engineer","Manual Tester","Automation Tester","Support Engineer",
				"System Engineer","Network Engineer","Cloud Engineer","DevOps Engineer",
				"Data Analyst","Business Analyst","Project Coordinator","Team Lead"
			};
			return freshersworldJobs;
		}
		else if(companyName == "CutShort")
		{
			String[] cutshortJobs = {
				"Startup Engineer","Product Engineer","Backend Developer","Frontend Developer",
				"Full Stack Developer","Java Developer","Python Developer","NodeJS Developer",
				"React Developer","Angular Developer","Cloud Engineer","DevOps Engineer",
				"QA Engineer","Automation Tester","Product Manager","Program Manager",
				"Business Analyst","UX Designer","UI Designer","Tech Lead"
			};
			return cutshortJobs;
		}
		else if(companyName == "Wellfound")
		{
			String[] wellfoundJobs = {
				"Startup Developer","Software Engineer","Backend Engineer","Frontend Engineer",
				"Full Stack Engineer","Data Engineer","Data Scientist","ML Engineer",
				"AI Engineer","Cloud Engineer","DevOps Engineer","QA Engineer",
				"Automation Tester","Product Manager","Program Manager","Business Analyst",
				"UX Designer","UI Designer","Mobile App Developer","Tech Lead"
			};
			return wellfoundJobs;
		}
		else if(companyName == "JobStreet")
		{
			String[] jobStreetJobs = {
				"Java Developer","Python Developer","PHP Developer","DotNet Developer",
				"Frontend Developer","Backend Developer","Full Stack Developer","React Developer",
				"Angular Developer","QA Engineer","Automation Tester","Manual Tester",
				"Business Analyst","System Analyst","Support Engineer","Cloud Engineer",
				"DevOps Engineer","Data Engineer","Project Manager","Team Lead"
			};
			return jobStreetJobs;
		}
		else if(companyName == "CareerBuilder")
		{
			String[] careerBuilderJobs = {
				"Software Engineer","Senior Software Engineer","Java Developer","Python Developer",
				"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
				"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
				"Automation Tester","Business Analyst","System Analyst","Product Manager",
				"Project Manager","UX Designer","UI Designer","Technical Lead"
			};
			return careerBuilderJobs;
		}
		else if(companyName == "SimplyHired")
		{
			String[] simplyHiredJobs = {
				"Java Developer","Python Developer","C Developer","C++ Developer",
				"Frontend Developer","Backend Developer","Full Stack Developer","React Developer",
				"Angular Developer","NodeJS Developer","QA Engineer","Automation Tester",
				"Cloud Engineer","DevOps Engineer","Data Engineer","Business Analyst",
				"System Analyst","Support Engineer","Project Manager","Tech Lead"
			};
			return simplyHiredJobs;
		}
		else if(companyName == "AngelList")
		{
			String[] angelListJobs = {
				"Startup Engineer","Product Engineer","Backend Developer","Frontend Developer",
				"Full Stack Developer","Mobile App Developer","Android Developer","iOS Developer",
				"React Native Developer","Flutter Developer","Cloud Engineer","DevOps Engineer",
				"QA Engineer","Automation Tester","Product Manager","Program Manager",
				"Business Analyst","UX Designer","UI Designer","Tech Lead"
			};
			return angelListJobs;
		}
		else if(companyName == "Upwork")
		{
			String[] upworkJobs = {
				"Freelance Developer","Java Developer","Python Developer","Web Developer",
				"Frontend Developer","Backend Developer","Full Stack Developer","Mobile App Developer",
				"Android Developer","iOS Developer","UI Designer","UX Designer",
				"QA Engineer","Automation Tester","DevOps Engineer","Cloud Engineer",
				"Data Analyst","Business Analyst","Project Manager","Technical Consultant"
			};
			return upworkJobs;
		}
		else if(companyName == "Freelancer")
		{
			String[] freelancerJobs = {
				"Freelance Programmer","Java Developer","Python Developer","PHP Developer",
				"DotNet Developer","Frontend Developer","Backend Developer","Full Stack Developer",
				"Mobile App Developer","Android Developer","iOS Developer","UI Designer",
				"UX Designer","QA Engineer","Automation Tester","Cloud Engineer",
				"DevOps Engineer","Data Analyst","Project Manager","Technical Lead"
			};
			return freelancerJobs;
		}
		else if(companyName == "Toptal")
		{
			String[] toptalJobs = {
				"Senior Software Engineer","Senior Backend Engineer","Senior Frontend Engineer","Full Stack Engineer",
				"Java Developer","Python Developer","React Developer","Angular Developer",
				"NodeJS Developer","Cloud Architect","DevOps Engineer","SRE",
				"Data Scientist","ML Engineer","AI Engineer","Product Manager",
				"Program Manager","UX Designer","UI Designer","Technical Lead"
			};
			return toptalJobs;
		}
		else if(companyName == "PeoplePerHour")
{
	String[] peoplePerHourJobs = {
		"Freelance Developer","Java Developer","Python Developer","Web Developer",
		"Frontend Developer","Backend Developer","Full Stack Developer","Mobile App Developer",
		"Android Developer","iOS Developer","UI Designer","UX Designer",
		"QA Engineer","Automation Tester","DevOps Engineer","Cloud Engineer",
		"Data Analyst","Business Analyst","Project Manager","Technical Consultant"
	};
	return peoplePerHourJobs;
}
else if(companyName == "Guru")
{
	String[] guruJobs = {
		"Freelance Programmer","Java Developer","Python Developer","PHP Developer",
		"DotNet Developer","Frontend Developer","Backend Developer","Full Stack Developer",
		"Mobile App Developer","Android Developer","iOS Developer","UI Designer",
		"UX Designer","QA Engineer","Automation Tester","Cloud Engineer",
		"DevOps Engineer","Data Analyst","Project Manager","Tech Lead"
	};
	return guruJobs;
}
else if(companyName == "Fiverr")
{
	String[] fiverrJobs = {
		"Freelance Engineer","Java Developer","Python Developer","Web Developer",
		"Frontend Developer","Backend Developer","Full Stack Developer","React Developer",
		"Angular Developer","NodeJS Developer","UI Designer","UX Designer",
		"QA Engineer","Automation Tester","Cloud Engineer","DevOps Engineer",
		"Data Analyst","Business Analyst","Project Manager","Technical Lead"
	};
	return fiverrJobs;
}
else if(companyName == "Internshala")
{
	String[] internshalaJobs = {
		"Software Intern","Java Intern","Python Intern","Web Developer Intern",
		"Frontend Intern","Backend Intern","Full Stack Intern","Mobile App Intern",
		"Android Intern","iOS Intern","UI Designer Intern","UX Designer Intern",
		"QA Intern","Automation Intern","Cloud Intern","DevOps Intern",
		"Data Analyst Intern","Business Analyst Intern","Project Intern","Tech Intern"
	};
	return internshalaJobs;
}
else if(companyName == "Apna")
{
	String[] apnaJobs = {
		"Junior Developer","Software Engineer","Backend Developer","Frontend Developer",
		"Full Stack Developer","Java Developer","Python Developer","Web Developer",
		"QA Engineer","Automation Tester","Support Engineer","System Engineer",
		"Network Engineer","Cloud Engineer","DevOps Engineer","Data Analyst",
		"Business Analyst","Project Coordinator","Team Lead","Technical Lead"
	};
	return apnaJobs;
}
else if(companyName == "Google")
{
	String[] googleJobs = {
		"Software Engineer","Senior Software Engineer","Backend Engineer","Frontend Engineer",
		"Full Stack Engineer","Data Engineer","Data Scientist","ML Engineer",
		"AI Engineer","Cloud Engineer","DevOps Engineer","SRE",
		"Product Manager","Program Manager","Technical Program Manager","QA Engineer",
		"Security Engineer","UX Designer","UI Designer","Tech Lead"
	};
	return googleJobs;
}
else if(companyName == "Microsoft")
{
	String[] microsoftJobs = {
		"Software Engineer","Senior Software Engineer","Backend Developer","Frontend Developer",
		"Full Stack Developer","Cloud Engineer","Azure Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","AI Engineer",
		"Product Manager","Program Manager","QA Engineer","Automation Tester",
		"Security Engineer","UX Designer","UI Designer","Technical Lead"
	};
	return microsoftJobs;
}
else if(companyName == "Amazon")
{
	String[] amazonJobs = {
		"SDE I","SDE II","SDE III","Backend Engineer",
		"Frontend Engineer","Full Stack Engineer","Cloud Engineer","AWS Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","ML Engineer",
		"Product Manager","Program Manager","Operations Manager","QA Engineer",
		"Automation Tester","Security Engineer","Solutions Architect","Tech Lead"
	};
	return amazonJobs;
}
else if(companyName == "Apple")
{
	String[] appleJobs = {
		"Software Engineer","iOS Developer","macOS Developer","Backend Engineer",
		"Frontend Engineer","Full Stack Engineer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","AI Engineer",
		"Hardware Engineer","Firmware Engineer","QA Engineer","Automation Tester",
		"Security Engineer","UX Designer","UI Designer","Technical Lead"
	};
	return appleJobs;
}
else if(companyName == "Meta")
{
	String[] metaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Data Engineer","Data Scientist","ML Engineer","AI Engineer",
		"Cloud Engineer","DevOps Engineer","SRE","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Security Engineer",
		"AR Engineer","VR Engineer","UX Designer","Tech Lead"
	};
	return metaJobs;
}
else if(companyName == "Netflix")
{
	String[] netflixJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Data Engineer","Data Scientist","ML Engineer","AI Engineer",
		"Cloud Engineer","DevOps Engineer","SRE","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Video Platform Engineer","Tech Lead"
	};
	return netflixJobs;
}
else if(companyName == "IBM")
{
	String[] ibmJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","AI Engineer","ML Engineer",
		"System Engineer","QA Engineer","Automation Tester","Security Engineer",
		"Business Analyst","Product Manager","Project Manager","Technical Lead"
	};
	return ibmJobs;
}
else if(companyName == "Oracle")
{
	String[] oracleJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Database Engineer","SQL Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"ERP Consultant","Business Analyst","Project Manager","Tech Lead"
	};
	return oracleJobs;
}
else if(companyName == "SAP")
{
	String[] sapJobs = {
		"SAP Consultant","ABAP Developer","Java Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","Functional Consultant","Product Manager","Project Manager",
		"Security Engineer","System Engineer","UX Designer","Technical Lead"
	};
	return sapJobs;
}
else if(companyName == "Salesforce")
{
	String[] salesforceJobs = {
		"Salesforce Developer","Apex Developer","Lightning Developer","Java Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"Business Analyst","Product Manager","Program Manager","System Analyst",
		"Security Engineer","UX Designer","UI Designer","Tech Lead"
	};
	return salesforceJobs;
}
else if(companyName == "Adobe")
{
	String[] adobeJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","C++ Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","AI Engineer",
		"QA Engineer","Automation Tester","Security Engineer","Product Manager",
		"Program Manager","UX Designer","UI Designer","Technical Lead"
	};
	return adobeJobs;
}
else if(companyName == "Cisco")
{
	String[] ciscoJobs = {
		"Network Engineer","Software Engineer","Backend Developer","Frontend Developer",
		"Full Stack Developer","Cloud Engineer","DevOps Engineer","Security Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"System Engineer","Network Administrator","Product Manager","Program Manager",
		"Technical Consultant","UX Designer","UI Designer","Tech Lead"
	};
	return ciscoJobs;
}
else if(companyName == "Intel")
{
	String[] intelJobs = {
		"Software Engineer","Firmware Engineer","Hardware Engineer","Embedded Engineer",
		"C Developer","C++ Developer","Backend Developer","Frontend Developer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","Data Scientist",
		"ML Engineer","QA Engineer","Automation Tester","Security Engineer",
		"System Engineer","Product Manager","Project Manager","Technical Lead"
	};
	return intelJobs;
}
else if(companyName == "NVIDIA")
{
	String[] nvidiaJobs = {
		"GPU Engineer","Software Engineer","CUDA Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","AI Engineer","ML Engineer",
		"Data Scientist","Cloud Engineer","DevOps Engineer","QA Engineer",
		"Automation Tester","Security Engineer","System Engineer","Product Manager",
		"Program Manager","UX Designer","UI Designer","Tech Lead"
	};
	return nvidiaJobs;
}
else if(companyName == "AMD")
{
	String[] amdJobs = {
		"Hardware Engineer","Software Engineer","Firmware Engineer","Embedded Developer",
		"C Developer","C++ Developer","Backend Developer","Frontend Developer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","Data Analyst",
		"QA Engineer","Automation Tester","Security Engineer","System Engineer",
		"Product Manager","Program Manager","Project Manager","Technical Lead"
	};
	return amdJobs;
}
else if(companyName == "Dell")
{
	String[] dellJobs = {
		"Software Engineer","Backend Developer","Frontend Developer","Full Stack Developer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"System Engineer","Network Engineer","Security Engineer","Product Manager",
		"Project Manager","UX Designer","UI Designer","Technical Lead"
	};
	return dellJobs;
}
else if(companyName == "HP")
{
	String[] hpJobs = {
		"Software Engineer","Firmware Engineer","Hardware Engineer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"System Engineer","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Project Manager","Tech Lead"
	};
	return hpJobs;
}
else if(companyName == "Accenture")
{
	String[] accentureJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","Business Analyst","QA Engineer",
		"Automation Tester","System Analyst","Consultant","Product Manager",
		"Project Manager","Scrum Master","Team Lead","Technical Lead"
	};
	return accentureJobs;
}
else if(companyName == "Capgemini")
{
	String[] capgeminiJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return capgeminiJobs;
}
else if(companyName == "Cognizant")
{
	String[] cognizantJobs = {
		"Programmer Analyst","Software Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return cognizantJobs;
}
else if(companyName == "TCS")
{
	String[] tcsJobs = {
		"Assistant System Engineer","Software Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","System Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return tcsJobs;
}
else if(companyName == "Infosys")
{
	String[] infosysJobs = {
		"Systems Engineer","Senior Systems Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return infosysJobs;
}
else if(companyName == "Wipro")
{
	String[] wiproJobs = {
		"Project Engineer","Software Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","System Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return wiproJobs;
}
else if(companyName == "HCL")
{
	String[] hclJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return hclJobs;
}
else if(companyName == "TechMahindra")
{
	String[] techMahindraJobs = {
		"Associate Software Engineer","Software Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return techMahindraJobs;
}
else if(companyName == "Mindtree")
{
	String[] mindtreeJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return mindtreeJobs;
}
else if(companyName == "LTI")
{
	String[] ltiJobs = {
		"Software Engineer","Senior Software Engineer","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Consultant","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return ltiJobs;
}
else if(companyName == "Mphasis")
{
	String[] mphasisJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return mphasisJobs;
}
else if(companyName == "Hexaware")
{
	String[] hexawareJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Team Lead"
	};
	return hexawareJobs;
}
else if(companyName == "Persistent")
{
	String[] persistentJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Engineer","Business Analyst","Project Manager","Product Manager",
		"UX Designer","UI Designer","Technical Lead","Architect"
	};
	return persistentJobs;
}
else if(companyName == "Zensar")
{
	String[] zensarJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Team Lead"
	};
	return zensarJobs;
}
else if(companyName == "Birlasoft")
{
	String[] birlasoftJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Technical Lead","Team Lead"
	};
	return birlasoftJobs;
}
else if(companyName == "Cyient")
{
	String[] cyientJobs = {
		"Software Engineer","Embedded Engineer","C Developer","C++ Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","QA Engineer","Automation Tester",
		"System Engineer","Network Engineer","Business Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return cyientJobs;
}
else if(companyName == "UST")
{
	String[] ustJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Team Lead"
	};
	return ustJobs;
}
else if(companyName == "NTT Data")
{
	String[] nttDataJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Consultant","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return nttDataJobs;
}
else if(companyName == "DXC")
{
	String[] dxcJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Support Engineer","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return dxcJobs;
}
else if(companyName == "Atos")
{
	String[] atosJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Team Lead"
	};
	return atosJobs;
}
else if(companyName == "SopraSteria")
{
	String[] sopraSteriaJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Consultant","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return sopraSteriaJobs;
}
else if(companyName == "CGI")
{
	String[] cgiJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Team Lead","Technical Lead"
	};
	return cgiJobs;
}
else if(companyName == "EPAM")
{
	String[] epamJobs = {
		"Software Engineer","Senior Software Engineer","Backend Engineer","Frontend Engineer",
		"Full Stack Engineer","Java Developer","Python Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Product Engineer","Business Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Architect"
	};
	return epamJobs;
}
else if(companyName == "Globant")
{
	String[] globantJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Product Engineer","Business Analyst","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Technical Lead"
	};
	return globantJobs;
}
else if(companyName == "ThoughtWorks")
{
	String[] thoughtWorksJobs = {
		"Software Engineer","Consultant Developer","Backend Engineer","Frontend Engineer",
		"Full Stack Engineer","Java Developer","Python Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Business Analyst","Project Manager","Product Manager",
		"UX Designer","UI Designer","Agile Coach","Technical Lead"
	};
	return thoughtWorksJobs;
}
else if(companyName == "MuSigma")
{
	String[] muSigmaJobs = {
		"Decision Scientist","Data Analyst","Data Scientist","Business Analyst",
		"Python Developer","R Developer","SQL Developer","Backend Developer",
		"Cloud Engineer","DevOps Engineer","ML Engineer","AI Engineer",
		"QA Engineer","Automation Tester","Consultant","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return muSigmaJobs;
}
else if(companyName == "Nagarro")
{
	String[] nagarroJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Team Lead"
	};
	return nagarroJobs;
}
else if(companyName == "Endava")
{
	String[] endavaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Product Engineer","Business Analyst","Project Manager","Product Manager",
		"UX Designer","UI Designer","Agile Coach","Technical Lead"
	};
	return endavaJobs;
}
else if(companyName == "PublicisSapient")
{
	String[] publicisSapientJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Business Analyst","System Analyst","Consultant","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return publicisSapientJobs;
}
else if(companyName == "Virtusa")
{
	String[] virtusaJobs = {
		"Software Engineer","Java Developer","Python Developer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","QA Engineer","Automation Tester","Business Analyst",
		"System Analyst","Support Engineer","Project Manager","Product Manager",
		"UX Designer","UI Designer","Scrum Master","Team Lead"
	};
	return virtusaJobs;
}
else if(companyName == "Kyndryl")
{
	String[] kyndrylJobs = {
		"System Engineer","Cloud Engineer","Infrastructure Engineer","DevOps Engineer",
		"SRE","Network Engineer","Security Engineer","Backend Developer",
		"Frontend Developer","Full Stack Developer","Data Engineer","Data Analyst",
		"QA Engineer","Automation Tester","Business Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return kyndrylJobs;
}
else if(companyName == "Siemens")
{
	String[] siemensJobs = {
		"Software Engineer","Embedded Engineer","C Developer","C++ Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","System Engineer","Business Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return siemensJobs;
}
else if(companyName == "Bosch")
{
	String[] boschJobs = {
		"Software Engineer","Embedded Engineer","Firmware Engineer","C Developer",
		"C++ Developer","Backend Developer","Frontend Developer","Full Stack Developer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","QA Engineer",
		"Automation Tester","System Engineer","Business Analyst","Project Manager",
		"Product Manager","UX Designer","UI Designer","Technical Lead"
	};
	return boschJobs;
}
else if(companyName == "Paytm")
{
	String[] paytmJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile App Developer","Tech Lead"
	};
	return paytmJobs;
}
else if(companyName == "PhonePe")
{
	String[] phonePeJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Android Developer","Tech Lead"
	};
	return phonePeJobs;
}
else if(companyName == "GooglePay")
{
	String[] googlePayJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return googlePayJobs;
}
else if(companyName == "Razorpay")
{
	String[] razorpayJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return razorpayJobs;
}
else if(companyName == "Stripe")
{
	String[] stripeJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Ruby Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","API Engineer","Tech Lead"
	};
	return stripeJobs;
}
else if(companyName == "Square")
{
	String[] squareJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return squareJobs;
}
else if(companyName == "Airbnb")
{
	String[] airbnbJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return airbnbJobs;
}
else if(companyName == "Uber")
{
	String[] uberJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Go Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return uberJobs;
}
else if(companyName == "Ola")
{
	String[] olaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return olaJobs;
}
else if(companyName == "Swiggy")
{
	String[] swiggyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return swiggyJobs;
}
else if(companyName == "Zomato")
{
	String[] zomatoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return zomatoJobs;
}
else if(companyName == "Dunzo")
{
	String[] dunzoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return dunzoJobs;
}
else if(companyName == "Blinkit")
{
	String[] blinkitJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return blinkitJobs;
}
else if(companyName == "Zepto")
{
	String[] zeptoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return zeptoJobs;
}
else if(companyName == "Flipkart")
{
	String[] flipkartJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return flipkartJobs;
}
else if(companyName == "Myntra")
{
	String[] myntraJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return myntraJobs;
}
else if(companyName == "Meesho")
{
	String[] meeshoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return meeshoJobs;
}
else if(companyName == "Snapdeal")
{
	String[] snapdealJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return snapdealJobs;
}
else if(companyName == "Ajio")
{
	String[] ajioJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return ajioJobs;
}
else if(companyName == "BigBasket")
{
	String[] bigBasketJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return bigBasketJobs;
}
else if(companyName == "Nykaa")
{
	String[] nykaaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return nykaaJobs;
}
else if(companyName == "Byjus")
{
	String[] byjusJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return byjusJobs;
}
else if(companyName == "Unacademy")
{
	String[] unacademyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return unacademyJobs;
}
else if(companyName == "Vedantu")
{
	String[] vedantuJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Mobile Developer","Tech Lead","Engineering Manager"
	};
	return vedantuJobs;
}
else if(companyName == "Coursera")
{
	String[] courseraJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return courseraJobs;
}
		 else if(companyName == "Udemy")
{
	String[] udemyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return udemyJobs;
}
else if(companyName == "KhanAcademy")
{
	String[] khanAcademyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Mobile Developer","Tech Lead","Engineering Manager"
	};
	return khanAcademyJobs;
}
else if(companyName == "Hotstar")
{
	String[] hotstarJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return hotstarJobs;
}
else if(companyName == "NetflixIndia")
{
	String[] netflixIndiaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Platform Engineer","Tech Lead"
	};
	return netflixIndiaJobs;
}
else if(companyName == "SonyLiv")
{
	String[] sonyLivJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Mobile Developer","Tech Lead","Engineering Manager"
	};
	return sonyLivJobs;
}
else if(companyName == "Zee5")
{
	String[] zee5Jobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Mobile Developer","Tech Lead","Engineering Manager"
	};
	return zee5Jobs;
}
else if(companyName == "Jio")
{
	String[] jioJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Network Engineer","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return jioJobs;
}
else if(companyName == "Airtel")
{
	String[] airtelJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Network Engineer","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return airtelJobs;
}
else if(companyName == "VodafoneIdea")
{
	String[] vodafoneIdeaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Network Engineer","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return vodafoneIdeaJobs;
}
else if(companyName == "PayPal")
{
	String[] payPalJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Payments Engineer","Tech Lead"
	};
	return payPalJobs;
}
else if(companyName == "StripeIndia")
{
	String[] stripeIndiaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Ruby Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Payments Engineer","Tech Lead"
	};
	return stripeIndiaJobs;
}
else if(companyName == "Freshworks")
{
	String[] freshworksJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return freshworksJobs;
}
else if(companyName == "Zoho")
{
	String[] zohoJobs = {
		"Software Engineer","Java Developer","C Developer","C++ Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Product Engineer","Business Analyst","Project Manager",
		"UX Designer","UI Designer","System Engineer","Tech Lead"
	};
	return zohoJobs;
}
else if(companyName == "Postman")
{
	String[] postmanJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","API Engineer","Tech Lead"
	};
	return postmanJobs;
}
else if(companyName == "BrowserStack")
{
	String[] browserStackJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Ruby Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"SDET","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Platform Engineer","Tech Lead"
	};
	return browserStackJobs;
}
else if(companyName == "InMobi")
{
	String[] inMobiJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","AdTech Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","Platform Engineer","Tech Lead"
	};
	return inMobiJobs;
}
else if(companyName == "ShareChat")
{
	String[] shareChatJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Mobile Developer","Tech Lead"
	};
	return shareChatJobs;
}
else if(companyName == "Groww")
{
	String[] growwJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","FinTech Engineer","Tech Lead"
	};
	return growwJobs;
}
else if(companyName == "Zerodha")
{
	String[] zerodhaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Trading Systems Engineer","Tech Lead"
	};
	return zerodhaJobs;
}
else if(companyName == "Upstox")
{
	String[] upstoxJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","FinTech Engineer","Tech Lead"
	};
	return upstoxJobs;
}
else if(companyName == "HDFC")
{
	String[] hdfcJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Boot Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Banking Systems Engineer","Tech Lead"
	};
	return hdfcJobs;
}
else if(companyName == "ICICI")
{
	String[] iciciJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Core Banking Engineer","Tech Lead"
	};
	return iciciJobs;
}
else if(companyName == "SBI")
{
	String[] sbiJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Mainframe Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Banking Application Engineer","Tech Lead"
	};
	return sbiJobs;
}
else if(companyName == "AxisBank")
{
	String[] axisBankJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Digital Banking Engineer","Tech Lead"
	};
	return axisBankJobs;
}
else if(companyName == "Kotak")
{
	String[] kotakJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","FinTech Engineer","Tech Lead"
	};
	return kotakJobs;
}
else if(companyName == "YesBank")
{
	String[] yesBankJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Banking Platform Engineer","Tech Lead"
	};
	return yesBankJobs;
}
else if(companyName == "IDFC")
{
	String[] idfcJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Boot Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","FinTech Platform Engineer","Tech Lead"
	};
	return idfcJobs;
}
else if(companyName == "IndusInd")
{
	String[] indusIndJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Core Banking Engineer","Tech Lead"
	};
	return indusIndJobs;
}
else if(companyName == "PaytmBank")
{
	String[] paytmBankJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Digital Payments Engineer","Tech Lead"
	};
	return paytmBankJobs;
}
else if(companyName == "BajajFinserv")
{
	String[] bajajFinservJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","FinTech Systems Engineer","Tech Lead"
	};
	return bajajFinservJobs;
}
else if(companyName == "TataCapital")
{
	String[] tataCapitalJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Finance Systems Engineer","Tech Lead"
	};
	return tataCapitalJobs;
}
else if(companyName == "AdityaBirlaGroup")
{
	String[] adityaBirlaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Enterprise Systems Engineer","Tech Lead"
	};
	return adityaBirlaJobs;
}
else if(companyName == "Reliance")
{
	String[] relianceJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Enterprise Architect","Tech Lead"
	};
	return relianceJobs;
}
else if(companyName == "LT")
{
	String[] ltJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Boot Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Engineering Systems Engineer","Tech Lead"
	};
	return ltJobs;
}
else if(companyName == "Deloitte")
{
	String[] deloitteJobs = {
		"Consultant","Senior Consultant","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","Product Manager","Project Manager",
		"UX Designer","UI Designer","Solution Architect","Technical Lead"
	};
	return deloitteJobs;
}
else if(companyName == "EY")
{
	String[] eyJobs = {
		"Consultant","Senior Consultant","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","Product Manager","Project Manager",
		"UX Designer","UI Designer","Solution Architect","Technical Lead"
	};
	return eyJobs;
}
else if(companyName == "KPMG")
{
	String[] kpmgJobs = {
		"Consultant","Senior Consultant","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","Product Manager","Project Manager",
		"UX Designer","UI Designer","Solution Architect","Technical Lead"
	};
	return kpmgJobs;
}
else if(companyName == "PwC")
{
	String[] pwcJobs = {
		"Consultant","Senior Consultant","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Analyst","QA Engineer",
		"Automation Tester","Business Analyst","Product Manager","Project Manager",
		"UX Designer","UI Designer","Solution Architect","Technical Lead"
	};
	return pwcJobs;
}
else if(companyName == "McKinsey")
{
	String[] mckinseyJobs = {
		"Business Analyst","Senior Analyst","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Consultant",
		"UX Designer","UI Designer","Enterprise Architect","Tech Lead"
	};
	return mckinseyJobs;
}
else if(companyName == "BCG")
{
	String[] bcgJobs = {
		"Business Analyst","Senior Analyst","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Consultant",
		"UX Designer","UI Designer","Enterprise Architect","Tech Lead"
	};
	return bcgJobs;
}
else if(companyName == "Bain")
{
	String[] bainJobs = {
		"Business Analyst","Senior Analyst","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Consultant",
		"UX Designer","UI Designer","Enterprise Architect","Tech Lead"
	};
	return bainJobs;
}
else if(companyName == "AccentureStrategy")
{
	String[] accentureStrategyJobs = {
		"Strategy Analyst","Senior Analyst","Java Developer","Python Developer",
		"Backend Developer","Frontend Developer","Full Stack Developer","Cloud Engineer",
		"DevOps Engineer","Data Engineer","Data Scientist","QA Engineer",
		"Automation Tester","Product Manager","Program Manager","Consultant",
		"UX Designer","UI Designer","Solution Architect","Tech Lead"
	};
	return accentureStrategyJobs;
}
else if(companyName == "GoldmanSachs")
{
	String[] goldmanSachsJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Trading Systems Engineer","Tech Lead"
	};
	return goldmanSachsJobs;
}
else if(companyName == "MorganStanley")
{
	String[] morganStanleyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Investment Systems Engineer","Tech Lead"
	};
	return morganStanleyJobs;
}
else if(companyName == "JPMorgan")
{
	String[] jpMorganJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Banking Platform Engineer","Tech Lead"
	};
	return jpMorganJobs;
}
else if(companyName == "Citi")
{
	String[] citiJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Core Banking Engineer","Tech Lead"
	};
	return citiJobs;
}
else if(companyName == "HSBC")
{
	String[] hsbcJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Mainframe Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Banking Systems Engineer","Tech Lead"
	};
	return hsbcJobs;
}
else if(companyName == "Barclays")
{
	String[] barclaysJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Risk Systems Engineer","Tech Lead"
	};
	return barclaysJobs;
}
else if(companyName == "DeutscheBank")
{
	String[] deutscheBankJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Trading Platform Engineer","Tech Lead"
	};
	return deutscheBankJobs;
}
else if(companyName == "UBS")
{
	String[] ubsJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Wealth Platform Engineer","Tech Lead"
	};
	return ubsJobs;
}
else if(companyName == "SpaceX")
{
	String[] spaceXJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"C++ Developer","Python Developer","Embedded Engineer","Firmware Engineer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","Data Scientist",
		"ML Engineer","QA Engineer","Automation Tester","Security Engineer",
		"Systems Engineer","Aerospace Engineer","Mission Engineer","Tech Lead"
	};
	return spaceXJobs;
}
else if(companyName == "Tesla")
{
	String[] teslaJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Python Developer","C++ Developer","Embedded Engineer","Firmware Engineer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","Data Scientist",
		"ML Engineer","QA Engineer","Automation Tester","Security Engineer",
		"Systems Engineer","Autopilot Engineer","Battery Engineer","Tech Lead"
	};
	return teslaJobs;
}
else if(companyName == "BlueOrigin")
{
	String[] blueOriginJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"C++ Developer","Python Developer","Embedded Engineer","Firmware Engineer",
		"Cloud Engineer","DevOps Engineer","Data Engineer","Data Scientist",
		"QA Engineer","Automation Tester","Security Engineer","Systems Engineer",
		"Aerospace Engineer","Launch Engineer","Mission Planner","Tech Lead"
	};
	return blueOriginJobs;
}
else if(companyName == "PayU")
{
	String[] payUJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Boot Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Payments Engineer","Tech Lead"
	};
	return payUJobs;
}
else if(companyName == "CRED")
{
	String[] credJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","ML Engineer","QA Engineer",
		"Automation Tester","Security Engineer","Product Manager","Program Manager",
		"UX Designer","UI Designer","FinTech Engineer","Tech Lead"
	};
	return credJobs;
}
else if(companyName == "Slice")
{
	String[] sliceJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Kotlin Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Credit Platform Engineer","Tech Lead"
	};
	return sliceJobs;
}
else if(companyName == "BharatPe")
{
	String[] bharatPeJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Payments Engineer","Tech Lead"
	};
	return bharatPeJobs;
}
else if(companyName == "OYO")
{
	String[] oyoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Hospitality Systems Engineer","Tech Lead"
	};
	return oyoJobs;
}
else if(companyName == "MakeMyTrip")
{
	String[] makeMyTripJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Travel Systems Engineer","Tech Lead"
	};
	return makeMyTripJobs;
}
else if(companyName == "Goibibo")
{
	String[] goibiboJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Travel Platform Engineer","Tech Lead"
	};
	return goibiboJobs;
}
else if(companyName == "RedBus")
{
	String[] redBusJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Security Engineer","Product Manager","Program Manager","Business Analyst",
		"UX Designer","UI Designer","Travel Platform Engineer","Tech Lead"
	};
	return redBusJobs;
}
else if(companyName == "BookMyShow")
{
	String[] bookMyShowJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Mobile Developer","Entertainment Systems Engineer","Tech Lead"
	};
	return bookMyShowJobs;
}
else if(companyName == "Practo")
{
	String[] practoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","HealthTech Engineer","Mobile Developer","Tech Lead"
	};
	return practoJobs;
}
else if(companyName == "PharmEasy")
{
	String[] pharmEasyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Health Platform Engineer","Mobile Developer","Tech Lead"
	};
	return pharmEasyJobs;
}
else if(companyName == "1mg")
{
	String[] oneMgJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Health Systems Engineer","Mobile Developer","Tech Lead"
	};
	return oneMgJobs;
}
else if(companyName == "Licious")
{
	String[] liciousJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Analyst","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Supply Chain Engineer","Mobile Developer","Tech Lead"
	};
	return liciousJobs;
}
else if(companyName == "Udaan")
{
	String[] udaanJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","B2B Platform Engineer","Mobile Developer","Tech Lead"
	};
	return udaanJobs;
}
else if(companyName == "Delhivery")
{
	String[] delhiveryJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Logistics Systems Engineer","Mobile Developer","Tech Lead"
	};
	return delhiveryJobs;
}
else if(companyName == "Rivigo")
{
	String[] rivigoJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Supply Chain Engineer","Mobile Developer","Tech Lead"
	};
	return rivigoJobs;
}
else if(companyName == "UrbanCompany")
{
	String[] urbanCompanyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Service Platform Engineer","Mobile Developer","Tech Lead"
	};
	return urbanCompanyJobs;
}
else if(companyName == "Cars24")
{
	String[] cars24Jobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","AutoTech Engineer","Mobile Developer","Tech Lead"
	};
	return cars24Jobs;
}
else if(companyName == "Spinny")
{
	String[] spinnyJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","Auto Platform Engineer","Mobile Developer","Tech Lead"
	};
	return spinnyJobs;
}
else if(companyName == "NoBroker")
{
	String[] noBrokerJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","NodeJS Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","PropTech Engineer","Mobile Developer","Tech Lead"
	};
	return noBrokerJobs;
}
else if(companyName == "MagicBricks")
{
	String[] magicBricksJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Python Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","RealEstate Platform Engineer","Mobile Developer","Tech Lead"
	};
	return magicBricksJobs;
}
else if(companyName == "PolicyBazaar")
{
	String[] policyBazaarJobs = {
		"Software Engineer","Backend Engineer","Frontend Engineer","Full Stack Engineer",
		"Java Developer","Spring Developer","Cloud Engineer","DevOps Engineer",
		"Data Engineer","Data Scientist","QA Engineer","Automation Tester",
		"Product Manager","Program Manager","Business Analyst","UX Designer",
		"UI Designer","InsurTech Engineer","Mobile Developer","Tech Lead"
	};
	return policyBazaarJobs;
}
else{
			System.out.println(companyName+ "not found here");
		}
		return null;
	}

	public static void getJobNames(String[] jobs)
	{
		
		
			for(String job : jobs)
			{
				System.out.println(job);
			}
			System.out.println();
		
	}
}