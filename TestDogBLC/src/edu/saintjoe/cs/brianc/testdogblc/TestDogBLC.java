package edu.saintjoe.cs.brianc.testdogblc;

public class TestDogBLC {
// Create a new private String called name 
	    private String name;
	   
	    // Create new private int called weight 
	    private int weight;
	    
	    // Set the name Void So you can add a name later
	    public void setName(String newName) {
	    	name = newName;
	    }
	    
	   // Set weight void so you can set a numbered weight 
	   public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	   // Getting the String from a public source and returning it  
	    public String getName() {
	    	return name;
	    }
	    
	    // Getting the public weight and returning it 
	    public int getWeight() {
	    	return weight;
	    }
	    
	    // making the Bark void 
	    public void bark() {
	    
	    	int pointless = 0;
	    	
	    	
	    	//  If/ else statements setting the bark noisr based off the weight of the dog
	    	if (weight > 60 ) {
	          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
	    	} else if (weight > 14 ) {
	    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
	    	} else
	    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
	    }
	    
	    //  Setting both the string newName and int newWeight at the same time 
	    public int setBoth(String newName, int newWeight) {
	    	
	    	int oldWeight = weight;
	    	
	    	name = newName;
	    	weight = newWeight;
	    	return oldWeight;
	    }
	    	
//  Leaving the eating procedure to void so you can set them to an int or String name later 
	    public void eat() { }
	    
	    public void chaseCat() { }
	}

