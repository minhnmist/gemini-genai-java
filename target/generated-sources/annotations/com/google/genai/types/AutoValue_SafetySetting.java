package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SafetySetting extends SafetySetting {

  private final Optional<HarmCategory> category;

  private final Optional<HarmBlockMethod> method;

  private final Optional<HarmBlockThreshold> threshold;

  private AutoValue_SafetySetting(
      Optional<HarmCategory> category,
      Optional<HarmBlockMethod> method,
      Optional<HarmBlockThreshold> threshold) {
    this.category = category;
    this.method = method;
    this.threshold = threshold;
  }

  @JsonProperty("category")
  @Override
  public Optional<HarmCategory> category() {
    return category;
  }

  @JsonProperty("method")
  @Override
  public Optional<HarmBlockMethod> method() {
    return method;
  }

  @JsonProperty("threshold")
  @Override
  public Optional<HarmBlockThreshold> threshold() {
    return threshold;
  }

  @Override
  public String toString() {
    return "SafetySetting{"
        + "category=" + category + ", "
        + "method=" + method + ", "
        + "threshold=" + threshold
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SafetySetting) {
      SafetySetting that = (SafetySetting) o;
      return this.category.equals(that.category())
          && this.method.equals(that.method())
          && this.threshold.equals(that.threshold());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= category.hashCode();
    h$ *= 1000003;
    h$ ^= method.hashCode();
    h$ *= 1000003;
    h$ ^= threshold.hashCode();
    return h$;
  }

  @Override
  public SafetySetting.Builder toBuilder() {
    return new AutoValue_SafetySetting.Builder(this);
  }

  static final class Builder extends SafetySetting.Builder {
    private Optional<HarmCategory> category = Optional.empty();
    private Optional<HarmBlockMethod> method = Optional.empty();
    private Optional<HarmBlockThreshold> threshold = Optional.empty();
    Builder() {
    }
    Builder(SafetySetting source) {
      this.category = source.category();
      this.method = source.method();
      this.threshold = source.threshold();
    }
    @Override
    public SafetySetting.Builder category(HarmCategory category) {
      this.category = Optional.of(category);
      return this;
    }
    @Override
    SafetySetting.Builder category(Optional<HarmCategory> category) {
      if (category == null) {
        throw new NullPointerException("Null category");
      }
      this.category = category;
      return this;
    }
    @Override
    public SafetySetting.Builder method(HarmBlockMethod method) {
      this.method = Optional.of(method);
      return this;
    }
    @Override
    SafetySetting.Builder method(Optional<HarmBlockMethod> method) {
      if (method == null) {
        throw new NullPointerException("Null method");
      }
      this.method = method;
      return this;
    }
    @Override
    public SafetySetting.Builder threshold(HarmBlockThreshold threshold) {
      this.threshold = Optional.of(threshold);
      return this;
    }
    @Override
    SafetySetting.Builder threshold(Optional<HarmBlockThreshold> threshold) {
      if (threshold == null) {
        throw new NullPointerException("Null threshold");
      }
      this.threshold = threshold;
      return this;
    }
    @Override
    public SafetySetting build() {
      return new AutoValue_SafetySetting(
          this.category,
          this.method,
          this.threshold);
    }
  }

}
