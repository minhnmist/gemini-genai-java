package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ComputerUse extends ComputerUse {

  private final Optional<Environment> environment;

  private final Optional<List<String>> excludedPredefinedFunctions;

  private AutoValue_ComputerUse(
      Optional<Environment> environment,
      Optional<List<String>> excludedPredefinedFunctions) {
    this.environment = environment;
    this.excludedPredefinedFunctions = excludedPredefinedFunctions;
  }

  @JsonProperty("environment")
  @Override
  public Optional<Environment> environment() {
    return environment;
  }

  @JsonProperty("excludedPredefinedFunctions")
  @Override
  public Optional<List<String>> excludedPredefinedFunctions() {
    return excludedPredefinedFunctions;
  }

  @Override
  public String toString() {
    return "ComputerUse{"
        + "environment=" + environment + ", "
        + "excludedPredefinedFunctions=" + excludedPredefinedFunctions
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ComputerUse) {
      ComputerUse that = (ComputerUse) o;
      return this.environment.equals(that.environment())
          && this.excludedPredefinedFunctions.equals(that.excludedPredefinedFunctions());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= environment.hashCode();
    h$ *= 1000003;
    h$ ^= excludedPredefinedFunctions.hashCode();
    return h$;
  }

  @Override
  public ComputerUse.Builder toBuilder() {
    return new AutoValue_ComputerUse.Builder(this);
  }

  static final class Builder extends ComputerUse.Builder {
    private Optional<Environment> environment = Optional.empty();
    private Optional<List<String>> excludedPredefinedFunctions = Optional.empty();
    Builder() {
    }
    Builder(ComputerUse source) {
      this.environment = source.environment();
      this.excludedPredefinedFunctions = source.excludedPredefinedFunctions();
    }
    @Override
    public ComputerUse.Builder environment(Environment environment) {
      this.environment = Optional.of(environment);
      return this;
    }
    @Override
    ComputerUse.Builder environment(Optional<Environment> environment) {
      if (environment == null) {
        throw new NullPointerException("Null environment");
      }
      this.environment = environment;
      return this;
    }
    @Override
    public ComputerUse.Builder excludedPredefinedFunctions(List<String> excludedPredefinedFunctions) {
      this.excludedPredefinedFunctions = Optional.of(excludedPredefinedFunctions);
      return this;
    }
    @Override
    ComputerUse.Builder excludedPredefinedFunctions(Optional<List<String>> excludedPredefinedFunctions) {
      if (excludedPredefinedFunctions == null) {
        throw new NullPointerException("Null excludedPredefinedFunctions");
      }
      this.excludedPredefinedFunctions = excludedPredefinedFunctions;
      return this;
    }
    @Override
    public ComputerUse build() {
      return new AutoValue_ComputerUse(
          this.environment,
          this.excludedPredefinedFunctions);
    }
  }

}
