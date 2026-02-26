class CameraExecuter {

    public static void main(String[] args) {

        boolean v1 = Camera.createCamera("Canon","EOS 90D",120000,32,"Black","Wide",true,2,"Lithium",1.2);
        Camera.getCameraDetails();

        boolean v2 = Camera.createCamera("Nikon","D7500",110000,24,"Black","Telephoto",true,2,"Lithium",1.1);
        Camera.getCameraDetails();

        boolean v3 = Camera.createCamera("Sony","Alpha A7",150000,28,"Black","Prime",true,3,"Lithium",1.0);
        Camera.getCameraDetails();

        boolean v4 = Camera.createCamera("Fujifilm","XT4",130000,26,"Silver","Wide",true,2,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v5 = Camera.createCamera("Panasonic","Lumix G9",125000,20,"Black","Zoom",true,2,"Lithium",1.3);
        Camera.getCameraDetails();

        boolean v6 = Camera.createCamera("Olympus","OMD E10",90000,16,"Black","Wide",false,1,"Lithium",0.8);
        Camera.getCameraDetails();

        boolean v7 = Camera.createCamera("Leica","Q2",450000,47,"Black","Prime",true,3,"Lithium",1.4);
        Camera.getCameraDetails();

        boolean v8 = Camera.createCamera("GoPro","Hero 11",55000,27,"Black","UltraWide",true,1,"Lithium",0.4);
        Camera.getCameraDetails();

        boolean v9 = Camera.createCamera("DJI","Osmo Action",48000,20,"Black","Wide",true,1,"Lithium",0.45);
        Camera.getCameraDetails();

        boolean v10 = Camera.createCamera("Canon","M50",65000,24,"White","Wide",false,1,"Lithium",0.7);
        Camera.getCameraDetails();

        boolean v11 = Camera.createCamera("Nikon","Z50",85000,21,"Black","Zoom",true,2,"Lithium",0.95);
        Camera.getCameraDetails();

        boolean v12 = Camera.createCamera("Sony","RX100",70000,20,"Black","Zoom",true,1,"Lithium",0.6);
        Camera.getCameraDetails();

        boolean v13 = Camera.createCamera("Canon","EOS R5",300000,45,"Black","Wide",true,4,"Lithium",1.5);
        Camera.getCameraDetails();

        boolean v14 = Camera.createCamera("Nikon","Z9",350000,46,"Black","Telephoto",true,5,"Lithium",1.6);
        Camera.getCameraDetails();

        boolean v15 = Camera.createCamera("Sony","A6400",90000,24,"Silver","Prime",true,2,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v16 = Camera.createCamera("Pentax","K70",60000,24,"Black","Wide",false,1,"Lithium",1.1);
        Camera.getCameraDetails();

        boolean v17 = Camera.createCamera("Kodak","PixPro",30000,16,"Red","Zoom",false,1,"Lithium",0.5);
        Camera.getCameraDetails();

        boolean v18 = Camera.createCamera("Samsung","NX300",75000,20,"Black","Wide",true,2,"Lithium",0.8);
        Camera.getCameraDetails();

        boolean v19 = Camera.createCamera("Casio","Exilim",25000,12,"Grey","Zoom",false,1,"Lithium",0.4);
        Camera.getCameraDetails();

        boolean v20 = Camera.createCamera("Insta360","One X2",45000,18,"Black","UltraWide",true,1,"Lithium",0.3);
        Camera.getCameraDetails();

        // ---- Invalid test cases (still correct parameters) ----

        boolean v21 = Camera.createCamera(null,"TestModel",50000,20,"Black","Wide",true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v22 = Camera.createCamera("TestBrand",null,50000,20,"Black","Wide",true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v23 = Camera.createCamera("ErrorBrand","E1",0,20,"Black","Wide",true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v24 = Camera.createCamera("ErrorBrand","E2",50000,0,"Black","Wide",true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v25 = Camera.createCamera("ErrorBrand","E3",50000,20,null,"Wide",true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v26 = Camera.createCamera("ErrorBrand","E4",50000,20,"Black",null,true,1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v27 = Camera.createCamera("ErrorBrand","E5",50000,20,"Black","Wide",true,-1,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v28 = Camera.createCamera("ErrorBrand","E6",50000,20,"Black","Wide",true,1,null,0.9);
        Camera.getCameraDetails();

        boolean v29 = Camera.createCamera("ErrorBrand","E7",50000,20,"Black","Wide",true,1,"Lithium",0);
        Camera.getCameraDetails();

        boolean v30 = Camera.createCamera("ErrorBrand","E8",0.0,20,"Black","Wide",true,1,"Lithium",1.5);
        Camera.getCameraDetails();

        boolean v31 = Camera.createCamera("Brand31","Model31",31000,31,"Blue","Wide",false,1,"Lithium",0.7);
        Camera.getCameraDetails();

        boolean v32 = Camera.createCamera("Brand32","Model32",32000,32,"Green","Zoom",true,2,"Lithium",0.8);
        Camera.getCameraDetails();

        boolean v33 = Camera.createCamera("Brand33","Model33",33000,33,"Yellow","Prime",true,2,"Lithium",0.9);
        Camera.getCameraDetails();

        boolean v34 = Camera.createCamera("Brand34","Model34",34000,34,"White","Wide",false,1,"Lithium",1.0);
        Camera.getCameraDetails();

        boolean v35 = Camera.createCamera("Brand35","Model35",35000,35,"Grey","Telephoto",true,3,"Lithium",1.1);
        Camera.getCameraDetails();

        boolean v36 = Camera.createCamera("Brand36","Model36",36000,36,"Black","UltraWide",true,3,"Lithium",1.2);
        Camera.getCameraDetails();

        boolean v37 = Camera.createCamera("FinalBrand","FinalModel",500000,50,"Gold","UltraWide",true,5,"Lithium",1.8);
        Camera.getCameraDetails();
    }
}