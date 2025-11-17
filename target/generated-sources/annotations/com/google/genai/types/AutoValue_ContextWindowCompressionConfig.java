package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ContextWindowCompressionConfig extends ContextWindowCompressionConfig {

  private final Optional<Long> triggerTokens;

  private final Optional<SlidingWindow> slidingWindow;

  private AutoValue_ContextWindowCompressionConfig(
      Optional<Long> triggerTokens,
      Optional<SlidingWindow> slidingWindow) {
    this.triggerTokens = triggerTokens;
    this.slidingWindow = slidingWindow;
  }

  @JsonProperty("triggerTokens")
  @Override
  public Optional<Long> triggerTokens() {
    return triggerTokens;
  }

  @JsonProperty("slidingWindow")
  @Override
  public Optional<SlidingWindow> slidingWindow() {
    return slidingWindow;
  }

  @Override
  public String toString() {
    return "ContextWindowCompressionConfig{"
        + "triggerTokens=" + triggerTokens + ", "
        + "slidingWindow=" + slidingWindow
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ContextWindowCompressionConfig) {
      ContextWindowCompressionConfig that = (ContextWindowCompressionConfig) o;
      return this.triggerTokens.equals(that.triggerTokens())
          && this.slidingWindow.equals(that.slidingWindow());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= triggerTokens.hashCode();
    h$ *= 1000003;
    h$ ^= slidingWindow.hashCode();
    return h$;
  }

  @Override
  public ContextWindowCompressionConfig.Builder toBuilder() {
    return new AutoValue_ContextWindowCompressionConfig.Builder(this);
  }

  static final class Builder extends ContextWindowCompressionConfig.Builder {
    private Optional<Long> triggerTokens = Optional.empty();
    private Optional<SlidingWindow> slidingWindow = Optional.empty();
    Builder() {
    }
    Builder(ContextWindowCompressionConfig source) {
      this.triggerTokens = source.triggerTokens();
      this.slidingWindow = source.slidingWindow();
    }
    @Override
    public ContextWindowCompressionConfig.Builder triggerTokens(Long triggerTokens) {
      this.triggerTokens = Optional.of(triggerTokens);
      return this;
    }
    @Override
    ContextWindowCompressionConfig.Builder triggerTokens(Optional<Long> triggerTokens) {
      if (triggerTokens == null) {
        throw new NullPointerException("Null triggerTokens");
      }
      this.triggerTokens = triggerTokens;
      return this;
    }
    @Override
    public ContextWindowCompressionConfig.Builder slidingWindow(SlidingWindow slidingWindow) {
      this.slidingWindow = Optional.of(slidingWindow);
      return this;
    }
    @Override
    ContextWindowCompressionConfig.Builder slidingWindow(Optional<SlidingWindow> slidingWindow) {
      if (slidingWindow == null) {
        throw new NullPointerException("Null slidingWindow");
      }
      this.slidingWindow = slidingWindow;
      return this;
    }
    @Override
    public ContextWindowCompressionConfig build() {
      return new AutoValue_ContextWindowCompressionConfig(
          this.triggerTokens,
          this.slidingWindow);
    }
  }

}
