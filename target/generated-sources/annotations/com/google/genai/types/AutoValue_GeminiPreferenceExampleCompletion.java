package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GeminiPreferenceExampleCompletion extends GeminiPreferenceExampleCompletion {

  private final Optional<Content> completion;

  private final Optional<Float> score;

  private AutoValue_GeminiPreferenceExampleCompletion(
      Optional<Content> completion,
      Optional<Float> score) {
    this.completion = completion;
    this.score = score;
  }

  @JsonProperty("completion")
  @Override
  public Optional<Content> completion() {
    return completion;
  }

  @JsonProperty("score")
  @Override
  public Optional<Float> score() {
    return score;
  }

  @Override
  public String toString() {
    return "GeminiPreferenceExampleCompletion{"
        + "completion=" + completion + ", "
        + "score=" + score
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeminiPreferenceExampleCompletion) {
      GeminiPreferenceExampleCompletion that = (GeminiPreferenceExampleCompletion) o;
      return this.completion.equals(that.completion())
          && this.score.equals(that.score());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= completion.hashCode();
    h$ *= 1000003;
    h$ ^= score.hashCode();
    return h$;
  }

  @Override
  public GeminiPreferenceExampleCompletion.Builder toBuilder() {
    return new AutoValue_GeminiPreferenceExampleCompletion.Builder(this);
  }

  static final class Builder extends GeminiPreferenceExampleCompletion.Builder {
    private Optional<Content> completion = Optional.empty();
    private Optional<Float> score = Optional.empty();
    Builder() {
    }
    Builder(GeminiPreferenceExampleCompletion source) {
      this.completion = source.completion();
      this.score = source.score();
    }
    @Override
    public GeminiPreferenceExampleCompletion.Builder completion(Content completion) {
      this.completion = Optional.of(completion);
      return this;
    }
    @Override
    GeminiPreferenceExampleCompletion.Builder completion(Optional<Content> completion) {
      if (completion == null) {
        throw new NullPointerException("Null completion");
      }
      this.completion = completion;
      return this;
    }
    @Override
    public GeminiPreferenceExampleCompletion.Builder score(Float score) {
      this.score = Optional.of(score);
      return this;
    }
    @Override
    GeminiPreferenceExampleCompletion.Builder score(Optional<Float> score) {
      if (score == null) {
        throw new NullPointerException("Null score");
      }
      this.score = score;
      return this;
    }
    @Override
    public GeminiPreferenceExampleCompletion build() {
      return new AutoValue_GeminiPreferenceExampleCompletion(
          this.completion,
          this.score);
    }
  }

}
