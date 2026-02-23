class Hospital
{
	public static String[] findDoctorsBySpecialization(String specialization)
	{
		if(specialization == "General Medicine")
		{
			String[] generalMedicineDoctors = {
				"Dr.Inchara","Dr.Likhitha SY","Dr.Likhitha BS","Dr.Ramesh","Dr.Suresh",
				"Dr.Anil","Dr.Prakash","Dr.Vijay","Dr.Mahesh","Dr.Raj",
				"Dr.Arjun","Dr.Santosh","Dr.Naveen","Dr.Deepak","Dr.Rohit"
			};
			return generalMedicineDoctors;
		}
		else if(specialization == "Orthopaedics")
		{
			String[] orthopaedicsDoctors = {
				"Dr.Prashanth","Dr.Aradhana","Dr.Amrutha","Dr.Rajeev","Dr.Narendra",
				"Dr.Sudheer","Dr.Pankaj","Dr.Vikas","Dr.Abhay","Dr.Ketan",
				"Dr.Sameer","Dr.Gaurav","Dr.Manish","Dr.Ritesh","Dr.Yash"
			};
			return orthopaedicsDoctors;
		}
		else if(specialization == "Cardiac Sciences")
		{
			String[] cardiacSciencesDoctors = {
				"Dr.Ajay","Dr.Ramesh","Dr.Suresh","Dr.Kiran","Dr.Anil",
				"Dr.Prakash","Dr.Vijay","Dr.Mahesh","Dr.Raj","Dr.Arjun",
				"Dr.Santosh","Dr.Naveen","Dr.Deepak","Dr.Varun","Dr.Rohit"
			};
			return cardiacSciencesDoctors;
		}
		else if(specialization == "Dental Science")
		{
			String[] dentalScienceDoctors = {
				"Dr.Asha","Dr.Kavya","Dr.Sindhu","Dr.Pooja","Dr.Megha",
				"Dr.Divya","Dr.Nisha","Dr.Ritu","Dr.Latha","Dr.Smitha",
				"Dr.Anita","Dr.Sonia","Dr.Preethi","Dr.Bhavya","Dr.Rashmi"
			};
			return dentalScienceDoctors;
		}
		else if(specialization == "Dermatology")
		{
			String[] dermatologyDoctors = {
				"Dr.Sneha","Dr.Kiran","Dr.Rajesh","Dr.Amit","Dr.Pankaj",
				"Dr.Neha","Dr.Suman","Dr.Lavanya","Dr.Swathi","Dr.Priya",
				"Dr.Madhu","Dr.Rekha","Dr.Chandana","Dr.Harsha","Dr.Manju"
			};
			return dermatologyDoctors;
		}
		else if(specialization == "Diabetology")
		{
			String[] diabetologyDoctors = {
				"Dr.Ravi","Dr.Anand","Dr.Harish","Dr.Karthik","Dr.Suresh",
				"Dr.Prasad","Dr.Vinay","Dr.Mahendra","Dr.Satish","Dr.Abhay",
				"Dr.Deepak","Dr.Rohit","Dr.Nitin","Dr.Sameer","Dr.Girish"
			};
			return diabetologyDoctors;
		}
		else if(specialization == "ENT")
		{
			String[] entDoctors = {
				"Dr.Mohan","Dr.Ravi","Dr.Kiran","Dr.Anil","Dr.Srinivas",
				"Dr.Ashok","Dr.Narayan","Dr.Pradeep","Dr.Vishal","Dr.Sameer",
				"Dr.Deepesh","Dr.Abhishek","Dr.Santosh","Dr.Hemant","Dr.Kumar"
			};
			return entDoctors;
		}
		else if(specialization == "Emergency and Trauma")
		{
			String[] emergencyDoctors = {
				"Dr.Suraj","Dr.Amit","Dr.Kapil","Dr.Manish","Dr.Arvind",
				"Dr.Praveen","Dr.Nikhil","Dr.Vikas","Dr.Gaurav","Dr.Rajat",
				"Dr.Pankaj","Dr.Harsha","Dr.Milind","Dr.Saurabh","Dr.Rohit"
			};
			return emergencyDoctors;
		}
		else if(specialization == "Foetal Medicine")
		{
			String[] foetalMedicineDoctors = {
				"Dr.Anitha","Dr.Kavitha","Dr.Sujatha","Dr.Radhika","Dr.Pallavi",
				"Dr.Meena","Dr.Shilpa","Dr.Nandini","Dr.Sowmya","Dr.Kalpana",
				"Dr.Reema","Dr.Hema","Dr.Kirthi","Dr.Manasa","Dr.Sandhya"
			};
			return foetalMedicineDoctors;
		}
		else if(specialization == "Gastroenterology and Hepatobiliary Sciences")
		{
			String[] gastroDoctors = {
				"Dr.Shekhar","Dr.Arvind","Dr.Kumar","Dr.Sunil","Dr.Prasad",
				"Dr.Raghav","Dr.Ashwin","Dr.Manoj","Dr.Dinesh","Dr.Yogesh",
				"Dr.Pavan","Dr.Amitabh","Dr.Jayesh","Dr.Keshav","Dr.Vivek"
			};
			return gastroDoctors;
		}
		else if(specialization == "Haematology")
		{
			String[] haematologyDoctors = {
				"Dr.Ashok","Dr.Bharath","Dr.Chetan","Dr.Deepak","Dr.Eshaan",
				"Dr.Faizal","Dr.Girish","Dr.Hemanth","Dr.Ishan","Dr.Jaydeep",
				"Dr.Kunal","Dr.Lalit","Dr.Manish","Dr.Naveen","Dr.Ojas"
			};
			return haematologyDoctors;
		}
		else if(specialization == "Infectious Diseases")
		{
			String[] infectiousDoctors = {
				"Dr.Ramesh","Dr.Suresh","Dr.Mahesh","Dr.Nagesh","Dr.Prakash",
				"Dr.Santosh","Dr.Vinod","Dr.Rajesh","Dr.Karthik","Dr.Anil",
				"Dr.Vikas","Dr.Deepak","Dr.Gaurav","Dr.Harsha","Dr.Milind"
			};
			return infectiousDoctors;
		}
		else if(specialization == "Infertility medicine")
		{
			String[] infertilityDoctors = {
				"Dr.Ananya","Dr.Radhika","Dr.Pallavi","Dr.Meena","Dr.Shilpa",
				"Dr.Sowmya","Dr.Lavanya","Dr.Nandini","Dr.Kalpana","Dr.Reema",
				"Dr.Supriya","Dr.Kirthi","Dr.Hema","Dr.Manjula","Dr.Sandhya"
			};
			return infertilityDoctors;
		}
		else if(specialization == "Mental Health and Behavioural Sciences")
		{
			String[] mentalHealthDoctors = {
				"Dr.Suresh","Dr.Anita","Dr.Raj","Dr.Megha","Dr.Kiran",
				"Dr.Nisha","Dr.Priya","Dr.Suman","Dr.Vinay","Dr.Deepak",
				"Dr.Harsha","Dr.Abhay","Dr.Sameer","Dr.Gaurav","Dr.Manish"
			};
			return mentalHealthDoctors;
		}
		else if(specialization == "Nephrology")
		{
			String[] nephrologyDoctors = {
				"Dr.Ravi","Dr.Mohan","Dr.Karthik","Dr.Suresh","Dr.Prakash",
				"Dr.Anil","Dr.Rajesh","Dr.Deepak","Dr.Girish","Dr.Vikas",
				"Dr.Pankaj","Dr.Hemant","Dr.Nitin","Dr.Manish","Dr.Ashok"
			};
			return nephrologyDoctors;
		}
		else if(specialization == "Neurointerventional Radiology")
		{
			String[] neuroInterventionalDoctors = {
				"Dr.Arun","Dr.Sandeep","Dr.Vishal","Dr.Ashish","Dr.Prem",
				"Dr.Nikhil","Dr.Siddharth","Dr.Ajayraj","Dr.Tarun","Dr.Jatin",
				"Dr.Milind","Dr.Saurabh","Dr.Harish","Dr.Balaji","Dr.Lokesh"
			};
			return neuroInterventionalDoctors;
		}
		else if(specialization == "Neurology")
		{
			String[] neurologyDoctors = {
				"Dr.Narayan","Dr.Sudhir","Dr.Venkatesh","Dr.Rameshwar","Dr.Hemant",
				"Dr.Pratik","Dr.Sachin","Dr.Girish","Dr.Kunal","Dr.Mukesh",
				"Dr.Sanjay","Dr.Rohith","Dr.Kapil","Dr.Mayank","Dr.Vikas"
			};
			return neurologyDoctors;
		}
		else if(specialization == "Neurosurgery")
		{
			String[] neurosurgeryDoctors = {
				"Dr.Arun","Dr.Sandeep","Dr.Balaji","Dr.Vishal","Dr.Ashish",
				"Dr.Harish","Dr.Prem","Dr.Nikhil","Dr.Siddharth","Dr.Ajayraj",
				"Dr.Lokesh","Dr.Tarun","Dr.Jatin","Dr.Milind","Dr.Saurabh"
			};
			return neurosurgeryDoctors;
		}
		else if(specialization == "Obstetrics and Gynaecology")
		{
			String[] obgDoctors = {
				"Dr.Anita","Dr.Radhika","Dr.Meena","Dr.Shilpa","Dr.Pallavi",
				"Dr.Sowmya","Dr.Nandini","Dr.Kalpana","Dr.Reema","Dr.Hema",
				"Dr.Manasa","Dr.Kirthi","Dr.Sandhya","Dr.Supriya","Dr.Lavanya"
			};
			return obgDoctors;
		}
		else if(specialization == "Oncology")
		{
			String[] oncologyDoctors = {
				"Dr.Ramesh","Dr.Suresh","Dr.Anil","Dr.Prakash","Dr.Vijay",
				"Dr.Mahesh","Dr.Raj","Dr.Arjun","Dr.Santosh","Dr.Naveen",
				"Dr.Deepak","Dr.Varun","Dr.Rohit","Dr.Kiran","Dr.Ajay"
			};
			return oncologyDoctors;
		}
		else if(specialization == "Ophthalmology")
		{
			String[] ophthalmologyDoctors = {
				"Dr.Suresh","Dr.Anand","Dr.Ravi","Dr.Mohan","Dr.Kiran",
				"Dr.Pradeep","Dr.Anil","Dr.Rajesh","Dr.Deepak","Dr.Vikas",
				"Dr.Pankaj","Dr.Gaurav","Dr.Harsha","Dr.Manish","Dr.Sameer"
			};
			return ophthalmologyDoctors;
		}
		else if(specialization == "Organ Transplant")
		{
			String[] organTransplantDoctors = {
				"Dr.Arjun","Dr.Balaji","Dr.Chandan","Dr.Dinesh","Dr.Eshwar",
				"Dr.Feroz","Dr.Ganesh","Dr.Harish","Dr.Irfan","Dr.Jagan",
				"Dr.Kiran","Dr.Lokesh","Dr.Mukesh","Dr.Nitin","Dr.Omkar"
			};
			return organTransplantDoctors;
		}
		else if(specialization == "Physiotherapy and Rehabilitation")
		{
			String[] physiotherapyDoctors = {
				"Dr.Radhika","Dr.Priya","Dr.Sowmya","Dr.Lavanya","Dr.Megha",
				"Dr.Anita","Dr.Kavya","Dr.Sindhu","Dr.Divya","Dr.Nisha",
				"Dr.Preethi","Dr.Bhavya","Dr.Rashmi","Dr.Smitha","Dr.Pooja"
			};
			return physiotherapyDoctors;
		}
		else if(specialization == "Plastic and Reconstructive Surgery")
		{
			String[] plasticSurgeryDoctors = {
				"Dr.Shekhar","Dr.Arvind","Dr.Kumar","Dr.Sunil","Dr.Prasad",
				"Dr.Raghav","Dr.Ashwin","Dr.Manoj","Dr.Dinesh","Dr.Yogesh",
				"Dr.Pavan","Dr.Amitabh","Dr.Jayesh","Dr.Keshav","Dr.Vivek"
			};
			return plasticSurgeryDoctors;
		}
		else if(specialization == "Pulmonology")
		{
			String[] pulmonologyDoctors = {
				"Dr.Ravi","Dr.Mohan","Dr.Suresh","Dr.Kiran","Dr.Anil",
				"Dr.Prakash","Dr.Vijay","Dr.Mahesh","Dr.Raj","Dr.Arjun",
				"Dr.Santosh","Dr.Naveen","Dr.Deepak","Dr.Varun","Dr.Rohit"
			};
			return pulmonologyDoctors;
		}
		else if(specialization == "Rheumatology")
		{
			String[] rheumatologyDoctors = {
				"Dr.Anand","Dr.Ravi","Dr.Mohan","Dr.Suresh","Dr.Kiran",
				"Dr.Prakash","Dr.Anil","Dr.Vijay","Dr.Mahesh","Dr.Raj",
				"Dr.Arjun","Dr.Santosh","Dr.Naveen","Dr.Deepak","Dr.Rohit"
			};
			return rheumatologyDoctors;
		}
		else if(specialization == "Support Specialties")
		{
			String[] supportSpecialtiesDoctors = {
				"Dr.Ramesh","Dr.Suresh","Dr.Anil","Dr.Prakash","Dr.Vijay",
				"Dr.Mahesh","Dr.Raj","Dr.Arjun","Dr.Santosh","Dr.Naveen",
				"Dr.Deepak","Dr.Varun","Dr.Rohit","Dr.Kiran","Dr.Ajay"
			};
			return supportSpecialtiesDoctors;
		}
		else if(specialization == "Thoracic Surgery")
		{
			String[] thoracicSurgeryDoctors = {
				"Dr.Shekhar","Dr.Arvind","Dr.Kumar","Dr.Sunil","Dr.Prasad",
				"Dr.Raghav","Dr.Ashwin","Dr.Manoj","Dr.Dinesh","Dr.Yogesh",
				"Dr.Pavan","Dr.Amitabh","Dr.Jayesh","Dr.Keshav","Dr.Vivek"
			};
			return thoracicSurgeryDoctors;
		}
		else if(specialization == "Transfusion Medicine")
		{
			String[] transfusionMedicineDoctors = {
				"Dr.Ashok","Dr.Bharath","Dr.Chetan","Dr.Deepak","Dr.Eshaan",
				"Dr.Faizal","Dr.Girish","Dr.Hemanth","Dr.Ishan","Dr.Jaydeep",
				"Dr.Kunal","Dr.Lalit","Dr.Manish","Dr.Naveen","Dr.Ojas"
			};
			return transfusionMedicineDoctors;
		}
		else if(specialization == "Urology")
		{
			String[] urologyDoctors = {
				"Dr.Ravi","Dr.Mohan","Dr.Karthik","Dr.Suresh","Dr.Prakash",
				"Dr.Anil","Dr.Rajesh","Dr.Deepak","Dr.Girish","Dr.Vikas",
				"Dr.Pankaj","Dr.Hemant","Dr.Nitin","Dr.Manish","Dr.Ashok"
			};
			return urologyDoctors;
		}
		else if(specialization == "Endocrine Surgery")
		{
			String[] endocrineSurgeryDoctors = {
				"Dr.Arun","Dr.Sandeep","Dr.Vishal","Dr.Ashish","Dr.Prem",
				"Dr.Nikhil","Dr.Siddharth","Dr.Ajayraj","Dr.Tarun","Dr.Jatin",
				"Dr.Milind","Dr.Saurabh","Dr.Harish","Dr.Balaji","Dr.Lokesh"
			};
			return endocrineSurgeryDoctors;
		}
		else if(specialization == "Vascular Surgery")
		{
			String[] vascularSurgeryDoctors = {
				"Dr.Arjun","Dr.Balaji","Dr.Chandan","Dr.Dinesh","Dr.Eshwar",
				"Dr.Feroz","Dr.Ganesh","Dr.Harish","Dr.Irfan","Dr.Jagan",
				"Dr.Kiran","Dr.Lokesh","Dr.Mukesh","Dr.Nitin","Dr.Omkar"
			};
			return vascularSurgeryDoctors;
		}
		else if(specialization == "Liver Transplant and Hepatobiliary Sciences")
		{
			String[] liverTransplantDoctors = {
				"Dr.Shekhar","Dr.Arvind","Dr.Kumar","Dr.Sunil","Dr.Prasad",
				"Dr.Raghav","Dr.Ashwin","Dr.Manoj","Dr.Dinesh","Dr.Yogesh",
				"Dr.Pavan","Dr.Amitabh","Dr.Jayesh","Dr.Keshav","Dr.Vivek"
			};
			return liverTransplantDoctors;
		}
		else if(specialization == "Palliative Medicine")
		{
			String[] palliativeMedicineDoctors = {
				"Dr.Anita","Dr.Radhika","Dr.Meena","Dr.Shilpa","Dr.Pallavi",
				"Dr.Sowmya","Dr.Nandini","Dr.Kalpana","Dr.Reema","Dr.Hema",
				"Dr.Manasa","Dr.Kirthi","Dr.Sandhya","Dr.Supriya","Dr.Lavanya"
			};
			return palliativeMedicineDoctors;
		}
		else if(specialization == "Medical Genetics")
		{
			String[] medicalGeneticsDoctors = {
				"Dr.Ramesh","Dr.Suresh","Dr.Anil","Dr.Prakash","Dr.Vijay",
				"Dr.Mahesh","Dr.Raj","Dr.Arjun","Dr.Santosh","Dr.Naveen",
				"Dr.Deepak","Dr.Varun","Dr.Rohit","Dr.Kiran","Dr.Ajay"
			};
			return medicalGeneticsDoctors;
		}
		else if(specialization == "Pain and Palliative Medicine")
		{
			String[] painPalliativeDoctors = {
				"Dr.Anita","Dr.Radhika","Dr.Meena","Dr.Shilpa","Dr.Pallavi",
				"Dr.Sowmya","Dr.Nandini","Dr.Kalpana","Dr.Reema","Dr.Hema",
				"Dr.Manasa","Dr.Kirthi","Dr.Sandhya","Dr.Supriya","Dr.Lavanya"
			};
			return painPalliativeDoctors;
		}
		else if(specialization == "Geriatric Medicine")
		{
			String[] geriatricMedicineDoctors = {
				"Dr.Ravi","Dr.Mohan","Dr.Suresh","Dr.Kiran","Dr.Anil",
				"Dr.Prakash","Dr.Vijay","Dr.Mahesh","Dr.Raj","Dr.Arjun",
				"Dr.Santosh","Dr.Naveen","Dr.Deepak","Dr.Varun","Dr.Rohit"
			};
			return geriatricMedicineDoctors;
		}
		else if(specialization == "Critical Care")
		{
			String[] criticalCareDoctors = {
				"Dr.Suraj","Dr.Amit","Dr.Kapil","Dr.Manish","Dr.Arvind",
				"Dr.Praveen","Dr.Nikhil","Dr.Vikas","Dr.Gaurav","Dr.Rajat",
				"Dr.Pankaj","Dr.Harsha","Dr.Milind","Dr.Saurabh","Dr.Rohit"
			};
			return criticalCareDoctors;
		}
		else if(specialization == "Nuclear Medicine")
		{
			String[] nuclearMedicineDoctors = {
				"Dr.Arunima","Dr.Kapoor","Dr.Sharma","Dr.Joshi","Dr.Bansal",
				"Dr.Mittal","Dr.Gupta","Dr.Saxena","Dr.Chopra","Dr.Malhotra",
				"Dr.Rana","Dr.Bhat","Dr.Kohli","Dr.Aggarwal","Dr.Goel"
			};
			return nuclearMedicineDoctors;
		}
		else{
			System.out.println(specialization + "not found here");
		}
		return null;
	}

	public static void getDoctors(String[] doctors)
{

    System.out.println("fetching doctors....");
    System.out.println("--------------------------------");

    for (String doctor : doctors) {
        System.out.println(doctor);
    }

    System.out.println("Above are the doctors List");
    System.out.println("--------------------------------");
}
}