import java.util.*;

class wBottles {
  public static int numWaterBottles(int numBottles, int numExchange) {
    int ans = numBottles;
    while (numBottles >= numExchange) {
      int newB = numBottles / numExchange;
      int rem = numBottles % numExchange;
      ans += newB;
      numBottles = newB + rem;
    }
    return ans;
  }

  public static void main(String args[]) {

    int a = numWaterBottles(15, 3);
    System.out.println(a);
  }
}