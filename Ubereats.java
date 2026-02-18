class Ubereats
{
    public static double search(String foodName)
    {
        double price = 0.0;
        if(foodName == "Veg Burger"){
            price = 120.00;
            return price;
        }else if(foodName == "Cheese Burger"){
            price = 140.00;
            return price;
        }else if(foodName == "Paneer Burger"){
            price = 160.00;
            return price;
        }else if(foodName == "Chicken Burger"){
            price = 180.00;
            return price;
        }else if(foodName == "Double Patty Burger"){
            price = 200.00;
            return price;
        }
        else if(foodName == "French Fries"){
            price = 90.00;
            return price;
        }else if(foodName == "Peri Peri Fries"){
            price = 110.00;
            return price;
        }else if(foodName == "Cheesy Fries"){
            price = 130.00;
            return price;
        }else if(foodName == "Loaded Fries"){
            price = 160.00;
            return price;
        }else if(foodName == "Curly Fries"){
            price = 120.00;
            return price;
        }
        else if(foodName == "Chicken Nuggets"){
            price = 160.00;
            return price;
        }else if(foodName == "Chicken Popcorn"){
            price = 150.00;
            return price;
        }else if(foodName == "Chicken Wings"){
            price = 170.00;
            return price;
        }else if(foodName == "Hot Wings"){
            price = 180.00;
            return price;
        }else if(foodName == "BBQ Wings"){
            price = 190.00;
            return price;
        }
        else if(foodName == "Veg Wrap"){
            price = 120.00;
            return price;
        }else if(foodName == "Paneer Wrap"){
            price = 140.00;
            return price;
        }else if(foodName == "Chicken Wrap"){
            price = 160.00;
            return price;
        }else if(foodName == "Falafel Wrap"){
            price = 150.00;
            return price;
        }else if(foodName == "Mexican Wrap"){
            price = 170.00;
            return price;
        }
        else if(foodName == "Veg Sandwich"){
            price = 100.00;
            return price;
        }else if(foodName == "Cheese Sandwich"){
            price = 120.00;
            return price;
        }else if(foodName == "Grilled Sandwich"){
            price = 140.00;
            return price;
        }else if(foodName == "Chicken Sandwich"){
            price = 160.00;
            return price;
        }else if(foodName == "Club Sandwich"){
            price = 180.00;
            return price;
        }
        else if(foodName == "Garlic Bread"){
            price = 100.00;
            return price;
        }else if(foodName == "Cheese Garlic Bread"){
            price = 120.00;
            return price;
        }else if(foodName == "Stuffed Garlic Bread"){
            price = 150.00;
            return price;
        }else if(foodName == "Garlic Breadsticks"){
            price = 130.00;
            return price;
        }else if(foodName == "Herb Bread"){
            price = 140.00;
            return price;
        }
        else if(foodName == "Veg Hot Dog"){
            price = 130.00;
            return price;
        }else if(foodName == "Chicken Hot Dog"){
            price = 160.00;
            return price;
        }else if(foodName == "Cheese Hot Dog"){
            price = 150.00;
            return price;
        }else if(foodName == "Mexican Hot Dog"){
            price = 170.00;
            return price;
        }else if(foodName == "Classic Hot Dog"){
            price = 140.00;
            return price;
        }
        else if(foodName == "Nachos Supreme"){
            price = 160.00;
            return price;
        }else if(foodName == "Cheese Nachos"){
            price = 140.00;
            return price;
        }else if(foodName == "Loaded Nachos"){
            price = 180.00;
            return price;
        }else if(foodName == "Tacos Veg"){
            price = 150.00;
            return price;
        }else if(foodName == "Tacos Chicken"){
            price = 180.00;
            return price;
        }
        else{
            System.out.println("Enter valid foodName");
        }
        return price;
    }
}
