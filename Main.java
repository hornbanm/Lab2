class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int bags = 11;
    int candiesPerBag = 55;
    int total = bags * candiesPerBag;

    double blue, brown, green, orange, red, yellow;
    blue = .24 * total;
    brown = .13 * total;
    green = .16 * total;
    orange = .20 * total;
    red = .13 * total;
    yellow = .14 * total;

    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sum;
    sum = blue + brown + green + orange + red + yellow; 
    System.out.println("Sum: " + sum);

    if ( blue > brown && red > orange)
     System.out.println("Blue over Brown and Red over Orange");

    if ( brown <= green)
     System.out.println("Brown is less than or equal to Green");

    if ( sum == total)
     System.out.println("Numbers match");
  }
}