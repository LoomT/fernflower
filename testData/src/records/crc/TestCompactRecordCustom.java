package crc;

public record TestCompactRecordCustom(int i, String s) {
   public TestCompactRecordCustom() {
      this(5, "yo");
   }

   public String string() {
      return s + String.valueOf(i);
   }
}
