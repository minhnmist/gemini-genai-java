package com.google.genai.types;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ActivityEnd extends ActivityEnd {

  private AutoValue_ActivityEnd() {
  }

  @Override
  public String toString() {
    return "ActivityEnd{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ActivityEnd) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    return h$;
  }

  @Override
  public ActivityEnd.Builder toBuilder() {
    return new AutoValue_ActivityEnd.Builder(this);
  }

  static final class Builder extends ActivityEnd.Builder {
    Builder() {
    }
    Builder(ActivityEnd source) {
    }
    @Override
    public ActivityEnd build() {
      return new AutoValue_ActivityEnd();
    }
  }

}
