package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SlidingWindow extends SlidingWindow {

  private final Optional<Long> targetTokens;

  private AutoValue_SlidingWindow(
      Optional<Long> targetTokens) {
    this.targetTokens = targetTokens;
  }

  @JsonProperty("targetTokens")
  @Override
  public Optional<Long> targetTokens() {
    return targetTokens;
  }

  @Override
  public String toString() {
    return "SlidingWindow{"
        + "targetTokens=" + targetTokens
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SlidingWindow) {
      SlidingWindow that = (SlidingWindow) o;
      return this.targetTokens.equals(that.targetTokens());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= targetTokens.hashCode();
    return h$;
  }

  @Override
  public SlidingWindow.Builder toBuilder() {
    return new AutoValue_SlidingWindow.Builder(this);
  }

  static final class Builder extends SlidingWindow.Builder {
    private Optional<Long> targetTokens = Optional.empty();
    Builder() {
    }
    Builder(SlidingWindow source) {
      this.targetTokens = source.targetTokens();
    }
    @Override
    public SlidingWindow.Builder targetTokens(Long targetTokens) {
      this.targetTokens = Optional.of(targetTokens);
      return this;
    }
    @Override
    SlidingWindow.Builder targetTokens(Optional<Long> targetTokens) {
      if (targetTokens == null) {
        throw new NullPointerException("Null targetTokens");
      }
      this.targetTokens = targetTokens;
      return this;
    }
    @Override
    public SlidingWindow build() {
      return new AutoValue_SlidingWindow(
          this.targetTokens);
    }
  }

}
