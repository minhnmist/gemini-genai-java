package com.google.genai.types;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ActivityStart extends ActivityStart {

  private AutoValue_ActivityStart() {
  }

  @Override
  public String toString() {
    return "ActivityStart{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ActivityStart) {
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
  public ActivityStart.Builder toBuilder() {
    return new AutoValue_ActivityStart.Builder(this);
  }

  static final class Builder extends ActivityStart.Builder {
    Builder() {
    }
    Builder(ActivityStart source) {
    }
    @Override
    public ActivityStart build() {
      return new AutoValue_ActivityStart();
    }
  }

}
