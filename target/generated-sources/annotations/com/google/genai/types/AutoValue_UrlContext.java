package com.google.genai.types;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_UrlContext extends UrlContext {

  private AutoValue_UrlContext() {
  }

  @Override
  public String toString() {
    return "UrlContext{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof UrlContext) {
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
  public UrlContext.Builder toBuilder() {
    return new AutoValue_UrlContext.Builder(this);
  }

  static final class Builder extends UrlContext.Builder {
    Builder() {
    }
    Builder(UrlContext source) {
    }
    @Override
    public UrlContext build() {
      return new AutoValue_UrlContext();
    }
  }

}
