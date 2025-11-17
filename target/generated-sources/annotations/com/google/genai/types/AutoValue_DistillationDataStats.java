package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DistillationDataStats extends DistillationDataStats {

  private final Optional<DatasetStats> trainingDatasetStats;

  private AutoValue_DistillationDataStats(
      Optional<DatasetStats> trainingDatasetStats) {
    this.trainingDatasetStats = trainingDatasetStats;
  }

  @JsonProperty("trainingDatasetStats")
  @Override
  public Optional<DatasetStats> trainingDatasetStats() {
    return trainingDatasetStats;
  }

  @Override
  public String toString() {
    return "DistillationDataStats{"
        + "trainingDatasetStats=" + trainingDatasetStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DistillationDataStats) {
      DistillationDataStats that = (DistillationDataStats) o;
      return this.trainingDatasetStats.equals(that.trainingDatasetStats());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= trainingDatasetStats.hashCode();
    return h$;
  }

  @Override
  public DistillationDataStats.Builder toBuilder() {
    return new AutoValue_DistillationDataStats.Builder(this);
  }

  static final class Builder extends DistillationDataStats.Builder {
    private Optional<DatasetStats> trainingDatasetStats = Optional.empty();
    Builder() {
    }
    Builder(DistillationDataStats source) {
      this.trainingDatasetStats = source.trainingDatasetStats();
    }
    @Override
    public DistillationDataStats.Builder trainingDatasetStats(DatasetStats trainingDatasetStats) {
      this.trainingDatasetStats = Optional.of(trainingDatasetStats);
      return this;
    }
    @Override
    DistillationDataStats.Builder trainingDatasetStats(Optional<DatasetStats> trainingDatasetStats) {
      if (trainingDatasetStats == null) {
        throw new NullPointerException("Null trainingDatasetStats");
      }
      this.trainingDatasetStats = trainingDatasetStats;
      return this;
    }
    @Override
    public DistillationDataStats build() {
      return new AutoValue_DistillationDataStats(
          this.trainingDatasetStats);
    }
  }

}
