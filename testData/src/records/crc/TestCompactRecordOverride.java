package crc;

public record TestCompactRecordOverride(String abc, int num1, double num2) {
  private static int num3;

  public TestCompactRecordOverride(String abc, int num1, double num2) {
    this.abc = abc;
    this.num1 = num1;
    this.num2 = num2;
    num3 = num1 + 1;
  }

  public String abc() {
    return abc;
  }

  public int num1() {
    return num1 + 1;
  }

  public double num2() {
    return num2 + num1;
  }
}