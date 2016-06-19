package com.teamtreehouse;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Treet {
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;

  public Treet(String author, String description, Date creationDate){
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationDate;
  }

  public List<String> getHashTags(){
    List<String> results = new ArrayList<String>();
    for(String word: getWords()){
      if(word.startsith("#")){
        results.add(word);
      }
    }
    return results;
  }

  private List<String> getWordsPrefixedWith(String prefix){
    List<String> results = new ArrayList<String>();
    for(String word: getWords()){
      if(word.startswith("@")){
        results.add(word);
      }
    }
    return results;
  }



  public String getAuthor() {
    return mAuthor;
  }

  public Date getCreationDate(){
    return mCreationDate;
  }

  public String getDescription(){
    return mDescription;
  }

  public List<String> getWords(){
    String[] words =  mDescription.toLowerCase().split("[^\\w#@']+");
    return Arrays.asList(words);
  }
}
