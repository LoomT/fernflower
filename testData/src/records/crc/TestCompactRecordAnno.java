package crc;

import java.lang.annotation.*;

public record TestCompactRecordAnno(@TA @RC String abc) {
  public TestCompactRecordAnno(@P String abc) {
    this.abc = abc;
  }

  @M public String abc() {
    return this.abc;
  }
}

@Target(ElementType.TYPE_USE)
@interface TA {}

@Target(ElementType.RECORD_COMPONENT)
@interface RC {}

@Target(ElementType.METHOD)
@interface M {}

@Target(ElementType.PARAMETER)
@interface P {}