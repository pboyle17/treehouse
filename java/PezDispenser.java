public class PezDispenser {
  public static final int MAX_PEZ = 12;
  private String mCharacterName;
  private int mPezCount;
  public PezDispenser(String characterName){
    mCharacterName = characterName;
  }
  public void load(){
    load(MAX_PEZ);
  }
  public void load(int pezAmount){
    if(mPezCount+pezAmount>MAX_PEZ){
      throw new IllegalArgumentException("Too many Pez!!!!");
    }
    mPezCount+= pezAmount;
  }

  public boolean isEmpty(){
    return mPezCount == 0;
  }

  public boolean dispense(){
    boolean wasDispensed = false;
    if(!isEmpty()){
      mPezCount--;
      wasDispensed = true;
    }
    return wasDispensed;
  }
  public String getCharacterName(){
    return mCharacterName;
  }
}
