package com.stackroute.lambdaexpression;

/* Complete the class as per the requirements given in PROBLEM.md */
public class CustomFunctionalInterfaceImplementation {
    static MyFunction<Integer> cube=(num)->{
        if(num==0)
            return 0;
        else
            return num*num*num;
    };
    static MyFunction<String> changeCase=(s)->{
      char []array=s.toCharArray();
      if(s.equals("null"))
          return null;
      for(int i=0;i<s.length();i++)
      {
          if (Character.isUpperCase(array[i])) {
              array[i] = Character.toLowerCase(array[i]);
          } else {
              array[i] = Character.toUpperCase(array[i]);
          }
      }
      String array1=String.valueOf(array);
      return array1;
    };
}
