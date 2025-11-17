package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_PreferenceOptimizationDataStats extends PreferenceOptimizationDataStats {

  private final Optional<DatasetDistribution> scoreVariancePerExampleDistribution;

  private final Optional<DatasetDistribution> scoresDistribution;

  private final Optional<Long> totalBillableTokenCount;

  private final Optional<Long> tuningDatasetExampleCount;

  private final Optional<Long> tuningStepCount;

  private final Optional<List<GeminiPreferenceExample>> userDatasetExamples;

  private final Optional<DatasetDistribution> userInputTokenDistribution;

  private final Optional<DatasetDistribution> userOutputTokenDistribution;

  private AutoValue_PreferenceOptimizationDataStats(
      Optional<DatasetDistribution> scoreVariancePerExampleDistribution,
      Optional<DatasetDistribution> scoresDistribution,
      Optional<Long> totalBillableTokenCount,
      Optional<Long> tuningDatasetExampleCount,
      Optional<Long> tuningStepCount,
      Optional<List<GeminiPreferenceExample>> userDatasetExamples,
      Optional<DatasetDistribution> userInputTokenDistribution,
      Optional<DatasetDistribution> userOutputTokenDistribution) {
    this.scoreVariancePerExampleDistribution = scoreVariancePerExampleDistribution;
    this.scoresDistribution = scoresDistribution;
    this.totalBillableTokenCount = totalBillableTokenCount;
    this.tuningDatasetExampleCount = tuningDatasetExampleCount;
    this.tuningStepCount = tuningStepCount;
    this.userDatasetExamples = userDatasetExamples;
    this.userInputTokenDistribution = userInputTokenDistribution;
    this.userOutputTokenDistribution = userOutputTokenDistribution;
  }

  @JsonProperty("scoreVariancePerExampleDistribution")
  @Override
  public Optional<DatasetDistribution> scoreVariancePerExampleDistribution() {
    return scoreVariancePerExampleDistribution;
  }

  @JsonProperty("scoresDistribution")
  @Override
  public Optional<DatasetDistribution> scoresDistribution() {
    return scoresDistribution;
  }

  @JsonProperty("totalBillableTokenCount")
  @Override
  public Optional<Long> totalBillableTokenCount() {
    return totalBillableTokenCount;
  }

  @JsonProperty("tuningDatasetExampleCount")
  @Override
  public Optional<Long> tuningDatasetExampleCount() {
    return tuningDatasetExampleCount;
  }

  @JsonProperty("tuningStepCount")
  @Override
  public Optional<Long> tuningStepCount() {
    return tuningStepCount;
  }

  @JsonProperty("userDatasetExamples")
  @Override
  public Optional<List<GeminiPreferenceExample>> userDatasetExamples() {
    return userDatasetExamples;
  }

  @JsonProperty("userInputTokenDistribution")
  @Override
  public Optional<DatasetDistribution> userInputTokenDistribution() {
    return userInputTokenDistribution;
  }

  @JsonProperty("userOutputTokenDistribution")
  @Override
  public Optional<DatasetDistribution> userOutputTokenDistribution() {
    return userOutputTokenDistribution;
  }

  @Override
  public String toString() {
    return "PreferenceOptimizationDataStats{"
        + "scoreVariancePerExampleDistribution=" + scoreVariancePerExampleDistribution + ", "
        + "scoresDistribution=" + scoresDistribution + ", "
        + "totalBillableTokenCount=" + totalBillableTokenCount + ", "
        + "tuningDatasetExampleCount=" + tuningDatasetExampleCount + ", "
        + "tuningStepCount=" + tuningStepCount + ", "
        + "userDatasetExamples=" + userDatasetExamples + ", "
        + "userInputTokenDistribution=" + userInputTokenDistribution + ", "
        + "userOutputTokenDistribution=" + userOutputTokenDistribution
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PreferenceOptimizationDataStats) {
      PreferenceOptimizationDataStats that = (PreferenceOptimizationDataStats) o;
      return this.scoreVariancePerExampleDistribution.equals(that.scoreVariancePerExampleDistribution())
          && this.scoresDistribution.equals(that.scoresDistribution())
          && this.totalBillableTokenCount.equals(that.totalBillableTokenCount())
          && this.tuningDatasetExampleCount.equals(that.tuningDatasetExampleCount())
          && this.tuningStepCount.equals(that.tuningStepCount())
          && this.userDatasetExamples.equals(that.userDatasetExamples())
          && this.userInputTokenDistribution.equals(that.userInputTokenDistribution())
          && this.userOutputTokenDistribution.equals(that.userOutputTokenDistribution());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= scoreVariancePerExampleDistribution.hashCode();
    h$ *= 1000003;
    h$ ^= scoresDistribution.hashCode();
    h$ *= 1000003;
    h$ ^= totalBillableTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= tuningDatasetExampleCount.hashCode();
    h$ *= 1000003;
    h$ ^= tuningStepCount.hashCode();
    h$ *= 1000003;
    h$ ^= userDatasetExamples.hashCode();
    h$ *= 1000003;
    h$ ^= userInputTokenDistribution.hashCode();
    h$ *= 1000003;
    h$ ^= userOutputTokenDistribution.hashCode();
    return h$;
  }

  @Override
  public PreferenceOptimizationDataStats.Builder toBuilder() {
    return new AutoValue_PreferenceOptimizationDataStats.Builder(this);
  }

  static final class Builder extends PreferenceOptimizationDataStats.Builder {
    private Optional<DatasetDistribution> scoreVariancePerExampleDistribution = Optional.empty();
    private Optional<DatasetDistribution> scoresDistribution = Optional.empty();
    private Optional<Long> totalBillableTokenCount = Optional.empty();
    private Optional<Long> tuningDatasetExampleCount = Optional.empty();
    private Optional<Long> tuningStepCount = Optional.empty();
    private Optional<List<GeminiPreferenceExample>> userDatasetExamples = Optional.empty();
    private Optional<DatasetDistribution> userInputTokenDistribution = Optional.empty();
    private Optional<DatasetDistribution> userOutputTokenDistribution = Optional.empty();
    Builder() {
    }
    Builder(PreferenceOptimizationDataStats source) {
      this.scoreVariancePerExampleDistribution = source.scoreVariancePerExampleDistribution();
      this.scoresDistribution = source.scoresDistribution();
      this.totalBillableTokenCount = source.totalBillableTokenCount();
      this.tuningDatasetExampleCount = source.tuningDatasetExampleCount();
      this.tuningStepCount = source.tuningStepCount();
      this.userDatasetExamples = source.userDatasetExamples();
      this.userInputTokenDistribution = source.userInputTokenDistribution();
      this.userOutputTokenDistribution = source.userOutputTokenDistribution();
    }
    @Override
    public PreferenceOptimizationDataStats.Builder scoreVariancePerExampleDistribution(DatasetDistribution scoreVariancePerExampleDistribution) {
      this.scoreVariancePerExampleDistribution = Optional.of(scoreVariancePerExampleDistribution);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder scoreVariancePerExampleDistribution(Optional<DatasetDistribution> scoreVariancePerExampleDistribution) {
      if (scoreVariancePerExampleDistribution == null) {
        throw new NullPointerException("Null scoreVariancePerExampleDistribution");
      }
      this.scoreVariancePerExampleDistribution = scoreVariancePerExampleDistribution;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder scoresDistribution(DatasetDistribution scoresDistribution) {
      this.scoresDistribution = Optional.of(scoresDistribution);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder scoresDistribution(Optional<DatasetDistribution> scoresDistribution) {
      if (scoresDistribution == null) {
        throw new NullPointerException("Null scoresDistribution");
      }
      this.scoresDistribution = scoresDistribution;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder totalBillableTokenCount(Long totalBillableTokenCount) {
      this.totalBillableTokenCount = Optional.of(totalBillableTokenCount);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder totalBillableTokenCount(Optional<Long> totalBillableTokenCount) {
      if (totalBillableTokenCount == null) {
        throw new NullPointerException("Null totalBillableTokenCount");
      }
      this.totalBillableTokenCount = totalBillableTokenCount;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder tuningDatasetExampleCount(Long tuningDatasetExampleCount) {
      this.tuningDatasetExampleCount = Optional.of(tuningDatasetExampleCount);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder tuningDatasetExampleCount(Optional<Long> tuningDatasetExampleCount) {
      if (tuningDatasetExampleCount == null) {
        throw new NullPointerException("Null tuningDatasetExampleCount");
      }
      this.tuningDatasetExampleCount = tuningDatasetExampleCount;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder tuningStepCount(Long tuningStepCount) {
      this.tuningStepCount = Optional.of(tuningStepCount);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder tuningStepCount(Optional<Long> tuningStepCount) {
      if (tuningStepCount == null) {
        throw new NullPointerException("Null tuningStepCount");
      }
      this.tuningStepCount = tuningStepCount;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder userDatasetExamples(List<GeminiPreferenceExample> userDatasetExamples) {
      this.userDatasetExamples = Optional.of(userDatasetExamples);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder userDatasetExamples(Optional<List<GeminiPreferenceExample>> userDatasetExamples) {
      if (userDatasetExamples == null) {
        throw new NullPointerException("Null userDatasetExamples");
      }
      this.userDatasetExamples = userDatasetExamples;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder userInputTokenDistribution(DatasetDistribution userInputTokenDistribution) {
      this.userInputTokenDistribution = Optional.of(userInputTokenDistribution);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder userInputTokenDistribution(Optional<DatasetDistribution> userInputTokenDistribution) {
      if (userInputTokenDistribution == null) {
        throw new NullPointerException("Null userInputTokenDistribution");
      }
      this.userInputTokenDistribution = userInputTokenDistribution;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats.Builder userOutputTokenDistribution(DatasetDistribution userOutputTokenDistribution) {
      this.userOutputTokenDistribution = Optional.of(userOutputTokenDistribution);
      return this;
    }
    @Override
    PreferenceOptimizationDataStats.Builder userOutputTokenDistribution(Optional<DatasetDistribution> userOutputTokenDistribution) {
      if (userOutputTokenDistribution == null) {
        throw new NullPointerException("Null userOutputTokenDistribution");
      }
      this.userOutputTokenDistribution = userOutputTokenDistribution;
      return this;
    }
    @Override
    public PreferenceOptimizationDataStats build() {
      return new AutoValue_PreferenceOptimizationDataStats(
          this.scoreVariancePerExampleDistribution,
          this.scoresDistribution,
          this.totalBillableTokenCount,
          this.tuningDatasetExampleCount,
          this.tuningStepCount,
          this.userDatasetExamples,
          this.userInputTokenDistribution,
          this.userOutputTokenDistribution);
    }
  }

}
