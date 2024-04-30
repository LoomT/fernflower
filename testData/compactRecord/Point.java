package records;

public record Point(int x, int y) {
   public int x() {
      return this.x;
   }

   public int y() {
      return this.y;
   }
}
