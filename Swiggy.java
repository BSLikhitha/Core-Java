class Swiggy
{
    public static double search(String foodName)
    {
        double price = 0.0;
        if(foodName == "Veg Momos"){
            price = 90.00;
            return price;
        }else if(foodName == "Chicken Momos"){
            price = 120.00;
            return price;
        }else if(foodName == "Fried Momos"){
            price = 130.00;
            return price;
        }else if(foodName == "Paneer Momos"){
            price = 110.00;
            return price;
        }else if(foodName == "Tandoori Momos"){
            price = 150.00;
            return price;
        }
        else if(foodName == "Veg Noodles"){
            price = 100.00;
            return price;
        }else if(foodName == "Chicken Noodles"){
            price = 130.00;
            return price;
        }else if(foodName == "Hakka Noodles"){
            price = 120.00;
            return price;
        }else if(foodName == "Schezwan Noodles"){
            price = 140.00;
            return price;
        }else if(foodName == "Singapore Noodles"){
            price = 150.00;
            return price;
        }
        else if(foodName == "Veg Fried Rice"){
            price = 110.00;
            return price;
        }else if(foodName == "Egg Fried Rice"){
            price = 120.00;
            return price;
        }else if(foodName == "Chicken Fried Rice"){
            price = 140.00;
            return price;
        }else if(foodName == "Schezwan Fried Rice"){
            price = 150.00;
            return price;
        }else if(foodName == "Triple Fried Rice"){
            price = 170.00;
            return price;
        }
        else if(foodName == "Veg Manchurian"){
            price = 120.00;
            return price;
        }else if(foodName == "Gobi Manchurian"){
            price = 130.00;
            return price;
        }else if(foodName == "Paneer Manchurian"){
            price = 150.00;
            return price;
        }else if(foodName == "Chicken Manchurian"){
            price = 170.00;
            return price;
        }else if(foodName == "Chilli Paneer"){
            price = 160.00;
            return price;
        }
        else if(foodName == "Chilli Chicken"){
            price = 180.00;
            return price;
        }else if(foodName == "Dragon Chicken"){
            price = 190.00;
            return price;
        }else if(foodName == "Honey Chicken"){
            price = 200.00;
            return price;
        }else if(foodName == "Pepper Chicken"){
            price = 185.00;
            return price;
        }else if(foodName == "Garlic Chicken"){
            price = 195.00;
            return price;
        }
        else if(foodName == "Spring Roll"){
            price = 90.00;
            return price;
        }else if(foodName == "Veg Spring Roll"){
            price = 95.00;
            return price;
        }else if(foodName == "Chicken Spring Roll"){
            price = 120.00;
            return price;
        }else if(foodName == "Corn Soup"){
            price = 70.00;
            return price;
        }else if(foodName == "Hot Sour Soup"){
            price = 80.00;
            return price;
        }
        else if(foodName == "Sweet Corn Soup"){
            price = 85.00;
            return price;
        }else if(foodName == "Chicken Clear Soup"){
            price = 90.00;
            return price;
        }else if(foodName == "Veg Clear Soup"){
            price = 75.00;
            return price;
        }else if(foodName == "American Chopsuey"){
            price = 160.00;
            return price;
        }else if(foodName == "Chinese Bhel"){
            price = 100.00;
            return price;
        }
        else if(foodName == "Veg Schezwan Momos"){
            price = 140.00;
            return price;
        }else if(foodName == "Chicken Schezwan Momos"){
            price = 160.00;
            return price;
        }else if(foodName == "Paneer Chilli Dry"){
            price = 170.00;
            return price;
        }else if(foodName == "Chicken Lollipop"){
            price = 180.00;
            return price;
        }else if(foodName == "Chicken 65 Chinese Style"){
            price = 190.00;
            return price;
        }
        else{
            System.out.println("Enter valid foodName");
        }
        return price;
    }
}
