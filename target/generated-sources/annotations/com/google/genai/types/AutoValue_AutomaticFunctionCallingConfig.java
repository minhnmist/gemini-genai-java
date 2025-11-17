package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AutomaticFunctionCallingConfig extends AutomaticFunctionCallingConfig {

  private final Optional<Boolean> disable;

  private final Optional<Integer> maximumRemoteCalls;

  private final Optional<Boolean> ignoreCallHistory;

  private AutoValue_AutomaticFunctionCallingConfig(
      Optional<Boolean> disable,
      Optional<Integer> maximumRemoteCalls,
      Optional<Boolean> ignoreCallHistory) {
    this.disable = disable;
    this.maximumRemoteCalls = maximumRemoteCalls;
    this.ignoreCallHistory = ignoreCallHistory;
  }

  @JsonProperty("disable")
  @Override
  public Optional<Boolean> disable() {
    return disable;
  }

  @JsonProperty("maximumRemoteCalls")
  @Override
  public Optional<Integer> maximumRemoteCalls() {
    return maximumRemoteCalls;
  }

  @JsonProperty("ignoreCallHistory")
  @Override
  public Optional<Boolean> ignoreCallHistory() {
    return ignoreCallHistory;
  }

  @Override
  public String toString() {
    return "AutomaticFunctionCallingConfig{"
        + "disable=" + disable + ", "
        + "maximumRemoteCalls=" + maximumRemoteCalls + ", "
        + "ignoreCallHistory=" + ignoreCallHistory
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutomaticFunctionCallingConfig) {
      AutomaticFunctionCallingConfig that = (AutomaticFunctionCallingConfig) o;
      return this.disable.equals(that.disable())
          && this.maximumRemoteCalls.equals(that.maximumRemoteCalls())
          && this.ignoreCallHistory.equals(that.ignoreCallHistory());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= disable.hashCode();
    h$ *= 1000003;
    h$ ^= maximumRemoteCalls.hashCode();
    h$ *= 1000003;
    h$ ^= ignoreCallHistory.hashCode();
    return h$;
  }

  @Override
  public AutomaticFunctionCallingConfig.Builder toBuilder() {
    return new AutoValue_AutomaticFunctionCallingConfig.Builder(this);
  }

  static final class Builder extends AutomaticFunctionCallingConfig.Builder {
    private Optional<Boolean> disable = Optional.empty();
    private Optional<Integer> maximumRemoteCalls = Optional.empty();
    private Optional<Boolean> ignoreCallHistory = Optional.empty();
    Builder() {
    }
    Builder(AutomaticFunctionCallingConfig source) {
      this.disable = source.disable();
      this.maximumRemoteCalls = source.maximumRemoteCalls();
      this.ignoreCallHistory = source.ignoreCallHistory();
    }
    @Override
    public AutomaticFunctionCallingConfig.Builder disable(boolean disable) {
      this.disable = Optional.of(disable);
      return this;
    }
    @Override
    AutomaticFunctionCallingConfig.Builder disable(Optional<Boolean> disable) {
      if (disable == null) {
        throw new NullPointerException("Null disable");
      }
      this.disable = disable;
      return this;
    }
    @Override
    public AutomaticFunctionCallingConfig.Builder maximumRemoteCalls(Integer maximumRemoteCalls) {
      this.maximumRemoteCalls = Optional.of(maximumRemoteCalls);
      return this;
    }
    @Override
    AutomaticFunctionCallingConfig.Builder maximumRemoteCalls(Optional<Integer> maximumRemoteCalls) {
      if (maximumRemoteCalls == null) {
        throw new NullPointerException("Null maximumRemoteCalls");
      }
      this.maximumRemoteCalls = maximumRemoteCalls;
      return this;
    }
    @Override
    public AutomaticFunctionCallingConfig.Builder ignoreCallHistory(boolean ignoreCallHistory) {
      this.ignoreCallHistory = Optional.of(ignoreCallHistory);
      return this;
    }
    @Override
    AutomaticFunctionCallingConfig.Builder ignoreCallHistory(Optional<Boolean> ignoreCallHistory) {
      if (ignoreCallHistory == null) {
        throw new NullPointerException("Null ignoreCallHistory");
      }
      this.ignoreCallHistory = ignoreCallHistory;
      return this;
    }
    @Override
    public AutomaticFunctionCallingConfig build() {
      return new AutoValue_AutomaticFunctionCallingConfig(
          this.disable,
          this.maximumRemoteCalls,
          this.ignoreCallHistory);
    }
  }

}
