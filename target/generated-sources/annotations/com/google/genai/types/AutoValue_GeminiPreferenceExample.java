package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GeminiPreferenceExample extends GeminiPreferenceExample {

  private final Optional<List<GeminiPreferenceExampleCompletion>> completions;

  private final Optional<List<Content>> contents;

  private AutoValue_GeminiPreferenceExample(
      Optional<List<GeminiPreferenceExampleCompletion>> completions,
      Optional<List<Content>> contents) {
    this.completions = completions;
    this.contents = contents;
  }

  @JsonProperty("completions")
  @Override
  public Optional<List<GeminiPreferenceExampleCompletion>> completions() {
    return completions;
  }

  @JsonProperty("contents")
  @Override
  public Optional<List<Content>> contents() {
    return contents;
  }

  @Override
  public String toString() {
    return "GeminiPreferenceExample{"
        + "completions=" + completions + ", "
        + "contents=" + contents
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeminiPreferenceExample) {
      GeminiPreferenceExample that = (GeminiPreferenceExample) o;
      return this.completions.equals(that.completions())
          && this.contents.equals(that.contents());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= completions.hashCode();
    h$ *= 1000003;
    h$ ^= contents.hashCode();
    return h$;
  }

  @Override
  public GeminiPreferenceExample.Builder toBuilder() {
    return new AutoValue_GeminiPreferenceExample.Builder(this);
  }

  static final class Builder extends GeminiPreferenceExample.Builder {
    private Optional<List<GeminiPreferenceExampleCompletion>> completions = Optional.empty();
    private Optional<List<Content>> contents = Optional.empty();
    Builder() {
    }
    Builder(GeminiPreferenceExample source) {
      this.completions = source.completions();
      this.contents = source.contents();
    }
    @Override
    public GeminiPreferenceExample.Builder completions(List<GeminiPreferenceExampleCompletion> completions) {
      this.completions = Optional.of(completions);
      return this;
    }
    @Override
    GeminiPreferenceExample.Builder completions(Optional<List<GeminiPreferenceExampleCompletion>> completions) {
      if (completions == null) {
        throw new NullPointerException("Null completions");
      }
      this.completions = completions;
      return this;
    }
    @Override
    public GeminiPreferenceExample.Builder contents(List<Content> contents) {
      this.contents = Optional.of(contents);
      return this;
    }
    @Override
    GeminiPreferenceExample.Builder contents(Optional<List<Content>> contents) {
      if (contents == null) {
        throw new NullPointerException("Null contents");
      }
      this.contents = contents;
      return this;
    }
    @Override
    public GeminiPreferenceExample build() {
      return new AutoValue_GeminiPreferenceExample(
          this.completions,
          this.contents);
    }
  }

}
