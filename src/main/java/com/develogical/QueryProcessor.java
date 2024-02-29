package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("name")){
      return "Sam";
    }

    if (query.toLowerCase().contains("plus")){
      String[] args = query.split(" ");
      return "" + (Integer.parseInt(args[2]) + Integer.parseInt(args[4].substring(0,args[4].length()-1)));
    }

    return "";
  }
}
