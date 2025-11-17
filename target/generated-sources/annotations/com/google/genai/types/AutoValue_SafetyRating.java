package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SafetyRating extends SafetyRating {

  private final Optional<Boolean> blocked;

  private final Optional<HarmCategory> category;

  private final Optional<HarmBlockThreshold> overwrittenThreshold;

  private final Optional<HarmProbability> probability;

  private final Optional<Float> probabilityScore;

  private final Optional<HarmSeverity> severity;

  private final Optional<Float> severityScore;

  private AutoValue_SafetyRating(
      Optional<Boolean> blocked,
      Optional<HarmCategory> category,
      Optional<HarmBlockThreshold> overwrittenThreshold,
      Optional<HarmProbability> probability,
      Optional<Float> probabilityScore,
      Optional<HarmSeverity> severity,
      Optional<Float> severityScore) {
    this.blocked = blocked;
    this.category = category;
    this.overwrittenThreshold = overwrittenThreshold;
    this.probability = probability;
    this.probabilityScore = probabilityScore;
    this.severity = severity;
    this.severityScore = severityScore;
  }

  @JsonProperty("blocked")
  @Override
  public Optional<Boolean> blocked() {
    return blocked;
  }

  @JsonProperty("category")
  @Override
  public Optional<HarmCategory> category() {
    return category;
  }

  @JsonProperty("overwrittenThreshold")
  @Override
  public Optional<HarmBlockThreshold> overwrittenThreshold() {
    return overwrittenThreshold;
  }

  @JsonProperty("probability")
  @Override
  public Optional<HarmProbability> probability() {
    return probability;
  }

  @JsonProperty("probabilityScore")
  @Override
  public Optional<Float> probabilityScore() {
    return probabilityScore;
  }

  @JsonProperty("severity")
  @Override
  public Optional<HarmSeverity> severity() {
    return severity;
  }

  @JsonProperty("severityScore")
  @Override
  public Optional<Float> severityScore() {
    return severityScore;
  }

  @Override
  public String toString() {
    return "SafetyRating{"
        + "blocked=" + blocked + ", "
        + "category=" + category + ", "
        + "overwrittenThreshold=" + overwrittenThreshold + ", "
        + "probability=" + probability + ", "
        + "probabilityScore=" + probabilityScore + ", "
        + "severity=" + severity + ", "
        + "severityScore=" + severityScore
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SafetyRating) {
      SafetyRating that = (SafetyRating) o;
      return this.blocked.equals(that.blocked())
          && this.category.equals(that.category())
          && this.overwrittenThreshold.equals(that.overwrittenThreshold())
          && this.probability.equals(that.probability())
          && this.probabilityScore.equals(that.probabilityScore())
          && this.severity.equals(that.severity())
          && this.severityScore.equals(that.severityScore());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= blocked.hashCode();
    h$ *= 1000003;
    h$ ^= category.hashCode();
    h$ *= 1000003;
    h$ ^= overwrittenThreshold.hashCode();
    h$ *= 1000003;
    h$ ^= probability.hashCode();
    h$ *= 1000003;
    h$ ^= probabilityScore.hashCode();
    h$ *= 1000003;
    h$ ^= severity.hashCode();
    h$ *= 1000003;
    h$ ^= severityScore.hashCode();
    return h$;
  }

  @Override
  public SafetyRating.Builder toBuilder() {
    return new AutoValue_SafetyRating.Builder(this);
  }

  static final class Builder extends SafetyRating.Builder {
    private Optional<Boolean> blocked = Optional.empty();
    private Optional<HarmCategory> category = Optional.empty();
    private Optional<HarmBlockThreshold> overwrittenThreshold = Optional.empty();
    private Optional<HarmProbability> probability = Optional.empty();
    private Optional<Float> probabilityScore = Optional.empty();
    private Optional<HarmSeverity> severity = Optional.empty();
    private Optional<Float> severityScore = Optional.empty();
    Builder() {
    }
    Builder(SafetyRating source) {
      this.blocked = source.blocked();
      this.category = source.category();
      this.overwrittenThreshold = source.overwrittenThreshold();
      this.probability = source.probability();
      this.probabilityScore = source.probabilityScore();
      this.severity = source.severity();
      this.severityScore = source.severityScore();
    }
    @Override
    public SafetyRating.Builder blocked(boolean blocked) {
      this.blocked = Optional.of(blocked);
      return this;
    }
    @Override
    SafetyRating.Builder blocked(Optional<Boolean> blocked) {
      if (blocked == null) {
        throw new NullPointerException("Null blocked");
      }
      this.blocked = blocked;
      return this;
    }
    @Override
    public SafetyRating.Builder category(HarmCategory category) {
      this.category = Optional.of(category);
      return this;
    }
    @Override
    SafetyRating.Builder category(Optional<HarmCategory> category) {
      if (category == null) {
        throw new NullPointerException("Null category");
      }
      this.category = category;
      return this;
    }
    @Override
    public SafetyRating.Builder overwrittenThreshold(HarmBlockThreshold overwrittenThreshold) {
      this.overwrittenThreshold = Optional.of(overwrittenThreshold);
      return this;
    }
    @Override
    SafetyRating.Builder overwrittenThreshold(Optional<HarmBlockThreshold> overwrittenThreshold) {
      if (overwrittenThreshold == null) {
        throw new NullPointerException("Null overwrittenThreshold");
      }
      this.overwrittenThreshold = overwrittenThreshold;
      return this;
    }
    @Override
    public SafetyRating.Builder probability(HarmProbability probability) {
      this.probability = Optional.of(probability);
      return this;
    }
    @Override
    SafetyRating.Builder probability(Optional<HarmProbability> probability) {
      if (probability == null) {
        throw new NullPointerException("Null probability");
      }
      this.probability = probability;
      return this;
    }
    @Override
    public SafetyRating.Builder probabilityScore(Float probabilityScore) {
      this.probabilityScore = Optional.of(probabilityScore);
      return this;
    }
    @Override
    SafetyRating.Builder probabilityScore(Optional<Float> probabilityScore) {
      if (probabilityScore == null) {
        throw new NullPointerException("Null probabilityScore");
      }
      this.probabilityScore = probabilityScore;
      return this;
    }
    @Override
    public SafetyRating.Builder severity(HarmSeverity severity) {
      this.severity = Optional.of(severity);
      return this;
    }
    @Override
    SafetyRating.Builder severity(Optional<HarmSeverity> severity) {
      if (severity == null) {
        throw new NullPointerException("Null severity");
      }
      this.severity = severity;
      return this;
    }
    @Override
    public SafetyRating.Builder severityScore(Float severityScore) {
      this.severityScore = Optional.of(severityScore);
      return this;
    }
    @Override
    SafetyRating.Builder severityScore(Optional<Float> severityScore) {
      if (severityScore == null) {
        throw new NullPointerException("Null severityScore");
      }
      this.severityScore = severityScore;
      return this;
    }
    @Override
    public SafetyRating build() {
      return new AutoValue_SafetyRating(
          this.blocked,
          this.category,
          this.overwrittenThreshold,
          this.probability,
          this.probabilityScore,
          this.severity,
          this.severityScore);
    }
  }

}
