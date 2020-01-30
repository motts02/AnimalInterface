/**
   Interface defining the required functionality of an Animal.

   @author Jim Teresco
   @version Spring 2020

*/

public interface Animal {

    /**
       Return the species of the type of animal.

       @return the species of the type of animal.
    */
    public String species();

    /**
       Return the number of legs that members of this
       species should have.

       @return the number of legs that members of this
       species should have
    */
    public int numLegs();

    /**
       Set the weight of a particular instance of the animal.
       
       @param newWeight the new weight of the animal
    */
    public void setWeight(double newWeight);


    /**
       Get the weight of a particular instance of the animal.
       
       @return the weight of the animal
    */
    public double getWeight();

}
