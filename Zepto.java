class Zepto
{
    public static double search(String foodName)
    {
        double price = 0.0;
        if(foodName == "Veg Samosa"){
            price = 25.00;
            return price;
        }else if(foodName == "Chicken Samosa"){
            price = 35.00;
            return price;
        }else if(foodName == "Veg Puff"){
            price = 30.00;
            return price;
        }else if(foodName == "Egg Puff"){
            price = 35.00;
            return price;
        }else if(foodName == "Chicken Puff"){
            price = 40.00;
            return price;
        }
        else if(foodName == "Veg Cutlet"){
            price = 30.00;
            return price;
        }else if(foodName == "Chicken Cutlet"){
            price = 45.00;
            return price;
        }else if(foodName == "Fish Cutlet"){
            price = 50.00;
            return price;
        }else if(foodName == "Paneer Cutlet"){
            price = 40.00;
            return price;
        }else if(foodName == "Aloo Cutlet"){
            price = 35.00;
            return price;
        }
        else if(foodName == "Bread Pakoda"){
            price = 30.00;
            return price;
        }else if(foodName == "Onion Pakoda"){
            price = 25.00;
            return price;
        }else if(foodName == "Vegetable Pakoda"){
            price = 30.00;
            return price;
        }else if(foodName == "Paneer Pakoda"){
            price = 45.00;
            return price;
        }else if(foodName == "Chicken Pakoda"){
            price = 55.00;
            return price;
        }
        else if(foodName == "Aloo Bonda"){
            price = 25.00;
            return price;
        }else if(foodName == "Mysore Bonda"){
            price = 30.00;
            return price;
        }else if(foodName == "Goli Baje"){
            price = 35.00;
            return price;
        }else if(foodName == "Punugulu"){
            price = 30.00;
            return price;
        }else if(foodName == "Batata Vada"){
            price = 35.00;
            return price;
        }
        else if(foodName == "Veg Sandwich Pack"){
            price = 50.00;
            return price;
        }else if(foodName == "Cheese Sandwich Pack"){
            price = 60.00;
            return price;
        }else if(foodName == "Grilled Sandwich Pack"){
            price = 70.00;
            return price;
        }else if(foodName == "Chicken Sandwich Pack"){
            price = 80.00;
            return price;
        }else if(foodName == "Paneer Sandwich Pack"){
            price = 75.00;
            return price;
        }
        else if(foodName == "Cream Bun"){
            price = 20.00;
            return price;
        }else if(foodName == "Jam Bun"){
            price = 20.00;
            return price;
        }else if(foodName == "Butter Bun"){
            price = 25.00;
            return price;
        }else if(foodName == "Veg Roll"){
            price = 40.00;
            return price;
        }else if(foodName == "Egg Roll"){
            price = 50.00;
            return price;
        }
        else if(foodName == "Chicken Roll"){
            price = 60.00;
            return price;
        }else if(foodName == "Paneer Roll"){
            price = 55.00;
            return price;
        }else if(foodName == "Veg Frankie"){
            price = 45.00;
            return price;
        }else if(foodName == "Egg Frankie"){
            price = 55.00;
            return price;
        }else if(foodName == "Chicken Frankie"){
            price = 65.00;
            return price;
        }
        else if(foodName == "Chocolate Pastry"){
            price = 70.00;
            return price;
        }else if(foodName == "Black Forest Pastry"){
            price = 80.00;
            return price;
        }else if(foodName == "Pineapple Pastry"){
            price = 75.00;
            return price;
        }else if(foodName == "Vanilla Pastry"){
            price = 65.00;
            return price;
        }else if(foodName == "Strawberry Pastry"){
            price = 70.00;
            return price;
        }
        else{
            System.out.println("Enter valid foodName");
        }
        return price;
    }
}
