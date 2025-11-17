package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TuningExample extends TuningExample {

  private final Optional<String> output;

  private final Optional<String> textInput;

  private AutoValue_TuningExample(
      Optional<String> output,
      Optional<String> textInput) {
    this.output = output;
    this.textInput = textInput;
  }

  @JsonProperty("output")
  @Override
  public Optional<String> output() {
    return output;
  }

  @JsonProperty("textInput")
  @Override
  public Optional<String> textInput() {
    return textInput;
  }

  @Override
  public String toString() {
    return "TuningExample{"
        + "output=" + output + ", "
        + "textInput=" + textInput
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TuningExample) {
      TuningExample that = (TuningExample) o;
      return this.output.equals(that.output())
          && this.textInput.equals(that.textInput());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= output.hashCode();
    h$ *= 1000003;
    h$ ^= textInput.hashCode();
    return h$;
  }

  @Override
  public TuningExample.Builder toBuilder() {
    return new AutoValue_TuningExample.Builder(this);
  }

  static final class Builder extends TuningExample.Builder {
    private Optional<String> output = Optional.empty();
    private Optional<String> textInput = Optional.empty();
    Builder() {
    }
    Builder(TuningExample source) {
      this.output = source.output();
      this.textInput = source.textInput();
    }
    @Override
    public TuningExample.Builder output(String output) {
      this.output = Optional.of(output);
      return this;
    }
    @Override
    TuningExample.Builder output(Optional<String> output) {
      if (output == null) {
        throw new NullPointerException("Null output");
      }
      this.output = output;
      return this;
    }
    @Override
    public TuningExample.Builder textInput(String textInput) {
      this.textInput = Optional.of(textInput);
      return this;
    }
    @Override
    TuningExample.Builder textInput(Optional<String> textInput) {
      if (textInput == null) {
        throw new NullPointerException("Null textInput");
      }
      this.textInput = textInput;
      return this;
    }
    @Override
    public TuningExample build() {
      return new AutoValue_TuningExample(
          this.output,
          this.textInput);
    }
  }

}
