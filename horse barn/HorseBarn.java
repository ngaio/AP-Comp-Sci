/**** <<< This Class is NOT complete >>>
 * A horse barn consists of N numbered spaces. Each space can hold at most 
 * one horse. The spaces are indexed starting from 0; the index of the last 
 * space is N – 1. No two horses in the barn have the same name.
 * 
 * The declaration of the HorseBarn class is shown below. You will write two 
 * unrelated methods of the HorseBarn class.
 ****/
import java.util.Arrays;

public class HorseBarn
{
  /** The spaces in the barn. Each array element holds a reference to the horse
   * that is currently occupying the space. A null value indicates an empty space.
   */
  private Horse[] spaces;

  public HorseBarn(Horse[] horses)
  {
    spaces = horses;
  }

  /** Returns the index of the space that contains the horse with the specified name.
   * Precondition: No two horses in the barn have the same name.
   * @param name the name of the horse to find
   * @return the index of the space containing the horse with the specified name;
   * -1 if no horse with the specified name is in the barn.
   */
  public int findHorseSpace(String name)
  {
     for (int x = 0; x < spaces.length; x++){
         if (spaces[x] != null && spaces[x].getName().equals(name)){
             return x; 
         }
     }
     return -1;
  }

  /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
   * starting at index 0, with no empty space between any two horses.
   * Postcondition: The order of the horses is the same as before the consolidation.
   */
  public void consolidate()
  {
      int y = 0;
      for (int x = 0; x < spaces.length; x++){
          if (spaces[x] != null){
              spaces[y] = spaces[x];
              y++;
          }
      }
      
      for (int z = y; z < spaces.length; z++){
          spaces[z] = null;
      }
  }

  public String toString()
  {
    return Arrays.toString(spaces);
  }
}


