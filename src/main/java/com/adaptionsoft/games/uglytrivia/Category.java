package com.adaptionsoft.games.uglytrivia;


public enum Category {
   POP, SCIENCE, SPORTS, ROCK;

   public static final Category currentCategory(int place) {
      switch(place) {
         case 0:
         case 4:
         case 8:
            return Category.POP;
         case 1:
         case 5:
         case 9:
            return Category.SCIENCE;
         case 2:
         case 6:
         case 10:
            return Category.SPORTS;
         default:
            return Category.ROCK;
      }
   }

}



