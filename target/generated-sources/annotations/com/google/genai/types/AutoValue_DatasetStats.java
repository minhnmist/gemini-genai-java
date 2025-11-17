package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DatasetStats extends DatasetStats {

  private final Optional<Long> totalBillableCharacterCount;

  private final Optional<Long> totalTuningCharacterCount;

  private final Optional<Long> tuningDatasetExampleCount;

  private final Optional<Long> tuningStepCount;

  private final Optional<List<Content>> userDatasetExamples;

  private final Optional<DatasetDistribution> userInputTokenDistribution;

  private final Optional<DatasetDistribution> userMessagePerExampleDistribution;

  private final Optional<DatasetDistribution> userOutputTokenDistribution;

  private AutoValue_DatasetStats(
      Optional<Long> totalBillableCharacterCount,
      Optional<Long> totalTuningCharacterCount,
      Optional<Long> tuningDatasetExampleCount,
      Optional<Long> tuningStepCount,
      Optional<List<Content>> userDatasetExamples,
      Optional<DatasetDistribution> userInputTokenDistribution,
      Optional<DatasetDistribution> userMessagePerExampleDistribution,
      Optional<DatasetDistribution> userOutputTokenDistribution) {
    this.totalBillableCharacterCount = totalBillableCharacterCount;
    this.totalTuningCharacterCount = totalTuningCharacterCount;
    this.tuningDatasetExampleCount = tuningDatasetExampleCount;
    this.tuningStepCount = tuningStepCount;
    this.userDatasetExamples = userDatasetExamples;
    this.userInputTokenDistribution = userInputTokenDistribution;
    this.userMessagePerExampleDistribution = userMessagePerExampleDistribution;
    this.userOutputTokenDistribution = userOutputTokenDistribution;
  }

  @JsonProperty("totalBillableCharacterCount")
  @Override
  public Optional<Long> totalBillableCharacterCount() {
    return totalBillableCharacterCount;
  }

  @JsonProperty("totalTuningCharacterCount")
  @Override
  public Optional<Long> totalTuningCharacterCount() {
    return totalTuningCharacterCount;
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
  public Optional<List<Content>> userDatasetExamples() {
    return userDatasetExamples;
  }

  @JsonProperty("userInputTokenDistribution")
  @Override
  public Optional<DatasetDistribution> userInputTokenDistribution() {
    return userInputTokenDistribution;
  }

  @JsonProperty("userMessagePerExampleDistribution")
  @Override
  public Optional<DatasetDistribution> userMessagePerExampleDistribution() {
    return userMessagePerExampleDistribution;
  }

  @JsonProperty("userOutputTokenDistribution")
  @Override
  public Optional<DatasetDistribution> userOutputTokenDistribution() {
    return userOutputTokenDistribution;
  }

  @Override
  public String toString() {
    return "DatasetStats{"
        + "totalBillableCharacterCount=" + totalBillableCharacterCount + ", "
        + "totalTuningCharacterCount=" + totalTuningCharacterCount + ", "
        + "tuningDatasetExampleCount=" + tuningDatasetExampleCount + ", "
        + "tuningStepCount=" + tuningStepCount + ", "
        + "userDatasetExamples=" + userDatasetExamples + ", "
        + "userInputTokenDistribution=" + userInputTokenDistribution + ", "
        + "userMessagePerExampleDistribution=" + userMessagePerExampleDistribution + ", "
        + "userOutputTokenDistribution=" + userOutputTokenDistribution
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatasetStats) {
      DatasetStats that = (DatasetStats) o;
      return this.totalBillableCharacterCount.equals(that.totalBillableCharacterCount())
          && this.totalTuningCharacterCount.equals(that.totalTuningCharacterCount())
          && this.tuningDatasetExampleCount.equals(that.tuningDatasetExampleCount())
          && this.tuningStepCount.equals(that.tuningStepCount())
          && this.userDatasetExamples.equals(that.userDatasetExamples())
          && this.userInputTokenDistribution.equals(that.userInputTokenDistribution())
          && this.userMessagePerExampleDistribution.equals(that.userMessagePerExampleDistribution())
          && this.userOutputTokenDistribution.equals(that.userOutputTokenDistribution());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= totalBillableCharacterCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalTuningCharacterCount.hashCode();
    h$ *= 1000003;
    h$ ^= tuningDatasetExampleCount.hashCode();
    h$ *= 1000003;
    h$ ^= tuningStepCount.hashCode();
    h$ *= 1000003;
    h$ ^= userDatasetExamples.hashCode();
    h$ *= 1000003;
    h$ ^= userInputTokenDistribution.hashCode();
    h$ *= 1000003;
    h$ ^= userMessagePerExampleDistribution.hashCode();
    h$ *= 1000003;
    h$ ^= userOutputTokenDistribution.hashCode();
    return h$;
  }

  @Override
  public DatasetStats.Builder toBuilder() {
    return new AutoValue_DatasetStats.Builder(this);
  }

  static final class Builder extends DatasetStats.Builder {
    private Optional<Long> totalBillableCharacterCount = Optional.empty();
    private Optional<Long> totalTuningCharacterCount = Optional.empty();
    private Optional<Long> tuningDatasetExampleCount = Optional.empty();
    private Optional<Long> tuningStepCount = Optional.empty();
    private Optional<List<Content>> userDatasetExamples = Optional.empty();
    private Optional<DatasetDistribution> userInputTokenDistribution = Optional.empty();
    private Optional<DatasetDistribution> userMessagePerExampleDistribution = Optional.empty();
    private Optional<DatasetDistribution> userOutputTokenDistribution = Optional.empty();
    Builder() {
    }
    Builder(DatasetStats source) {
      this.totalBillableCharacterCount = source.totalBillableCharacterCount();
      this.totalTuningCharacterCount = source.totalTuningCharacterCount();
      this.tuningDatasetExampleCount = source.tuningDatasetExampleCount();
      this.tuningStepCount = source.tuningStepCount();
      this.userDatasetExamples = source.userDatasetExamples();
      this.userInputTokenDistribution = source.userInputTokenDistribution();
      this.userMessagePerExampleDistribution = source.userMessagePerExampleDistribution();
      this.userOutputTokenDistribution = source.userOutputTokenDistribution();
    }
    @Override
    public DatasetStats.Builder totalBillableCharacterCount(Long totalBillableCharacterCount) {
      this.totalBillableCharacterCount = Optional.of(totalBillableCharacterCount);
      return this;
    }
    @Override
    DatasetStats.Builder totalBillableCharacterCount(Optional<Long> totalBillableCharacterCount) {
      if (totalBillableCharacterCount == null) {
        throw new NullPointerException("Null totalBillableCharacterCount");
      }
      this.totalBillableCharacterCount = totalBillableCharacterCount;
      return this;
    }
    @Override
    public DatasetStats.Builder totalTuningCharacterCount(Long totalTuningCharacterCount) {
      this.totalTuningCharacterCount = Optional.of(totalTuningCharacterCount);
      return this;
    }
    @Override
    DatasetStats.Builder totalTuningCharacterCount(Optional<Long> totalTuningCharacterCount) {
      if (totalTuningCharacterCount == null) {
        throw new NullPointerException("Null totalTuningCharacterCount");
      }
      this.totalTuningCharacterCount = totalTuningCharacterCount;
      return this;
    }
    @Override
    public DatasetStats.Builder tuningDatasetExampleCount(Long tuningDatasetExampleCount) {
      this.tuningDatasetExampleCount = Optional.of(tuningDatasetExampleCount);
      return this;
    }
    @Override
    DatasetStats.Builder tuningDatasetExampleCount(Optional<Long> tuningDatasetExampleCount) {
      if (tuningDatasetExampleCount == null) {
        throw new NullPointerException("Null tuningDatasetExampleCount");
      }
      this.tuningDatasetExampleCount = tuningDatasetExampleCount;
      return this;
    }
    @Override
    public DatasetStats.Builder tuningStepCount(Long tuningStepCount) {
      this.tuningStepCount = Optional.of(tuningStepCount);
      return this;
    }
    @Override
    DatasetStats.Builder tuningStepCount(Optional<Long> tuningStepCount) {
      if (tuningStepCount == null) {
        throw new NullPointerException("Null tuningStepCount");
      }
      this.tuningStepCount = tuningStepCount;
      return this;
    }
    @Override
    public DatasetStats.Builder userDatasetExamples(List<Content> userDatasetExamples) {
      this.userDatasetExamples = Optional.of(userDatasetExamples);
      return this;
    }
    @Override
    DatasetStats.Builder userDatasetExamples(Optional<List<Content>> userDatasetExamples) {
      if (userDatasetExamples == null) {
        throw new NullPointerException("Null userDatasetExamples");
      }
      this.userDatasetExamples = userDatasetExamples;
      return this;
    }
    @Override
    public DatasetStats.Builder userInputTokenDistribution(DatasetDistribution userInputTokenDistribution) {
      this.userInputTokenDistribution = Optional.of(userInputTokenDistribution);
      return this;
    }
    @Override
    DatasetStats.Builder userInputTokenDistribution(Optional<DatasetDistribution> userInputTokenDistribution) {
      if (userInputTokenDistribution == null) {
        throw new NullPointerException("Null userInputTokenDistribution");
      }
      this.userInputTokenDistribution = userInputTokenDistribution;
      return this;
    }
    @Override
    public DatasetStats.Builder userMessagePerExampleDistribution(DatasetDistribution userMessagePerExampleDistribution) {
      this.userMessagePerExampleDistribution = Optional.of(userMessagePerExampleDistribution);
      return this;
    }
    @Override
    DatasetStats.Builder userMessagePerExampleDistribution(Optional<DatasetDistribution> userMessagePerExampleDistribution) {
      if (userMessagePerExampleDistribution == null) {
        throw new NullPointerException("Null userMessagePerExampleDistribution");
      }
      this.userMessagePerExampleDistribution = userMessagePerExampleDistribution;
      return this;
    }
    @Override
    public DatasetStats.Builder userOutputTokenDistribution(DatasetDistribution userOutputTokenDistribution) {
      this.userOutputTokenDistribution = Optional.of(userOutputTokenDistribution);
      return this;
    }
    @Override
    DatasetStats.Builder userOutputTokenDistribution(Optional<DatasetDistribution> userOutputTokenDistribution) {
      if (userOutputTokenDistribution == null) {
        throw new NullPointerException("Null userOutputTokenDistribution");
      }
      this.userOutputTokenDistribution = userOutputTokenDistribution;
      return this;
    }
    @Override
    public DatasetStats build() {
      return new AutoValue_DatasetStats(
          this.totalBillableCharacterCount,
          this.totalTuningCharacterCount,
          this.tuningDatasetExampleCount,
          this.tuningStepCount,
          this.userDatasetExamples,
          this.userInputTokenDistribution,
          this.userMessagePerExampleDistribution,
          this.userOutputTokenDistribution);
    }
  }

}
