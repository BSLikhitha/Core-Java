class Zomato
{
    public static double search(String foodName)
    {
        double price = 0.0;
        if(foodName == "Benne Dosa"){
            price = 99.00;
            return price;
        }else if(foodName == "Masala Dosa"){
            price = 100.00;
            return price;
        }else if(foodName == "Plain Dosa"){
            price = 50.00;
            return price;
        }else if(foodName == "Set Dosa"){
            price = 70.00;
            return price;
        }else if(foodName == "Rava Dosa"){
            price = 80.00;
            return price;
        }else if(foodName == "Onion Dosa"){
            price = 75.00;
            return price;
        }else if(foodName == "Ghee Dosa"){
            price = 85.00;
            return price;
        }else if(foodName == "Butter Dosa"){
            price = 95.00;
            return price;
        }else if(foodName == "Mysore Masala Dosa"){
            price = 110.00;
            return price;
        }else if(foodName == "Cheese Dosa"){
            price = 120.00;
            return price;
        }
        else if(foodName == "Idli"){
            price = 40.00;
            return price;
        }else if(foodName == "Thatte Idli"){
            price = 45.00;
            return price;
        }else if(foodName == "Mini Idli"){
            price = 50.00;
            return price;
        }else if(foodName == "Rava Idli"){
            price = 45.00;
            return price;
        }else if(foodName == "Kanchipuram Idli"){
            price = 55.00;
            return price;
        }
        else if(foodName == "Vada"){
            price = 45.00;
            return price;
        }else if(foodName == "Medu Vada"){
            price = 50.00;
            return price;
        }else if(foodName == "Maddur Vada"){
            price = 55.00;
            return price;
        }else if(foodName == "Masala Vada"){
            price = 60.00;
            return price;
        }
        else if(foodName == "Poori"){
            price = 55.00;
            return price;
        }else if(foodName == "Pongal"){
            price = 60.00;
            return price;
        }else if(foodName == "Bisi Bele Bath"){
            price = 100.00;
            return price;
        }else if(foodName == "Kesari Bath"){
            price = 50.00;
            return price;
        }else if(foodName == "Upma"){
            price = 45.00;
            return price;
        }

        else if(foodName == "Khara Bath"){
            price = 55.00;
            return price;
        }else if(foodName == "Tomato Bath"){
            price = 60.00;
            return price;
        }else if(foodName == "Curd Rice"){
            price = 50.00;
            return price;
        }else if(foodName == "Lemon Rice"){
            price = 55.00;
            return price;
        }else if(foodName == "Puliyogare"){
            price = 60.00;
            return price;
        }
        else if(foodName == "Rice Bath"){
            price = 65.00;
            return price;
        }else if(foodName == "Vegetable Rice"){
            price = 70.00;
            return price;
        }else if(foodName == "Sambar Rice"){
            price = 65.00;
            return price;
        }else if(foodName == "Plain Rice Meal"){
            price = 80.00;
            return price;
        }else if(foodName == "South Indian Thali"){
            price = 120.00;
            return price;
        }
        else if(foodName == "Vegetable Sagu"){
            price = 40.00;
            return price;
        }else if(foodName == "Coconut Chutney"){
            price = 30.00;
            return price;
        }else if(foodName == "Mint Chutney"){
            price = 35.00;
            return price;
        }else if(foodName == "Tomato Chutney"){
            price = 35.00;
            return price;
        }else if(foodName == "Sambar"){
            price = 40.00;
            return price;
        }
        else if(foodName == "Filter Coffee"){
            price = 30.00;
            return price;
        }else if(foodName == "Masala Tea"){
            price = 25.00;
            return price;
        }else if(foodName == "Badam Milk"){
            price = 45.00;
            return price;
        }else if(foodName == "Rose Milk"){
            price = 40.00;
            return price;
        }else if(foodName == "Fresh Lime Soda"){
            price = 50.00;
            return price;
        }
        else{
            System.out.println("Enter valid foodName");
        }
        return price;
    }
}
