package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EntityLabel extends EntityLabel {

  private final Optional<String> label;

  private final Optional<Float> score;

  private AutoValue_EntityLabel(
      Optional<String> label,
      Optional<Float> score) {
    this.label = label;
    this.score = score;
  }

  @JsonProperty("label")
  @Override
  public Optional<String> label() {
    return label;
  }

  @JsonProperty("score")
  @Override
  public Optional<Float> score() {
    return score;
  }

  @Override
  public String toString() {
    return "EntityLabel{"
        + "label=" + label + ", "
        + "score=" + score
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EntityLabel) {
      EntityLabel that = (EntityLabel) o;
      return this.label.equals(that.label())
          && this.score.equals(that.score());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= label.hashCode();
    h$ *= 1000003;
    h$ ^= score.hashCode();
    return h$;
  }

  @Override
  public EntityLabel.Builder toBuilder() {
    return new AutoValue_EntityLabel.Builder(this);
  }

  static final class Builder extends EntityLabel.Builder {
    private Optional<String> label = Optional.empty();
    private Optional<Float> score = Optional.empty();
    Builder() {
    }
    Builder(EntityLabel source) {
      this.label = source.label();
      this.score = source.score();
    }
    @Override
    public EntityLabel.Builder label(String label) {
      this.label = Optional.of(label);
      return this;
    }
    @Override
    EntityLabel.Builder label(Optional<String> label) {
      if (label == null) {
        throw new NullPointerException("Null label");
      }
      this.label = label;
      return this;
    }
    @Override
    public EntityLabel.Builder score(Float score) {
      this.score = Optional.of(score);
      return this;
    }
    @Override
    EntityLabel.Builder score(Optional<Float> score) {
      if (score == null) {
        throw new NullPointerException("Null score");
      }
      this.score = score;
      return this;
    }
    @Override
    public EntityLabel build() {
      return new AutoValue_EntityLabel(
          this.label,
          this.score);
    }
  }

}
