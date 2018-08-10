class IntegerToRoman {
  public String intToRoman(int num) {
      char R_1 = 'I';
      char R_5 = 'V';
      char R_10 = 'X';
      char R_50 = 'L';
      char R_100 = 'C';
      char R_500 = 'D';
      char R_1000 = 'M';
      StringBuilder result = new StringBuilder();
      int m = num / 1000;
      for(int i = 0; i < m ; i ++) {
          result.append(R_1000);
      }

      int h = (num  % 1000)/ 100 ;
      if (h == 9) {
          result.append(R_100);
          result.append(R_1000);
      } else if (h == 4) {
          result.append(R_100);
          result.append(R_500);
      } else {
          if (h >= 5) {
              result.append(R_500);
              h = h - 5;
          }
          for(int i = 0; i < h; i ++) {
              result.append(R_100);
          }
      }

      h = (num % 100)/ 10;
      if (h == 9) {
          result.append(R_10);
          result.append(R_100);
      } else if (h == 4) {
          result.append(R_10);
          result.append(R_50);
      } else {
          if (h >= 5) {
              result.append(R_50);
              h = h - 5;
          }
          for(int i = 0; i < h; i ++) {
              result.append(R_10);
          }
      }

      h = num % 10;
      if (h == 9) {
          result.append(R_1);
          result.append(R_10);
      } else if (h == 4) {
          result.append(R_1);
          result.append(R_5);
      } else {
          if (h >= 5) {
              result.append(R_5);
              h = h - 5;
          }
          for(int i = 0; i < h; i ++) {
              result.append(R_1);
          }
      }
      return result.toString();
      
  }
}
