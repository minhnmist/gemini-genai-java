package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ThinkingConfig extends ThinkingConfig {

  private final Optional<Boolean> includeThoughts;

  private final Optional<Integer> thinkingBudget;

  private AutoValue_ThinkingConfig(
      Optional<Boolean> includeThoughts,
      Optional<Integer> thinkingBudget) {
    this.includeThoughts = includeThoughts;
    this.thinkingBudget = thinkingBudget;
  }

  @JsonProperty("includeThoughts")
  @Override
  public Optional<Boolean> includeThoughts() {
    return includeThoughts;
  }

  @JsonProperty("thinkingBudget")
  @Override
  public Optional<Integer> thinkingBudget() {
    return thinkingBudget;
  }

  @Override
  public String toString() {
    return "ThinkingConfig{"
        + "includeThoughts=" + includeThoughts + ", "
        + "thinkingBudget=" + thinkingBudget
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ThinkingConfig) {
      ThinkingConfig that = (ThinkingConfig) o;
      return this.includeThoughts.equals(that.includeThoughts())
          && this.thinkingBudget.equals(that.thinkingBudget());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= includeThoughts.hashCode();
    h$ *= 1000003;
    h$ ^= thinkingBudget.hashCode();
    return h$;
  }

  @Override
  public ThinkingConfig.Builder toBuilder() {
    return new AutoValue_ThinkingConfig.Builder(this);
  }

  static final class Builder extends ThinkingConfig.Builder {
    private Optional<Boolean> includeThoughts = Optional.empty();
    private Optional<Integer> thinkingBudget = Optional.empty();
    Builder() {
    }
    Builder(ThinkingConfig source) {
      this.includeThoughts = source.includeThoughts();
      this.thinkingBudget = source.thinkingBudget();
    }
    @Override
    public ThinkingConfig.Builder includeThoughts(boolean includeThoughts) {
      this.includeThoughts = Optional.of(includeThoughts);
      return this;
    }
    @Override
    ThinkingConfig.Builder includeThoughts(Optional<Boolean> includeThoughts) {
      if (includeThoughts == null) {
        throw new NullPointerException("Null includeThoughts");
      }
      this.includeThoughts = includeThoughts;
      return this;
    }
    @Override
    public ThinkingConfig.Builder thinkingBudget(Integer thinkingBudget) {
      this.thinkingBudget = Optional.of(thinkingBudget);
      return this;
    }
    @Override
    ThinkingConfig.Builder thinkingBudget(Optional<Integer> thinkingBudget) {
      if (thinkingBudget == null) {
        throw new NullPointerException("Null thinkingBudget");
      }
      this.thinkingBudget = thinkingBudget;
      return this;
    }
    @Override
    public ThinkingConfig build() {
      return new AutoValue_ThinkingConfig(
          this.includeThoughts,
          this.thinkingBudget);
    }
  }

}
