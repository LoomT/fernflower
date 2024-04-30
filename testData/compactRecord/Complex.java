public record Complex(int i, String s) {
   public Complex() {
      this(5, "yo");
   }

   public String string() {
      String var10000 = this.s;
      return var10000 + String.valueOf(this.i);
   }

   public int i() {
      return this.i;
   }

   public String s() {
      return this.s;
   }
}
