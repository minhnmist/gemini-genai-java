package com.google.genai.types;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ExternalApiSimpleSearchParams extends ExternalApiSimpleSearchParams {

  private AutoValue_ExternalApiSimpleSearchParams() {
  }

  @Override
  public String toString() {
    return "ExternalApiSimpleSearchParams{"
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ExternalApiSimpleSearchParams) {
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
  public ExternalApiSimpleSearchParams.Builder toBuilder() {
    return new AutoValue_ExternalApiSimpleSearchParams.Builder(this);
  }

  static final class Builder extends ExternalApiSimpleSearchParams.Builder {
    Builder() {
    }
    Builder(ExternalApiSimpleSearchParams source) {
    }
    @Override
    public ExternalApiSimpleSearchParams build() {
      return new AutoValue_ExternalApiSimpleSearchParams();
    }
  }

}
