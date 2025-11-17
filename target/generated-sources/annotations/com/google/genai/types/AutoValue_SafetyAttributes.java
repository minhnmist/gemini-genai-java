package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SafetyAttributes extends SafetyAttributes {

  private final Optional<List<String>> categories;

  private final Optional<List<Float>> scores;

  private final Optional<String> contentType;

  private AutoValue_SafetyAttributes(
      Optional<List<String>> categories,
      Optional<List<Float>> scores,
      Optional<String> contentType) {
    this.categories = categories;
    this.scores = scores;
    this.contentType = contentType;
  }

  @JsonProperty("categories")
  @Override
  public Optional<List<String>> categories() {
    return categories;
  }

  @JsonProperty("scores")
  @Override
  public Optional<List<Float>> scores() {
    return scores;
  }

  @JsonProperty("contentType")
  @Override
  public Optional<String> contentType() {
    return contentType;
  }

  @Override
  public String toString() {
    return "SafetyAttributes{"
        + "categories=" + categories + ", "
        + "scores=" + scores + ", "
        + "contentType=" + contentType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SafetyAttributes) {
      SafetyAttributes that = (SafetyAttributes) o;
      return this.categories.equals(that.categories())
          && this.scores.equals(that.scores())
          && this.contentType.equals(that.contentType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= categories.hashCode();
    h$ *= 1000003;
    h$ ^= scores.hashCode();
    h$ *= 1000003;
    h$ ^= contentType.hashCode();
    return h$;
  }

  @Override
  public SafetyAttributes.Builder toBuilder() {
    return new AutoValue_SafetyAttributes.Builder(this);
  }

  static final class Builder extends SafetyAttributes.Builder {
    private Optional<List<String>> categories = Optional.empty();
    private Optional<List<Float>> scores = Optional.empty();
    private Optional<String> contentType = Optional.empty();
    Builder() {
    }
    Builder(SafetyAttributes source) {
      this.categories = source.categories();
      this.scores = source.scores();
      this.contentType = source.contentType();
    }
    @Override
    public SafetyAttributes.Builder categories(List<String> categories) {
      this.categories = Optional.of(categories);
      return this;
    }
    @Override
    SafetyAttributes.Builder categories(Optional<List<String>> categories) {
      if (categories == null) {
        throw new NullPointerException("Null categories");
      }
      this.categories = categories;
      return this;
    }
    @Override
    public SafetyAttributes.Builder scores(List<Float> scores) {
      this.scores = Optional.of(scores);
      return this;
    }
    @Override
    SafetyAttributes.Builder scores(Optional<List<Float>> scores) {
      if (scores == null) {
        throw new NullPointerException("Null scores");
      }
      this.scores = scores;
      return this;
    }
    @Override
    public SafetyAttributes.Builder contentType(String contentType) {
      this.contentType = Optional.of(contentType);
      return this;
    }
    @Override
    SafetyAttributes.Builder contentType(Optional<String> contentType) {
      if (contentType == null) {
        throw new NullPointerException("Null contentType");
      }
      this.contentType = contentType;
      return this;
    }
    @Override
    public SafetyAttributes build() {
      return new AutoValue_SafetyAttributes(
          this.categories,
          this.scores,
          this.contentType);
    }
  }

}
