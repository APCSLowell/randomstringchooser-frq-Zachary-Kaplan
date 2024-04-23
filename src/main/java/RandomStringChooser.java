import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  ArrayList <String> bob;
  public RandomStringChooser(String[]blungus)
  {
    bob = new ArrayList <String>();
    for(String i: blungus)
      {
        bob.add(i);
      }
  }

  public String getNext()
  {
    if(bob.size() ==0)
    {
      return "NONE";
    } else
    {
      return bob.get(Math.random() * bob.size());
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
