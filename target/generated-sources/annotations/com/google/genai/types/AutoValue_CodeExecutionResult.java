package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CodeExecutionResult extends CodeExecutionResult {

  private final Optional<Outcome> outcome;

  private final Optional<String> output;

  private AutoValue_CodeExecutionResult(
      Optional<Outcome> outcome,
      Optional<String> output) {
    this.outcome = outcome;
    this.output = output;
  }

  @JsonProperty("outcome")
  @Override
  public Optional<Outcome> outcome() {
    return outcome;
  }

  @JsonProperty("output")
  @Override
  public Optional<String> output() {
    return output;
  }

  @Override
  public String toString() {
    return "CodeExecutionResult{"
        + "outcome=" + outcome + ", "
        + "output=" + output
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CodeExecutionResult) {
      CodeExecutionResult that = (CodeExecutionResult) o;
      return this.outcome.equals(that.outcome())
          && this.output.equals(that.output());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= outcome.hashCode();
    h$ *= 1000003;
    h$ ^= output.hashCode();
    return h$;
  }

  @Override
  public CodeExecutionResult.Builder toBuilder() {
    return new AutoValue_CodeExecutionResult.Builder(this);
  }

  static final class Builder extends CodeExecutionResult.Builder {
    private Optional<Outcome> outcome = Optional.empty();
    private Optional<String> output = Optional.empty();
    Builder() {
    }
    Builder(CodeExecutionResult source) {
      this.outcome = source.outcome();
      this.output = source.output();
    }
    @Override
    public CodeExecutionResult.Builder outcome(Outcome outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }
    @Override
    CodeExecutionResult.Builder outcome(Optional<Outcome> outcome) {
      if (outcome == null) {
        throw new NullPointerException("Null outcome");
      }
      this.outcome = outcome;
      return this;
    }
    @Override
    public CodeExecutionResult.Builder output(String output) {
      this.output = Optional.of(output);
      return this;
    }
    @Override
    CodeExecutionResult.Builder output(Optional<String> output) {
      if (output == null) {
        throw new NullPointerException("Null output");
      }
      this.output = output;
      return this;
    }
    @Override
    public CodeExecutionResult build() {
      return new AutoValue_CodeExecutionResult(
          this.outcome,
          this.output);
    }
  }

}
