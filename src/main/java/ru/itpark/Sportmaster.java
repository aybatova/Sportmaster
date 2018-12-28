package ru.itpark;

public class Sportmaster {
  public int calculateBonus(int purchaseAmount, int totalAmount) {

    int result;
    int purchaseMin = 1_000;
    int bonusBlue = 50;
    int bonusSilver = 70;
    int bonusGold = 100;
    int minLimitBlue = 0;
    int maxLimitBlue = 15_000;
    int minLimitSilver = 15_001;
    int maxLimitSilver = 150_000;
    int boundsCount = purchaseAmount / purchaseMin;




    if (totalAmount >= minLimitBlue && totalAmount <= maxLimitBlue) {
      result = (boundsCount) * bonusBlue;
    } else if (totalAmount >= minLimitSilver && totalAmount <= maxLimitSilver) {
      result = (boundsCount) * bonusSilver;
    } else {
      result = (boundsCount) * bonusGold;
    }

    return result;
  }

}
