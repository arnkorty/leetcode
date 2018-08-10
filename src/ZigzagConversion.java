class ZigzagConversion {
  public String convert(String s, int numRows) {
  if (numRows == 1) {
       return s;
   }
   StringBuilder builder = new StringBuilder("");
   int len = s.length();
   for(int i = 0; i < numRows; i ++) {
       int cIndex = i;
       while(cIndex < len ) {
           builder.append(s.charAt(cIndex));
           if (i != 0 && i != numRows -1) {
               int sIndex = cIndex - 2 * i +  numRows * 2 - 2;

               if (sIndex < len) {
                   builder.append(s.charAt(sIndex));
               }
           }
           cIndex += numRows * 2 - 2;
       }
   }
   return builder.toString();
}
}
