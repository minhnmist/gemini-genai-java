package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SupervisedTuningDataStats extends SupervisedTuningDataStats {

  private final Optional<List<String>> droppedExampleReasons;

  private final Optional<Long> totalBillableCharacterCount;

  private final Optional<Long> totalBillableTokenCount;

  private final Optional<Long> totalTruncatedExampleCount;

  private final Optional<Long> totalTuningCharacterCount;

  private final Optional<List<Long>> truncatedExampleIndices;

  private final Optional<Long> tuningDatasetExampleCount;

  private final Optional<Long> tuningStepCount;

  private final Optional<List<Content>> userDatasetExamples;

  private final Optional<SupervisedTuningDatasetDistribution> userInputTokenDistribution;

  private final Optional<SupervisedTuningDatasetDistribution> userMessagePerExampleDistribution;

  private final Optional<SupervisedTuningDatasetDistribution> userOutputTokenDistribution;

  private AutoValue_SupervisedTuningDataStats(
      Optional<List<String>> droppedExampleReasons,
      Optional<Long> totalBillableCharacterCount,
      Optional<Long> totalBillableTokenCount,
      Optional<Long> totalTruncatedExampleCount,
      Optional<Long> totalTuningCharacterCount,
      Optional<List<Long>> truncatedExampleIndices,
      Optional<Long> tuningDatasetExampleCount,
      Optional<Long> tuningStepCount,
      Optional<List<Content>> userDatasetExamples,
      Optional<SupervisedTuningDatasetDistribution> userInputTokenDistribution,
      Optional<SupervisedTuningDatasetDistribution> userMessagePerExampleDistribution,
      Optional<SupervisedTuningDatasetDistribution> userOutputTokenDistribution) {
    this.droppedExampleReasons = droppedExampleReasons;
    this.totalBillableCharacterCount = totalBillableCharacterCount;
    this.totalBillableTokenCount = totalBillableTokenCount;
    this.totalTruncatedExampleCount = totalTruncatedExampleCount;
    this.totalTuningCharacterCount = totalTuningCharacterCount;
    this.truncatedExampleIndices = truncatedExampleIndices;
    this.tuningDatasetExampleCount = tuningDatasetExampleCount;
    this.tuningStepCount = tuningStepCount;
    this.userDatasetExamples = userDatasetExamples;
    this.userInputTokenDistribution = userInputTokenDistribution;
    this.userMessagePerExampleDistribution = userMessagePerExampleDistribution;
    this.userOutputTokenDistribution = userOutputTokenDistribution;
  }

  @JsonProperty("droppedExampleReasons")
  @Override
  public Optional<List<String>> droppedExampleReasons() {
    return droppedExampleReasons;
  }

  @JsonProperty("totalBillableCharacterCount")
  @Override
  public Optional<Long> totalBillableCharacterCount() {
    return totalBillableCharacterCount;
  }

  @JsonProperty("totalBillableTokenCount")
  @Override
  public Optional<Long> totalBillableTokenCount() {
    return totalBillableTokenCount;
  }

  @JsonProperty("totalTruncatedExampleCount")
  @Override
  public Optional<Long> totalTruncatedExampleCount() {
    return totalTruncatedExampleCount;
  }

  @JsonProperty("totalTuningCharacterCount")
  @Override
  public Optional<Long> totalTuningCharacterCount() {
    return totalTuningCharacterCount;
  }

  @JsonProperty("truncatedExampleIndices")
  @Override
  public Optional<List<Long>> truncatedExampleIndices() {
    return truncatedExampleIndices;
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
  public Optional<SupervisedTuningDatasetDistribution> userInputTokenDistribution() {
    return userInputTokenDistribution;
  }

  @JsonProperty("userMessagePerExampleDistribution")
  @Override
  public Optional<SupervisedTuningDatasetDistribution> userMessagePerExampleDistribution() {
    return userMessagePerExampleDistribution;
  }

  @JsonProperty("userOutputTokenDistribution")
  @Override
  public Optional<SupervisedTuningDatasetDistribution> userOutputTokenDistribution() {
    return userOutputTokenDistribution;
  }

  @Override
  public String toString() {
    return "SupervisedTuningDataStats{"
        + "droppedExampleReasons=" + droppedExampleReasons + ", "
        + "totalBillableCharacterCount=" + totalBillableCharacterCount + ", "
        + "totalBillableTokenCount=" + totalBillableTokenCount + ", "
        + "totalTruncatedExampleCount=" + totalTruncatedExampleCount + ", "
        + "totalTuningCharacterCount=" + totalTuningCharacterCount + ", "
        + "truncatedExampleIndices=" + truncatedExampleIndices + ", "
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
    if (o instanceof SupervisedTuningDataStats) {
      SupervisedTuningDataStats that = (SupervisedTuningDataStats) o;
      return this.droppedExampleReasons.equals(that.droppedExampleReasons())
          && this.totalBillableCharacterCount.equals(that.totalBillableCharacterCount())
          && this.totalBillableTokenCount.equals(that.totalBillableTokenCount())
          && this.totalTruncatedExampleCount.equals(that.totalTruncatedExampleCount())
          && this.totalTuningCharacterCount.equals(that.totalTuningCharacterCount())
          && this.truncatedExampleIndices.equals(that.truncatedExampleIndices())
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
    h$ ^= droppedExampleReasons.hashCode();
    h$ *= 1000003;
    h$ ^= totalBillableCharacterCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalBillableTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalTruncatedExampleCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalTuningCharacterCount.hashCode();
    h$ *= 1000003;
    h$ ^= truncatedExampleIndices.hashCode();
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
  public SupervisedTuningDataStats.Builder toBuilder() {
    return new AutoValue_SupervisedTuningDataStats.Builder(this);
  }

  static final class Builder extends SupervisedTuningDataStats.Builder {
    private Optional<List<String>> droppedExampleReasons = Optional.empty();
    private Optional<Long> totalBillableCharacterCount = Optional.empty();
    private Optional<Long> totalBillableTokenCount = Optional.empty();
    private Optional<Long> totalTruncatedExampleCount = Optional.empty();
    private Optional<Long> totalTuningCharacterCount = Optional.empty();
    private Optional<List<Long>> truncatedExampleIndices = Optional.empty();
    private Optional<Long> tuningDatasetExampleCount = Optional.empty();
    private Optional<Long> tuningStepCount = Optional.empty();
    private Optional<List<Content>> userDatasetExamples = Optional.empty();
    private Optional<SupervisedTuningDatasetDistribution> userInputTokenDistribution = Optional.empty();
    private Optional<SupervisedTuningDatasetDistribution> userMessagePerExampleDistribution = Optional.empty();
    private Optional<SupervisedTuningDatasetDistribution> userOutputTokenDistribution = Optional.empty();
    Builder() {
    }
    Builder(SupervisedTuningDataStats source) {
      this.droppedExampleReasons = source.droppedExampleReasons();
      this.totalBillableCharacterCount = source.totalBillableCharacterCount();
      this.totalBillableTokenCount = source.totalBillableTokenCount();
      this.totalTruncatedExampleCount = source.totalTruncatedExampleCount();
      this.totalTuningCharacterCount = source.totalTuningCharacterCount();
      this.truncatedExampleIndices = source.truncatedExampleIndices();
      this.tuningDatasetExampleCount = source.tuningDatasetExampleCount();
      this.tuningStepCount = source.tuningStepCount();
      this.userDatasetExamples = source.userDatasetExamples();
      this.userInputTokenDistribution = source.userInputTokenDistribution();
      this.userMessagePerExampleDistribution = source.userMessagePerExampleDistribution();
      this.userOutputTokenDistribution = source.userOutputTokenDistribution();
    }
    @Override
    public SupervisedTuningDataStats.Builder droppedExampleReasons(List<String> droppedExampleReasons) {
      this.droppedExampleReasons = Optional.of(droppedExampleReasons);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder droppedExampleReasons(Optional<List<String>> droppedExampleReasons) {
      if (droppedExampleReasons == null) {
        throw new NullPointerException("Null droppedExampleReasons");
      }
      this.droppedExampleReasons = droppedExampleReasons;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder totalBillableCharacterCount(Long totalBillableCharacterCount) {
      this.totalBillableCharacterCount = Optional.of(totalBillableCharacterCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder totalBillableCharacterCount(Optional<Long> totalBillableCharacterCount) {
      if (totalBillableCharacterCount == null) {
        throw new NullPointerException("Null totalBillableCharacterCount");
      }
      this.totalBillableCharacterCount = totalBillableCharacterCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder totalBillableTokenCount(Long totalBillableTokenCount) {
      this.totalBillableTokenCount = Optional.of(totalBillableTokenCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder totalBillableTokenCount(Optional<Long> totalBillableTokenCount) {
      if (totalBillableTokenCount == null) {
        throw new NullPointerException("Null totalBillableTokenCount");
      }
      this.totalBillableTokenCount = totalBillableTokenCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder totalTruncatedExampleCount(Long totalTruncatedExampleCount) {
      this.totalTruncatedExampleCount = Optional.of(totalTruncatedExampleCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder totalTruncatedExampleCount(Optional<Long> totalTruncatedExampleCount) {
      if (totalTruncatedExampleCount == null) {
        throw new NullPointerException("Null totalTruncatedExampleCount");
      }
      this.totalTruncatedExampleCount = totalTruncatedExampleCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder totalTuningCharacterCount(Long totalTuningCharacterCount) {
      this.totalTuningCharacterCount = Optional.of(totalTuningCharacterCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder totalTuningCharacterCount(Optional<Long> totalTuningCharacterCount) {
      if (totalTuningCharacterCount == null) {
        throw new NullPointerException("Null totalTuningCharacterCount");
      }
      this.totalTuningCharacterCount = totalTuningCharacterCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder truncatedExampleIndices(List<Long> truncatedExampleIndices) {
      this.truncatedExampleIndices = Optional.of(truncatedExampleIndices);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder truncatedExampleIndices(Optional<List<Long>> truncatedExampleIndices) {
      if (truncatedExampleIndices == null) {
        throw new NullPointerException("Null truncatedExampleIndices");
      }
      this.truncatedExampleIndices = truncatedExampleIndices;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder tuningDatasetExampleCount(Long tuningDatasetExampleCount) {
      this.tuningDatasetExampleCount = Optional.of(tuningDatasetExampleCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder tuningDatasetExampleCount(Optional<Long> tuningDatasetExampleCount) {
      if (tuningDatasetExampleCount == null) {
        throw new NullPointerException("Null tuningDatasetExampleCount");
      }
      this.tuningDatasetExampleCount = tuningDatasetExampleCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder tuningStepCount(Long tuningStepCount) {
      this.tuningStepCount = Optional.of(tuningStepCount);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder tuningStepCount(Optional<Long> tuningStepCount) {
      if (tuningStepCount == null) {
        throw new NullPointerException("Null tuningStepCount");
      }
      this.tuningStepCount = tuningStepCount;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder userDatasetExamples(List<Content> userDatasetExamples) {
      this.userDatasetExamples = Optional.of(userDatasetExamples);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder userDatasetExamples(Optional<List<Content>> userDatasetExamples) {
      if (userDatasetExamples == null) {
        throw new NullPointerException("Null userDatasetExamples");
      }
      this.userDatasetExamples = userDatasetExamples;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder userInputTokenDistribution(SupervisedTuningDatasetDistribution userInputTokenDistribution) {
      this.userInputTokenDistribution = Optional.of(userInputTokenDistribution);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder userInputTokenDistribution(Optional<SupervisedTuningDatasetDistribution> userInputTokenDistribution) {
      if (userInputTokenDistribution == null) {
        throw new NullPointerException("Null userInputTokenDistribution");
      }
      this.userInputTokenDistribution = userInputTokenDistribution;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder userMessagePerExampleDistribution(SupervisedTuningDatasetDistribution userMessagePerExampleDistribution) {
      this.userMessagePerExampleDistribution = Optional.of(userMessagePerExampleDistribution);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder userMessagePerExampleDistribution(Optional<SupervisedTuningDatasetDistribution> userMessagePerExampleDistribution) {
      if (userMessagePerExampleDistribution == null) {
        throw new NullPointerException("Null userMessagePerExampleDistribution");
      }
      this.userMessagePerExampleDistribution = userMessagePerExampleDistribution;
      return this;
    }
    @Override
    public SupervisedTuningDataStats.Builder userOutputTokenDistribution(SupervisedTuningDatasetDistribution userOutputTokenDistribution) {
      this.userOutputTokenDistribution = Optional.of(userOutputTokenDistribution);
      return this;
    }
    @Override
    SupervisedTuningDataStats.Builder userOutputTokenDistribution(Optional<SupervisedTuningDatasetDistribution> userOutputTokenDistribution) {
      if (userOutputTokenDistribution == null) {
        throw new NullPointerException("Null userOutputTokenDistribution");
      }
      this.userOutputTokenDistribution = userOutputTokenDistribution;
      return this;
    }
    @Override
    public SupervisedTuningDataStats build() {
      return new AutoValue_SupervisedTuningDataStats(
          this.droppedExampleReasons,
          this.totalBillableCharacterCount,
          this.totalBillableTokenCount,
          this.totalTruncatedExampleCount,
          this.totalTuningCharacterCount,
          this.truncatedExampleIndices,
          this.tuningDatasetExampleCount,
          this.tuningStepCount,
          this.userDatasetExamples,
          this.userInputTokenDistribution,
          this.userMessagePerExampleDistribution,
          this.userOutputTokenDistribution);
    }
  }

}
