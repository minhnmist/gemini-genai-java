package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SessionResumptionConfig extends SessionResumptionConfig {

  private final Optional<String> handle;

  private final Optional<Boolean> transparent;

  private AutoValue_SessionResumptionConfig(
      Optional<String> handle,
      Optional<Boolean> transparent) {
    this.handle = handle;
    this.transparent = transparent;
  }

  @JsonProperty("handle")
  @Override
  public Optional<String> handle() {
    return handle;
  }

  @JsonProperty("transparent")
  @Override
  public Optional<Boolean> transparent() {
    return transparent;
  }

  @Override
  public String toString() {
    return "SessionResumptionConfig{"
        + "handle=" + handle + ", "
        + "transparent=" + transparent
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SessionResumptionConfig) {
      SessionResumptionConfig that = (SessionResumptionConfig) o;
      return this.handle.equals(that.handle())
          && this.transparent.equals(that.transparent());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= handle.hashCode();
    h$ *= 1000003;
    h$ ^= transparent.hashCode();
    return h$;
  }

  @Override
  public SessionResumptionConfig.Builder toBuilder() {
    return new AutoValue_SessionResumptionConfig.Builder(this);
  }

  static final class Builder extends SessionResumptionConfig.Builder {
    private Optional<String> handle = Optional.empty();
    private Optional<Boolean> transparent = Optional.empty();
    Builder() {
    }
    Builder(SessionResumptionConfig source) {
      this.handle = source.handle();
      this.transparent = source.transparent();
    }
    @Override
    public SessionResumptionConfig.Builder handle(String handle) {
      this.handle = Optional.of(handle);
      return this;
    }
    @Override
    SessionResumptionConfig.Builder handle(Optional<String> handle) {
      if (handle == null) {
        throw new NullPointerException("Null handle");
      }
      this.handle = handle;
      return this;
    }
    @Override
    public SessionResumptionConfig.Builder transparent(boolean transparent) {
      this.transparent = Optional.of(transparent);
      return this;
    }
    @Override
    SessionResumptionConfig.Builder transparent(Optional<Boolean> transparent) {
      if (transparent == null) {
        throw new NullPointerException("Null transparent");
      }
      this.transparent = transparent;
      return this;
    }
    @Override
    public SessionResumptionConfig build() {
      return new AutoValue_SessionResumptionConfig(
          this.handle,
          this.transparent);
    }
  }

}
