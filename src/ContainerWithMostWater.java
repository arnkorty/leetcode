class ContainerWithMostWater {
  public int maxArea(int[] height) {
      int maxarea = 0, l = 0, r = height.length - 1;
      while (l < r) {
          int minarea = Math.min(height[l], height[r]) * (r - l); 
          maxarea = Math.max(maxarea, minarea);
          if (height[l] < height[r]){
              while(r > l && height[++l] * (r - l) < minarea){}
          }else {
              while(r > l && height[--r] * (r-l) < minarea) {}
          }
          
      }
      return maxarea;
  }
}
