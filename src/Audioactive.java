public class Audioactive {

  public static long valeurSuivante(long valeur) {
    long result = 0;
    long previewValue = valeur % 10;
    int counter = 1;
    int power100 = 1;
    do {
      valeur /= 10;
      long actualValue = valeur % 10;

      if (actualValue != previewValue || valeur == 0) {
        result += (10 * counter + previewValue) * power100;
        previewValue = actualValue;
        counter = 0;
        power100 *= 100;
      }
      counter++;
    } while (valeur > 0);

    return result;
  }
}
