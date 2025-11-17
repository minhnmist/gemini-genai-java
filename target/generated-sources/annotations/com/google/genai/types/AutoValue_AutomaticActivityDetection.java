package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AutomaticActivityDetection extends AutomaticActivityDetection {

  private final Optional<Boolean> disabled;

  private final Optional<StartSensitivity> startOfSpeechSensitivity;

  private final Optional<EndSensitivity> endOfSpeechSensitivity;

  private final Optional<Integer> prefixPaddingMs;

  private final Optional<Integer> silenceDurationMs;

  private AutoValue_AutomaticActivityDetection(
      Optional<Boolean> disabled,
      Optional<StartSensitivity> startOfSpeechSensitivity,
      Optional<EndSensitivity> endOfSpeechSensitivity,
      Optional<Integer> prefixPaddingMs,
      Optional<Integer> silenceDurationMs) {
    this.disabled = disabled;
    this.startOfSpeechSensitivity = startOfSpeechSensitivity;
    this.endOfSpeechSensitivity = endOfSpeechSensitivity;
    this.prefixPaddingMs = prefixPaddingMs;
    this.silenceDurationMs = silenceDurationMs;
  }

  @JsonProperty("disabled")
  @Override
  public Optional<Boolean> disabled() {
    return disabled;
  }

  @JsonProperty("startOfSpeechSensitivity")
  @Override
  public Optional<StartSensitivity> startOfSpeechSensitivity() {
    return startOfSpeechSensitivity;
  }

  @JsonProperty("endOfSpeechSensitivity")
  @Override
  public Optional<EndSensitivity> endOfSpeechSensitivity() {
    return endOfSpeechSensitivity;
  }

  @JsonProperty("prefixPaddingMs")
  @Override
  public Optional<Integer> prefixPaddingMs() {
    return prefixPaddingMs;
  }

  @JsonProperty("silenceDurationMs")
  @Override
  public Optional<Integer> silenceDurationMs() {
    return silenceDurationMs;
  }

  @Override
  public String toString() {
    return "AutomaticActivityDetection{"
        + "disabled=" + disabled + ", "
        + "startOfSpeechSensitivity=" + startOfSpeechSensitivity + ", "
        + "endOfSpeechSensitivity=" + endOfSpeechSensitivity + ", "
        + "prefixPaddingMs=" + prefixPaddingMs + ", "
        + "silenceDurationMs=" + silenceDurationMs
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutomaticActivityDetection) {
      AutomaticActivityDetection that = (AutomaticActivityDetection) o;
      return this.disabled.equals(that.disabled())
          && this.startOfSpeechSensitivity.equals(that.startOfSpeechSensitivity())
          && this.endOfSpeechSensitivity.equals(that.endOfSpeechSensitivity())
          && this.prefixPaddingMs.equals(that.prefixPaddingMs())
          && this.silenceDurationMs.equals(that.silenceDurationMs());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= disabled.hashCode();
    h$ *= 1000003;
    h$ ^= startOfSpeechSensitivity.hashCode();
    h$ *= 1000003;
    h$ ^= endOfSpeechSensitivity.hashCode();
    h$ *= 1000003;
    h$ ^= prefixPaddingMs.hashCode();
    h$ *= 1000003;
    h$ ^= silenceDurationMs.hashCode();
    return h$;
  }

  @Override
  public AutomaticActivityDetection.Builder toBuilder() {
    return new AutoValue_AutomaticActivityDetection.Builder(this);
  }

  static final class Builder extends AutomaticActivityDetection.Builder {
    private Optional<Boolean> disabled = Optional.empty();
    private Optional<StartSensitivity> startOfSpeechSensitivity = Optional.empty();
    private Optional<EndSensitivity> endOfSpeechSensitivity = Optional.empty();
    private Optional<Integer> prefixPaddingMs = Optional.empty();
    private Optional<Integer> silenceDurationMs = Optional.empty();
    Builder() {
    }
    Builder(AutomaticActivityDetection source) {
      this.disabled = source.disabled();
      this.startOfSpeechSensitivity = source.startOfSpeechSensitivity();
      this.endOfSpeechSensitivity = source.endOfSpeechSensitivity();
      this.prefixPaddingMs = source.prefixPaddingMs();
      this.silenceDurationMs = source.silenceDurationMs();
    }
    @Override
    public AutomaticActivityDetection.Builder disabled(boolean disabled) {
      this.disabled = Optional.of(disabled);
      return this;
    }
    @Override
    AutomaticActivityDetection.Builder disabled(Optional<Boolean> disabled) {
      if (disabled == null) {
        throw new NullPointerException("Null disabled");
      }
      this.disabled = disabled;
      return this;
    }
    @Override
    public AutomaticActivityDetection.Builder startOfSpeechSensitivity(StartSensitivity startOfSpeechSensitivity) {
      this.startOfSpeechSensitivity = Optional.of(startOfSpeechSensitivity);
      return this;
    }
    @Override
    AutomaticActivityDetection.Builder startOfSpeechSensitivity(Optional<StartSensitivity> startOfSpeechSensitivity) {
      if (startOfSpeechSensitivity == null) {
        throw new NullPointerException("Null startOfSpeechSensitivity");
      }
      this.startOfSpeechSensitivity = startOfSpeechSensitivity;
      return this;
    }
    @Override
    public AutomaticActivityDetection.Builder endOfSpeechSensitivity(EndSensitivity endOfSpeechSensitivity) {
      this.endOfSpeechSensitivity = Optional.of(endOfSpeechSensitivity);
      return this;
    }
    @Override
    AutomaticActivityDetection.Builder endOfSpeechSensitivity(Optional<EndSensitivity> endOfSpeechSensitivity) {
      if (endOfSpeechSensitivity == null) {
        throw new NullPointerException("Null endOfSpeechSensitivity");
      }
      this.endOfSpeechSensitivity = endOfSpeechSensitivity;
      return this;
    }
    @Override
    public AutomaticActivityDetection.Builder prefixPaddingMs(Integer prefixPaddingMs) {
      this.prefixPaddingMs = Optional.of(prefixPaddingMs);
      return this;
    }
    @Override
    AutomaticActivityDetection.Builder prefixPaddingMs(Optional<Integer> prefixPaddingMs) {
      if (prefixPaddingMs == null) {
        throw new NullPointerException("Null prefixPaddingMs");
      }
      this.prefixPaddingMs = prefixPaddingMs;
      return this;
    }
    @Override
    public AutomaticActivityDetection.Builder silenceDurationMs(Integer silenceDurationMs) {
      this.silenceDurationMs = Optional.of(silenceDurationMs);
      return this;
    }
    @Override
    AutomaticActivityDetection.Builder silenceDurationMs(Optional<Integer> silenceDurationMs) {
      if (silenceDurationMs == null) {
        throw new NullPointerException("Null silenceDurationMs");
      }
      this.silenceDurationMs = silenceDurationMs;
      return this;
    }
    @Override
    public AutomaticActivityDetection build() {
      return new AutoValue_AutomaticActivityDetection(
          this.disabled,
          this.startOfSpeechSensitivity,
          this.endOfSpeechSensitivity,
          this.prefixPaddingMs,
          this.silenceDurationMs);
    }
  }

}
